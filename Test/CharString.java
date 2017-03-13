public class CharString{
	public static void main(String[] args){
		String s[] = new String[255];
		s['a'] = "d";
		System.out.println(s['a']); // printet ein "d"

		s["a"] = "c";
		System.out.println(s["a"]);//funktioniert nicht!
		//implizite typenumwandlung bei character durch int möglich.

		/*
		char []c = s[0].toCharArray();
		System.out.println(c[0]);

		int a = 'c';
		System.out.println(a);
		*/

	}
}