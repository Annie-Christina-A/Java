public class GCD {
    static int gcd(int a, int b){
        int result=Math.min(a,b);
        while(result>0){
            if(a%result==0 && b%result==0){
                break;
            }
            result--;
        }
        return result;
    }
    public static void main(String[] args){
        int output=gcd(98, 56);
            System.out.println(output);
    }
}
