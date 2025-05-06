package calculator;

/**
 * DivisionOperations class provides methods to divide numbers.
 */
public class DivisionOperations {
    
    // Method to divide two doubles
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    // Method to divide two integers
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println("10 / 2 = " + divide(10.0, 2.0)); // Using double method
            System.out.println("10 / 0 = " + divide(10.0, 0.0)); // Will cause an exception
            System.out.println("10 / 2 = " + divide(10, 2)); // Using int method
            System.out.println("10 / 0 = " + divide(10, 0)); // Will cause an exception
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
            //e.printStackTrace(); // Shows details of the error
        }
    }
}