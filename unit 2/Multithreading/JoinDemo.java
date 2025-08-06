class Cpp extends Thread{
    public void run(){
        for(int i=0;i<15;i++){
            System.out.println("Let Daddy C++ complete first");
        }
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}

class python extends Thread{
    public void run(){
        for(int i=0;i<15;i++){
            System.out.println("Hi Daddy C++..im gay...i suck cocks for living  :)");
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) {
        Cpp cpp = new Cpp();
        python Python = new python();

        cpp.start();
        Python.start();
        try {
            cpp.join();
        } catch (InterruptedException e) {
           
            e.printStackTrace();
        }
    }
}
