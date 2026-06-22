public class MissingNumber {
    public static int findMissing(int[] arr) {
        int n = arr.length;
        int xor1 = 0, xor2 = 0;
        for (int i = 0; i <= n; i++) xor1 ^= i;
        for (int num : arr) xor2 ^= num;
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 4};
        System.out.println(findMissing(arr));
    }
}
