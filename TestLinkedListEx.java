import DataStructures.LinkedListEx;
public class TestLinkedListEx {

	public static void main(String[] args) {
		LinkedListEx lle = new LinkedListEx();
		lle.setData();
		System.out.println(lle.getData());
		LinkedListEx.ll.add(2,"nat");
		System.out.println(lle.getData());
		LinkedListEx.ll.remove(1);
		System.out.println(lle.getData());
		LinkedListEx.ll.removeFirst();
		System.out.println(lle.getData());
	}

}
