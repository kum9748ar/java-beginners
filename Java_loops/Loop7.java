package Java_loops;

public class Loop7 {
    public static void main(String[] args) {
        int n,i=1,j=0;
        n = Integer.parseInt(args[0]);
        while(i<=n){
            i=i+j;
            System.out.print(i+" ");
            j++;
        }

    }
}
