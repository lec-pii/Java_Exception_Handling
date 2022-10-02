package Java_Exception_Handling;
public class Safe {
    public static void main(String[] args) {
        
        try {
            System.out.println(doSdomething(5, 2));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("done");
 
    }

    static int doSdomething(int c, int d) throws Exception{
        int quotient = division(c, d);
        return quotient;
    }

    static int division(int a, int b) throws Exception {
        return(a/b);
    } 

}
