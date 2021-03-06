/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaxonisack
 */
public class Drone {
    private Product products[];
    private Location location;
    private int id;
    
    public Drone(int id, Product product[], Location location){
        this.id=id; this.products=products; this.location=location;
    }    
    
    public void fly_to(Location end){
        Location start=this.location;
        int x1=start.getRow();
        int y1=start.getColumn();
        int x2=end.getRow();
        int y2=end.getColumn();
        int distanceMoved = (int) Math.pow(( Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)), 0.5);
        
        this.location=end;
        
    }
    public void load(Product items[], Warehouse wh){
        if(wh.getLocation().equals(this.location)) { // if in the same location
            //load items
               this.products=items; 
        }else{  // if different location
            //move there
            fly_to(wh.getLocation());
            //load items
            this.products=items; 
        }
    }
    public void deliver(Order order){
    	if(order.getCustomer().getLocation().equals(this.location)) { // if in the same location
            //load items
    		order.getCustomer().setProducts(this.products) ;
               
    } else {
    		//Item not available in inventory
    }
}
}