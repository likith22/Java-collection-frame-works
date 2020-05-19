package vendingMachine;
import java.util.*; 

public class VendingMachine {
	private Map<String, Integer> products = new LinkedHashMap<String, Integer>();
	
	public void setData() {
		products.put("Coke",20);
		products.put("Pepsi",23);
		products.put("ThumsUp",23);
	}
	public void displayProducts() {
		Set set = products.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry me = (Map.Entry)iterator.next();
			System.out.println(me.getKey()+" => "+me.getValue());
		}
	}
	public int calculateBill(String product,int qty,int money) {
		if(products.containsKey(product)) {
			money = money + (products.get(product))*qty;
		}
		else {
			System.out.println("Product not Found");
		}
		return money;
	}
}
