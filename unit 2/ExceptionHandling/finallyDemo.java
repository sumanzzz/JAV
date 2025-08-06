public class finallyDemo {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        int result;
        try{
            result=a/b;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("division by zero not possible"+e.getMessage());
        }
        finally{
            System.out.println("finally block executed!");
        }
        System.out.println("program continues....");
    }
}
