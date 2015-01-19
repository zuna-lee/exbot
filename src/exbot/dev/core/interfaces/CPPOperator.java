package exbot.dev.core.interfaces;

import java.util.ArrayList;

public abstract class CPPOperator extends Operator{

	public CPPOperator(String id, ArrayList<String> dataFrom){
		super(id, dataFrom);
	}
	
	protected void init(String libName){
		System.loadLibrary(libName);
	}
	
	public native static String wrap(String s);
	
	public void operate(String libName){
		this.init(libName);
		System.out.println(wrap("Pixy is now operating on C++"));
	}
	
}