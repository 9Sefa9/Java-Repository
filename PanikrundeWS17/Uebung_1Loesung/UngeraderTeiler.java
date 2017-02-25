package Uebung_1;

public class UngeraderTeiler {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int zahl=sc.nextInt();
		System.out.println(ungeraderTeiler(zahl));
	}

	private static int ungeraderTeiler(int in) {
		if ((in % 2 ) != 0) 
		{
			return in;
		}
		else
		{
			return ungeraderTeiler(in/2);
		}
	}

}
