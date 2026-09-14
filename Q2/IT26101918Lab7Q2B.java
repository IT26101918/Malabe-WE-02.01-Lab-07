public class IT26101918Lab7Q2B {
    public static void main(String[] args) {
        
        // Loop from 1 to 5 for each row
        for (int i = 1; i <= 5; i++) {
            
            // Print the current row number and the dash
            System.out.print(i + " - ");
            
            // Loop to print the correct number of stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            // Move to the next line after completing the row
            System.out.println();
        }
        
    }
}
