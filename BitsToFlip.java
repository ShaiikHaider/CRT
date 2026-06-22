public class UniqueNumbers {
    public static void main(String[] args) {
        for (int num = 100; num <= 999; num++) {
            int a = num / 100;
            int b = (num / 10) % 10;
            int c = num % 10;
            if (a != b && b != c && a != c) {
                System.out.print(num + " ");
            }
        }
    }
}
