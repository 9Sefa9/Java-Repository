package Uebung_3;

public class MyStack {

	private Object[] array;
	private int topPointer=0;
	
	public MyStack(int size){
		array=new Object[size];
	}
	
	public void push(Object o) throws Exception{
		if(topPointer>=array.length){
			throw new Exception("Stack-Overflow!");
		}
		else{
			array[topPointer]=o;
			topPointer++;
		}
	}
	
	public Object pop() throws Exception{
		if(topPointer==0){
			throw new Exception("Stack empty!");
		}
		else{
			topPointer--;
			return array[topPointer];
		}
	}
	
	public int size(){
		return topPointer;
	}
}