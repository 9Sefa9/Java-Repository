package LernPaket;

public class HashLinearProbingAusDemKopf2<Key,Value> {
	
	private int M=20;
	private Key [] keys =(Key[]) new Object[M];
	private Value[] values = (Value[]) new Object[M];
	
	public int hash(Key key){
		return (key.hashCode() & 0x7fffffff)%M;
	}
	public Value get(Key key){
		for(int i = hash(key); keys[i] != null; i = (i+1) % M)
			if(key.equals(keys[i]))
				return values[i];
		return null;
	}
	public void put(Key key, Value value){
		int i;
		for(i = hash(key); keys[i] != null; i = (i+1)%M){
			if(key.equals(keys[i]))
				break;
			
		  keys[i] = key;
		  values[i] = value;
		}
	}
}
