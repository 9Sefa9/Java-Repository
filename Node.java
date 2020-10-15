import java.util.*;
public class Node<T>{
    public static void main(String[] args){
        Node<Integer> tree = new Node<Integer>(20);
     
        tree.setLeftNode(9);
        tree.setRightNode(25);  
        tree.setParentNode(tree);
        
        tree.getLeftNode().setLeftNode(5);
        tree.getLeftNode().setRightNode(12);
        tree.getLeftNode().getLeftNode().setParentNode(tree.getLeftNode());
        tree.getLeftNode().getRightNode().setParentNode(tree.getLeftNode());

        tree.getLeftNode().getRightNode().setLeftNode(11);
        tree.getLeftNode().getRightNode().setRightNode(14);
        tree.getLeftNode().getRightNode().getLeftNode().setParentNode(tree.getLeftNode().getRightNode());
        tree.getLeftNode().getRightNode().getRightNode().setParentNode(tree.getLeftNode().getRightNode());

        System.out.println(findInorderSuccessor(tree.getLeftNode()).getValue());
    }
    public static Node findInorderSuccessor(Node node){

            //links ist nichts und rechts ist nichts => stop.
            if(node.getLeftNode()==null && node.getRightNode() == null){System.out.println("1."+node.getValue()+"\n"); return node.getParentNode();}

            //links ist etwas aber rechts ist nichts. => gehe links 
            if(node.getLeftNode()!=null && node.getRightNode()==null){ System.out.println("2."+node.getValue()+"\n");findInorderSuccessor(node.getLeftNode());}

            //links ist etwas und rechts ist etwas => gehe nach links
            if(node.getLeftNode() != null && node.getRightNode()!=null) {System.out.println("3."+node.getValue()+"\n"); findInorderSuccessor(node.getLeftNode());}

            //links ist nichts aber rechts etwas => gehe nach rechts.
            if(node.getLeftNode() == null && node.getRightNode()!=null) {System.out.println("4."+node.getValue()+"\n"); findInorderSuccessor(node.getRightNode());}
            return null;
    }
    private T value;
    private boolean visited =false;
    //private ArrayList GetAdjacentEdges(G,W) wobei der edge von V nach W geht. AM besten iterieren über den 
    //Für linkesList nützlich
    private Node nextNode=null;
    private Node previousNode=null;
    private Node parentNode=null;
    private Node leftNode=null;
    private Node rightNode=null;
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
    public void setRightNode(Node right){
   
        this.rightNode = right;
    }
    public void setRightNode(T value){

        this.rightNode = new Node<T>(value);
    }
    public Node getRightNode(){
        return this.rightNode;
    }
    public void setLeftNode(Node left){

        this.leftNode = left;
    }
    public void setLeftNode(T value){

        this.leftNode = new Node<T>(value);
    }
    public void setParentNode(Node parent){
        this.parentNode = parent;
    }
     public void setParentNode(T value){
        this.parentNode = new Node<T>(value);
    }
    public Node getParentNode(){
        return this.parentNode;
    }
    public Node getLeftNode(){
        return this.leftNode;
    }
    
}