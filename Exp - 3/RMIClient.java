import java.rmi.*;
import java.util.*;

public class RMIClient {
	public static void main(String args[]) throws Exception{

		double p,t,r,n,rsi,rci;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Principle Amount :");
		p=sc.nextDouble();
		System.out.println("Enter Time :");
		t=sc.nextDouble();
		System.out.println("Enter Interest Rate :");
		r=sc.nextDouble();
		System.out.println("Enter number of times that interest is compounded per unit :");
		n=sc.nextDouble();
		
		Interest i=(Interest)Naming.lookup("rmi://localhost:1099/interestServer");

		rsi=i.simple(p,t,r);
		rci=i.compound(p,t,r,n);

		System.out.println("Simple Interest :"+rsi+"\nCompound Interest :"+rci);



	}
}