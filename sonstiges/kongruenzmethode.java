public class kongruenzmethode{
    public static void main(String[] arg){
       	calc();
    }
private static void calc(){

for(int i =0; i<=25; i++){
   float a =6/*Muss ausgefüllt werden. */;
    float b =9f/*Muss ausgefüllt werden*/;
    int mod = 26;
    
    float sum1 =  (((a*i)+b) % mod);
    float sum2 = sum1+65;

    char cryptedCipher = ((char)sum2);
    char decryptedCipher = (char)(i+65);
//System.out.println(sum1);

System.out.println("code: "+sum2+" char: "+cryptedCipher +" ---> " +decryptedCipher);
//System.out.println("Der float von "+cryptedCipher+" = "+((float) (((a*i)+b) % mod) + 65));
//System.out.println("ASCII Code: "+sum2+"\nCharacter: "+((char)sum2));
}

}
}
/*private static void kong(){
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
}*/