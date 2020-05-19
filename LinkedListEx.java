package DataStructures;
import java.util.LinkedList;
public class LinkedListEx {
	/*
	 * LinkedList is class in java
	 * in this program we will see the methods used in the LinkedList Class.
	 */
	public static LinkedList<String> ll = new LinkedList<>();
	public void setData() {
		ll.add("Cap");
		ll.add("Thor");
		ll.add("hulk");
		ll.add("Joker");
	}
	public LinkedList<String> getData() {
		return ll;
	}
}
