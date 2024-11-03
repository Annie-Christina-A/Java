import java.util.*;
public class Binary_string {
    static String binary_to_decimal(String a, String b){
        int str1=Integer.parseInt(a,2);
        int str2=Integer.parseInt(b,2);
        int add=str1+str2;
        String result = Integer.toBinaryString(add);
        return result;

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String str1 = scan.nextLine();
        System.out.print("Enter a binary number: ");
        String str2 = scan.nextLine();
        String output = binary_to_decimal(str1, str2);
        System.out.print(output);
        scan.close();

    }
}
