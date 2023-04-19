package edu.utsa.android.bestbuybesties;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import edu.utsa.android.bestbuybesties.controller.FoodListController;

public class FoodListActivity extends AppCompatActivity {

    private FoodListController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
        controller = new FoodListController(this);

        Intent intent = getIntent();
        //get either fridge or pantry
        //
        //set up buttons for both more info options and add item options :)
    }
}