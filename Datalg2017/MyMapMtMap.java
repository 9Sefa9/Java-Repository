
public class MyMapMtMap<K,V> implements MyMap<K,V>{

    public MyMapMtMap(){

    }
    public MyMap<K,V> insert(int key,int value, MyMap<K,V> map){
    		return new MyMapFunctions<K,V>(key,value,new MyMapMtMap<K,V>());
            /*
            MyMapMtMap<K,V> temp = new MyMapMtMap<K,V>();

            Map[] tempMap = new Map[map.length-1];
            tempMap[key] = value;
            return tempMap;
            */
    }
    public MyMap<K,V> update(int key, int value, MyMap<K,V> map){
        if(isInDom(key,map).equals(false))
            break;
        else return MyMapFunctions(key,value,map);
    }
    public boolean isInDom(int key, MyMap<K,V> map) {
         if(map[key] == null)
              return false;

        return true;
    }
    public int lookup(int key, MyMap<K,V> map){
        assert isInDom(key, map).equals(true);
        return map[key];
    }
    /*
    public MyOption<T> lookup_op(int key, MyMap<K,V> map){
        vorerst
        return null;
        return MyOption<map[key]>;
    }
	*/
    public MyMap<K,V> delete(int key, MyMap<K,V> map){
        return map[key] = null;
    }

    public MyMap<K,V> union(MyMap<K,V> map1, MyMap<K,V> map2){
            int length = map1.length+map2.length;
            Map[] temp = new Map[length];

            for(int i=0; i< map1.length; i++)
                temp[i] = map1[i];

            for(int j = map1.length-1; j< map2.length; j++)
                temp[j]= map2[j];

            return temp;
    }

    public int size(MyMap<K,V> map){
        int counter = 0;
        for(int i = 0; i< map.length;i++)
            if(map[i] != null)
                counter++;
        return counter;
    }
    public String toString(){
        return "mt_map";
    }
}