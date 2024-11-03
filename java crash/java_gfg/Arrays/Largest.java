import java.util.*;
public class Largest {
    static void greater(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] a=new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a numbers: ");
        int n=scan.nextInt();
        System.out.println("Enter "+ n+ " numbers: ");
        for(int i=1;i<=n;i++){
            a[i]=scan.nextInt();
        }
        greater(a);
        scan.close();
        
    }
}
