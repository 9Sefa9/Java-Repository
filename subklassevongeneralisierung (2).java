public class subklassevongeneralisierung extends generalisierung{

	public static void main(String[] args){
		generalisierung<String> g = new generalisierung<String>();
		g.writeToFile("G:/Users/Progamer/Desktop/abdurrahman pc.txt", "HI");
		g.readFromFile("G:/Users/Progamer/Desktop/abdurrahman pc.txt");
		g.setText("dataa");
		System.out.println(g.getText());
	}

}
//typische fehler: bie getter den return statement vergessen
//bei streams muss gecastet werden(z.b für pfad angabe).