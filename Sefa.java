import java.util.*;
public class Sefa{
    public static void main(String[] a){
        Scanner input = new Scanner(System.in);

        System.out.println("Hallo Sefa!   Was kann Ich für dich tun ? ");
        System.out.println("1. Programming Modus anschalten\n2.Spielemodus anschalten\n3. Programm beenden");
        String decision = input.next();
        switch(decision){
            case "1":{System.out.println("1");break;}
            case "2":{System.out.println("2");break;}
            case "3":{System.out.println("Ende");break;}
        }
    }
}