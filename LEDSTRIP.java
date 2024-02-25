package org.example;

public class LEDSTRIP {
    private int red;
    private int green;
    private int blue;
    private int dimmer;

    LEDSTRIP(){

        red = 0;
        green = 0;
        blue = 0;
        dimmer = 0;

    }
    public void setRed(int red){
        this.red = red;
    }
    public void setGreen(int green){
        this.green = green;
    }
    public void setBlue(int blue){
        this.blue= blue;
    }
    public void setDimmer(int dimmer)
    {
        this.dimmer = dimmer;
    }
    public boolean setColorByName(String color){
        if (color == "red"){
            setRed(255);
            setBlue(0);
            setGreen(0);
            return true;
        } else if (color =="green") {
            setRed(0);
            setBlue(0);
            setGreen(255);
            return true;
        } else if (color == "blue") {
            setRed(0);
            setBlue(255);
            setGreen(0);
            return true;
        }
        else {
            return false;
        }
    }
    public int getRed()
    {
        return red;
    }

    public int getBlue()
    {
        return blue;
    }

    public int getGreen()
    {
        return green;
    }

    public int getDimmer()
    {
        return dimmer;
    }
    public String getColorByRgb (int red, int blue, int green){
        String rgb = String.valueOf(red) + String.valueOf(green) + String.valueOf(blue);
        if (rgb == "25500"){
            return "red";
        } else if (rgb == "00255") {
            return "green";
        } else if (rgb == "02550") {
            return "blue";
        }
        else {
            return "Error";
        }
    }
    public boolean adjustDimmerPercentage(int percentage){
        if (percentage > 0 &&percentage < 100){
            setDimmer(percentage);
            return true;
        }
        else {
            return false;
        }

    }
}
