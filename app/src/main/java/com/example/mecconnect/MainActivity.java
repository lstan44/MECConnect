package com.example.mecconnect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button login, signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.bt_login);
        signup = findViewById(R.id.bt_signup);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userLogIn();
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userSignUp();
            }
        });

    }

    public void userLogIn(){
        //test
        Intent intent = new Intent(this,ProfileActivity.class);
        EditText em = findViewById(R.id.et_email);
        EditText pw = findViewById(R.id.et_password);

        String email = em.getText().toString();
        String pwd = pw.getText().toString();

        boolean validUser = AuthenticationManager.userDidEnterValidCredentials(email,pwd);
        if(validUser) {
//            String txt = AuthenticationManager.test();
//
//            intent.putExtra("db", txt);
            startActivity(intent);
        }
        else{
            Toast.makeText(this,"Wrong Credentials",Toast.LENGTH_LONG).show();
        }


    }

    public void userSignUp(){
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }
}
