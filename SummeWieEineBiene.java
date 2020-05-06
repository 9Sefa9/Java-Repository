public class SummeWieEineBiene{
	
	public static void main(String[] args){

		int[] digits = new int[4];
		digits[0] = 2;
		digits[1] = 3;
        digits[2] = 5;
        digits[3] = 7;

	System.out.println(rek(digits)); 

    System.out.println(rekSum(digits, 0)); 
	}
	public static int rek(int[] d){
		int leer = 0;
		
		for(int i = 0; i<=d.length-1; i++){
			leer+=d[i];
		}
		return leer;
	}
	public static int rekSum(int[] d, int i){
		if(i == d.length-1){
			return d[i];
		}
		else{
			return d[i] +=rekSum(d,i+=1);	
		}
	}
}