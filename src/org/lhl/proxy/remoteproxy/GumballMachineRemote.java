package org.lhl.proxy.remoteproxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 远程接口
 * 
 * @author carl
 *
 */
public interface GumballMachineRemote extends Remote {
	public String getLocation() throws RemoteException;
}
