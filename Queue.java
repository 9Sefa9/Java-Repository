import java.util.*;
/*
* Synonyme: FIFO-Schlange, Warteschlange, Queue
* Der DT Schlange kann als spezielle Liste aufgefasst werden, bei der die Elemente an einem Ende (hinten) eingefügt und am anderen Ende (vorne) entfernt werden.
 * LINKED LIST BESSER GEEIGNET!
 */
public class Queue<T>{

    private ArrayList<T> list;
     public Queue(){
         list = new ArrayList<T>();
     }

    public void enqueue(T value){
        if(!empty()){

        }
    }
    public T dequeue(){
        if(!empty()){
            T value = getList().get(getList().size()-1);
            getList().remove(getList().size()-1);
            return value;
        }
        return null;
    }
    public boolean empty(){
        if(getList() != null) return  getList().size() == 0;
        
        return true;
    }
    public ArrayList<T> getList(){
        return this.list;
    }
}
