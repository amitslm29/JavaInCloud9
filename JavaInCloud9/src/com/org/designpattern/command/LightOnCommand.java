package com.org.designpattern.command;

//Concrete Command
public class LightOnCommand implements Command {

	//Reference to Receiver
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.switchOn();
	}

}
