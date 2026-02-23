import java.util.Scanner;
public class assignment_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //one();
        //two();
        //three();
       // four();
        //five();
        System.out.println("Integer size: " + Integer.BYTES + " bytes");

        /*
        * Assignment-3 | Characters & Modulo
Input a character and print its Unicode/ASCII code.
Input an ASCII code and print its corresponding character.
Input three characters and display them with their corresponding ASCII codes.
Write a program to print the last digit of a given number.
Write a program to print a given number without its last digit.
        * */
    }
    static void one(){
        // 1. input a character and print its unicode/ascii code.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter char = ");
        char ch = input.next().charAt(0);

        // implicit (binding) conversion
        int ascii = ch;
        System.out.println("unicode : "+ascii);

    }
    static void two(){
        // 2. Input an ASCII code and print its corresponding character.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Ascii : ");
        int ascii = input.nextInt();

        // Explicit conversion (Narrowing)
        char ch = (char)ascii;

        System.out.println("Corresponding character : "+ch);

    }
    static void three(){
        Scanner input = new Scanner(System.in);
        // 3. Input three characters and display them with their corresponding ASCII codes.
        System.out.println("Enter three characters : ");
        char ch1 = input.next().charAt(0);
        char ch2 = input.next().charAt(0);
        char ch3 = input.next().charAt(0);

        // implicit (binding) conversion

        int n1 = ch1;
        int n2 = ch2;
        int n3 = ch3;

        System.out.println("Ascii 1 : "+n1);
        System.out.println("Ascii 2 : "+n2);
        System.out.println("Ascii 3 : "+n3);

    }
    static void four(){
        Scanner input = new Scanner(System.in);
        // 4. Write a program to print the last digit of a given number.
        System.out.print("Enter Numbers : ");
        int num = input.nextInt();

        int lastDigit = Math.abs(num%10);
        System.out.println("Last digit: " + lastDigit);

        input.close();
        /*
       =>  % 10 gives the remainder when the number is divided by 10, which is the last digit.
       =>  Math.abs() ensures the result is positive even if the number is negative.
         */
    }
    static void five(){
        Scanner input = new Scanner(System.in);
        // Write a program to print a given number without its last digit.
        System.out.print("Enter number's : ");
        int num = input.nextInt();

        int without_last = (num/10);

        System.out.println("WithOut last Digit : "+without_last);
    }
}
