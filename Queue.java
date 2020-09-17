import java.util.*;
/*
* Synonyme: FIFO-Schlange, Warteschlange, Queue
* Der DT Schlange kann als spezielle Liste aufgefasst werden, bei der die Elemente an einem Ende (hinten) eingefügt und am anderen Ende (vorne) entfernt werden.
 * LINKED LIST BESSER GEEIGNET!
 */
public class Queue{
        public static void main(String[] args){
                Queue q = new Queue();
                Node n0 = new Node("0");
                Node n1 = new Node("1");
                 Node n2 = new Node("2");
                  Node n3 = new Node("3");
                   Node n4 = new Node("4");
                     Node n5 = new Node("5");
              
                q.enqueue(n0);
                q.enqueue(n1);
                 q.enqueue(n2);
                  q.enqueue(n3);
                   q.enqueue(n4);
                   q.enqueue(n5);
        
                   q.dequeue();
                   q.dequeue();
                   q.dequeue();
                   q.dequeue();
                   q.dequeue();
                   q.dequeue();
        
                   System.out.println(q.size());
                q.print();
                System.out.println(".."); 
        }
    private LinkedList list;
     public Queue(){
         list = new LinkedList();
     }

    public void enqueue(Node value){
            list.prepend(value);
    }
    public Node dequeue(){
        if(!empty()){
            Node tail = getList().tail();
            getList().remove(getList().tail());
            return tail;
        }
        return null;
    }
    public boolean empty(){
        if(getList().size()==0) return true;

        return false;
    }
    public LinkedList getList(){
        return this.list;
    }
    public int size(){
        return this.list.size();
    }
    public void print(){
        this.list.print();
    }
}
