package Java_Basics;

public class FirstLast {
    public static void main(String[] args) {
        int a = 76498, f = 0, l;
        int a_copy = a;
        l = a % 10;
        while (a > 0) {
            if (a < 10) {
                f = a;
            }
            a = a / 10;
        }

        System.out.println("a= " + a_copy + " first digit is " + f + " last digit is " + l);
    }
}