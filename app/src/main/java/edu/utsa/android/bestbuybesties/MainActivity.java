package edu.utsa.android.bestbuybesties;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import edu.utsa.android.bestbuybesties.controller.MainController;

public class MainActivity extends AppCompatActivity {
    MainController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controller = new MainController(this);
//can do otherwise if you wish to dynamically allocate buttons :)
        setupButton(R.id.PantryButton);
        setupButton(R.id.RefrigeratorButton);
    }
    private void setupButton(int buttonID){
        Button button = findViewById(buttonID);
        button.setOnClickListener(controller);

    }

}