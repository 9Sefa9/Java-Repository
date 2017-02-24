public class Schueler extends Mensch{
	
	protected String[] lieblingsfach;

	public void lernen(String fach){
		for(String s: lieblingsfach)
			if(s.equals(fach))
				System.out.println(name+ " lernt " +fach);
	}
	public boolean magLehrer(Lehrer l){
		if(l.gibtHausAufgaben() == false)
			return true;
		else{
			for(String s: lieblingsfach)
				if(l.getFach().equals(s))
					return true;
				return false;
		}
	}
}