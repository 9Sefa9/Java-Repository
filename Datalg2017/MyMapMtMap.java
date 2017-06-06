
public class MyMapMtMap<Map> implements MyMap<Map>{

    public MyMapMtMap(){

    }
    public Map[] insert(int key,int value, Map[] map){
            Map[] tempMap = new Map[map.length-1];
            tempMap[key] = value;
            return tempMap;
    }
    public Map[] update(int key, int value, Map[] map){
        if(isInDom(key,map).equals(false))
            break;
        else map[key] = value;
    }
    public boolean isInDom(int key, Map[] map) {
         if(map[key] == null)
              return false;

        return true;
    }
    public int lookup(int key, Map[] map){
        assert isInDom(key, map).equals(true);
        return map[key];
    }
    public MyOption<T> lookup_op(int key, Map[] map){
        //vorerst
        return null;
        //return MyOption<map[key]>;
    }

    public Map[] delete(int key, Map[] map){
        return map[key] = null;
    }

    public Map[] union(Map[] map1, Map[] map2){
            int length = map1.length+map2.length;
            Map[] temp = new Map[length];

            for(int i=0; i< map1.length; i++)
                temp[i] = map1[i];

            for(int j = map1.length-1; j< map2.length; j++)
                temp[j]= map2[j];

            return temp;
    }

    public int size(Map[] map){
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