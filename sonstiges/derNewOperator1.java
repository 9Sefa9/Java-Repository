
public class derNewOperator1 {

	protected int Sch�ler;
	protected String Name;
	protected String Fach;
	protected static derNewOperator2 hi;
	
	public static void main(String args[]){
		derNewOperator2 klasse = new derNewOperator2(30,"Frau M�ller","Englisch");
		System.out.println(klasse);
        objekt(klasse);
        
	 
	}
	public static void objekt(derNewOperator2 test){
		hi = test;
		test.setFach("Deutsch");
		test.setName("Anne");
		System.out.println(test);
	}
	
	
}
