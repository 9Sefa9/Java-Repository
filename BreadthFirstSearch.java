public class BreadthFirstSearch{
   public static void main(String[] args){
        Node node = generateRandomNodes(); new Node("");
        
        dfs(node);
    }

    public static void bfs(Node n){
            n.setVisited(true);
            System.out.println(n.getValue());
            for(Object nextNode :n.getNextNodes()){
                if(((Node) nextNode).getVisited() != true)
                    bfs((Node)nextNode);
            }
    }
    private static Node generateRandomNodes(){
        Node newNode = new Node("ROOT");

        Random random = new Random();
         ArrayList<Node> n = new ArrayList<Node>();
         for(int i = random.nextInt(10) ; i<random.nextInt(30); i+=random.nextInt(3)){
             for(int j = random.nextInt(10)  ; j<random.nextInt(30); j+=random.nextInt(3)){
                    n.add(new Node("Leaf "+i+","+j));
            }
        }


        newNode.setNextNodes(n);
        return newNode;
    }
}