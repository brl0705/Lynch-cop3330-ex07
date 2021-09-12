package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int length;
        int width;
        int area;

        Scanner input1 = new Scanner(System.in);
        System.out.println("What is the length of your room?");
        length = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("What is the width of your room?");
        width = input2.nextInt();

        System.out.println("You entered the dimensions of " + length + " feet by " + width + " feet.");
        System.out.println("The area is");

        area=length*width;
        double meters=area*0.09290304;
        System.out.println(area + " square feet.");
        System.out.println(meters + " square meters.");
    }
}
