package Java_Exception_Handling;
import java.util.Scanner;

public class CustException {
    public static void main(String[] args) throws Exception { 
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();

        if (username.length() > 10) {
            throw new StringLengthTooHuge(); //throwing an Exception explicitely
        }
        System.out.println("Re tsene");

    }
}
class StringLengthTooHuge extends Exception {
    StringLengthTooHuge(){
        super("String length exceeds 10");
    }
    
    StringLengthTooHuge(String msg){
        super(msg);
    }
}


