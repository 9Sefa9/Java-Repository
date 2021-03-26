public class ArrayListCustom<T>{

private T[] list;
int i;
public static void main(String[] args){
    ArrayListCustom<Integer> alc = new ArrayListCustom();
}
public ArrayListCustom(){
    this.list = (T[] )new T[0];
    i=0;
}

public void add(T element){
    resizeUp();
    list[i] = element;

}
public T get(int index){
    return list[index];
}
public int indexOf(T element){
    for(int i=0; i<this.list.length;i++){
        if(this.list[i].equals(element)){
            return i;
        }
    }

}
public void print(){
    for(int i=0; i<this.list.length;i++){
        System.out.println(this.list[i]);
    }
}
private void resizeUp(){
    T[] temp = new T[this.list.length+1];
    for(int i = 0; i<temp.length; i++){
        if(i!=this.list.length)
            temp[i] = this.list[i];
    }
    this.list = temp;

}
private void resizeDown(){
    T[] temp = new T[this.list.length];

}
}