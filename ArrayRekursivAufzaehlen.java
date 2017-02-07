public class ArrayRekursivAufzaehlen{
	
	//Aufgabe:  Sei digit ein Integer Array.  DIeser Array soll die Elemente von hinten nach vorne 
	//ausgeben. Bestimmen sie diese Rekursiv. Dannach Iterativ.

	public static void main(String[] args){
		int[] digit = {3,2,6,4,8};
		rekursion(digit,0);
		//i++ is maybe wrong ???
	}
	public static void rekursion(int[] digit,int i){

		if(digit[i] == digit[digit.length-1]){
				System.out.println(digit[i]);
		}
		else{ 
			rekursion(digit, i+1);
			System.out.println(digit[i]);//verstehe die Logik nicht
			
		}
	}
}