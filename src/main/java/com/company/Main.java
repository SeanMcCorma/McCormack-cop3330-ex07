package com.company;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sean McCormack
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        int length = Integer.parseInt(scan.nextLine());
        System.out.print("What is the width of the room in feet? ");
        int width = Integer.parseInt(scan.nextLine());
        System.out.println("Your entered dimensions of "+length+" feet by "+width+" feet.");
        System.out.println("The area is");
        int area=length*width;
        System.out.println(area +" square feet");
        double area_metric = (area *0.09290304);
        System.out.printf("%.3f square meters",area_metric);
	// write your code here
    }
}
