public class Timer{

    public static void main(String[]a ){
        long minutes =0;
        long seconds=0;
        while(true){
            try{
        Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        seconds= (seconds+1)%60;
        if(seconds==0)
            minutes+=1;
        System.out.print("\r"+minutes+":"+seconds);
    }
}
}