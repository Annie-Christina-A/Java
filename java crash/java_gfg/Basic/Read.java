import java.util.Scanner;
public class Read{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number");
    int num=scan.nextInt();
    System.out.println(num);
    scan.close();
}
}