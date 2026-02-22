import java.util.Scanner;
public class assignment_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            six();
        /*
        * Assignment-2 | Operators & Expressions
1. Write a Java program to calculate average of three integers.
            one();
2. Write a Java program to calculate circumference of a circle.
            two();
3. Write a Java program to calculate simple interest.
            three();
4. Write a Java program to calculate volume of a cuboid.
            four();
5. Write a program to ask user about the cost price and selling price of bananas per dozen.
 Calculate the profit or loss earned upon selling 25 bananas.
 five();
 six();
        * */

    }
    static void one(){
        // 1. write a program to calculate average of three integers.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Num1 : ");
        int n1 = input.nextInt();
        System.out.print("Enter Num2 : ");
        int n2 = input.nextInt();
        System.out.print("Enter Num3 : ");
        int n3 = input.nextInt();

        int avg = (n1 + n2 + n3)/3;

        System.out.println("Average : "+avg);

    }
    static void two(){
        Scanner input = new Scanner(System.in);
        // Write a Java program to calculate circumference of a circle.
        // 2*pi*radius

        System.out.print("Enter Radius = ");
        double radius = input.nextDouble();

        double pi = 3.14f;

        double circumference = 2 * pi * radius;
        System.out.print("Circumference of a circle is = "+circumference);

    }
    static void three(){
        Scanner input = new Scanner(System.in);
        // Write a Java program to calculate simple interest.
        // PTR

        System.out.print("Enter Principle amount = ");
        double principle = input.nextDouble();
        System.out.print("Enter Time (Year) : ");
        double time = input.nextDouble();
        System.out.print("Enter Rate of intrest : ");
        double rate = input.nextDouble();

        double simple_interest = (principle * time * rate ) / 100;

        System.out.println("Simple Interest is : "+ simple_interest);


    }
    static void four(){
        Scanner input = new Scanner(System.in);
        // 4. Write a Java program to calculate volume of a cuboid.
        // volume of cuboid = length * width * height

        System.out.print("Enter Length = ");
        double length = input.nextDouble();
        System.out.print("Enter Width = ");
        double width = input.nextDouble();
        System.out.print("Enter Height = ");
        double height = input.nextDouble();

        double cuboid = length * width * height;

        System.out.println("Volume of Cuboid = "+ cuboid);
    }
    static void five(){
        Scanner input = new Scanner(System.in);

        // 5. Write a program to ask user about the cost price and selling price of bananas per dozen.
        // Calculate the profit or loss earned upon selling 25 bananas.

        System.out.print("Cost price per dozen Bananas = ");
        double cost = input.nextDouble();
        System.out.print("Sell price per dozen Bananas = ");
        double sell = input.nextDouble();

        double profit,loss;

        if(sell > cost){
            profit = sell - cost;
            System.out.println("you'r Profit is : "+profit);
        }else{
            loss = cost - sell;
            System.out.println("you'r Loss is : "+loss);
        }


    }
    static void six() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost price per dozen bananas: ");
        double costPerDozen = sc.nextDouble();

        System.out.print("Enter selling price per dozen bananas: ");
        double sellPerDozen = sc.nextDouble();

        // Price per banana
        double costPerBanana = costPerDozen / 12;
        double sellPerBanana = sellPerDozen / 12;

        // For 25 bananas
        double totalCost = costPerBanana * 25;
        double totalSell = sellPerBanana * 25;

        double result = totalSell - totalCost;

        if (result > 0) {
            System.out.println("Profit : 25 banana's = " + result);
        }
        else if (result < 0) {
            System.out.println("Loss : 25 banana's = " + (-result));
        }
        else {
            System.out.println("No Profit No Loss");
        }

        sc.close();
    }

}
