import java.text.NumberFormat;

public class throwsDemo {
    public static int convertIntToString(String num) throws NumberFormatException{
        return Integer.parseInt(num);
    }    

    public static void main(String[] args) {
        try{
            String number = "123g";
            int result = convertIntToString(number);
            System.out.println("Converted number:"+" "+result);
        }
        catch(NumberFormatException e){
            System.out.println("Exception caught:"+" "+e.getMessage());
        }

    }
}
