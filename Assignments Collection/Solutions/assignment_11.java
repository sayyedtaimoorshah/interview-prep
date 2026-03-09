import java.util.Scanner;
public class assignment_11 {
    public static void main(String[] args) {
        //one();
        //two();
        //three();
        //  four();
        // five();
        // six();
        //seven();
       // eight();
        //nine();
        ten();
        /*
1. Print "AlgoDev" 5 times.
2. Print first 10 natural numbers.
3. Print first 10 odd natural numbers.
4. Print first 10 odd natural numbers in reverse.
5. Print first 10 even natural numbers.
6. Print first 10 even natural numbers in reverse.
7. Print squares of first 10 natural numbers.
8. Print cubes of first 10 natural numbers.
9. Print the table of 5.
10. Print first 10 natural numbers in reverse.
         */
    }

    static void one() {
        // 1. print "AlgoDev" 5 times

        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". AlgoDev");
        }
    }

    static void two() {
        // 2. Print first 10 natural numbers.
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    static void three() {
        // 3. Print first 10 odd natural numbers.
        for (int i = 1; i <= 10; i = i + 2) {
            System.out.print(i + " ");
        }
    }

    static void four() {
        // 4. Print first 10 odd natural numbers in reverse.
        for (int i = 9; i > 0; i = i - 2) {
            System.out.print(i + " ");
        }
    }

    static void five() {
        // 5. Print first 10 even natural numbers.
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    static void six() {
        // 6. Print first 10 even natural numbers in reverse.
        for (int i = 10; i >= 1; --i) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    static void seven() {
        // 7. Print squares of first 10 natural numbers.
        for (int i = 1; i <= 10; i++) {
            // Calculate the square of the current number (i * i)
            int square = i * i;
            System.out.println("The square of " + i + " is: " + square);
        }
    }

    static void eight() {
        // 8. Print cubes of first 10 natural numbers.

        for (int i = 1; i <= 10; i++) {
            int cube = i*i*i;
            System.out.println("the Cubes of " + i + " is : " + cube);
        }
    }
    static void nine(){
        // 9. Print the table of 5.
        for(int i = 1; i<=10; i++){
            System.out.println("5 * "+ i +" = "+5*i);
        }
    }
    static void ten(){
// 10. 3. Print first 10 natural numbers in reverse.
        for(int i = 10; i>=1; i--){
            System.out.println(i);
        }
    }
}
