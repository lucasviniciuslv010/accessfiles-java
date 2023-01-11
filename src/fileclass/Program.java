package fileclass;

import java.io.File;
import java.util.Scanner;

/*
Documentation:
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html
 */
public class Program {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a directory path: ");
            String strPath = sc.nextLine();

            File path = new File(strPath); // An abstract representation of file and directory pathnames.

            File[] files = path.listFiles(File::isFile); // File list
            File[] folders = path.listFiles(File::isDirectory); // Directory list

            System.out.println("FILES:");
            if (files != null) {
                for (File file : files) {
                    System.out.println(file);
                }
            }

            System.out.println("\n----------------------------\n");

            System.out.println("FOLDERS:");
            if (folders != null) {
                for (File folder : folders) {
                    System.out.println(folder);
                }
            }

            System.out.println("\n----------------------------\n");

            boolean success = new File(strPath + "//subdir").mkdir(); // Create a directory at the specified path
            System.out.println("Directory successfully created: " + success);

            System.out.println("\n----------------------------\n");

            System.out.println("getParent: " + path.getParent()); // Parent directory name
            System.out.println("getName: " + path.getName()); // Directory name
            System.out.println("getPath: " + path.getPath()); // Full path
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
