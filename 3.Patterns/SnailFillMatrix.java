public class SnailFillMatrix {
    public static void main(String[] args) {

        int n = 4;
        int[][] a = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        int num = 1;

        while (top <= bottom && left <= right) {

            // Left to Right
            for (int i = left; i <= right; i++)
                a[top][i] = num++;
            top++;

            // Top to Bottom
            for (int i = top; i <= bottom; i++)
                a[i][right] = num++;
            right--;

            // Right to Left
            for (int i = right; i >= left; i--)
                a[bottom][i] = num++;
            bottom--;

            // Bottom to Top
            for (int i = bottom; i >= top; i--)
                a[i][left] = num++;
            left++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}