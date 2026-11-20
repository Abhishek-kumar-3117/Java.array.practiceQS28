import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int element = sc.nextInt();
        int pos = sc.nextInt();

        if (pos < 1 || pos > n + 1) {
            System.out.println("Invalid position");
            return;
        }

        for (int i = n; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos - 1] = element;

        System.out.println(Arrays.toString(arr));
    }
}