package org.usfirst.frc5839.CRC2017test1.commands;

import org.usfirst.frc5839.CRC2017test1.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class GearHandler extends Command {

	  public GearHandler() {
	    	requires(Robot.gear);
	        // Use requires() here to declare subsystem dependencies
	        // eg. requires(chassis);
	    }

	    // Called just before this Command runs the first time
	    protected void initialize() {
	    }

	    // Called repeatedly when this Command is scheduled to run
	    protected void execute() {
	    	switch (Robot.oi.button1) {
	    	case 1:
	    		Robot.gear.LiftGear();
	    		break;
			case 0:
				Robot.gear.LowerGear();
				break;
			}
	    }

	    // Make this return true when this Command no longer needs to run execute()
	    protected boolean isFinished() {
	        return !Robot.oi.joystickButton1.get();
	    }

	    // Called once after isFinished returns true
	    protected void end() {
	    	Robot.gear.Liftstop();
	    	switch (Robot.oi.button1) {
	    	case 1:
	    		Robot.oi.button1--;
	    		break;
			case 0:
				Robot.oi.button1++;
				break;
			};
	    }

	    // Called when another command which requires one or more of the same
	    // subsystems is scheduled to run
	    protected void interrupted() {
	    }

}
