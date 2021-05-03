package com.example.wordtransferbackwards;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE =
            "com.example.android.wordtransferbackwards.extra.MESSAGE";

    ArrayList<String> wordList = new ArrayList<String>();
    private EditText editView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editView = findViewById(R.id.editText);

    }

    public void launchSecondActivity(View view) {
        Log.d("LOGGED", "Button clicked!");

        String normalword = editView.getText().toString();
        Reverse r = new Reverse();
        r.reverseString(normalword);

        String reversedWord = r.reverseString(normalword);
        wordList.add(reversedWord);

        Intent intent = new Intent(this, Backwards.class);
        intent.putExtra(EXTRA_MESSAGE, reversedWord);
        startActivity(intent);
        Log.d("LOGGED", "Reversed " + reversedWord);
        Log.d("LOGGED", "Word added to wordList " + wordList.get(0));
    }
}