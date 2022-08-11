package Java_Conditionals;

import java.util.Scanner;

public class ClothStore {
    public static void main(String[] args) {
        double pa, tc, discount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter purchase amount");
        pa = sc.nextInt();
        discount = (pa <= 2000) ? 5 : (pa >= 2001 && pa <= 5000) ? 25 : (pa >= 5001 && pa <= 10000) ? 35 : 50;
        tc = pa - (discount / 100 * pa);
        System.out.println("purchase amount : " +pa+" discount : "+discount+" total amount : " +tc);
    }
}
