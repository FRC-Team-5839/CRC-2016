package org.usfirst.frc5839.CRC2017test1.commands;

import org.usfirst.frc5839.CRC2017test1.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveControl extends Command {
	
	public static final Joystick stick1 = Robot.oi.getJoystick1();
	public static final Joystick stick2 = Robot.oi.getJoystick2();

    public DriveControl() {
    	
    	requires(Robot.driveBase);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	Robot.driveBase.Drive(stick1.getRawAxis(0), stick1.getRawAxis(1), stick2.getRawAxis(3), 0);
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
