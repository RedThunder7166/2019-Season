/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Elevator;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.ElevatorSubsystem;

public class ElevatorMoveUp extends Command {

  ElevatorSubsystem elevatorSubsystem;

  public ElevatorMoveUp() {
    elevatorSubsystem = Robot.subsystemMaster.getElevatorSubsystem();    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(elevatorSubsystem);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    elevatorSubsystem.ElevatorUpSpeed();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  elevatorSubsystem.ElevatorUp();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    elevatorSubsystem.ElevatorDoNothing();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
