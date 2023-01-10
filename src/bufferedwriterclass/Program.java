package bufferedwriterclass;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
Documentation:
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/BufferedWriter.html
 */
public class Program {

    public static void main(String[] args) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("//home//lucas//Temp//out.txt"))) {
            bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut ultricies suscipit fringilla.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
