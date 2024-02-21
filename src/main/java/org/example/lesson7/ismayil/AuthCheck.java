package org.example.lesson7.ismayil;

public class AuthCheck {

    public static Boolean checkIfLoginIsValid(String login){ // c     u          m         a         @          g      m       a         -y-           l.com

        String suffix ="@gmail.com";
        int loginLength = login.length(); // 14
        int suffixUzunulugu = suffix.length(); //10

        for (int i=0; i < suffixUzunulugu ; i++){ //
            if (login.charAt(loginLength-suffixUzunulugu + i ) != suffix.charAt(i)){ // login -> 8 =  y   != suffix -> 4 = i
                return false;
            }

        }

        return true;
    }

    public static String encryptPassword(String password){
        //tersine cevir

        //ve return ele

        return password + "Xyz123";
    }
}
