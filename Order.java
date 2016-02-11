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
    
    public Order(Product products[],Location del){
            this.products=products;
            this.deliveredLocation=del;
    }
    
}
