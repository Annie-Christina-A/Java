public class Compound_interest {
    static double Calculate(float p, float r, double t){
        double sum=p * (Math.pow((1 + r / 100), t));
        return sum;
    }
    public static void main(String[] args){
        System.out.println(Calculate(1200, 2, 5.4));
    }
}
