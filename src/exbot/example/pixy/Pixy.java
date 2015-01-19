package exbot.example.pixy;

import java.util.ArrayList;

import exbot.dev.core.interfaces.Operator;
import exbot.dev.core.interfaces.ProducedData;

public class Pixy extends Operator{
	
	public Pixy(String id, ArrayList<String> dataFrom){
		super(id, dataFrom);
	}
	
	protected ProducedData process() {
		// TODO Auto-generated method stub
		return new PixyData("P");
	}


}
