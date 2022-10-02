package Java_Exception_Handling;
public class JustAfile {
    public static void main(String[] args) {
        // Enter Your Code Here
        String number = "12";
        String number2 = "34a";
        
        int a = 0;
        int b = 0;

        try {
             a = Integer.parseInt(number);
             b = Integer.parseInt(number2); //
             System.out.println("Converted");
            
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }finally{
            //Get excuted whether an exception was raised or not
        }
        
       
        System.out.println(a+b);

    }
}
