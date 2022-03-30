package com.example.w22comp1008lhw11;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private String libraryName, streetAddress;

    /**
     * This is the constructor for the book class.  When it is called it will create space in system
     * memory to hold a library object
     * @param libraryName - a String representing the name of the library (must be 2 or more characters)
     * @param streetAddress - a Street address
     */
    public Library(String libraryName, String streetAddress) {
        this.libraryName = libraryName;
        this.streetAddress = streetAddress;
        books = new ArrayList<>();
    }

    /**
     * This method receives a Book object and adds it to the library without any validation
     * @param book
     */
    public void addBook(Book book)
    {
        books.add(book);
    }

    public double getInventoryValue()
    {
        return -1;
    }

    public int getNumOfBooksInLibrary()
    {
        return books.size();
    }

    public double getAvgPricePerBook()
    {
        return -1;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
}
