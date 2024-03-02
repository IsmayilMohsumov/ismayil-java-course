package org.example.lesson9.ismayil;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {

    public static void readFile(String filePath, String targetUserId)
            throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userData = line.split(" ");

                //Check out picture in package lesson9->dataset-> userDataVisual.png

                // !JUMA TODO: Check if ID is just a number
                //          TODO: If not throw UserIdIsNotNumberException(message)


                // !MAGA TODO: Check if NAME is more than two characters
                //          TODO: If not throw UserIdIsNotNumberException(message)


                // !KAMIL TODO: Check if user ID matches the target ID
                //         TODO: If not throw UserIdIsNotNumberException(message)

            }


        }
    }

}
