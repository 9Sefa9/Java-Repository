package GPT;
public class ArrayMethoden{
	//java ArrayMethoden Hakan  
	public static void main(String[] args){
	if(args.length != 0){
	int[] digits = new int[args.length];

	
	for(int i = 0; i<=args.length-1; i++){	
	//Integer.parseInt, brauchen wir weil wir einen String[] args Array haben(implizite typenkonvertierung nicht möglich)	
		digits[i] = Integer.parseInt(args[i]);   
	}	
	//print(digits);
    
    sort(digits);
	System.out.println(digits[0]);
	
	}else {
			int[] empty = new int[0];
	}
	
  }
  public static void print(int[]array){
	  for(int i : array)
		System.out.print(i+", ");

  }
  //bubblesort
  public static void sort(int[] a){
		boolean done = false;
		
		while(!done){
			done = true;
		for(int i=1; i<a.length; i++){
			if(a[i-1] > a[i]){  // a[0] und a[1]   --> H    A
				int temp = a[i-1];        //temp = H
				a[i-1] = a[i];			   //H = A;
				a[i] = temp;		    	//A = temp;
				done = false;
			}
		}
	}
		do{
		done = true;
		for(int i=1; i<a.length; i++){
			if(a[i-1] > a[i]){  // a[0] und a[1]   --> H    A
				int temp = a[i-1];        //temp = H
				a[i-1] = a[i];			   //H = A;
				a[i] = temp;		    	//A = temp;
				done = false;
			}
		}
			
		}
		while(!done);
	}
   } 
