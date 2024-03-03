package org.example.lesson9.ismayil;
import org.example.lesson9.exceptions.UserIdIsNotNumberException;
import org.example.lesson9.exceptions.UserNotFoundException;
import org.example.lesson9.exceptions.UsernameIsLessThanTwoWordsException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileExample {


    public static void readFile(String filePath, int targetUserId)  throws IOException,UserIdIsNotNumberException, UsernameIsLessThanTwoWordsException,UserNotFoundException{

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userData = line.split(" ");



                //Check out picture in package lesson9->dataset-> userDataVisual.png


                try {
//                    System.out.println(userData[0]);
                    String ids = userData[0];
                    System.out.print(ids+" ");
                    int id =Integer.parseInt(ids);
                } catch (Exception e) {
                    throw new UserIdIsNotNumberException(userData[0]+" is not number");
                }


                String name =userData[1];
                System.out.println(name);
                if (name.length()<=2){
                    throw new UsernameIsLessThanTwoWordsException(name+ " is less than 2 chars");

                }



                String idFromDatabase=userData[0];

                Integer id=Integer.parseInt(idFromDatabase);
                if(id==targetUserId){
                    System.err.println(userData[0]+userData[1]+userData[2]);
                    return;


                }

            }
            throw new UserNotFoundException(targetUserId+"Id is not matches");



            }


        }




}
