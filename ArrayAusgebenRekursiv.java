package Tests;

public class ArrayAusgebenRekursiv {

	public static void main(String[] args) {
		int[] a = { 2, 4, 5, 7, 9 };
		printRec(a, 0);
	} 

	public static void printRec(int[] array, int index) {
		if (index == array.length-1) {
			return;
		}else {
			printRec(array, index+1);
			System.out.println(array[index]);		
		}

	}
}