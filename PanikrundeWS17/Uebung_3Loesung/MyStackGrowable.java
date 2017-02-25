package Uebung_3;
public class MyStackGrowable<T> {

	private Object[] array;
	private int topPointer=0;
	
	public MyStackGrowable(int startSize){
		array= new Object[startSize];
	}
	
	public void push(T o) throws Exception{
		if(topPointer>=array.length){
			array=resize(array, array.length*2);
		}
		else{
			array[topPointer]=o;
			topPointer++;
		}
	}
	
	@SuppressWarnings("unchecked")
	public T pop() throws Exception{
		if(topPointer==0){
			throw new Exception("Stack empty!");
		}
		else{
			if(topPointer<0.25*array.length){
				array=resize(array, array.length/2);
			}
			return (T)array[topPointer--];
		}
	}
	
	public int size(){
		return topPointer;
	}
	
	public Object[] resize(Object[] list, int size){
		Object[] output=new Object[size];
		for(int i=0;i<output.length;i++){
			if(i<list.length){
				output[i]=list[i];
			}
		}
		return output;
	}
}