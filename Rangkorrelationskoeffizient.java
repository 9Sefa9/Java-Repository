import java.util.*;
public class Rangkorrelationskoeffizient{

    static ArrayList<ArrayList<Double>> list = new ArrayList<>();
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int spaltenZahl = 2;
        for(int i = 1; i<=spaltenZahl; i++){
        
            if( i != spaltenZahl)
                System.out.println("Trage die Daten für Spalte "+i+" ein. Und wenn du fertig bist, klicke die Taste \"F\" um die nächsten Spalten zu füllen! ");
            else
                System.out.println("Trage die Daten für die letzte Spalte "+i+" ein. Wenn du fertig bist, klicke die Taste \"F\" um die Berechnung zu beginnen!");
            
                
                ArrayList<Double> tmp = new ArrayList<>();
                input = new Scanner(System.in);
                while(true){           
                    String digit = input.nextLine();
                
                    if(digit.equals("f"))
                        break;
                    else tmp.add(Double.valueOf(digit));
               }
               list.add(tmp);
            }


            calc();
        }
        private static double mittelwert(int spalte){
            double mittelwert=0;
            for(int i = 0; i<list.get(spalte).size(); i++){
                mittelwert+= list.get(spalte).get(i);
            }
                return  (mittelwert / list.get(spalte).size());
        } 
        private static void calc(){
            double mittelwertSpalte1 = mittelwert(0);
           double mittelwertSpalte2 = mittelwert(0);
           double zaehler = 0;
           double nenner1 =0;
           double nenner2 = 0;
           double nennerResult=0;
           double rsp =0;
            for(int i = 0; i<list.get(0).size(); i++){
                zaehler += (list.get(0).get(i) - mittelwertSpalte1) * (list.get(1).get(i) - mittelwertSpalte2);
            }

            for(int i =0; i<list.get(0).size();i++){
                nenner1 +=  Math.pow((list.get(0).get(i) - mittelwertSpalte1),2);
            }
            nenner1 = Math.sqrt(nenner1);
            for(int i =0; i<list.get(0).size();i++){
                nenner2 += Math.pow((list.get(1).get(i) - mittelwertSpalte2),2);
            }
            nenner2 = Math.sqrt(nenner2);

            nennerResult = nenner1 * nenner2;

            rsp = zaehler/nennerResult;
            
            System.out.println(Math.floor(a));
        }
        private static void print(){
            for(ArrayList<Double> tmp : list){
                tmp.forEach(k->System.out.println(k));
            }
        
        }
}