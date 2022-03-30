package com.example.w22comp1008lhw11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    private Library library;
    private Book book;

    @BeforeEach
    void setUp() {
        library = new Library("Jaret's Library","55 HappyVale St, Barrie, ON");
        book = new Book("Java 101","Jaret Wright","images/book.png",9.99);

        library.addBook(book);
    }

    @Test
    void addBook() {
        Book book = new Book("Java 102","Jaret Wright","images/book.png",9.99);
        library.addBook(book);
        assertEquals(2, library.getNumOfBooksInLibrary());
    }

    @Test
    void getInventoryValue() {
    }

    @Test
    void getAvgPricePerBook() {
    }

    @Test
    void setLibraryName() {
    }

    @Test
    void setStreetAddress() {
    }
}