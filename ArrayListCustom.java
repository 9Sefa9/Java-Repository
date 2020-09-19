public class ArrayListCustom<T>{

private T[] list;
public static void main(String[] args){
    ArrayListCustom<int> alc = new ArrayListCustom();
}
public ArrayListCustom(){
    this.list = new T[0];
}

public void add(T element){
    resize();

}
public T get(int index){

}
public int indexOf(){


}
public void sort(){

}
private void resizeUp(){
    T[] temp = new T[this.list.length+1];
    for(int i = 0; i<this.list.length; i++){
        temp[i] = this.list[i];
    }

}
private void resizeDown(){
    T[] temp = new T[this.list.length];

}
}