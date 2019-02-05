/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
// import edu.wpi.first.wpilibj.CounterBase;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.Elevator.ElevatorDoNothing;

/**
 * Add your docs here.
 */
public class ElevatorSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  Encoder encoderHeight = new Encoder(0, 1, false, EncodingType.k4X);
  
  // encoderHeight.setDistancePerPulse(5);
  
  

  VictorSP elevator = new VictorSP(RobotMap.ELEVATOR_PORT);


  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new ElevatorDoNothing());
  }

  public void ElevatorDoNothing(){
    elevator.set(0);
  }

  public void ElevatorUp(){
    elevator.set(1);
  }

  public void ElevatorDown(){
    elevator.set(-1);
  }



}
