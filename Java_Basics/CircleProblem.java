package Java_Basics;

import java.util.Scanner;

public class CircleProblem {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a circle");
        int radius = sc.nextInt();
        double area = Math.sqrt(radius) * pi;
        double circumference = 2 * pi * radius;
        System.out.println(
                "The area of the circle is " + area + "and the circumference of the circle is " + circumference);
    }
}
