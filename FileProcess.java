import java.io.*;
import java.util.*;

public class FileProcess {
	public static void main(String[] args) {
            try {
                    File file1 = new File ("busy_day.in");
                    Scanner scn = new Scanner (file1);
                    int count=0;
                    while(scn.hasNextLine()){
                        count++;
                        if(count==1){
                            String Line =scn.nextLine();
                            String[] splited = Line.split("\\s+");    
                            System.out.println("row "+splited[0]+" col "+splited[1]);
                            
                        }
                        
                    }

            } catch (FileNotFoundException fnfe){
            System.out.println("File not found");}
		 
	}
}
