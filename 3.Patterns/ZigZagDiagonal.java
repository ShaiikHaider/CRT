public class ZigZagDiagonal {

    public static void main(String[] args) {

        int n = 4;
        int[][] a = new int[n][n];

        int num = 1;

        for (int d = 0; d <= 2 * (n - 1); d++) {

            if (d % 2 == 0) {

                for (int i = Math.min(d, n - 1); i >= 0; i--) {

                    int j = d - i;

                    if (j < n)
                        a[i][j] = num++;
                }
            }
            else {

                for (int i = 0; i <= Math.min(d, n - 1); i++) {

                    int j = d - i;

                    if (j < n)
                        a[i][j] = num++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}