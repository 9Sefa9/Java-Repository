public class Reverse {

    public <T extends Comparable<? super T>> boolean reversed(T[] a, T[] b) {

    }

    public <T extends Comparable<? super T>> void reverse(T[] a) {

    }
    
    private String arrayToString(Object[] a) {
        String r="[";
        if(a.length>0)
            r+=a[0];
        for(int i=1; i<a.length; i++)
            r+=", "+a[i];
        r+="]";
        return r;
    }


    public static void main(String[] args) {
        Reverse r = new Reverse();        
        Integer[] a1 = {5,4,3,2,1,0};
        Integer[] a3 = {0,1,2,3,4,5};
        Integer[] a2 = {2,1,2,2,1,1};
        String[] a4 = {"A","B","C","D","E"};
        System.out.println(r.reversed(a1,a3));
        System.out.println(r.reversed(a2,a3));
        System.out.print(r.arrayToString(a1)+" is reversed ");
        r.reverse(a1);
        System.out.println(r.arrayToString(a1));
        System.out.print(r.arrayToString(a2)+" is reversed ");
        r.reverse(a2);
        System.out.println(r.arrayToString(a2));
        System.out.print(r.arrayToString(a4)+" is reversed ");
        r.reverse(a4);
        System.out.println(r.arrayToString(a4));
    }
}