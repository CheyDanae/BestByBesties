package edu.utsa.android.bestbuybesties.controller;

import android.app.Activity;
import android.view.View;

import edu.utsa.android.bestbuybesties.ItemInfoActivity;

public class ItemInfoController implements View.OnClickListener {

    private Activity activity;
    public ItemInfoController(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void onClick(View view) {
//if back button is clicked, go back to previous (list page)

    }

    /**
     * shows the information displayed in xml file
     */
    public void showInfo(){
        //may call additional classes idk
        //item selected would go in parameters
    }

}
