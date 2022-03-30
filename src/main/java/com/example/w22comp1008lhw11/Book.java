package com.example.w22comp1008lhw11;

public class Book {
    private String title, author, imageLocation;
    private double price;

    public Book(String title, String author, String imageLocation, double price) {
        this.title = title;
        this.author = author;
        this.imageLocation = imageLocation;
        this.price = price;
    }

    public int getTitleLength()
    {
        return 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null)
            this.title = title;
        else
            throw new IllegalArgumentException("Book title must have at least 1 character");
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
