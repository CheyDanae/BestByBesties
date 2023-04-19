package edu.utsa.android.bestbuybesties.model;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class FoodItem implements Comparable<FoodItem>{
    String foodType,addedDate,storageType,expirationDate;
    int itemID, storageID, itemQuantity,
            exMonth, exDay, exYear,
            initMonth, initDay, initYear, daysTilExpiration;

    int expiryThreshold = 4;

    @Override
    public int compareTo(FoodItem o) {
        int a = this.daysTilExpiration;
        int b = o.getDaysTilExpiration();
        return b - a;
    }

    FoodItem(int id, String name, String expirationDate, String addedDate, int itemQuantity, String storageType, int storageID){
        setItemID(id);
        setFoodType(name);
        setAddedDate(addedDate);
        setExpirationDate(expirationDate);
        setItemQuantity(itemQuantity);
        isExpiring();
        setStorageType(storageType);
        setStorageID(storageID);
    }

    public String getAddedDate() {
        return String.format(Locale.US, "%d-%d-%d", initMonth, initDay, initYear);
    }

    public void setAddedDate(String addedDate) {
        String[] datePieces = addedDate.split("-");
        setInitMonth(Integer.parseInt(datePieces[1]));
        setInitDay(Integer.parseInt(datePieces[2]));
        setInitYear(Integer.parseInt(datePieces[0]));
        this.addedDate = addedDate;
    }

    public int getItemID(){
        return itemID;
    }
    public void setItemID(int id){
        itemID = id;
    }

    public int getStorageID() {
        return storageID;
    }

    public void setStorageID(int storageID) {
        this.storageID = storageID;
    }

    public boolean isExpiring(){
        //check expiryDate vs added date...
        if(exYear == initYear){
            if(exMonth == initMonth)
            {
                daysTilExpiration = exDay - initDay; //for sorting
                return daysTilExpiration <= expiryThreshold;
            }
        }
        return false;
    }

    public boolean isExpired(){
        //Checks current date vs expiry date. Returns true if they match
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy", Locale.US);
        String currentDate = dateFormat.format(new Date());
        String[] datePieces = currentDate.split("-");
        int currYr = Integer.parseInt(datePieces[2]);
        int currDy = Integer.parseInt(datePieces[1]);
        int currMo = Integer.parseInt(datePieces[0]);

        if(exYear == currYr){
            if(exMonth == currMo)
            {
                return exDay == currDy;
            }
        }
        return false;
    }
    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getExpirationDate(){
        return String.format(Locale.US,"%d-%d-%d",exMonth, exDay, exYear );
    }
    public void setExpirationDate(String expirationDate) {
        String[] datePieces = expirationDate.split("-");
        setExMonth(Integer.parseInt(datePieces[1]));
        setExDay(Integer.parseInt(datePieces[2]));
        setExYear(Integer.parseInt(datePieces[0]));
        this.expirationDate = expirationDate;
    }

    public int getExpiryThreshold() {
        return expiryThreshold;
    }

    public void setExpiryThreshold(int expiryThreshold) {
        this.expiryThreshold = expiryThreshold;
    }

    public int getExMonth() {
        return exMonth;
    }

    public void setExMonth(int exMonth) {
        this.exMonth = exMonth;
    }

    public int getExDay() {
        return exDay;
    }

    public void setExDay(int exDay) {
        this.exDay = exDay;
    }

    public int getExYear() {
        return exYear;
    }

    public void setExYear(int exYear) {
        this.exYear = exYear;
    }

    public int getInitMonth() {
        return initMonth;
    }

    public void setInitMonth(int initMonth) {
        this.initMonth = initMonth;
    }

    public int getInitDay() {
        return initDay;
    }

    public void setInitDay(int initDay) {
        this.initDay = initDay;
    }

    public int getInitYear() {
        return initYear;
    }

    public void setInitYear(int initYear) {
        this.initYear = initYear;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public int getDaysTilExpiration() {
        return daysTilExpiration;
    }

    public void setDaysTilExpiration(int daysTilExpiration) {
        this.daysTilExpiration = daysTilExpiration;
    }

}
