package Java_loops;

public class Loop5 {
public static void main(String[] args) {
    int n,i=1;
    n= Integer.parseInt(args[0]);
    while(i*i<=n){
        System.out.print(i*i+" ");
        i++;
    }
}    
}
