public class Frequentletter{
	private static int[] s = {20,101,37,79,126};
	
	public static void main(String[] args){
		System.out.println(getFrequentletter(s));
		getFrequentletter();
	}
	public static char getFrequentletter(int[] s){
		int max = 0;
		for(int i = 0; i<=s.length-1; i++){
			if(s[i]>max)
				max = s[i];

			if(s[i]<max)
				continue;

			if(s[i] == max)
				continue;
		}
		char c = (char)max;
		return c;
	}
	public static void getFrequentletter(){

		}
	}
}