public class ungeraderTeiler{
	public static void main(String[] args){

			System.out.println(iterativ(42));
	}
	static public int iterativ(int zahl){
		int sum = 0;
		for(int i = 0; i<=zahl; i++){
			
			if((zahl%2) == 0 ){
				zahl /= 2;
			}else
			sum = zahl;
			
		}
		return sum;
	}
}