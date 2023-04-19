package edu.utsa.android.bestbuybesties.controller;

import android.app.Activity;
import android.view.View;

import edu.utsa.android.bestbuybesties.AddFoodActivity;

public class AddFoodController implements View.OnClickListener {
    private Activity activity;

    public AddFoodController(Activity activity){
        this.activity = activity;
    }

    @Override
    public void onClick(View view) {
        //if add button is clicked, take user info and add to file or arraylist
        //if back button is clicked return to previous page
    }
    //add in classes to read in user input on textUserInput and place into FoodItem object :)
    //gotta google this ^
}
