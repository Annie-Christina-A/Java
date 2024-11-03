public class Perimeter_rec {
    static int Calc(int length, int breadth){
        int perimeter=2*(length+breadth);
        return perimeter;
    }
    public static void main(String[] args){
        System.out.println(Calc(5, 7));
    }
}
