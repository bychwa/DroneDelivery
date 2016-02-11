import java.io.*;
import java.util.*;

public class FileProcess {
        public static int turns,max_payload,no_drones,no_products_types;
        public static List<Drone> drones = new ArrayList<Drone>();
	public static List<Product> products = new ArrayList<Product>();
	public static List<Warehouse> warehouses = new ArrayList<Warehouse>();
	
                
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
                        if(count==2){
                            String[] splited = Line.split("\\s+");    
                            no_products_types=splited[0]; 
                        }
                        if(count== 3){
                            String[] splited = Line.split("\\s+");    
                            for(int i=0; i<splited.length; i++){
                                Product pd=new Product(splited[i],i);
                                products.add(pd);
                            }
                        }
                        if(count== 4){
                            String[] splited = Line.split("\\s+");    
                            for(int i=0; i<splited.length; i++){
                                Warehouse wh=new Warehouse(products.toArray(),new Location(0,0));
                                warehouses.add(wh);
                            }
                        }
                        System.out.println(Line);
                        
                    }

            } catch (FileNotFoundException fnfe){
            System.out.println("File not found");}
		 
	}
}
