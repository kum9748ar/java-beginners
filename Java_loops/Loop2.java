package Java_loops;

public class Loop2 {

  public static void main(String[] args) {
    int n, i;
    n = Integer.parseInt(args[0]);
    for (i = 1; i <= n; i++) {
      if (i % 2 != 0) {
        System.out.print(i+ " ");
      }
    }
  }
}
