package com.example.mecconnect;
import android.database.sqlite.*;
import android.view.Display;

public class AuthenticationManager {

    private static SQLiteDatabase myDB;
    private static String dbPath = "/Users/slalanne/Desktop/Databases/firstDb.db";
    static String user_email = "stanleylalanne@mec.science";
    static String user_password = "mypassword";
    public static boolean userDidEnterValidCredentials(String email, String password){
        if(email.equals(user_email)&&password.equals(user_password)){
            return true;
        }
        else return false;
    }


    public static boolean dbConnect(String dbName){

       myDB = SQLiteDatabase.openDatabase(dbName, null, SQLiteDatabase.OPEN_READWRITE);
       if (myDB.isOpen()){
           return true;
       }
       else  return  false;

    }

    public static String test(){
        String query = "SELECT * FROM Users;";
        String txt = "";
        if(dbConnect(dbPath)){
            txt = myDB.rawQuery(query,null).toString();
            return txt;
        }
        return txt;
    }

}
