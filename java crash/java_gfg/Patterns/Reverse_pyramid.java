import java.util.*;
public class Reverse_pyramid {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        scan.close();
    }
}
