package Java_loops;

public class Loop8 {

  public static void main(String[] args) {
    int n, i=2,j=0;
    n = Integer.parseInt(args[0]);
    while(i<=n){
        i+=j;
        System.out.print(i+" ");
        j+=2;
    }
  }
}
