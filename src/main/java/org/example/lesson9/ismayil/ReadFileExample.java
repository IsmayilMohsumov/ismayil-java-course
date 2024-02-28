package org.example.lesson9.ismayil;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\mohsu\\Downloads\\Files from HP laptop\\IMPORTANT FILES\\IMPORTANT FILES\\Course Ismayil\\repo-fixed\\ismayil-java-course\\src\\main\\java\\org\\example\\lesson9\\dataset\\example.txt";

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            // Handle IOException if there is an issue with file reading
            System.err.println("Error reading from the file: " + e.getMessage());
            e.printStackTrace(); // Print the stack trace for debugging
        }
    }
}
