class CallOfDutyTheGoatedGame extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class GetSetName {
    public static void main(String[] args) {
        CallOfDutyTheGoatedGame COD = new CallOfDutyTheGoatedGame();
        COD.start();
        COD.setName("Free Fire,Valorant and PUBG is Trash...so fuckin Trash");
    }
}
