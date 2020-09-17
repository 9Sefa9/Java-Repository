import java.util.*;
public class Node<T>{

    private T value;
    private boolean visited =false;
    //private ArrayList GetAdjacentEdges(G,W) wobei der edge von V nach W geht. AM besten iterieren über den 
    //Für linkesList nützlich
    private Node nextNode=null;
    private Node previousNode=null;

    //für Bäume mit mehr als einem Leaf
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
    public void setVisited(boolean visited){
        this.visited = visited;
    }
    public boolean getVisited(){
        return this.visited;
    }
    public void setNextNode(Node node){
        this.nextNode = node;
    }
    public Node getNextNode(){
        return this.nextNode;
    }
    public void setPreviousNode(Node node){
        this.previousNode = node;
    }
    public Node getPreviousNode(){
        return this.previousNode;
    }
}