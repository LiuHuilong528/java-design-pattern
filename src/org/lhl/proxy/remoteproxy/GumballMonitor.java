package org.lhl.proxy.remoteproxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * 客户端
 * 
 * @author carl
 *
 */

public class GumballMonitor {

	private GumballMachineRemote machine;

	public GumballMonitor(GumballMachineRemote machine) {
		this.machine = machine;
	}

	public void report() {
		try {
			System.out.println("GumballMachine :" + machine.getLocation() + " is reporting!");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		String location = "rmi:localhost/machine";
		GumballMonitor monitor = null;
		
		try {
			GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location);
			monitor = new GumballMonitor(machine);
			monitor.report();
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
