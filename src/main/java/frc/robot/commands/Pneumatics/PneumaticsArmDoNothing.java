/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Pneumatics;

// import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.PneumaticsSubsystem;

public class PneumaticsArmDoNothing extends Command{


  PneumaticsSubsystem pneumaticsSubsystem;


  public PneumaticsArmDoNothing(){
    // Use requires() here to declare subsystem dependencies
    pneumaticsSubsystem = Robot.subsystemMaster.getPneumaticsSubsystem();
    requires(pneumaticsSubsystem);
   
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize(){



  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute(){

    pneumaticsSubsystem.ArmDoNothing();

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished(){
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end(){



  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted(){

  }
}
