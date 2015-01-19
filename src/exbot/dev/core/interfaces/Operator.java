package exbot.dev.core.interfaces;

import java.util.ArrayList;

import exbot.platform.data.Dispatcher;
import exbot.platform.loader.DeviceManager;

public abstract class Operator implements Runnable{
	protected String ID;
	protected Dispatcher dispatcher = new Dispatcher();
	protected boolean running = true;
	protected ArrayList<String> dataFrom = new ArrayList<String>();
	
	public Operator(String id, ArrayList<String> dataFrom){
		this.ID = id;
		this.dataFrom = dataFrom;
		this.requestToRegist();
	}

	private void requestToRegist(){
		for(String id: dataFrom){
			Operator op = DeviceManager.getDeviceManager().getOperator(id);
			op.dispatcher.regist(this);
		}
	}
	
	public void run(){
		while(running){
			ProducedData data = this.process();
			this.dispatcher.announce(data);
		}
	}
	
	public void stop(boolean running){
		System.out.println("stop");
		System.out.flush();
		
		this.running = running;
	}
	
	public String getID() {
		return this.ID;
	}
	
	public ArrayList<String> getDataFrom() {
		return dataFrom;
	}
	
	protected abstract ProducedData process();
}
