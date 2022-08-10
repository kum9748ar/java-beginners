package Java_Conditionals;

import java.util.Scanner;

public class IsTriangle2 {
    public static void main(String[] args) {
        int a, b, c;
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 sides of a triangle respectively ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        boolean isTraingle = (a + b > c && b + c > a && c + a > b) ? true : false;
        if (isTraingle) {
            s = (a == b && a == c) ? "equilateral" : (a == b || a == c || b == c) ? "isoceles" : "scalene";
            System.out.println(s);
        } else {
            System.out.println("not a triangle");
        }
    }
}
