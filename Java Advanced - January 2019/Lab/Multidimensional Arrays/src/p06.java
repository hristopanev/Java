import java.util.Arrays;
import java.util.Scanner;

public class p06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            int[] rowData = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = rowData;
        }

        for (int row = 0; row < n; row++) {
            System.out.print(matrix[row][row] + " ");
        }
        System.out.println();

        for (int row = 0; row < n; row++) {
            System.out.print(matrix[n - 1 - row][row] + " ");
        }
        System.out.println();
    }
}
