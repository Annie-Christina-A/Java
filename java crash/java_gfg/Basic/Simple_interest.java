public class Simple_interest {
    static float Calculate(float p, float r, float t){
        float sum = (p*r*t)/100;
        return sum;
    }
    public static void main(String[] args){
        System.out.println(Calculate(10000,5,5));
    }
}
