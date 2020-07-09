public class ElliptischeKurve{




    public static void main(String[] ar){
        int modul = 7;
        for(int i = 0 ; i<=modul-1; i++){
           for(int j = 0 ; j<=modul-1; j++){
                double  x = ((Math.pow(i,3) + i +1) % modul);
                double y = Math.pow(j,2);
                boolean gleich = y == x ? true:false;
                if(gleich)
                    System.out.println("("+i+","+j+")");
            }
        }

    }
}