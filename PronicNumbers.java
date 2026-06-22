public class BitsToFlip {
    public static int countBitsToFlip(int a, int b) {
        int xor = a ^ b;
        int count = 0;
        while (xor != 0) {
            count += xor & 1;
            xor >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(countBitsToFlip(a, b));
    }
}
