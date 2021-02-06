package network;
import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args){
		ArrayList<Integer> ob = new ArrayList<Integer>();
		ob.add(2);
		ob.add(3);
		ob.add(1);
		ob.add(15);
		ob.add(34);
		System.out.println("Arraylist after insertion:"+ob);
		ob.remove(4);
		System.out.println("Array list after remobing 34(using index value):"+ob);
		ob.add(2,0);
		System.out.println("Arraylist after adding new element at 2nd index with 0:"+ob);
	}
}
