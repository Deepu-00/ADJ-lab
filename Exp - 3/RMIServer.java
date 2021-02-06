import java.rmi.*;
import java.rmi.server.*;


public class RMIServer extends UnicastRemoteObject implements Interest{
	
	public RMIServer() throws RemoteException{
		super();
	}

	public double simple(double p,double t,double r) throws RemoteException{
		return (p*t*r)/100;
	}
	public double compound(double p,double t,double r,double n) throws RemoteException{
		return (p*(Math.pow(1 +(r/n),n*t)));
	}

	public static void main(String args[]) throws Exception{
		RMIServer server =new RMIServer();
		System.out.println("RMI Server is running");
		Naming.rebind("interestServer",server);
	}


}