package edu.utsa.android.bestbuybesties;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AddFoodActivity extends AppCompatActivity {
    private AddFoodController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_food);
        controller = new AddFoodActivity(this);
        Intent = getIntent();
        //create classes in controller to return
        //set up back button and add food button
    }
}