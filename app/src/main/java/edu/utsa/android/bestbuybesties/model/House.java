package edu.utsa.android.bestbuybesties.model;

import android.content.res.AssetManager;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class House {
    House(){

        allStoredItems = new ArrayList<>();
        storageAreas = new ArrayList<>();
    }
    ArrayList<Storage> storageAreas;
    private ArrayList<FoodItem> allStoredItems; //Items across all storage units
    private final String[] delimiters = {",","\\n","\\r"};
    public void loadStorageUnits(AssetManager assetMgr) throws FileNotFoundException {
        //load storage units data from csv line by line. Split the line into tokens,
        // and distribute accordingly
        String currentLine;
        String[] currentTokens;
        Scanner fileRead;
        int itemID;
        String itemLabel;
        try{
            InputStream file = assetMgr.open("storage.csv");
            fileRead = new Scanner(file);
            fileRead.useDelimiter(Arrays.toString(delimiters));
            while(fileRead.hasNextLine()){
                currentLine = fileRead.nextLine();
                currentTokens = currentLine.split(",");
                itemID = Integer.parseInt(currentTokens[0]);
                itemLabel = currentTokens[1].trim();
                switch (itemLabel.toLowerCase()) {
                    case "fridge":
                        storageAreas.add(new Fridge(itemID));
                        break;
                    case "pantry":
                        storageAreas.add(new Pantry(itemID));
                        break;
                }
            }

        }catch(IOException ex){
            throw(new RuntimeException(ex));
        }
        fileRead.close();

    }
    private void loadItems(AssetManager assetMgr) throws FileNotFoundException {
        //Loads global items data from csv line by line. Split the line into tokens,
        // and distribute accordingly
        String currentLine;
        String[] currentTokens;
        Scanner fileRead;
        int itemID,itemStorageDest, qty;
        String addDate, expDate,itemLabel, storageType;
        try{
            InputStream file = assetMgr.open("items.csv");
            fileRead = new Scanner(file);
            fileRead.useDelimiter(Arrays.toString(delimiters));
            while(fileRead.hasNextLine()){
                currentLine = fileRead.nextLine();
                currentTokens = currentLine.split(",");
                itemID = Integer.parseInt(currentTokens[0]);
                itemLabel = currentTokens[1].trim();
                addDate = currentTokens[2].trim();
                expDate = currentTokens[3].trim();
                qty = Integer.parseInt(currentTokens[4]);
                storageType = currentTokens[5].trim();
                itemStorageDest = Integer.parseInt(currentTokens[6]);
                allStoredItems.add(new FoodItem(itemID,itemLabel,expDate,addDate,qty,storageType,itemStorageDest));
            }

        }catch(IOException ex){
            throw(new RuntimeException(ex));
        }

        fileRead.close();
    }
}
