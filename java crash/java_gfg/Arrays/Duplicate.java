import java.util.*;;
public class Duplicate {
    static int find_duplicate(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("n: ");
        int n=scan.nextInt();
        System.out.println(n+" numbers: ");
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        int unique = find_duplicate(a);
        System.out.println("Array after removing duplicate");
        System.out.println(Arrays.toString(a));
        for(int i=0;i<unique;i++)
        System.out.print(a[i]+" ");
        scan.close();

    }
}
