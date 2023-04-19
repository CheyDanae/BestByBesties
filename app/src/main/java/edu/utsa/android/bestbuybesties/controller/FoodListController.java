package edu.utsa.android.bestbuybesties.controller;

import android.app.Activity;
import android.view.View;

import edu.utsa.android.bestbuybesties.FoodListActivity;

public class FoodListController implements View.OnClickListener {
    private Activity activity;
    public FoodListController(Activity activity) {
        this.activity = activity;

    }
    public void onClick(View view){
        //if add button is clicked use intent and switch to add page
        //if more info button is clicked use intent and switch to more info page


    }

    /**
     * will return list of either fridge or pantry contents
     */
    public void showList(){

    }


}
