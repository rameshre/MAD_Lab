package com.example.pgm6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     EditText name,age,email,address,qul;
    Button  b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        age=findViewById(R.id.age);
        email=findViewById(R.id.email);
        address=findViewById(R.id.address);
        qul=findViewById(R.id.qul);
        b1.findViewById(R.id.submit);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
            }
        });
    }
    protected void onPause(){
        super.onPause();
        SharedPreferences sharedPreferences=getSharedPreferences("MySharedPref",MODE_PRIVATE);
        SharedPreferences.Editor myEdit=sharedPreferences.edit();
        myEdit.putString("name",name.getText().toString());
        myEdit.putInt("age",Integer.parseInt(age.getText().toString()));
        myEdit.putString("address", address.getText().toString());
        myEdit.putString("email", email.getText().toString());
        myEdit.putString("qul", qul.getText().toString());
        myEdit.commit();

    }
    protected void onResume(){
        super.onResume();
        SharedPreferences sh=getSharedPreferences("MySharedPref",MODE_PRIVATE);
        String s1 = sh.getString("name", "");
        int a = sh.getInt("age", 0);
        String s2 = sh.getString("address", "");
        String s3 = sh.getString("email", "");
        String s4 = sh.getString("qul", "");
        name.setText(s1);
        age.setText(String.valueOf(a));
        email.setText(s2);
        address.setText(s3);
        qul.setText(s4);

    }
}