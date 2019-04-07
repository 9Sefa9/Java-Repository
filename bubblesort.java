public class bubblesort{
	public static void main(String[ ]args){
		int[] ar = {2,7,4,9,5};
		sort(ar);
		for(int i: ar){
			System.out.print(i);
		}
	}

	public static void sort(int[] array){
		boolean done = false;
		do{
			done = true;
			for(int i = 1; i<=array.length-1; i++){
				if(array[i-1] > array[i]){
					int temp = array[i-1];
					array[i-1] = array[i];
					array[i] = temp;
					done = false;
				}
			}

		}while(!done);
	}
}