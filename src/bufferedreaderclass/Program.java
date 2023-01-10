package bufferedreaderclass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
Documentation:
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/BufferedReader.html
 */
public class Program {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("//home//lucas//Temp//in.txt"))) {
            String content;
            while ((content = br.readLine()) != null) {
                System.out.println(content);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
