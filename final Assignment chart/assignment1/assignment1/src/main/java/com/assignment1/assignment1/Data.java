package com.assignment1.assignment1;


public class Data {

    int index;
    String language;
    int percentage;

    public Data(int index, String language, int percentage) {
        this.index = index;
        this.language = language;
        this.percentage = percentage;
    }

    public Data() {

    }





    public int getIndex() {
        return index;
    }

    public String getLanguage() {
        return language;
    }

    public int getPercentage() {
        return percentage;
    }


    public void setIndex(int index) {
        this.index = index;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}
