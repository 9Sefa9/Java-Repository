public class Midsort{

    private int firsthalf,secondhalf;

    public void sort(Comparable[] list) {
        firsthalf = list.length / 2;
        secondhalf = list.length / 2;

        while (secondhalf - 1 >= 0 && secondhalf < list.length) {

            if ((list[secondhalf].compareTo(list[secondhalf - 1]) ) < 0 && secondhalf > 0) {
                exch(list, secondhalf, secondhalf - 1);

                if (secondhalf < list.length / 2)
                    secondhalf += 1;

                continue;
            } else if ((list[secondhalf].compareTo(list[secondhalf - 1]))>= 0 && secondhalf > 0) {
                secondhalf -= 1;
                continue;
            }
            break;
        }
        while (firsthalf < list.length && firsthalf >= 0) {

            if (firsthalf + 1 == list.length) {
                break;
            } else if ((list[firsthalf].compareTo(list[firsthalf + 1]) ) >0 && firsthalf < list.length - 1) {
                exch(list, firsthalf, firsthalf + 1);

                if (firsthalf > 0)
                    firsthalf -= 1;

                continue;
            } else if ((list[firsthalf].compareTo(list[firsthalf + 1])) <= 0 && firsthalf < list.length - 1) {
                firsthalf += 1;
                continue;
            }
            break;
        }
    }

    public boolean less(Comparable v, Comparable w) {
        return false;
    }

    public void exch(Comparable[] l,int i, int k){
        Comparable temp = l[i];
        l[i] = l[k];
        l[k] = temp;
    }
    public static void main(String[] a){
        Comparable[] mil = new Comparable[100000];
        for(int i = 0; i<mil.length;i++){
           mil[i] = (int)Math.round(Math.random() * (100000 - 0)+0); //random numbers 
	}

        System.out.println();
        Midsort s= new Midsort();

        long past = System.currentTimeMillis();
        s.sort(mil);
        long present = (System.currentTimeMillis() - past) / 1000;
        System.out.println("Es hat: "+present+" sekunden gedauert um eine Liste mit der länge "+mil.length+" zu sortieren!");
        
        System.out.println();
        
        for(Comparable t:mil){
            System.out.println(t);
        }
    }

}