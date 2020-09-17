import java.util.*;
public class MyADTConstructor implements MyADT{
	public int a,b;
	public MyADTConstructor(int a, int b){
		if(a<0 || b<0)
			throw new IllegalStateException(a+" oder "+b+" ist keine natuerliche Zahl!");
		else{
		this.a = a;
		this.b = b;
		}
	
	}
	public int zero(){
		return 0;
	}
	public int succ(int a){
		return a+1;
	}
	public int pred(int a){		
		//assert less(0,a) == true; 			
		return a-1;	
	}
	public boolean less(int a, int b){
		if(a<b)
			return true;
		return false;
	}
	public int add(int a,int b){
			return a+b;
	}
	public int mult(int a, int b){
			return a*b;
	}	
	public String toString(){
		return "pred(succ(a)): "+pred(succ(a))+"\nless(zero,succ(a)): "+less(zero(),succ(a))+"\n"
		+"less(a,zero): "+less(a,zero())+"\nless(succ(a),succ(b)): "+less(succ(a),succ(b))+"\n"
		+"add(zero, a): "+add(zero(),a)+"\nadd(succ(a), b): "+add(succ(a),b)+"\nmult(zero,a): "+mult(zero(),a)
		+"\nmult(succ(a), b): "+mult(succ(a),b)+"";
	}
}