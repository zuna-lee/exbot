package exbot.platform.devices;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import exbot.dev.core.interfaces.Operator;
import exbot.platform.loader.DeviceManager;

public class AppFindAction {
	
    public Operator getDevice(String id){
    	final String classPath = LookupTableWrapper.getPath(id);
    	Operator op = null;
		try {
			Class<?> c = Class.forName(classPath);
			Constructor<?> constructor = c.getDeclaredConstructors()[0];
			Object obj = (Object)constructor.newInstance(new Object[] {
				    new String(id),
				    new ArrayList<String>()
			});
			
			op = (Operator) obj;
			
		} catch (ClassNotFoundException e) {
//			System.err.println("A class for operating the device is not found");
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		return op;
	}
    
    public void registOperator(Operator op){
		DeviceManager.getDeviceManager().addOperator(op);
    }

	public void init(Operator op) {
		(new Thread(op)).start();
	}
}
