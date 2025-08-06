public class multipleCatchDemo {
    public static void main(String[] args) {
        try{
            int a=5/2;
            int[] arr = {1,2,3,4};
            
            System.out.println(arr[2]);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
