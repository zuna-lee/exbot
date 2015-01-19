package exbot.example.mouse;

import java.util.ArrayList;

import exbot.dev.core.interfaces.ProducedData;
import exbot.dev.core.interfaces.Operator;

public class Mouse extends Operator{
	
	public Mouse(String id, ArrayList<String> dataFrom){
		super(id, dataFrom);
	}
	
	protected ProducedData process() {
		// TODO Auto-generated method stub
		System.out.println("m is operating");
		return new MousePoint("M");
	}

}