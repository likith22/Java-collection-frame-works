import vendingMachine.VendingMachine;
import java.util.*;
public class TestVendingMachine {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		Scanner sc = new Scanner(System.in);
		vm.setData();
		vm.displayProducts();
		System.out.println("enter no.of products:");
		int n = sc.nextInt();
		
		int qty = 0;
		int money = 0;
		String products[] = new String[n];
		for(int i = 0;i < n ;i++ ) {
			System.out.println("Enter the product names:");
			products[i] = sc.next();
			System.out.println("Enter the qty");
			qty = sc.nextInt();
			money = vm.calculateBill(products[i], qty, money);
		}
		System.out.println("Bill = "+money);
		sc.close();
	}

}
