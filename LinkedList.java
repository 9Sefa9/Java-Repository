import java.util.*;
/*
# Main operations
prepend(value)        -> Add a node in the beginning
append(value)         -> Add a node in the end
pop()                 -> Remove a node from the end
popFirst()            -> Remove a node from the beginning
head()                -> Return the first node
tail()                -> Return the last node
remove(Node)          -> Remove Node from the list

*/
public class LinkedList{

    public static void main(String[] a){
        LinkedList l = new LinkedList();
        Node n0 = new Node("0");
        Node n1 = new Node("1");
         Node n2 = new Node("2");
          Node n3 = new Node("3");
           Node n4 = new Node("4");
             Node n5 = new Node("5");
      
        
    }
    private Node root;
    private int size;
    public LinkedList(){
            size = 0;
    }
    public void prepend(Node value){

        if(this.root == null){
            //Da dies der erste Element ist mit size 0, kann einfach appended werden.
            append(value);
        }else{
            Node newNode = value;
            root.setPreviousNode(newNode);
            newNode.setNextNode(root);
            root = newNode;
            incrementSize();
        }
        
       
    }
    public void append(Node value){
        if(this.root == null){
            this.root = value;
        }else{
            Node lastNode = tail();
            Node newNode = value;
            lastNode.setNextNode(newNode);
            newNode.setPreviousNode(lastNode);
        }
        incrementSize();

    }

    public Node head(){
        return this.root;
    }
    public Node tail(){
        Node rootTmp =  head();
        while(rootTmp.getNextNode()!=null){
                rootTmp = rootTmp.getNextNode();
        }
        return rootTmp;
    }
    public void remove(Node node){
        Node rootTemp=  head();
        while(!rootTemp.equals(node)){
            rootTemp = rootTemp.getNextNode();
        }
        //Match gefunden!
        Node previous = rootTemp.getPreviousNode();
        Node next = rootTemp.getNextNode(); 

        if(previous != null && next != null){
            previous.setNextNode(next);
            next.setPreviousNode(previous);
        }
        else{
            //Fall :  PREVIOUS     ROOT      NULL
            if(previous!=null && next == null){
            previous.setNextNode(null);
            }
            //Fall :  NULL     ROOT      NEXT
            if(previous==null && next!=null){
            next.setPreviousNode(null);
            this.root = next;
            }
            //Fall :  NULL     ROOT      NULL
            if(previous == null && next == null){
                this.root = null;
            }
        }
        decrementSize();
    }
    public void pop(){
        remove(tail());
        decrementSize();
    }
    public void popFirst(){
        remove(head());
        decrementSize();
    }
    private void incrementSize(){
        this.size+=1;
    }
    private void decrementSize(){
        this.size =   this.size == 0 ? 0: (this.size-=1);
    }
    private int size(){
        return this.size;
    }
    public void print(){
        Node tmp = head();
        while(tmp!=null){
                System.out.println(tmp.getValue());
                tmp = tmp.getNextNode();
        }
}

}