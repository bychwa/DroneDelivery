/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaxonisack
 */
public class Order {
    
    private Product products[];
    private Location deliveredLocation;
    private String status;
    
    public Order(Product products[],Location del){
            this.products=products;
            this.deliveredLocation=del;
    }

    public Product[] getProducts() {
            return products;
    }

    public void setProducts(Product[] products) {
            this.products = products;
    }

    public Location getDeliveredLocation() {
            return deliveredLocation;
    }

    public void setDeliveredLocation(Location deliveredLocation) {
            this.deliveredLocation = deliveredLocation;
    }

    public void setStatus(String status){
        this.status=status;
    }
    public String getStatus(){
        return status;
    }
    
}
