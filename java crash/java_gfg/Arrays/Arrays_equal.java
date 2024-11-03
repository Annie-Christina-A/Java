public class Arrays_equal {
    public static void check_arrays_equal(int a[],int b[]){
        boolean result=true;//Arrays.equals(a,b)
        if(a.length==b.length){
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]){
                    result=false;
                }
            }
        }
        else
            result=false;
             if (result == true) {

            
            System.out.println("Arrays are equal");
        }
        else {

            
            System.out.println("Arrays are not equal");
        }
    }
    public static void print(int a[],int b[]){
          for(int i=0;i<a.length;i++)
              System.out.print(a[i]+" ");
      
          System.out.println();
      
          for(int i=0;i<b.length;i++)
              System.out.print(b[i]+" ");
      
          System.out.println();
    }
    public static void main(String[] args) {
        int a[] = { 30, 25, 40 };
        int b[] = { 30, 25, 40 };

          print(a,b);
        check_arrays_equal(a,b); // Check the Two Arrays


    }
}
