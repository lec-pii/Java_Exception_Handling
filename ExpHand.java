package Java_Exception_Handling;
import java.util.Scanner;

/**
 * ExpHand
 */
class ExpHand {
    public static void main(String[] args) throws Exception {
        // Enter Your Code Here
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        try {
            System.out.print("Enter num1 : ");
            num1 = sc.nextInt();
            System.out.print("Enter num2 : ");
            num2 = sc.nextInt();   
            
            System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
            System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
            System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
            System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        } catch (Exception e) {
            System.out.println("!!!!!!!Aowaaaaaa Mathata!!!!!!!!!");
        } finally{
            System.out.println("re qetile");
        }

        System.out.println("Re tsoela pele ka program");

    }
    
}