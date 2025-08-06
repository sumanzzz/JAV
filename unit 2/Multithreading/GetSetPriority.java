class Jesus extends Thread {
    public void run(){
        for(int i=0;i<15;i++){
            System.out.println(Thread.currentThread().getName());
        }
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

    }
    
}
class Mary extends Thread{
    public void run(){
        for(int i=0;i<15;i++){
            System.out.println(Thread.currentThread().getName());
        }
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

}

public class GetSetPriority {
    public static void main(String[] args) {
        Jesus jesus = new Jesus();
        Mary mary = new Mary();
        
        

        jesus.setPriority(Thread.MIN_PRIORITY);
        mary.setPriority(Thread.MAX_PRIORITY);

        jesus.setName("Romans nailed Jesus");
        mary.setName("God nailed Mary");

        jesus.start();
        mary.start();
    }
}
