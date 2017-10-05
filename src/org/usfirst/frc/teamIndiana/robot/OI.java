
package org.usfirst.frc.teamIndiana.robot;

import org.usfirst.frc.teamIndiana.robot.util.Deadband;

import edu.wpi.first.wpilibj.Joystick;

public class OI {
	
	private Joystick driver				= new Joystick(Constants.usbDriver);
	
	public boolean shift, score;
	public double leftY, rightY;
	
	public void getOI(){
		//Drive Controls
		leftY = -1.0 * Deadband.calcDeadbandOut(driver.getRawAxis(Constants.controllerLY));
		rightY = -1.0 * Deadband.calcDeadbandOut(driver.getRawAxis(Constants.controllerRY));
		
		shift = driver.getRawButton(Constants.controllerRB);
		score = driver.getRawButton(Constants.controllerLB);
	}
}
