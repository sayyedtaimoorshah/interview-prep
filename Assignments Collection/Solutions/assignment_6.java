import java.util.Scanner;

public class assignment_6 {

    public static void main(String[] args) {

        two();
    }
    static void one(){
        Scanner sc = new Scanner(System.in);
        // 1. Convert PKR to USD
        final double RATE = 184.23; // 1 USD = 184.23 PKR
        System.out.print("Enter amount in PKR: ");
        double pkr = sc.nextDouble();
        double usd = pkr / RATE;
        System.out.println("Amount in USD = " + usd);

    }
    static void two(){
        Scanner sc = new Scanner(System.in);

         // 2. Rotate a three-digit number to the right
        System.out.print("\nEnter a three-digit number: ");
        int num = sc.nextInt();

        int lastDigit = num % 10;
        int remaining = num / 10;
        int rotated = lastDigit * 100 + remaining;

        System.out.println("Rotated number = " + rotated);
    }
    static void three(){
        // 3. boolean x = 10 > 8 > 4  (correct logic using &&)
        boolean x1 = (10 > 8) && (8 > 4);
        System.out.println("\nValue of x for (10 > 8 && 8 > 4) = " + x1);
    }
    static void four(){
          // 4. x = !(2 > -2)
        boolean x2 = !(2 > -2);
        System.out.println("Value of x for !(2 > -2) = " + x2);
    }
    static void five(){
        // 5. boolean x = 3 < 0 && 5 > 0
        boolean x3 = (3 < 0) && (5 > 0);
        System.out.println("Value of x for (3 < 0 && 5 > 0) = " + x3);
    }
}