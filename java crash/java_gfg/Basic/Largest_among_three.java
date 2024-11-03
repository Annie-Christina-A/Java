public class Largest_among_three {
    public void largest(int a, int b, int c){
        if(a>b){
            if(a>c)
                System.out.println("a is big");
            else
                System.out.println("c is big");
            
        }
        else{
            if(b>c)
                System.out.println("B is big");
            
            else
                 System.out.println("c is big");
            
        }
    }
    public static void main(String[] args){
        Largest_among_three res = new Largest_among_three();
        res.largest(8, 5, 7);

    }
}
