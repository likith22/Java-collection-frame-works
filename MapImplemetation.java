package DataStructures;
import java.util.HashMap;
import java.util.Map;

public class MapImplemetation {
	public static Map<String, String> student = new HashMap<>();
	//entering a value into the map:-
	//note:- you cannot put the values into the map unless you use a function
	public void putData() {
		student.put("101", "Likith");
		student.put("102", "Laalith");
		student.put("103", "Pooja");
	}
	//returning a value using a key:-
	public String getData(String key) {
		return student.get(key);
	}
	//returning a map object
	public Map<String,String> getData() {
		return student;
	}
	/*
	 * hash map does not allow duplicate keys
	 * hash map allows duplicate values
	 * map is interface in java so you to implement it using the hash map.
	 */
}
