public class CrypticNumbers{
	public static boolean theCrypticTest(int n){
		if(n %2 ==0){
			return false;
		}else{
			for(int i=3; i*i<=n;i+=2){
				if(n%i==0){
					System.out.println(n+" "+i);
					return false;
				}
			}return true;
		}
	}
	public static void main(String[] args){
		System.out.println(theCrypticTest(2)); // false
		System.out.println(theCrypticTest(9)); //false
		System.out.println(theCrypticTest(11)); //true
	}
}