package com.example.mecconnect;

public class AuthenticationManager {

    static String user_email = "stanleylalanne@mec.science";
    static String user_password = "mypassword";
    public static boolean userDidEnterValidCredentials(String email, String password){
        if(email.equals(user_email)&&password.equals(user_password)){
            return true;
        }
        else return false;
    }
}
