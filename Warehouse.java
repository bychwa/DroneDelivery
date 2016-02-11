
public class Warehouse {
	
        private Product product[];
        private Location location;
        
        public Warehouse(Product product[],Location location ){
            this.product=product; 
            this.location=location;

        }
	
        public Product[] getProducts() {
            return product;
	}
        public void setLocation(Location loc){
            this.location=loc;
        }
        public Location getLocation(){
            return this.location;
        }
	public void setProdcut(Product[] product) {
            this.product = product;
	}
	// Some kinda connection with drones
	
}
