package Java_loops;

public class Loop6 {

  public static void main(String[] args) {
    int n, i = 1;
    n = Integer.parseInt(args[0]);
    while (i * i - 1 <= n) {
      System.out.print(i * i - 1 + " ");
      i++;
    }
  }
}
