package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class program {

	public static void main(String[] args) {
	
		
		String[] lines = new String[] {"rafael" ,"carla" ,"lucca"};
		
		String path = "C:\\workspace\\wp-eclipse\\arquivos\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
			
		
	}

}
