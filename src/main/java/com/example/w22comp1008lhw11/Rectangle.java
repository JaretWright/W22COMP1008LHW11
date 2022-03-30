package com.example.w22comp1008lhw11;

public class Rectangle {
    private double height, width;
    private int posX, posy;

    public Rectangle(double height, double width) {
        setHeight(height);
        setWidth(width);
        posX = 0;
        posy = 0;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public double getHeight() {
        return height;
    }

    /**
     * This will set the height variable, it must be greater than 0
     * @param height
     */
    public void setHeight(double height) {
        if (height>0)
            this.height = height;
        else
            throw new IllegalArgumentException("height must be greater than 0");
    }

    public double getWidth() {
        return width;
    }

    /**
     * This will set the width for the rectangle.  Valid width must be greater than 0
     * @param width > 0
     */
    public void setWidth(double width) {
        if (width>0)
            this.width = width;
        else
            throw new IllegalArgumentException("width must be greater than 0");
    }

    /**
     * The perimeter is 2x length + 2x width
     * @return
     */
    public double getPerimeter()
    {
        return 2*width + 2*height;
    }

    /**
     * The area is height * width
     * @return the area of the rectangle
     */
    public double getArea()
    {
        return height*width;
    }
}
