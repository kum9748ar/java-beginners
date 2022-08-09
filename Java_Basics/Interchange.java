package Java_Basics;

public class Interchange {
    public static void main(String[] args) {
        int a = 5, b = 6, temp;
        System.out.println("a =" + a + " b=" + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Interchange");
        System.out.println("a =" + a + " b=" + b);

    }
}