import DataStructures.MapImplemetation;

public class TestMapImplementation {

	public static void main(String[] args) {
		MapImplemetation mi = new MapImplemetation();
		
		mi.putData();
		System.out.println(mi.getData());
		System.out.println(mi.getData("102"));
		
		//using the static object you can access directly the key set:-
		System.out.println(MapImplemetation.student.keySet());
		//you check whether the map is empty or not:-
		System.out.println(MapImplemetation.student.isEmpty());
		//you can check whether the value is present or not:-
		System.out.println(MapImplemetation.student.containsValue("Pooja"));
		//you can check whether the key present or not:-
		System.out.println(MapImplemetation.student.containsKey("101"));
		//you can also get the hash code:-
		System.out.println(MapImplemetation.student.hashCode());
		//you can also replace the values:-
		MapImplemetation.student.replace("101", "lokesh");
		System.out.println(MapImplemetation.student);
	}

}
