public class VariablenSichtbarkeit{
	public static void main(String[] args){
		java.util.Scanner eingabe = new java.util.Scanner(System.in);
		switch(eingabe.nextLine()){
			case "hi" : System.out.println("hi");
						System.out.println("hihi");
						break;
					
			case "nichthi" : System.out.println("case2");
							System.out.println("case3");
							break;
			default:
			System.out.println("keines der cases wurde angesprochen!");							
		}
		
	}
}