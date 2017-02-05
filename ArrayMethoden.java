public class ArrayMethoden{
	public static void main(String[] args){
	if(args.length != 0){
	//create an integer array which saves the digits from args
	int[] digits = new int[args.length];
	
	//deep copy from args to digits Array
	for(int i = 0; i<=args.length-1; i++){		
		digits[i] = Integer.parseInt(args[i]);
	}	
	//print(digits);
   // sort(digits);
	//System.out.println(rekSum(digits,0));
	System.out.println(sum(digits));
	}else {
			int[] empty = new int[0];
	}
	
  }
  public static void print(int[]array){
	  for(int i : array)
		System.out.print(i+", ");   
  }
  public static void sortieren(int[] array){
		int[] array2 = new int[array.length];
		
		for(int i = 0; i<=array.length-1;i++)
			array2[i] = array[i];
		
		boolean done;
		do{
		done = true;
		for(int i=1; i<array2.length; i++){
			if(array2[i-1] > array2[i]){
				int temp = array2[i-1];
				array2[i-1] = array2[i];
				array2[i] = temp;
				done = false;
			}
		}
		}
		while(!done);
		for(int i=array2.length-1; i>=0; i--)
		System.out.print(array2[i]);
	}
  public static int rekSum(int[] a, int i){
	  if(a.length == i){
		  return 0;
	  }else{
		 return a[i]+=rekSum(a,i+1);
	  }
	  
  }
  public static int sum(int[] a){
	  int sum=0;
	  for(int i = 0; i<=a.length-1;i++)
		sum+=a[i];
	return sum;
  }
 } 
	