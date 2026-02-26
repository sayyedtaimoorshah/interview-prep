import java.util.Scanner;
public class assignment_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // one();
       // two();
      //  three();
      //  four();
        five();
    }
    static void one(){
        // 1. Input a three-digit number and display the sum of the digits
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int num = sc.nextInt();

        int d1 = num % 10;
        int d2 = (num / 10) % 10;
        int d3 = num / 100;

        int sum = d1 + d2 + d3;
        System.out.println("Sum of digits = " + sum);

    }
    static void two(){
        // 2. Find the ASCII code of the character +
        char ch = '+';
        int ascii = (int) ch;
        System.out.println("ASCII value of '+' = " + ascii);

    }
    static void three(){
        // 3. Print the size of int, float, char, and double type variables
        System.out.println("Size of int = " + Integer.BYTES + " bytes");
        System.out.println("Size of float = " + Float.BYTES + " bytes");
        System.out.println("Size of char = " + Character.BYTES + " bytes");
        System.out.println("Size of double = " + Double.BYTES + " bytes");


    }
    static void four(){
        // 4. Make the last digit of a number zero
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to make last digit zero: ");
        int x = sc.nextInt();

        int result = (x / 10) * 10;
        System.out.println("After making last digit zero: " + result);


    }
    static void five(){
        // 5. Input a number and a digit. Append the digit to the number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("Enter a digit to append: ");
        int digit = sc.nextInt();

        int appendedNumber = number * 10 + digit;
        System.out.println("After appending digit: " + appendedNumber);

        sc.close();
    }
}
