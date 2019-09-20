package com.org.designpattern.command;

//Concrete Command
public class LightOffCommand implements Command {
	
	//Reference to Receiver
	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.switchOff();
	}

}
