package ru.bvn13.licenseserverjclient;

import java.io.*;
import java.util.Base64;

/**
 * Created by bvn13 on 24.06.2017.
 */
public abstract class SystemID {

    private static String OS = System.getProperty("os.name").toLowerCase();

    private static boolean isWindows()
    {
        return (OS.indexOf("win") >= 0);
    }
    private static boolean isUnix()
    {
        return (OS.indexOf("win") < 0); //(OS.indexOf("nux") >= 0);
    }

    private static String getVolumeUUID()
    {
        Process p;
        BufferedReader reader;
        String line = "NOT FOUND";

        if(isWindows()) {

            String userDir = new File(System.getProperty("user.dir")).getAbsolutePath();
            String rootDir = userDir.substring(0, userDir.indexOf(File.separator)+1);
            String drive = ""+rootDir.substring(0,1);
            String query = "cmd /c"+" vol "+drive+":";

            try {
                p = Runtime.getRuntime().exec(query);
                p.waitFor();
                reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

                if (isWindows()) {
                    reader.readLine();
                }
                line = reader.readLine();
                line = line.substring(line.lastIndexOf(" ") + 1);
            } catch(IOException ex) {
                //ex.printStackTrace();
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }

            return line;

        } else if(isUnix()) {

            String query = "lsblk --nodeps -o name,serial";

            try {
                p = Runtime.getRuntime().exec(query);
                p.waitFor();
                reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

                while ((line = reader.readLine()) != null) {
                    if (line.startsWith("sda ")) {
                        line = line.substring(line.lastIndexOf(" ") + 1);
                        return line;
                    }
                }

            } catch(IOException ex) {
                //ex.printStackTrace();
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }

        } else {

            //System.out.println("WRONG SYSTEM");
            return "WRONG SYSTEM";
        }

        return line;
    }


    public static String getSystemID() {
        String systemInfo = "System info: ";

        systemInfo += "\n" + "Available processors (cores): " + Runtime.getRuntime().availableProcessors();
        long maxMemory = Runtime.getRuntime().maxMemory();
        systemInfo += "\n" + "Maximum memory (bytes): " + (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory);
        String userDir = new File(System.getProperty("user.dir")).getAbsolutePath();
        String rootDir = userDir.substring(0, userDir.indexOf(File.separator)+1);
        systemInfo += "\n" + "Root dir: "+rootDir;
        systemInfo += "\n" + "Root volume UUID: "+getVolumeUUID();
        File[] roots = File.listRoots();
        for (File root : roots) {
            if (root.getAbsolutePath().equals(rootDir)) {
                systemInfo += "\n" + "Root dir total space: "+root.getTotalSpace();
            }
        }

        return systemInfo;
    }


    public static String encode(String data) {
        Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(data.getBytes());
    }

    public static String decode(String data) throws UnsupportedEncodingException {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] base64decodedBytes = decoder.decode(data);
        String decodedString = new String(base64decodedBytes, "utf-8");
        return decodedString;
    }


}
