package org.lhl.proxy.remoteproxy;

/**
 * Machine 是远程服务实现类
 * 
 * @author carl
 *
 */
public class GumballMachine implements GumballMachineRemote {

	private String location;

	public GumballMachine(String localtion) {
		this.location = localtion;
	}

	@Override
	public String getLocation() {
		return location;
	}

}
