package Exceptions.Exceptions;
public class PowerPlant {

	public static void main(String[] args) //throws NuclearEngineer , dann ohne try und catch !,  wird geworfen(aber nicht behandelt!
	{
		// TODO Auto-generated method stub
		// es muss sichergestellt werden, dass beim werfen, die exception vorhanden Ist !
		//falls nicht, dann muss sie in einer seperaten klasse extended werden.
		// try ist nur einmal m�glich, jedoch k�nnen beliebig viele catches auftreten
		// try resource nur bei streams m�glich! 
		
		try {
			HomerSimpson.work();
		} catch (NuclearEngineer n) {
			System.out.println("It's pronounced 'nucular'");
		}
	}

}
