
public class Product {
	private int weight;
	private int productType;
        public Product(int weight, int productType){
            this.weight=weight; this.productType=productType;
        }
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getProductType() {
		return productType;
	}
	public void setProductType(int productType) {
		this.productType = productType;
	}
	
}
