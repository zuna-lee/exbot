package exbot.example.mouse;

import java.util.ArrayList;

import exbot.dev.core.interfaces.CPPOperator;
import exbot.dev.core.interfaces.ProducedData;

public class MouseCpp extends CPPOperator{

	public MouseCpp(String id, ArrayList<String> dataFrom){
		super(id, dataFrom);
	}
	
	protected ProducedData process() {
		super.operate("CPPOperator");
		return null;
	}

}