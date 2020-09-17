import java.util.*;
/* Vorgang: 
  procedure DFS(G, v) is
    label v as discovered
    for all directed edges from v to w that are in G.adjacentEdges(v) do
        if vertex w is not labeled as discovered then
            recursively call DFS(G, w)
*/

public class DepthFirstSearch{
    
    public static void main(String[] args){
        Node node = generateRandomNodes(); new Node("");
        
        dfs(node);
    }


    public static void dfs(Node n){
            n.setVisited(true);
            System.out.println(n.getValue());
            for(Object nextNode :n.getNextNodes()){
                if(((Node) nextNode).getVisited() != true)
                    dfs((Node)nextNode);
            }
    }
    private static Node generateRandomNodes(){
        Node newNode = new Node("ROOT");

        Random random = new Random();
         ArrayList<Node> n = new ArrayList<Node>();
         for(int i = random.nextInt(10) ; i<random.nextInt(100); i+=random.nextInt(10)){
             for(int j = random.nextInt(10)  ; j<random.nextInt(100); j+=random.nextInt(10)){
                    n.add(new Node(""+i+" "+j));
            }
        }
        newNode.setNextNodes(n);
        return newNode;
    }
    

}