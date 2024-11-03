import java.util.Arrays;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        Integer[] arr={1,2,5,0,-4};
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

    }
}
