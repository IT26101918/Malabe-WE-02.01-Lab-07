public class IT26101918Lab7Q2A {
    public static void main(String[] args) {
        // Outer loop handles the rows (4 rows total)
        for (int i = 0; i < 4; i++) {
            // Inner loop handles the columns (5 dollar signs per row)
            for (int j = 0; j < 5; j++) {
                System.out.print("$ ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
