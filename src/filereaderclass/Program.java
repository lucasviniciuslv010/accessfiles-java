package filereaderclass;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
Documentation:
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/FileReader.html

Warning!
Using FileReader is a very inefficient way of reading a text file in Java.
To improve the performance in huge files, it is recommended to use a BufferedReader on top of a FileReader.
 */
public class Program {

    public static void main(String[] args) {

        File file = new File("//home//lucas//Temp//in.txt");

        try (FileReader fr = new FileReader(file)) {
            char[] chars = new char[(int) file.length()];
            fr.read(chars);
            String fileContent = new String(chars);
            System.out.println(fileContent);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
