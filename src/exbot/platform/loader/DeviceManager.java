package exbot.platform.loader;

import java.util.Hashtable;

import exbot.dev.core.interfaces.Operator;

public class DeviceManager {

	private static DeviceManager deivceManager;
	private static Hashtable<String, Operator> operatingDevicesOperator = new Hashtable<String, Operator>();
	private static Hashtable<String, Integer> portTable = new Hashtable<String, Integer>();
	
	private DeviceManager(){}
	
	public static DeviceManager getDeviceManager(){
		if(deivceManager==null){
			return new DeviceManager();
		}else{
			return deivceManager;
		}
	}
	
	public void addPort(String id, int port){
		portTable.put(id, port);
	}
	
	public int getPort(String id){
		return portTable.get(id);
	}
	
	public void addOperator(Operator op){
		operatingDevicesOperator.put(op.getID(), op);
	}
	
	public Operator getOperator(String id){
		return operatingDevicesOperator.get(id);
	}
	
	public void removeOperator(String id){
		operatingDevicesOperator.remove(id);
		portTable.remove(id);
	}

}
