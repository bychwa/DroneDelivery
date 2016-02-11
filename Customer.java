/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaxonisack
 */
public class Customer {
      private Location location;
      private int id;
      private Product products[];
        
      public Customer(int id, Location location, Product products[]){
          this.id=id;
          this.location=location;
          this.products=products;
      }
      public void receive(Product products[]){
          this.products=products;
      }
}   
