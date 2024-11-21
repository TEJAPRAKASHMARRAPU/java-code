import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) throws FileNotFoundException {
       File file = new File("C:\\Users\\M.TEJA PRAKASH\\OneDrive\\Desktop\\java_prog\\file.txt.txt");
        Scanner scanner = new Scanner(file);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Sum: " + (num1 + num2));

        scanner.close();
    }
}
