package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Declaration Button
    Button btnClickMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Intialization Button
        btnClickMe = (Button) findViewById(R.id.buttonEnviar);
        btnClickMe.setOnClickListener(MainActivity.this);
    }


    @Override
    public void onClick(View v) {
        TextView label = (TextView) findViewById(R.id.WelcomeLabel);
        TextView name = (TextView) findViewById(R.id.editTextText);

        label.setText("Hola "+name.getText()+"!!!");
    }
}