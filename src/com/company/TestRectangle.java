package com.company;


public class TestRectangle {

    public static void main(String[] args) {
        Main.Rectangle rectangle1 = new Main.Rectangle(4, 40);
        Main.Rectangle rectangle2 = new Main.Rectangle(3.5, 35.9);

        System.out.println("Your Rectangle 1 \n"+ rectangle1.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle1.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle1.getArea());

        System.out.println("=================================================================");

        System.out.println("Your Rectangle 2 \n"+ rectangle2.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle2.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle2.getArea());
    }

}
