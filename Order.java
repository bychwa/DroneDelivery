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
    private Customer customer;
    
    public Order(Product products[],Location del, Customer customer){
            this.products=products;
            this.deliveredLocation=del;
            this.customer=customer;
    }

    public Product[] getProducts() {
            return products;
    }

    public void setProducts(Product[] products) {
            this.products = products;
    }
    public Customer getCustomer() {
            return customer;
    }

    public void setCustomer(Customer customer) {
            this.customer = customer;
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
