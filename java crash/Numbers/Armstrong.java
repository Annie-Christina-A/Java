public class Armstrong {
    static int armstrong(int n){
        int sum=0;
        while(n>0){
            int rev=n%10;
            sum=sum+rev*rev*rev;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args){
        int n=153;
        int result=armstrong(n);
        if(n==result)
        System.out.println("Armstrong");
        else
        System.out.println("Not an Armstrong");
    }
}
