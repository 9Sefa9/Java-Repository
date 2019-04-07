public class BinarySearch{
	
	public static void main(String[] args){
		int[] ar = {2,4,6,8};
		System.out.println(search(6,ar));
	}

	public static int search(int key, int[] sortedArray){
		int lowIndex = 0;
		int highIndex = sortedArray.length-1;
		int midIndex = ((lowIndex +highIndex)/2);

		while(lowIndex <= highIndex){

			if(sortedArray[midIndex] > key)
				highIndex = midIndex- 1;
			
			else if(sortedArray[midIndex] < key)
				lowIndex = midIndex + 1;
			
			else return midIndex;

		}
		return -1;
	}
}