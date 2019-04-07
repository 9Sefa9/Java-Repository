package Uebung_3;
import java.util.ArrayList;

public class MyStackCollection<T> {

	private ArrayList<T> array;
	private int topPointer=0;
	
	public MyStackCollection(){
		array= new ArrayList<T>();
	}
	
	public void push(T o) throws Exception{
		array.add(o);
		topPointer++;
	}
	
	public T pop() throws Exception{
		topPointer--;
		return array.remove(array.size()-1);
	}
	
	public int size(){
		return topPointer;
	}
}