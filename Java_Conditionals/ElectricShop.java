package Java_Conditionals;

import java.util.Scanner;

public class ElectricShop {
    public static void main(String args[]) {
        String name, address;
        double pa, discount, net_amount;
        char category;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name , address and purchase amount followed bya \"Space\"");
        name = sc.next();
        address = sc.next();
        pa = sc.nextDouble();
        System.out.println("Enter  \"L\" for Laptop  and \"D\" for Desktop");
        category = sc.next().charAt(0);
        sc.close();
        if (category == 'L') {
            discount = (pa >= 0 && pa <= 2500) ? 0
                    : (pa >= 2501 && pa <= 57000) ? 5 : (pa >= 57001 && pa <= 100000) ? 7 : 10;
        } else {
            discount = (pa >= 0 && pa <= 2500) ? 5
                    : (pa >= 2501 && pa <= 57000) ? 7.5 : (pa >= 57001 && pa <= 100000) ? 10 : 15;
        }
        net_amount = pa - (discount / 100) * pa;
        System.out.println("Bill\nCustomer Name: " + name + "\tCategory: " + category + "\tpurchase amount:" + pa
                + "\t disount:" + discount + "%\tNet Amount: Rs. " + net_amount);

    }
}