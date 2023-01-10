package filewriterclass;

import java.io.FileWriter;
import java.io.IOException;

/*
Documentation:
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/FileWriter.html

Warning!
To improve the performance, it is recommended to use a BufferedWriter on top of a FileWriter.
 */
public class Program {

    public static void main(String[] args) {

        // Use FileWriter("//home//lucas//Temp//file.txt", true) to append to the existing file.
        try (FileWriter fw = new FileWriter("//home//lucas//Temp//out.txt")) {
            fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut ultricies suscipit fringilla.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
