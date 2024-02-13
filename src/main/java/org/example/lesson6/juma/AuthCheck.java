package org.example.lesson6.juma;

public class AuthCheck {

    public Boolean checkIfLoginIsValid(String login) {


        boolean index = login.endsWith("@gmail.com");
        if (!index) {
            System.out.println(login);
        }

        return index;
    }



 public String encryptThePassword(String password) {

        StringBuilder encryptedText = new StringBuilder(new StringBuilder(password).reverse().toString());

        String text = encryptedText + "Xyz123";
        return text;


    }

}





