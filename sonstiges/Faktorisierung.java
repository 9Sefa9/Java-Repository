import java.util.*;
public class Faktorisierung{
    static ArrayList<Long> primZahlen = new ArrayList<>();
    public static void main(String[]args){
      
        addPrimesToList();
        findFaktorOf(3167599l);  
    }
    public static void findFaktorOf(long value){
        for(Long primeNumber:primZahlen){
          if((value % primeNumber)==0){
              System.out.println("Faktor p: "+primeNumber);
              System.out.println("Faktor q: "+(value/ primeNumber));
          }
          System.out.println(primeNumber);
        }
    }
    public static void addPrimesToList(){
        for(long i =1; i<10000000; i++){
          boolean primeNumber = isPrimzahl(i);
             if(primeNumber)
                 primZahlen.add(i);
        }     


    }
    public static boolean isPrimzahl(long zahl){
    long prim = zahl;
    if (prim <= 2) {
      return (prim == 2);
    }
    for (long i = 2; i * i <= prim; i++) {
      if (prim % i == 0) {
        return false;
      }
    }
    return true; 
  }
}