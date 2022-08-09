package Java_Basics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal amount");
        int principal_amount = sc.nextInt();
        System.out.println("Enter the rate of interest");
        double rate_of_interest = sc.nextDouble();
        System.out.println("Enter the number of years ");
        int time = sc.nextInt();
        double simple_interest = (principal_amount * rate_of_interest * time) / 100;
        System.out.println("Your simple interest becomes " + simple_interest);
    }
}