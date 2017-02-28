public class Quersum{
public static void main(String[] args){
	methodeiterativ(45);
	System.out.println(methoderekursiv(45));
}
public static int methoderekursiv(int zahl){
	String neueZahl = ""+zahl;

	if(neueZahl.length()-1 ==0)
		return Integer.parseInt(neueZahl);
	
	else{
		
		return Integer.parseInt(""+neueZahl.charAt(0)) + methoderekursiv(Integer.parseInt(""+neueZahl.substring(1)));
	}
}














public static void methodeiterativ(int zahl){
	String neueZahl = ""+zahl;
	int leer = 0;
	
	for(int i = 0; i<=neueZahl.length()-1; i++){	
	
	char c = neueZahl.charAt(i);
	leer+=Integer.parseInt(""+c);

	}
	System.out.println(leer);
}
}
