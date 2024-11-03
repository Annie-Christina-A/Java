public class Factorial {
    static int factorial(int n){
        int sum=1;
        if(n==1)
            return 1;
        else{
            for(int i=2;i<=n;i++){
                sum=sum*i;
            }
            return sum;
        }

    }
    public static void main(String[] args){
        int result = factorial(5);
        System.out.println(result);
    }
}
