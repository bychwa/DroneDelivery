
import java.io.*;
import java.util.*;

public class FileProcess {
	public static void main() {
		try {
			File file1 = new File ("busy_day.in");
			Scanner scn = new Scanner (file1);
			while(scn.hasNextLine()){
				System.out.println(scn.nextLine());
			}
			
		} catch (FileNotFoundException fnfe){
		System.out.println("File not found");}
		 
	}
}
