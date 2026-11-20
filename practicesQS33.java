// Delete an Element from an Array

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int pos = sc.nextInt();

        if (pos < 1 || pos > n) {
            System.out.println("Invalid position");
            return;
        }

        for (int i = pos - 1; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        int[] result = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            result[i] = arr[i];
        }

        System.out.println(Arrays.toString(result));
    }
}