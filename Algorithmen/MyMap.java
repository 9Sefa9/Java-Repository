public interface MyMap<K,V>{

	public MyMap<K,V> insert(int key,int value,MyMap<K,V> map);

	public MyMap<K,V> update(int key,int value,MyMap<K,V> map);

	public int lookup(int key,MyMap<K,V> map);

	//public MyOption<T> lookup_op(K key, Map[]map);

	public MyMap<K,V> delete(int key, MyMap<K,V> map);

	public MyMap<K,V> union(MyMap<K,V>[] map1, MyMap<K,V> map2);

	public int size(MyMap<K,V> map);

    public boolean isInDom(int key, MyMap<K,V> map);


}
