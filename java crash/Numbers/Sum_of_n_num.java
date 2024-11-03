public class Sum_of_n_num {
    static int sum(int n){
        int result=n*(n+1)/2;
        return result;
    }
    public static void main(String[] args){
        int ans = sum(5);
        System.out.println(ans);
    }
}
