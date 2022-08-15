package Java_loops;

public class LoopA {

  public static void main(String args[]) {
    int i, n;
    n = Integer.parseInt(args[0]);
    for (i = 2; i <= n; i += 2) {
      System.out.print(i + " ");
    }
  }
}
