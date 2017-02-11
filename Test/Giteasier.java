import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Giteasier {
    public static void main(String[] Args){
        // Kommandoliste erstellen (jedes Argument muss ein separates Array-Element sein)
        String[][] commandlist = {
                {"ping","localhost"},
                {"ping","8.8.8.8"}
        };
        // Liste der Befehle ausführen
        RunCommands(commandlist);
    }
    // Funktion die die Befehle in einerm gemeinsamen Evironment ausführt
    public static void RunCommands(String[][] commands){
        try{
            ProcessBuilder pb = new ProcessBuilder();
            String s = null;
            Charset charset = Charset.forName("IBM850");
            BufferedReader stdInput;
            Process proc;
            for (String[] command :commands){
                pb.command(command);
                proc = pb.start();
                stdInput = new BufferedReader(new InputStreamReader(
                        proc.getInputStream(),charset));
                while ((s = stdInput.readLine()) != null) {
                    System.out.println(s);
                }
            }
    }catch(Exception ex){}
    }
}