package exbot.example.mouse;

import exbot.dev.core.interfaces.ProducedData;

public class MousePoint implements ProducedData{
	private String data;
	
	public MousePoint(String data){
		this.data = data;
	}
}
