package org.example;

import java.util.ArrayList;
import java.util.List;

public class Photo {

    private int widthPhoto;
    private int heightPhoto;
    private String descriptionPhoto;
    private List<String> listOfPeople;
    private int dpiPhoto;

    Photo(int widthPhoto, int heightPhoto, String descriptionPhoto, int dpiPhoto,  List<String> listOfPeople){
        this.widthPhoto = widthPhoto;
        this.heightPhoto = heightPhoto;
        this.descriptionPhoto = descriptionPhoto;
        this.listOfPeople = new ArrayList<>(listOfPeople);
        this.dpiPhoto = dpiPhoto;
    }

    public void setWidthPhoto(int widthPhoto){
        this.widthPhoto = widthPhoto;
    }
    public int getWidthPhoto(){
        return this.widthPhoto;
    }
    public void setHeightPhoto(int heightPhoto){
        this.heightPhoto = heightPhoto;
    }
    public int getHeightPhoto(){
        return this.heightPhoto;
    }
    public void setDescriptionPhoto(String descriptionPhoto){
        this.descriptionPhoto = descriptionPhoto;
    }
    public String getDescriptionPhoto(){
        return this.descriptionPhoto;
    }
    public void setDpiPhoto(int dpiPhoto){
        this.dpiPhoto = dpiPhoto;
    }
    public int getDpiPhoto(){
        return this.dpiPhoto;
    }
    public boolean isPhotoPrintable(){
        if (getDpiPhoto() >= 150 && getHeightPhoto() > 585 && getWidthPhoto() > 875){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isGroupPhoto(){
        if(listOfPeople.size() >= 2){
            return true;
        }
        else {
            return false;
        }
    }







}
