import java.util.Scanner;

public class IT26101918Lab7Q1A {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter marks for four subjects:");
        
        // Prompt and read marks for four subjects
        System.out.print("Enter Subject Mark 1: ");
        double mark1 = input.nextDouble();
        
        System.out.print("Enter Subject Mark 2: ");
        double mark2 = input.nextDouble();
        
        System.out.print("Enter Subject Mark 3: ");
        double mark3 = input.nextDouble();
        
        System.out.print("Enter Subject Mark 4: ");
        double mark4 = input.nextDouble();
        
        // Calculate the average mark
        double average = (mark1 + mark2 + mark3 + mark4) / 4.0;
        
        // Determine the grade based on the average
        String grade;
        if (average >= 75 && average <= 100) {
            grade = "Distinction";
        } else if (average >= 50 && average <= 74) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }
        
        // Print the final output matching the expected format
        System.out.println("\nAverage is : " + average);
        System.out.println("Overall Grade is : " + grade);
        
        // Close the scanner to release resources
        input.close();
    }
}
