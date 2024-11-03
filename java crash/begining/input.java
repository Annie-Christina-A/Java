
import java.util.Scanner;
class Arr{
public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=scan.nextInt();
    int[] arr=new int[n]; 
    for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
    }
    System.out.println("middle value:"+arr[n/2]);
}}