package edu.utsa.android.bestbuybesties;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import edu.utsa.android.bestbuybesties.controller.ItemInfoController;

public class ItemInfoActivity extends AppCompatActivity {
    private ItemInfoController controller;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_info);

        controller = new ItemInfoController(this);
        Intent intent = getIntent();
        //call whatever class is made to show information from controller
        //setup the back button
    }
}