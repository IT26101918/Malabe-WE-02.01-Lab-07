import java.util.Scanner;

public class IT26101918Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Loop through 3 students
        for (int i = 1; i <= 3; i++) {
            System.out.println("Student " + i);
            System.out.print("Enter marks: ");
            
            // Reads 4 space-separated numbers from the same line
            double mark1 = input.nextDouble();
            double mark2 = input.nextDouble();
            double mark3 = input.nextDouble();
            double mark4 = input.nextDouble();
            
            // Calculate average
            double average = (mark1 + mark2 + mark3 + mark4) / 4.0;
            
            // Determine grade
            String grade;
            if (average >= 75 && average <= 100) {
                grade = "Distinction";
            } else if (average >= 50 && average < 75) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }
            
            // Display results for this student
            System.out.println("Average is : " + average);
            System.out.println("Overall Grade is : " + grade);
            System.out.println(); // Prints an empty line for neat spacing
        }
        
        input.close();
    }
}
