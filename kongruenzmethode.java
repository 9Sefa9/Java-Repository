public class kongruenzmethode{
    public static void main(String[] arg){
        int count = 0;
        for(int i = 0; i<=25;i++){
            for(int x = 0; x<=25;x++){
                int res = ((i*x)+0)%26;
                count++;
                System.out.print(res+", ");
            }
            System.out.println("\n=======");
        }
        System.out.println("Count: "+count);
    }
}