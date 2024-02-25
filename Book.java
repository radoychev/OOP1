package org.example;

public class Book {


    private String nameBook;
    private String authorBook;
    private boolean isHardCover;
    private double priceBook;
    private int pagesBook;
    private int timesReadBook;

    public Book(String nameBook, String authorBook, boolean isHardCover, double priceBook, int pagesBook, int timesReadBook){
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.isHardCover = isHardCover;
        this.priceBook = priceBook;
        this.pagesBook = pagesBook;




        this.timesReadBook = 0;



    }

    public void setNameBook(String nameBook){
        this.nameBook = nameBook;

    }
    public String getNameBook(){
        return this.nameBook;
    }
    public void setAuthorBook(String authorBook){

        this.authorBook = authorBook;
    }
    public String getAuthorBook(){

        return this.authorBook;
    }
    public void setIsHardCover(boolean isHardCover){

        this.isHardCover = isHardCover;
    }
    public boolean getIsHardCover(){

        return this.isHardCover;
    }
    public void setPriceBook(double priceBook){

        this.priceBook = priceBook;
    }
    public double getPriceBook(){

        return this.priceBook;
    }
    public void setPagesBook(int pagesBook){

        this.pagesBook = pagesBook;
    }
    public int getPagesBook(){

        return this.pagesBook;
    }
    public int readBook(){
        return timesReadBook+=1;
    }
    public int getTimesReadBook(){
        return this.timesReadBook;
    }
    public double getAverageReadTime(){
        double timeToRead = this.pagesBook / 0.8;
        return timeToRead;
    }
    public String readingAdvice(){
        if (getAverageReadTime() < 61){
            return "You can read it";
        }
        else if(getAverageReadTime()> 60 && getAverageReadTime() <240){
            return "Are you sure you want to read this now?";
        }
        else{
            return "You should not start reading this now";
        }

    }



}
