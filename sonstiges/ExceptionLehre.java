public class ExceptionLehre{
	public static void main(String[] args){
		try{
		System.out.println("Ich werd jetzt ne Exeption schmeiﬂen!");
	
		schmeiﬂen();
		
		}catch(Fehler e){
			System.out.println("Hata Var!");
			e.printStackTrace();
		}
		
	
	}
	
	public static void schmeiﬂen() throws Fehler{
		
		throw new Fehler("Fehler!");
	}
	
	
	 
}
/*
 
Variante 1:
public void methode1(){
    try{
        throw new EigeneAusnahme("baka");
    }
    catch(EigeneAusnahme e){
        System.out.println("Da haben wir den Pudding!");
    }
}

Variante 2:
public void methode2() throws EigeneAusnahme{
    throw new EigeneAusnahme("baka");
}

*/