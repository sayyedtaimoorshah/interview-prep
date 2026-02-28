import java.util.Scanner;
public class assignment_7 {
    public static void main(String[] args) {
        /*
        Assignment-7 | Decision Control
Check whether a given number is positive or non-positive.
Check whether a given number is divisible by 5 or not.
Check whether a given number is Even or Odd.
Check Even/Odd without using the % operator.
Check Even/Odd using a bitwise operator.
         */
       // one();
       // two();
       // three();
       // four();
        five();
    }
    static void one(){
        // 1. check whether a given number is positive or non-positive
        int num = 23;
        if(num >=0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
    }
    static void two(){
        // 2. Check whether a given number is divisible by 5 or not.
        int num = 25;
        if(num % 5 == 0){
            System.out.println("Divisible");
        }else{
            System.out.println("Not Divisible");
        }
    }
    static void three(){
        // 3. Check whether a given number is Even or Odd.
        int num = 10;
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
    static void four(){
        // 4. Check Even/Odd without using the % operator.

        int num = 8;

if ((num / 2) * 2 == num) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}


        /*
        2nd method
        int num = 5;

while (num >= 2) {
    num = num - 2;
}

if (num == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
         */

    }
    static void five(){
        // 5. Check Even/Odd using a bitwise operator.
        int num = 6;

        if ((num & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
