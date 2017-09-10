import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThreeSumAlg {
//Milenium Problem:   ThreemSumAlg in einer Laufzeitverhalten unter O(n²) schaffen
	public static int count(int[] a) {
		long now = System.currentTimeMillis();
		int N = a.length;
		int count = 0;
		for (int i = 0; i < N; i++)
			for (int j = i + 1; j < N; j++)
				for (int k = j + 1; k < N; k++)
					if (a[i] + a[j] + a[k] == 0)
						// überprüft die Anzahl der Triple, wenn alle drei arrays addiert gleich 0 ergeben sollen 
						count++;
					else System.out.println("("+a[i]+","+a[j]+","+a[k]+")");
					//System.out.println((System.currentTimeMillis() - now)/1000.0);
		return count;
	}

	public static void main(String[] args) {

		int a[] = {0,1,2,3};
		System.out.println(count(a));
	}
}
