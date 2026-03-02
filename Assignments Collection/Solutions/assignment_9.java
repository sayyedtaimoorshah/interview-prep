import java.util.Scanner;
public class assignment_9 {
    public static void main(String[] args) {
        /*
        Assignment-9 | Decision Control Statements
1. Take cost price and selling price; calculate profit or loss percentage.
2. Take marks of 5 subjects (out of 100). Check if candidate passed or failed (Pass = 33).
3. Check whether a character is Uppercase or Lowercase.
4. Check whether a given number is divisible by 3 and 2.
5. Check whether a given number is divisible by 7 or 3.
         */
        one();
    }
    static void one(){
        // 1. take cost price and selling price, calculate profite or loss percentage.
        Scanner input = new Scanner(System.in);
        // 1. Take inputs
        System.out.print("Enter Cost Price: ");
        double cp = input.nextDouble();

        System.out.print("Enter Selling Price: ");
        double sp = input.nextDouble();

        // 2. Calculate logic
        if (sp > cp) {
            double profit = sp - cp;
            double profitPercentage = (profit / cp) * 100;
            System.out.printf("Profit: %.2f\n", profit);
            System.out.printf("Profit Percentage: %.2f%%\n", profitPercentage);
        }
        else if (cp > sp) {
            double loss = cp - sp;
            double lossPercentage = (loss / cp) * 100;
            System.out.printf("Loss: %.2f\n", loss);
            System.out.printf("Loss Percentage: %.2f%%\n", lossPercentage);
        }
        else {
            System.out.println("No Profit, No Loss.");
        }

        input.close();


    }
}
