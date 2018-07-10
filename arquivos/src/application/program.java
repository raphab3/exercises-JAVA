package application;

import java.io.File;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
	
		
//		String[] lines = new String[] {"rafael" ,"carla" ,"lucca"};
//		
//		String path = "C:\\workspace\\wp-eclipse\\arquivos\\out.txt";
//		
//		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
//			for(String line : lines) {
//				bw.write(line);
//				bw.newLine();
//			}
//		}
//		catch(IOException ioe) {
//			ioe.printStackTrace();
//		}
//		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a folder path: "); String strPath = sc.nextLine();
//		File path = new File(strPath);
//		File[] folders = path.listFiles(File::isDirectory);
//		System.out.println("FOLDERS:"); 
//		for (File folder : folders){ 
//			System.out.println(folder); }
//		File[] files = path.listFiles(File::isFile); 
//		System.out.println("FILES:"); 
//		for (File file : files) { 
//			System.out.println(file); }
//		boolean success = new File(strPath + "\\subdir").mkdir();
//		System.out.println("Directory created successfully: " + success);
//		sc.close();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		File path = new File(strPath);
		System.out.println("getPath: " + path.getPath());
		System.out.println("getParent: " + path.getParent()); 
		System.out.println("getName: " + path.getName());
		sc.close();


			
		
	}

}
