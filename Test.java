import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        try {
            // File path
            File file = new File("C:\\Users\\M.TEJA PRAKASH\\OneDrive\\Desktop\\java_prog\\file.txt.txt");
            Scanner scanner = new Scanner(file);

            // Read numbers and operation from the file
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            char operator = scanner.next().charAt(0);

            // Perform the operation based on the operator
            double result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;

                case '/':
                    if (num2 != 0) {
                        result = (double) num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;

                default:
                    System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the file path.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error: Invalid file format or input.");
            e.printStackTrace();
        }
    }
}
