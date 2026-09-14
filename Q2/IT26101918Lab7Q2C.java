public class IT26101918Lab7Q2C {
    public static void main(String[] args) {
        // Outer loop controls the starting number of each row
        // It starts at 5 and counts down to 1
        for (int i = 5; i >= 1; i--) {
            
            // Inner loop prints the number 'i', exactly 'i' times
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            
            // Move to the next line after finishing the current row
            System.out.println();
        }
    }
}
