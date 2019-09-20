package com.org.designpattern.command;

//Client
public class Client {
	
	public static void main(String[] args) {
		
		Light light = new Light();
	    Command lightsOn = new LightOnCommand(light);
	    Command lightsOff = new LightOffCommand(light);

		RemoteController control = new RemoteController();
		
		control.setCommand(lightsOn);
		control.pressButton();
		
		control.setCommand(lightsOff);
		control.pressButton();
	    
	}
}
