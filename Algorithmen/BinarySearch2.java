public class BinarySearch{
    public static void main(String[] a){
        int[] array = {0,1,1,5,4,9,2,8,5,6,7,1,4};
        sort(array);
        for(int i=0; i<array.length;i++){
            System.out.print(i);
        }
        System.out.println();
        System.out.println(binarySearch(array, 9));
    }
    private static int binarySearch(int[] array,int value){
        int low = 0;
        int high = array.length;
        int mid = (high/2)+1;
        
        while(low<=high){
        
            if(value<array[mid]){
                high = mid;
                mid = (high/2)+1;
                low = 0;
            }
            else if(value>array[mid]){
                    low = mid;
                    mid = low+((high - low)/2);
                    high = array.length;
            }
            else if(value == array[mid]){
                    return mid;  
            }
            for(int i=low; i<high;i++){
            System.out.print(i);
            }
            System.out.println("");
            }
        return -1;
    }
    private static void sort(int[] array){
        for(int i = 0; i<array.length;i++){
            for(int j = i+1; j<array.length;j++){
                    if(array[i]>array[j])
                        swap(i,j,array);
            }
        }
    }
    private static void swap(int i, int j, int[] array){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}