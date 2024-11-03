public class Reverse {
    static int reverse(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args){
        int result=reverse(1234);
        System.out.println(result);
    }
}
