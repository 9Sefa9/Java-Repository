package TutorialFolder;

public class Tutorial12Inkrementierung {

	public static void main(String[] args) {
		int alter = 0;
		
		alter= 15;
		System.out.println(alter);
		++alter; //1erh�hung der alter um 1 
		System.out.println(alter);
		System.out.println(alter++);	//2 ++ nachher wird f�r die n�chste Zeile inkremntiert
		System.out.println(alter);		//3hier wird das alter um 1 erh�ht! erh�ht !
		//alternativ:
		System.out.println(++alter);	//4 ++ vorher wird in dieser zeile inkrementiert
		
		alter = alter + 5;				//5erste m�glichkeit das alter um 5 zu erh�hen!
		System.out.println(alter);		
		
		alter+=5;						//6dies ist aber die kurzschreibweise!!
		System.out.println(alter);
		
		--alter; //hier wurde einmal das alter verringert
		alter--; //nochmal das alter verringert
		alter-=5;//nochmal um 5 verringert!
		alter*=2;//und dann mit 2 multipliziert!
		System.out.println(alter);	//dann ausgegeben!
		alter/=4; //teilung durch 4 !
		System.out.println(alter);
	
	}

}
