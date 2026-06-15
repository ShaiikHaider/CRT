public class operations {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println("AND  = " + (a & b));
        System.out.println("OR   = " + (a | b));
        System.out.println("XOR  = " + (a ^ b));
        System.out.println("NOT a= " + (~a));
        System.out.println("NOT b= " + (~b));
        System.out.println("a<<1 = " + (a << 1));
        System.out.println("a>>1 = " + (a >> 1));
        System.out.println("a>>>1= " + (a >>> 1));
    }
}