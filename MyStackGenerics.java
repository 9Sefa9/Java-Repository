package Uebung_3;
public class MyStackGenerics<T> {

	private Object[] array;
	private int topPointer=0;
	
	public MyStackGenerics(int size){
		array= new Object[size];
	}
	
	public void push(T object) throws Exception{
		if(topPointer>=array.length){
			throw new Exception("Stack-Overflow!");
		}
		else{
			array[topPointer]=object;
			topPointer++;
		}
	}
	
	@SuppressWarnings("unchecked")
	public T pop() throws Exception{
		if(topPointer==0){
			throw new Exception("Stack empty!");
		}
		else{
			return (T)array[topPointer--];
		}
	}
	
	public int size(){
		return topPointer;
	}
}