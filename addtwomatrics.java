import java.util.Scanner;
public class addtwomatrics {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        input.nextLine();
        int[][] arr = new int[m][n];
        int [][] num = new int[m][n];
        int [][] result = new int[m][n];
        for (int i = 0;i < m;i++) {
            for (int j = 0;j < n;j++) {
                arr[i][j] = input.nextInt();
            }
        }
        for (int i = 0;i < m;i++) {
            for (int j = 0;j < n;j++) {
                num[i][j] = input.nextInt();
            }
        }
        for (int i = 0;i < m;i++) {
            for (int j = 0;j < n;j++) {
                result[i][j] = arr[i][j] + num[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}