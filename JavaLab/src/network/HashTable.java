package network;
import java.util.Hashtable;
import java.util.Map;

public class HashTable {
	public static void main(String[] args) {
		Hashtable<Integer, String> ob=new Hashtable<Integer,String>();
		ob.put(1,"DAA");
		ob.put(2,"ADS");
		ob.put(3,"ES");
		System.out.println("Hash table size = "+ob.size());
		System.out.println("Hash table is = "+ob);
		for(Map.Entry m:ob.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
