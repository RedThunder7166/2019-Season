/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;
import frc.robot.subsystems.LightsSubsystem;

/**
 * Add your docs here.
 */
public class Lights extends InstantCommand {

  LightsSubsystem lightsSubsystem;
  /**
   * Add your docs here.
   */
  public Lights() {
    super();
    lightsSubsystem = Robot.subsystemMaster.getLightsSubsystem();
    // Use requires() here to declare subsystem dependencies
     requires(lightsSubsystem);
  }

  // Called once when the command executes
  @Override
  protected void initialize() {
    lightsSubsystem.Elights();
  }

}
