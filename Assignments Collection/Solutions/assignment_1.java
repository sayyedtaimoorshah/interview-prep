import java.util.Scanner;
public class assignment_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("==> Assignment-1 | Input and Output <==");
        /*
Write a program to print Hello student on the screen.
Write a program to print Hello in the first line and students in the second line.
Write a program to print "AlgoDev!" on the screen (with double quotes).
Write a program to print \n on the screen.
Write a program to print \r on the screen.
Write a program to print "Teacher's Day" on the screen (with double and single quotes).
Write a program to calculate sum of two integers taken from user via Scanner.
Write a program to calculate square of a given number.
Write a program to calculate area of a rectangle.
Write a program to find the area of the circle (Take radius from user)
         */
    }
    void one(){
        // 1. Write a program to print Hello student on the screen.
        System.out.println("Hello Student");

    }
    void two(){
        // 2. Write a program to print Hello in the first line and students in the second line.
        System.out.println("Hello\nstudents");
    }
    void three(){
        // 3. Write a program to print "AlgoDev!" on the screen (with double quotes).
        System.out.println("\"AlgoDev!\"");
    }
    void four(){
        // 4. Write a program to print \n on the screen.
        System.out.println("\\n");
    }
    void five(){
        // 5. Write a program to print \r on the screen.
        System.out.println("\\r");
    }
    void six(){
        // 6. Write a program to print "Teacher's Day" on the screen (with double and single quotes).
        System.out.println("\"Teacher\'s Day\"");
    }
    void seven(){
        // 7. Write a program to calculate sum of two integers taken from user via Scanner.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        int n2 = sc.nextInt();

        int sum = n1 + n2;
        System.out.println("Sum is : "+ sum);
    }
    void eight(){
        // 8. Write a program to calculate square of a given number.
        int side = 4;
        int square = (side * side);
        System.out.println("Area of Square is : "+square);
    }
    void nine(){
        // 9. Write a program to calculate area of a rectangle.
        int length = 4;
        int width = 4;
        int rectangle = (length * width);
        System.out.println("Area of Square is : "+rectangle);

    }
    void ten(){
        // 10. Write a program to find the area of the circle (Take radius from user)
        Scanner r = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        double radius = r.nextDouble();

        double pi = 3.14;

        double circle = pi * radius * radius;

        System.out.println("Area of Circle is = "+circle);

    }
}
