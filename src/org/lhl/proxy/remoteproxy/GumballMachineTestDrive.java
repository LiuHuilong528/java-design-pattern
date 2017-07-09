package org.lhl.proxy.remoteproxy;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * 产生Stub和Skeleton 命令：rmic 远程服务实现
 * 
 * 注册服务;
 * 
 * 启动服务命令：rmiregistry
 * 
 * @author carl
 *
 */
public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachineRemote machine = new GumballMachine("NY");
		try {
			Naming.bind("localhost/machine", machine);
		} catch (MalformedURLException | RemoteException | AlreadyBoundException e) {
			e.printStackTrace();
		}
	}
}
