package Java_Basics;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        double length, area = 100, perimeter = 0;
        System.out.println("Enter the area");
        Scanner sc = new Scanner(System.in);
        area = sc.nextDouble();
        length = Math.sqrt(area);
        perimeter = 4 * length;
        System.out.println("length = " + length + " area = " + area + " perimeter = " + perimeter);

    }
}
