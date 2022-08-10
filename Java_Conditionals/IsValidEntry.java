package Java_Conditionals;

import java.util.Scanner;

public class IsValidEntry {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        a = sc.nextInt();
        System.out.println("Enter another number");
        b = sc.nextInt();
        while (a <= 0) {
            System.out.println("Invalid Input ");
            System.out.println("Enter a number");
            a = sc.nextInt();
        }
        while (b <= 0) {
            System.out.println("Invalid Input ");
            System.out.println("Enter a number");
            b = sc.nextInt();
        }

        int result = (a > b) ? a / b : b / a;
        System.out.println(result);
    }

}
