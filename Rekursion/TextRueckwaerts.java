public class TextRueckwaerts{
	//Eine kleine übung die ich mal versucht habe zu lösen...
	public static void main(String[] args){
		System.out.println(rek("afeS"));
	}
	public static String rek(String s){
		if(s.length() == 1)
			return ""+s.charAt(0);
		else{
			String last = ""+s.charAt(s.length()-1);
			return last += rek(s.substring(0,s.length()-1)); 
		}
	}
}