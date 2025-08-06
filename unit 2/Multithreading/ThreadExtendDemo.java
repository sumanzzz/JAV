class FirstThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
class SecondThread extends Thread{
    public void run(){
        for(char c='A';c<'J';c++){
            System.out.println(c);
        }
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}

public class ThreadExtendDemo {
    public static void main(String[] args) {
        FirstThread ft = new FirstThread();
        SecondThread st = new SecondThread();

        ft.start();
        st.start();
    }
    
}