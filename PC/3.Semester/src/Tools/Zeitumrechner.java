package Tools;

public class Zeitumrechner {

	public static void main(String[] args){
		
		int second = 3730;

		
		
		
		int h = second/3600;
		int hRest = second%3600;
		int day=std/24;
		int dayRest = tag%24;
		int min = tagRest/60;
		int minRest = min%60;
	
	//	int stdRest = min%60;
		
		System.out.println(second + " seconds are: "+day+" Days and"+h+ "Hours and " + min + "Minutes and" + minRest + "seconds");
	}
}
