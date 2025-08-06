class MoonPie extends Thread{
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

public class isAliveThread {
    public static void main(String[] args) {
        MoonPie mn = new MoonPie();
        mn.start();
        System.out.println("is the thread alive?:"+" "+mn.isAlive());
    }
}
