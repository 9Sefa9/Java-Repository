public class Forcesort{
    int [] arrayToSort ={3,1,2,5,4,0};
    //3 1 2 

    //5 4 0
    int [] hilfsArray1 = new int[this.arrayToSort.length/2];
    int [] hilfsArray2 = new int[this.arrayToSort.length/2];

    public static void main(String[] args){
        new Forcesort().sort();
    }
    public void sort(){
        for(int i = 0 ; i<this.arrayToSort.length;i++){
            if(2*i < this.arrayToSort.length)
                hilfsArray1[i] = arrayToSort[2*i];
            
            if((2*i)+1 < this.arrayToSort.length){
                hilfsArray2[i] =arrayToSort[(2*i)+1];
            }
        }
       
        for(int s : this.hilfsArray1)
                System.out.println("Ha1: "+s);
            
        for(int s : this.hilfsArray2)
                System.out.println("Ha1: "+s);
        
    }
}