package Java_Exception_Handling;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MultipleExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] arr = {1,2,3,4,5};
            System.out.println("a / b = " + (a/b));
            System.out.println("element at index 5 = " + arr[5]);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
