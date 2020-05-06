package shoppingcartApp;

import java.util.ArrayList;
import java.util.List;

public class StoreProduct {
	private final List<Product> products = new ArrayList<Product>();

	public StoreProduct() {

	}

	public List<Product> getProducts() {
		return products;
	}
	public void initStoreItems() {
		String [] name = {"Tea", "Milk", "Bread"}; 
		double [] price = {2.00d, 5.00d, 10.00d}; 
		Integer [] stocks = {14, 20, 50};
		
		for(int i=0; i<name.length; i++) {
			products.add(new Product(i+1,name[i], price[i], stocks[i]));
		}
	}
}
