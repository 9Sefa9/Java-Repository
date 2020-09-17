import java.util.*;
public class BreadthFirstSearch{
    private static Queue queue;
   public static void main(String[] args){
        Node node = generateRandomNodes(); 
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        bfs.bfsAlternative(node);
    }
    public BreadthFirstSearch(){
        queue = new Queue();
    }
    public static void bfs(Node n){
            System.out.println(n.getValue());
                if(!n.getNextNodes().isEmpty()){
                    for(Object currentNode  : n.getNextNodes()){ 
                        if(!((Node)currentNode).getVisited()){
                        ((Node)currentNode).setVisited(true);
                        queue.enqueue((Node)currentNode);
                        }
                    }
                }

                Node adjacentNode = queue.dequeue();
                if(adjacentNode!=null)
                    bfs(adjacentNode);
                
    }
    public static void bfsAlternative(Node n){
            
                queue.enqueue(n);

                while(!queue.isEmpty()){
                    Node currentNode  = queue.dequeue();
                    for(Object adjacentNode  : currentNode.getNextNodes()){
                        if(adjacentNode!=null && !((Node)adjacentNode).getVisited()){
                           ((Node)adjacentNode).setVisited(true); 
                           queue.enqueue((Node)adjacentNode);
                        }
                    }
                    System.out.println(((Node)currentNode).getValue());
                }
    } 
        
    private static Node generateRandomNodes(){
        Node newNode = new Node("ROOT");

        Random random = new Random();
         ArrayList<Node> n = new ArrayList<Node>();
    //     for(int i = random.nextInt(10) ; i<random.nextInt(30); i+=random.nextInt(3)){
     //        for(int j = random.nextInt(10)  ; j<random.nextInt(30); j+=random.nextInt(3)){
                    n.add(new Node("Leaf "+"1"));
                    n.add(new Node("Leaf "+"2"));
                    n.add(new Node("Leaf "+"3"));

                    n.get(0).getNextNodes().add(new Node("Leaf "+"4"));
                    n.get(0).getNextNodes().add(new Node("Leaf "+"5"));
                    ((Node)n.get(0).getNextNodes().get(1)).getNextNodes().add(new Node("Leaf "+"6"));
                    n.get(2).getNextNodes().add(new Node("Leaf "+"7"));
                    ((Node)n.get(2).getNextNodes().get(0)).getNextNodes().add(((Node)n.get(0).getNextNodes().get(1)).getNextNodes().get(0));
    //        }
    //    }


        newNode.setNextNodes(n);
        return newNode;
    }
}