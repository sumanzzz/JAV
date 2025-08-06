class FirstThread implements Runnable{
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
class SecondThread implements Runnable{
    public void run(){
        for(char c='A';c<'J';c++){
            System.out.println(c);
        }
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
class ThreadRunnableInt{
    public static void main(String[] args) {
        FirstThread ft = new FirstThread();
        Thread t1 = new Thread(ft);
        SecondThread sc = new SecondThread();
        Thread t2 = new Thread(sc);

        t1.start();
        t2.start();
    }
}