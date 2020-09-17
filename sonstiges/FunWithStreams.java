package LernPaket;

import java.io.*;

public class FunWithStreams{
	public static void main(String[] args){
		String input = args[0];
		String output = args[1];
		int x = Integer.parseInt(args[2]);
		haveFun(input, output, x);
	}

	private static void checkWord(String s, int x) throws WordTooLongException{
		if (s.length() > x) throw new WordTooLongException();
	}

	private static void haveFun(String in, String out, int x){
		try(BufferedReader br = new BufferedReader(new FileReader(in));
		BufferedWriter bw = new BufferedWriter(new FileWriter(out))){
			String nextLine = null;
			while((nextLine = br.readLine()) != null){
				String[] words = nextLine.split(" ");
				for (String s : words){
					try {
						checkWord(s,x);
					}
					catch(WortTooLongException e){
						s = s.substring(0,x);
					}
					finally{
						bw.write(s+" ");
					}
				}
				bw.write("\n");
			}
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
