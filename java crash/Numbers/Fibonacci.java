public class Fibonacci {
    static void Fibo(int n, int a, int b){
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<n;i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
    public static void main(String[] args){
            Fibo(5,0,1);
    }
}
