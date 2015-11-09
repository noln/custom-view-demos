package io.jammy.customviewdemos;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.jammy.customviewdemos.Views.LinearLayoutWithTextBox;


public class MainActivity extends AppCompatActivity {

    LinearLayoutWithTextBox linearLayoutWithTextBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayoutWithTextBox = (LinearLayoutWithTextBox) findViewById(R.id.custom_view);
        linearLayoutWithTextBox.setEmbeddedTextViewText("Blah!");
    }
}
