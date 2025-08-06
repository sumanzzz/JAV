public class throwDemo {

    public static void checkAge(int num){
        if(num<18){
            throw new IllegalArgumentException("Age should be above 18");
        }
        else{
            System.out.println("Age is perfect!");
        }
    }
    public static void main(String[] args) {
        try{
            checkAge(16);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());;
        }
    }
}
