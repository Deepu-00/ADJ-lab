package network;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> obj = new HashMap<Integer,String>();
		obj.put(1,"DAA");
		obj.put(2,"ADS");
		obj.put(3,"ES");
		System.out.println("Hash map size = "+obj.size());
		System.out.println("Hash map is = "+obj);
		for(Map.Entry m:obj.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		if(obj.containsKey(2)) {
			String str=obj.get(2);
			System.out.println("value of key 2 is = "+str);
		}
	}
}
