import java.io.*;
import java.util.*;

public class FileProcess {
        public static int turns,max_payload,no_drones;
        public static List<Drone> drones = new ArrayList<Drone>();
	public static void main(String[] args) {
            try {
                    File file1 = new File ("busy_day.in");
                    Scanner scn = new Scanner (file1);
                    int count=0;
                    while(scn.hasNextLine()){
                        count++;
                        String Line =scn.nextLine();
                        if(count==1){
                            String[] splited = Line.split("\\s+");    
                            turns=splited[3]; max_payload=splited[4];
                            no_drones=splited[2];
                            
                            Map cityMap=new Map(splited[0],splited[1]);
                            
                            for(int i=0; i<no_drones;i++){
                                Location initialLocation=new Location(0,0);
                                Drone newDrone=new Drone(i,null,initialLocation);
                                drones.add(newDrone);
                            }
                            
                            System.out.println("row "+splited[0]+" col "+splited[1]);
                            
                        }
                        System.out.println(Line);
                        
                    }

            } catch (FileNotFoundException fnfe){
            System.out.println("File not found");}
		 
	}
}
