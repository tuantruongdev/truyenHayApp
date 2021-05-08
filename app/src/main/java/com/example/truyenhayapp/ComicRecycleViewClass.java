package com.example.truyenhayapp;

public class ComicRecycleViewClass {
    String comicType;
    String comicName;

    public ComicRecycleViewClass(String comicType, String comicName) {
        this.comicType = comicType;
        this.comicName = comicName;
    }

    public String getComicType() {
        return comicType;
    }

    public void setComicType(String comicType) {
        this.comicType = comicType;
    }

    public String getComicName() {
        return comicName;
    }

    public void setComicName(String comicName) {
        this.comicName = comicName;
    }
}
