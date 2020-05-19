import DataStructures.ArrayListEx;

public class TestArrayListEx {

	public static void main(String[] args) {
		ArrayListEx a = new ArrayListEx();
		
		a.addData();
		System.out.println("Before Clearing Duplicates");
		System.out.println(a.getData());
		System.out.println("After Clearing  duplicates");
		System.out.println(a.clearDupicates().getClass());
	}

}
