public class NumberPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // Two spaces
            }

            // Print increasing numbers
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            // Print decreasing numbers
            num -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(num + " ");
                num--;
            }

            // Move to the next line
            System.out.println();
        }
    }
}
