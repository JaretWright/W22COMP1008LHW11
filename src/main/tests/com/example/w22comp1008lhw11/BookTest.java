package com.example.w22comp1008lhw11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book book;
    private String nullTitle;

    @BeforeEach
    void setUp() {
        book = new Book("Java 101","Jaret Wright","images/book.png",9.99);
    }

    @Test
    void setTitle() {
        book.setTitle("All things Great!");
        assertEquals("All things Great!", book.getTitle());
    }

    @Test
    void setTitleInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            book.setTitle("");
        });
    }

    @Test
    void setTitleInvalid2() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            book.setTitle("    ");
        });
    }

    @Test
    void setTitleInvalidNull() {
        Assertions.assertThrows(NullPointerException.class, ()->{
            book.setTitle(nullTitle);
        });
    }

    @Test
    void setAuthor() {
        book.setAuthor("Jaret");
        assertEquals("Jaret", book.getAuthor());
    }

    @Test
    void setAuthor2() {
        book.setAuthor("  Jaret ");
        assertEquals("Jaret", book.getAuthor());
    }

    @Test
    void setAuthorInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            book.setAuthor("");
        });
    }

    @Test
    void setAuthorInvalid2() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            book.setAuthor(" B ");
        });
    }

    @Test
    void setImageLocation() {
        book.setImageLocation("images/someImage.png");
        assertEquals("images/someImage.png",book.getImageLocation());
    }

    @Test
    void setImageLocationInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            book.setImageLocation("bookCover.png");
        });
    }

    //Book prices range from 0 to 2000
    @Test
    void setPriceLow() {
        book.setPrice(0);
        assertEquals(0,book.getPrice());
    }

    //Book prices range from 0 to 2000
    @Test
    void setPriceHigh() {
        book.setPrice(2000);
        assertEquals(2000,book.getPrice());
    }

    @Test
    void setPriceInvalidLow() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            book.setPrice(-0.01);
        });
    }

    @Test
    void setPriceInvalidHigh() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            book.setPrice(2000.01);
        });
    }

    @Test
    void constructorInvalidTitle() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            book = new Book(" ","Jaret","images/photo.png",9.99);
        });
    }

    @Test
    void constructorInvalidAuthor() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            book = new Book("Java "," J ","images/photo.png",9.99);
        });
    }

    @Test
    void constructorInvalidImageLocation() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            book = new Book("Java "," Jaret ","photo.png",9.99);
        });
    }

    @Test
    void constructorInvalidPriceLow() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            book = new Book("Java "," Jaret ","images/photo.png",-1);
        });
    }

    @Test
    void constructorInvalidPriceHigh() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            book = new Book("Java "," Jaret ","images/photo.png",10000);
        });
    }
}