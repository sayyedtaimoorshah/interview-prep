import  java.util.Scanner;
public class assignment_8 {
    public static void main(String[] args) {

        /*
        assignment-8 | More on Decision Control
1. Check whether a given number is a three-digit number or not.
2. Print the greater between two numbers. Print one if both are same.
3. Check whether roots of a quadratic equation are real & distinct, real & equal, or imaginary.
4. Check whether a given year is a Leap Year.
5. Find the greatest among three given numbers.

         */

               // one();
              //  two();
         three();
       // four();
        //five();
    }
    static void one(){
        // 1. check whether a given number is a three-digit number or not
        int num = 36;
        if(num >= 100 && num <= 999){
            System.out.println("Three-Digit Number");
        }else{
            System.out.println("Not three digit Number");
        }
    }
    static void two(){
        // 2. Print the greater between two numbers. Print one if both are same.
            Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num1 > num2){
            System.out.println("Number one are greater then num two");
        }else if(num1 < num2){
            System.out.println("number two are greater then num one");
        }else{
            System.out.println("both are same");
        }
    }
    static void three(){
        // 3. Check whether roots of a quadratic equation are real & distinct, real & equal, or imaginary.


                // Create Scanner object to take input from user
                Scanner sc = new Scanner(System.in);

                // Declare variables for coefficients a, b, c
                double a, b, c;

                // Ask user to enter values
                System.out.print("Enter value of a: ");
                a = sc.nextDouble();

                System.out.print("Enter value of b: ");
                b = sc.nextDouble();

                System.out.print("Enter value of c: ");
                c = sc.nextDouble();

                // Calculate discriminant
                double discriminant = (b * b) - (4 * a * c);

                // Check conditions
                if (discriminant > 0) {
                    System.out.println("Roots are Real and Distinct");
                }
                else if (discriminant == 0) {
                    System.out.println("Roots are Real and Equal");
                }
                else {
                    System.out.println("Roots are Imaginary");
                }

                // Close scanner
                sc.close();

        }


    static void four(){
        // 4. Check whether a given year is a Leap Year.
        int num = 2003;
        if(num % 4 == 0){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not Leap year");
        }
    }
    static void five(){
        // 5. Find the greatest among three given numbers
        int n1 = 10, n2 = 200 , n3 = 30;
        if(n1>n2 && n1 > n3){
            System.out.println("Number one are greater");
        }else if(n2 > n1 && n2 > n3){
            System.out.println("number two are greater");
        }else{
            System.out.println("Number three are greater");
        }
    }
}
