import java.util.TreeMap;

public class MainClass {
	
	public static void main(String args[]){
	
		TreeMap<Integer, String> h = new TreeMap<>();
		
		
		h.put(1, "Ja");
		h.put(5, "Tom");
		h.put(4, "Mam");
		
		System.out.println(h.get(4));

	}
}

