import java.rmi.*;

public interface Interest extends Remote {

	// declaration of remote methods

	public double simple(double p, double t,double r) throws RemoteException;
	public double compound(double p, double t,double r,double n) throws RemoteException;
}