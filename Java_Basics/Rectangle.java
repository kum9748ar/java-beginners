package Java_Basics;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        double l, b, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter length ");
        l = sc.nextDouble();
        System.out.println("Eneter breadth ");
        b = sc.nextDouble();
        d = Math.sqrt(l * l + b * b);
        System.out.println("The diagonal is " + d);
    }
}
