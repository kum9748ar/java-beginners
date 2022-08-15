package Java_loops;

public class Loop9 {

  public static void main(String[] args) {
    int n, i = 0, j = 0;
    n = Integer.parseInt(args[0]);
    while (i <= n) {
      if (j==0){
        
      }
        if (j % 2 != 0) {
        i += j;
        System.out.print(i + " ");
      }
      j++;
    }
  }
}
