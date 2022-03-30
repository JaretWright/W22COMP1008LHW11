package com.example.w22comp1008lhw11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private Rectangle square, rectangle;

    //This method will be called prior to each test running
    //I like to re-initialize my testing variables here so I always have "fresh"
    //objects
    @BeforeEach
    void setUp() {
        square = new Rectangle(20,20);
        rectangle = new Rectangle(20, 30);
    }

    @Test
    void setHeight() {
        rectangle.setHeight(100);
        assertEquals(100, rectangle.getHeight());
    }

    @Test
    void setHeightInvalid(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            rectangle.setHeight(-5);
        });
    }

    @Test
    void setHeightInvalidConstructor(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            rectangle = new Rectangle(0,10);
        });
    }


    @Test
    void setWidth() {
        rectangle.setWidth(10);
        assertEquals(10, rectangle.getWidth());
    }

    @Test
    void setWidthInvalid(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            rectangle.setWidth(0);
        });
    }

    @Test
    void setWidthInvalidConstructor(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            rectangle = new Rectangle(10,0);
        });
    }

    @Test
    void getPerimeterSquare() {
        assertEquals(80, square.getPerimeter());
    }

    @Test
    void getPerimeterRectangle() {
        assertEquals(100, rectangle.getPerimeter());
    }

    @Test
    void getAreaSquare() {
        assertEquals(400, square.getArea());
    }

    @Test
    void getAreaRectangle() {
        assertEquals(600, rectangle.getArea());
    }
}