package LernPaket;

// suche im geordnetem array!
public class BinarySearchSymbolTable<Key extends Comparable<Key>, Value> {
	// Nutzt constructor,
	private Key[] keys;
	private Value[] values;
	private int N;

	public BinarySearchSymbolTable(int kapazit�t) {
		keys = (Key[]) new Object[kapazit�t];
		values = (Value[]) new Object[kapazit�t];
	}
	
	public void put(Key key, Value value){
		int i = rank(key); 
		
	}
	public Value get(Key key) {
		if (key == null)
			return null;
		int i = rank(key);
		if (i < N && keys[i].compareTo(key) == 0)
			return values[i];
		else
			return null;
	}
	//das ist nichts weiter als eine stink normale bin�re suche
	private int rank(Key key) {
		int lo = 0, hi = N - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			int cmp = key.compareTo(keys[mid]);
			if (cmp < 0)
				hi = mid - 1;
			else if (cmp > 0)
				lo = mid + 1;
			else if (cmp == 0)
				return mid;
		}
		return lo;
	}
}
