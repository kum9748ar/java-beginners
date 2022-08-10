package Java_Conditionals;

import java.util.Scanner;

public class IsTriangle {
    public static void main(String[] args) {
        int a, b, c;
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values of a ,b , c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int sum = a + b + c;
        if (sum == 180) {
            if (a == b && a == c) {
                s = "equilateral";
            } else if (a == b || a == c || b == c) {
                s = "isoseles";
            }

            else {
                s = "scalene";
            }

            System.out.println(s);
            System.out.println("sum of triangle is " + sum);
        } else {
            System.out.println("not a tringle");
        }

    }
}
