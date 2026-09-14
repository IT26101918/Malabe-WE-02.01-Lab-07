import java.util.Scanner;

public class IT26101918Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop for 5 customers
        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);

            // Get total bill amount
            System.out.print("Enter total bill amount: ");
            double totalBill = scanner.nextDouble();

            // Get mode of payment
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char paymentMode = scanner.next().charAt(0);

            // Validate and process the payment mode
            if (paymentMode == 'C' || paymentMode == 'c') {
                // Calculate 5% discount for cash payments
                double discount = totalBill * 0.05;
                double amountToBePaid = totalBill - discount;

                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + amountToBePaid);

            } else if (paymentMode == 'O' || paymentMode == 'o') {
                // No discount for other payment methods
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + totalBill);

            } else {
                // Display error message for invalid inputs
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println(); // Prints a blank line between customers
        }

        scanner.close();
    }
}
