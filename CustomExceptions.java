package Java_Exception_Handling;
import java.util.Scanner;

class CustomExceptions {
    public static void main(String[] args) {
        // Enter Your Code Here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int num = sc.nextInt();

        // doSomething(num);

        try {
            doSomething(num);
            
        } catch (Exception e) {
            e.printStackTrace();
            // System.out.println(e.getMessage());
        }
    }

    static void doSomething(int a) throws Exception {
        if(a > 10){
            // throw  new Exception("You're Too Old madala");
            System.out.println("NUmber greater than 10");
        }else{
            System.out.println("Yebooo");
        }
        
        System.out.println(100/a);

    }
}
