public class LCM {
    static int lcm(int a,int b){
        int ans=a>b?a:b;
        while(true){
        if(ans%a==0 && ans%b==0)
            break;
        ans++;
        }
        return ans;
    }
    public static void main(String[] args){
        int result=lcm(12, 6);
        System.out.println(result);
    }
}
