package Panikrunde2016;

public class Pflanze {
	protected String art;
	
	public static void main(String[] args){
		Pflanze[] meinePflanzen = 
			{ new Baum("Kiefer",56),
			new Blume("Butterblume")
			};
		
		((Baum)meinePflanzen[0]).setJahresringe(57);
		((Blume)meinePflanzen[1]).setBluetenfarbe("gelb");
		
		for(Pflanze p: meinePflanzen){
			System.out.println(p);
	}
	
	}
	
}
