package TutorialFolder;

public class Tutorial24ArrayGrundWissenReloaded {
	public static void main(String[] args)
	{
		
	int array[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
	
	
	
	for(int i=0; i<array.length; ++i)
	{
		System.out.println(array[i]);   //position i=0 ist die 0 te Array position!
										// i wird inkrementiert (++i) somit erh�ht sich i und gibt die erh�hte array position aus.
	}
	
	
	
	//Dies ist eine Enhanced-For-Schleife.
	//Diese sind sehr n�tzlich, wenn man einen Forloop hat, 
	//in dem man alle Inhalte des Arrays der Reihe nach verwenden m�chte.
	for(int test:array)
	{
		System.out.println(array[test]);
	}
		
	
	
	
	}
}


