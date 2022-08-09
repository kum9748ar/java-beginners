package Java_Basics;

public class SumOfLastDigits {
    public static void main(String[] args) {
        int a = 234, b = 456, c = 712;
        int d = a % 10 + b % 10 + c % 10;
        System.out.println(d);
    }
}
