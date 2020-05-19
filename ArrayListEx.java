//In this program we will how remove the duplicate values easily using the array List.
package DataStructures;
import java.util.*;

public class ArrayListEx {
	ArrayList<Integer> arr = new ArrayList<>();
	public void addData() {
		arr.add(10);
		arr.add(11);
		arr.add(11);
		arr.add(12);
	}
	public ArrayList<Integer> getData(){
		return arr;
	}
	public Set<Integer> clearDupicates() {
		Set<Integer> s = new LinkedHashSet<Integer>(arr);
		//you can simply copy the data :-
		/*arr.clear();
		arr.addAll(s);
		return arr;*/
		//Or you can simply return the LinkedHashSet
		return s;
		
	}
}
