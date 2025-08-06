public class TryCatchDemo {
    public static void main(String[] args) {
        int a=3;
        int b=0;

        try{
            int result = a/b;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("division by zero not possible"+e.getMessage());
        }
    }

    
}