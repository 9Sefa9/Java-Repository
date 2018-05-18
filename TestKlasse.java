public class TestKlasse {
    public static void main(String[] args){
      System.out.println(f(10,42));
    }
    public static int f(int n,int x){
      int n2 = n;
      while(n2>0){
           System.out.println(n2);
            n2-=1;
            
          if((x-Math.pow(2,n))<=0){
              return 0;
          }
           
          
      }
      return -1;
    }
}
