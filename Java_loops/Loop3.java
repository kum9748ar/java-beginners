package Java_loops;

public class Loop3 {

  public static void main(String[] args) {
    int n, i;
    n = Integer.parseInt(args[0]);
    System.out.println("First Implementation ");
    for (i = 1; i <= n; i++) {
      if (i % 7 == 0) {
        System.out.print(i + " ");
      }
    }
    int j =7;
    System.out.println("\nSecond Implementation ");
    while (j <= n) {
      System.out.print(j + " ");
      j += 7;
    }
  }
}
