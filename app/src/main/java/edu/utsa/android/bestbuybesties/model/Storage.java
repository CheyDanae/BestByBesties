package edu.utsa.android.bestbuybesties.model;

import java.util.ArrayList;
import java.util.Collections;


public abstract class Storage {

    protected enum StorageType{fridge, pantry};

    StorageType storageType;
    private int storageId;
    private static ArrayList<FoodItem> allStoredItems; //Items across all storage units

    private ArrayList<FoodItem> localStoredItems; //Local to the individual storage unit

    public void setStorageType(int type){
        switch(type){
            case 0:
                storageType = StorageType.fridge;
                break;
            case 1:
                storageType = StorageType.pantry;
                break;
        }
    }
    protected String getStorageTypeStr(){
        return storageType.toString().toLowerCase();
    }


    public void getLocalStorageItems(ArrayList<FoodItem> globalInventory){
        //This should be called when a storage unit is clicked
        //Goes through the global arraylist (from House) and grabs items that belong to it
        // based on storage type and id, then sorts by daysUntilExpiration
        if(allStoredItems != null){
            for(int i = 0; i < allStoredItems.size(); i++){
                if(allStoredItems.get(i).getStorageID() == this.storageId && allStoredItems.get(i).getStorageType().equals(this.storageType.toString())){
                    localStoredItems.add(allStoredItems.get(i));
                }
            }
            //sort localStoredItems by expiration
            Collections.sort(localStoredItems);
        }
    }
    public void addItem(FoodItem item){
        //adds a single item to the storage unit
        localStoredItems.add(item);
    };
    public void removeItem(FoodItem item){
        localStoredItems.remove(item);
    };
    public int getStorageId() {
        return storageId;
    }
    public void setStorageId(int id){
        storageId = id;
    }
    public StorageType getStorageType() {
        return storageType;
    }

    public void setStorageType(StorageType storageType) {
        this.storageType = storageType;
    }

    public static ArrayList<FoodItem> getAllStoredItems() {
        return allStoredItems;
    }

    public static void setAllStoredItems(ArrayList<FoodItem> allStoredItems) {
        Storage.allStoredItems = allStoredItems;
    }

    public ArrayList<FoodItem> getLocalStoredItems() {
        return localStoredItems;
    }

    public void setLocalStoredItems(ArrayList<FoodItem> localStoredItems) {
        this.localStoredItems = localStoredItems;
    }
}
