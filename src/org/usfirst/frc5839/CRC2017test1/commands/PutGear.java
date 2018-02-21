package org.usfirst.frc5839.CRC2017test1.commands;

import org.usfirst.frc5839.CRC2017test1.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PutGear extends Command {

    public PutGear() {
    	requires(Robot.gear);
    	requires(Robot.driveBase);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.gear.LiftGear();
    	Robot.driveBase.Drive(0, 0, 0, 0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.gear.LowerGear(-0.1);
    	Robot.gear.GearOut();
    	Robot.driveBase.Drive(0, 0.2, 0, 0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return !Robot.oi.joystickButton2.get();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveBase.Drive(0, 0, 0, 0);
    	Robot.gear.GearStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
