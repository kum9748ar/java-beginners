package Java_Conditionals;

import java.util.Scanner;

public class IsMultipleOf7 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        a= sc.nextInt();
        System.out.println("Enter another number");
        b= sc.nextInt();
        boolean result = (a%7==0 && b%7 == 0) ? true: false;
        System.out.println(result);
     
    }
}