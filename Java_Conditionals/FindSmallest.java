package Java_Conditionals;

import java.security.DrbgParameters.Reseed;
import java.util.Scanner;

public class FindSmallest {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        a = sc.nextInt();
        System.out.println("Enter a number");
        b = sc.nextInt();
        System.out.println("Enter a number");
        c = sc.nextInt();
        int res = (a < b && a < c) ? a : (b < c && b < c) ? b : c;
        System.out.println(res);
    }
}
