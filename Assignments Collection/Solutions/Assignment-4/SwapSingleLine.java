public class SwapSingleLine {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        a = a + b - (b = a);

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}