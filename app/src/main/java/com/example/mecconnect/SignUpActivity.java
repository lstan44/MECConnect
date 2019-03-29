package com.example.mecconnect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    private Button signUp;
    private EditText fn = findViewById(R.id.et_signup_firstname);
    private EditText ln = findViewById(R.id.et_signup_lastname);
    private EditText em = findViewById(R.id.et_signup_email);
    private EditText pw = findViewById(R.id.et_signup_pwd);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        signUp = findViewById(R.id.signupButton);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signup();
            }
        });
    }

    public void signup(){
        Intent intent = new Intent(this, MainActivity.class);

        String firstName = fn.getText().toString();
        String lastName = ln.getText().toString();
        String email = em.getText().toString();
        String password = pw.getText().toString();

        if(firstName.isEmpty() || lastName.isEmpty()|| email.isEmpty()||password.isEmpty()){
            Toast.makeText(this,"Can't leave any field empty!", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"Account has been created. You may now login", Toast.LENGTH_LONG).show();
            startActivity(intent);
        }

    }
}
