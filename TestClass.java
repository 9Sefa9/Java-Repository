public class TestClass{

    public static void main(String[]  args){
        Node n = new Node("ROOT");
        Node n1 = new Node("ROOT");

        if(n.equals(n1)){
             System.out.println(true);
        }
        else System.out.println(false);
    }
}