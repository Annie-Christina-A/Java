public class Prime {
    static boolean isPrime(int n){
        if(n>1){
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    return false;
                }

            }
            return true;
        }
        else
        return false;
    }
    public static void main(String[] args){
        if(isPrime(7)){
            System.out.println("TRUE");
        }
        else
            System.out.println("FALSE");

    }
}
