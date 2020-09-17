//call by value, call by reference. 
//weil ein array = objekt ist, ist es durchaus möglich,
//diese zu verändern, ohne referenz auf was zu haben.
public class Valuechanger{
	public static void main(String[] args){
		int testarray[] = {1,2,3,4,5};
		changevalue(testarray);
		
		for(Integer i:testarray)
		System.out.println(i);
	}
	public static void changevalue(int[] a){
		a[1] = 10;
	}
}