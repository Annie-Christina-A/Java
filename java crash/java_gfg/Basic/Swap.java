import java.util.*;
public class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int m=sc.nextInt();
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        System.out.println("Before swaping");
        System.out.println(m);
        System.out.println(n);
        int k;
        k=m;
        m=n;
        n=k;
        System.out.println("After swaping");

        System.out.println(m);
        System.out.println(n);
        sc.close();
    }
}
