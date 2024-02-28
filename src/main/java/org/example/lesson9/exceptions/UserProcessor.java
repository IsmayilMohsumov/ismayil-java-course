package org.example.lesson9.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class UserProcessor {
    public static String findUserById(String userId) throws IOException, UserNotFoundException {
        String filePath = "C:\\Users\\mohsu\\Downloads\\Files from HP laptop\\IMPORTANT FILES\\IMPORTANT FILES\\Course Ismayil\\repo-fixed\\ismayil-java-course\\src\\main\\java\\org\\example\\lesson9\\dataset\\users.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                String[] userData = line.split(" ");
                System.out.println(Arrays.toString(userData));
                if (userData[0].equals(userId)) {
                    return userData[1]; // Return user's name
                }
            }
        }
        throw new UserNotFoundException("User with ID '" + userId + "' not found");
    }

    public static void main(String[] args) {
        String userIdToFind = "5";

        try {
            String userName = findUserById(userIdToFind);
            System.out.println("User found: " + userName);
        } catch (UserNotFoundException e) {
            System.err.println("Error: " + e.getMessage());

        } catch (IOException e) {
            // Handle IOException if there is an issue with file reading
            System.err.println("Error reading from the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
