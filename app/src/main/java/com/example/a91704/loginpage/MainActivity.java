package com.example.a91704.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public  void clicker(View view){

        EditText editText=findViewById(R.id.editText);

        EditText editPass=findViewById(R.id.editPass);
        Log.i("Print","button pressed");
        Log.i("username",editText.getText().toString());

        Log.i("username",editPass.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
