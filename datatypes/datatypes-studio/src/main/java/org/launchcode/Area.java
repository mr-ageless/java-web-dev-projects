package org.launchcode;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input;
        double radius;
        double areaOfCircle;

        input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        radius = input.nextDouble();
//areaOfCircle = 3.14 * radius * radius;
        areaOfCircle = Circle.getArea(radius);
        System.out.println(areaOfCircle);
    }
}