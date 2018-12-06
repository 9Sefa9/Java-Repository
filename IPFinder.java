import java.net.InetAddress;
import java.lang.*;
//this code finds all IP´s in a network.
public class IPFinder extends Thread{
    private int start,end;
    private long timeStart,timeLater;
    public static void main(String[] args){
         
         Thread t = new Thread(new IPFinder(0,25));
         t.start();

         Thread t2 = new Thread(new IPFinder(25,50));
         t2.start();
         
         Thread t3 = new Thread(new IPFinder(50,75));
         t3.start();

         Thread t4 = new Thread(new IPFinder(75,100));
         t4.start();

         Thread t5 = new Thread(new IPFinder(100,125));
         t5.start();

         Thread t6 = new Thread(new IPFinder(125,150));
         t6.start();
        
         Thread t7 = new Thread(new IPFinder(150,175));
         t7.start();

         Thread t8 = new Thread(new IPFinder(175,200));
         t8.start();

         Thread t9 = new Thread(new IPFinder(200,225));
         t9.start();

         Thread t10 = new Thread(new IPFinder(225,255));
         t10.start();
        
    }
    public IPFinder(int start, int end){
        this.start = start;
        this.end = end;
        System.out.println("START");
        this.timeStart = System.nanoTime();
    }
    public synchronized void checkHosts(String subnet){
        try{
        int timeout=0;
        for (int i=this.start;i<this.end;i++){
        String host=subnet + "." + i;
        if (InetAddress.getByName(host).isReachable(timeout)){
           System.out.println(host + " is reachable");
        }
      }
        }catch(Exception e){
            e.printStackTrace();
        }
        this.timeLater = System.nanoTime();
        System.out.println("DONE IN : "+(this.timeLater - this.timeStart)/ 1000000000);
    }
    @Override
    public void run(){
        checkHosts("192.168.178");
    }

}