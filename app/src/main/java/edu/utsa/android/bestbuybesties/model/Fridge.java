package edu.utsa.android.bestbuybesties.model;

public class Fridge extends Storage{

    Fridge(int fridgeID){
        this.setStorageId(fridgeID);
        this.setStorageType(0);
    };

    /*@Override
    public String getIconName() {
        return getStorageTypeStr();
    }*/

}
