public class Fibonacci {
    static int fibo(int n){
        if(n<=0)
            return 0;
        int fib[] = new int[2*n+1];
        fib[0]=0;
        fib[1]=1;
        int s=0;
        for(int j=2;j<=2*n;j++){
            fib[j]=fib[j-1]+fib[j-2];
            if(j%2==0)
            s+=fib[j];
        }
        return s;
    }
    public static void main(String[] args){
        int output = fibo(7);
        System.out.println(output);
    }
}
