package com.example.w22comp1008lhw11;

public class Book {
    private String title, author, imageLocation;
    private double price;

    public Book(String title, String author, String imageLocation, double price) {
        setTitle(title);
        setAuthor(author);
        setImageLocation(imageLocation);
        setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    /**
     * The title must be at least 1 character in length
     * @param title
     */
    public void setTitle(String title) {
        title = title.trim();
        if (title.length()>= 1)
            this.title = title;
        else
            throw new IllegalArgumentException("Book title must have at least 1 character");
    }

    public String getAuthor() {
        return author;
    }

    /**
     * The author must have at least 2 characters in the name.  This method will validate
     * and set the instance variable
     * @param author
     */
    public void setAuthor(String author) {
        if (author.trim().length()>=2)
            this.author = author.trim();
        else
            throw new IllegalArgumentException("Author name must be 2 or more characters");
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        if (imageLocation.startsWith("images/"))
            this.imageLocation = imageLocation;
        else
            throw new IllegalArgumentException("the image location must start with 'images/'");
    }

    public double getPrice() {
        return price;
    }

    /**
     * Valid book prices are in then range 0-2000 inclusive
     * @param price 0 to 2000
     */
    public void setPrice(double price) {
        if (price >=0 && price <=2000)
            this.price = price;
        else
            throw new IllegalArgumentException("price must be in the range 0-2000");
    }
}
