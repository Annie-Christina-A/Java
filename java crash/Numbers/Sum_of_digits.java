class Sum_of_digits{
    static int sum(int n){
        int Sum=0;
        while(n>0){
            Sum=Sum+n%10;
            n=n/10;
        }
        return Sum;
    }
    public static void main(String[] args){
    int n=1234;
    int result = sum(n);
    System.out.println("the sum of digits is "+result);
}

}
