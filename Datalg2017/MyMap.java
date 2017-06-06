public interface MyMap<Map>{

	public Map[] insert(int key,int value,Map[] map);

	public Map[] update(int key,int value, Map[] map);

	public int lookup(int key, Map[] map);

	//public MyOption<T> lookup_op(K key, Map[]map);

	public Map[] delete(int key, Map[] map);

	public Map[] union(Map[] map1, Map[] map2);

	public int size(Map[] map);

    public boolean isInDom(int key, Map[] map);


}
