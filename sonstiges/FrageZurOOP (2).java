public class FrageZurOOP{
	public static void main(String[] args){
		FrageZurOOP m = new FrageZurOOP();
		ungeraderTeiler t = new ungeraderTeiler();
		m.test(t);
	}
	public void test(ungeraderTeiler l){
		System.out.println(l.iterativ(42));
	}
}