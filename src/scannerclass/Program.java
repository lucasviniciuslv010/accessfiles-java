package scannerclass;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
Documentation:
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Scanner.html
 */
public class Program {

    public static void main(String[] args) {

        File file = new File("//home//lucas//Temp//in.txt");

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
