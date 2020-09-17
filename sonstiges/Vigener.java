public class Vigener{
    public static void main(String[] args){
        String str = "PYIPJMHQYWECJMZQXZZDAGRDTXUZCWPYMSYQHVBWIUICWOBJEFPTNKFLCXKDEYIGSQBIOFPYZXWDTNOAVUVRJUAVXEUMJSGZCEBGYULPVUYJMZDCWDWZUCLWDNZCKFCVCKMHWKFSMYKLFYVBSGZXBMZXJOAZYINABFFWSFCJMZQHKKWFCXUWUNEEJBLRULUMTRWECEDWDYJCWMHUOJWLPZLAAIKHTCVNSZHZWSXNVBNAHEOMZOENVDYZCKUAAKZDYELWEWYVGEMMSYQHVBWPUJCWDHLXYQHLOYQHUFWDGFOYQHVBOALSOFTUSOMZXJOAZFVLWZELOFRNZQVQLNSKEYECUTUWDOUXDOFIICVW";
        
        //findTriples(str);
        theKs(str,5);
    }
    public static void theKs(String str, int n){
        for( int j = 0; j<=4;j++){
            System.out.println("K: "+(j+1)+"\n");
        for(int i = j; i<str.length();i+=5){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    }
    public static void findTriples(String str){
                int i =0;
                int j = i+3;
                int k = 0;
                int l = k+3;
                int count = 0;
                while(i<str.length()-2 && j<str.length()-1){
                    String res = str.substring(i, j);
                    while(k<str.length()-2 && l<str.length()-1){
                        if(res.equals(str.substring(k, l))){
                                 count+=1;
                        }
                       
                        k+=1;
                        l+=1;
                    }
                     if(count !=1 && count != 0)
                      System.out.println(res +" count: "+count);
                      
                       count = 0;
                        k = 0; 
                        l = k+3;
                        i+=1;
                        j+=1;   
            }
    }
}