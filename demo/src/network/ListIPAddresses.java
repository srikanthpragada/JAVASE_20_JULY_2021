package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ListIPAddresses {

	public static void main(String[] args) throws UnknownHostException {
		
		var addresses = InetAddress.getAllByName("www.srikanthtechnologies.in");
		
		for(var address : addresses)
			System.out.println(address.getHostAddress());
		

	}

}
