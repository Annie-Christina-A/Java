import java.util.*;
public class Square {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int row = scan.nextInt();
        System.out.print("Enter Cols: ");
        int col = scan.nextInt();
        for(int i=1;i<=row;i++){
            if(i==1||i==row){
                for(int k=1;k<=col;k++){
                    System.out.print("*");
                }}
            else{
                System.out.print("*");
                for(int j=2;j<col;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
