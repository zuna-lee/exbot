package exbot.platform;

import exbot.platform.devices.DeviceWatcher;
import exbot.platform.devices.LookupTableWrapper;

public class Control {

	public static void main(String[] args) throws InterruptedException {
		
		LookupTableWrapper.initTable();
		new DeviceWatcher();
		while(true){}
	}
	
}