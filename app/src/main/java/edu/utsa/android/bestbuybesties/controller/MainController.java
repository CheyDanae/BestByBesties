package edu.utsa.android.bestbuybesties.controller;

import android.app.Activity;
import android.content.res.AssetManager;
import android.view.View;

import edu.utsa.android.bestbuybesties.MainActivity;

public class MainController  implements View.OnClickListener{
    private AssetManager assets;
    private Activity activity;
    //private House home???

    public MainController(Activity activity) {
        this.activity = activity;
        this.assets = activity.getAssets();
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        //if id==fridge use intent and call fridge class to FoodListActivity(or storage/house)
        //if id == pantry use intent and call pantry class to FoodListActivity(or storage/house)


    }
}
