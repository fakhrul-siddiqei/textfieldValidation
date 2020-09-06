package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final  String specialCharRegex= ".*[@#!$%^&+=].*";
        final   String UpperCaseRegex= ".*[A-Z].*";
        final   String LowerCaseRegex= ".*[a-z].*";
        final  String NumberRegex= ".*[0-9].*";
        final TextView tv=findViewById(R.id.text);
        Button bt=findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password=tv.getText().toString();
                if(password.matches(specialCharRegex)){
                    Toast.makeText(MainActivity.this, "Password Cant contains special charaachter", Toast.LENGTH_SHORT).show();
                }
                else if(password.matches(UpperCaseRegex) && password.matches(LowerCaseRegex) && password.matches(NumberRegex) )
                {
                    Toast.makeText(MainActivity.this, "Password Successfull", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Your Password at least have to contains a capital and small character and digits", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}