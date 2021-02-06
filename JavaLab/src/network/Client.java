package network;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		try {
			Socket s = new Socket("localhost", 2008);
			
			DataInputStream din = new DataInputStream(s.getInputStream());
			PrintStream pw = new PrintStream(s.getOutputStream());
			
			pw.println("Hi I am client.Please send me current date and time");
			
			System.out.println("Server : " + din.readLine());
			
			s.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
