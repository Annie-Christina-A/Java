public class Pascals_tri {
    public static void main(String[] args){
        
        int n = 5; // Number of rows

        // Outer loop for each row
        for (int i = 0; i < n; i++) {
            // Print leading spaces for alignment
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }

            // Calculate and print values in the row
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); // Calculate the next number
            }
            System.out.println(); // Move to the next line
        }
    }
}

    

