import java.util.*;
public class Node<T>{

    private T value;
    private ArrayList<Node> nextNodes;
    public Node(T value){
        nextNodes = new ArrayList<>();
        this.value = value;
    }
    public void setValue(T value){
        this.value = value;
    }
    public T getValue(){
        return this.value;
    }
    public ArrayList<Node> getNextNodes(){
        return this.nextNodes;
    }
    public void setNextNodes(ArrayList<Node> nextNodes){
        this.nextNodes = nextNodes;
    }

}