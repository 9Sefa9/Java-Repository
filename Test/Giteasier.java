import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
// führt einen cmd befehl aus 
public class Giteasier {
    public static void main(String[] Args){
        // Kommandoliste
         String[] commandlist = {"ipconfig","start cmd.e"};
        // Liste der Befehle ausführen
        RunCommands(commandlist);
    }
    public static void RunCommands(String[] commands){
        try{
            ProcessBuilder pb = new ProcessBuilder();
            String s = null;
            Charset charset = Charset.forName("IBM850");
            BufferedReader stdInput;
            Process proc;

                pb.command(commands[0]);
                proc = pb.start();
                stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream(),charset));
                while ((s = stdInput.readLine()) != null) {
                    System.out.println(s);
                
            }
    }catch(Exception ex){}
    }
}