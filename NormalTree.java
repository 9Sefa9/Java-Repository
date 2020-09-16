import java.util.*;
public class NormalTree{
    
    
    public static void main(String[] args){
        Node node = new Node("");
        
        ArrayList<Node> n = new ArrayList<Node>();
        n.add(new Node("LEAF1"));
        n.add(new Node("LEAF2"));
        n.add(new Node("LEAF3"));
        n.add(new Node("LEAF4"));
        n.add(new Node("LEAF5"));
        node.setNextNodes(n);
        node.setValue("ROOT");
        printTree(node);
    }
    public static void printTree(Node n){
        Node tmp = n;
        int i =0;
        while(tmp!=null){
            System.out.println((String)tmp.getValue());
            while(tmp.getNextNodes() != null){
                tmp = (Node)tmp.getNextNodes().get(i);
                System.out.println((String)tmp.getValue());
                i+=1;
            }
        }
        
    }
    

}