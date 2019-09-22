package com.example.helloworldapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        EditText editText = findViewById(R.id.user_message);
        String message = editText.getText().toString();
        Intent intent = new Intent(this,MessageActivity.class);
        intent.putExtra("EXTRA_MESSAGE",message);
        startActivity(intent);
    }
}
