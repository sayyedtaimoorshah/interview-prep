import java.util.Scanner;
public class assignment_10 {
    public static void main(String[] args) {

        /*
        Assignment-10 | Logic & Validation
Check whether a given number is positive, negative, or zero.
Check whether a character is an Alphabet (Upper), Alphabet (Lower), Digit, or Special Character.
Check if a triangle is valid given its three sides.
Take month number and display the number of days in that month.

         */

        //one();
        //two();
        three();
    }
    static void one(){
        int num = 0;
        if(num == 0){
            System.out.println("Number are Zero");
        }else if(num > 0){
            System.out.println("Positive");
        }else if(num < 0){
            System.out.println("Negative");
        }else{
            System.out.println("invalid case plz try agin ... ");
        }
    }
    static void two(){
        // 2. Check whether a character is an Alphabet (Upper), Alphabet (Lower),
        // Digit, or Special Character.
Scanner input = new Scanner(System.in);
        System.out.print("Enter Char : ");
        char ch = input.next().charAt(0);

       if(ch >= 'a' && ch <= 'z'){
           System.out.println("Alphabet (lower) ... ");
       } else if(ch >= 'A' && ch <= 'Z'){
           System.out.println("Alphabet (Upper) ... ");
       }else if(ch >= 0){
           System.out.println("Number is Digit");
       }else{

           System.out.println("Special character");
       }



    }
    static void three(){
        // 3. Check if a triangle is valid given its three sides.
        int side = 2;
        int triangle = side * side * side ;
        int correct = triangle;
        if(triangle == correct){
            System.out.println("Triangle is Correct");
        }else {
            System.out.println("not correct");
        }

    }
}
