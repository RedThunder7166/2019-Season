/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlFrame;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.BaseMotorController;

import edu.wpi.first.wpilibj.AnalogInput;
// import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;
// import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.VictorSP;
// import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.Elevator.ElevatorDoNothing;

/**
 * Add your docs here.
 */
public class ElevatorSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  // Encoder encoderHeight = new Encoder(0, 1, false, EncodingType.k4X);

  // encoderHeight.setDistancePerPulse(5);

  DigitalInput elevatorSwitchBottom = new DigitalInput(0);
  DigitalInput elevatorSwitchTop = new DigitalInput(1);
  TalonSRX elevator = new TalonSRX(RobotMap.ELEVATOR_PORT_CAN);
  // VictorSP elevator2 = new VictorSP(RobotMap.ELEVATOR_PORT);
  AnalogInput potentiometer = new AnalogInput(3);
  

  
  // Counter bottomCounter = new Counter(elevatorSwitch);

  public void ElevatorUp(){
      // if(elevatorSwitchTop.get() == true){
      //   elevator.set(ControlMode.PercentOutput, 0.08);
      // }else{
        elevator.set(ControlMode.PercentOutput, 0.75);
      }
    // }

  public void ElevatorDown(){
      if(elevatorSwitchBottom.get() == false){
        // Do Nothing
      }else{ elevator.set(ControlMode.PercentOutput, -0.60);
    }
  }

  public void ElevatorDoNothing(){
    // elevator.setNeutralMode(NeutralMode.Brake);
  }

  public void ElevatorUpSpeed(){
    elevator.set(ControlMode.PercentOutput, 1);
  }

  public void ElevatorDownSpeed(){
    elevator.set(ControlMode.PercentOutput, -1);
  }

  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new ElevatorDoNothing());
  }
//If you want to drive an use the elevator take everything below this and comment it out








  // public void ElevatorGround(){
  //   //if you push A, set motor at 100%
  //   if(elevator.getActiveTrajectoryPosition() >= 0){
  //     elevator.setSelectedSensorPosition(0);
  //   }
  //   if(elevatorSwitchBottom.get() == false){
  //     elevator.set(0.05);
  //   }
  // }

  // //suicide

  // public void ElevatorHatch1(){
  //   if(elevator.getActiveTrajectoryPosition() >= 0){
  //     elevator.setSelectedSensorPosition(0);
  //   }
  //   if(elevatorSwitchTop.get() == false){
  //     elevator.set(0.05);
  //   }
  // }
  
  // public void ElevatorHatch2(){
  //   if(elevator.getActiveTrajectoryPosition() >= 0){
  //     elevator.setSelectedSensorPosition(0);
  //     }
  //   if(elevatorSwitchTop.get() == false){
  //     elevator.set(0.05);
  //     }
  // }

  // public void ElevatorHatch3(){
  //   if(elevator.getActiveTrajectoryPosition() >= 0){
  //     elevator.setSelectedSensorPosition(0);
  //     }
  //   if(elevatorSwitchTop.get() == false){
  //     elevator.set(0.05);
  //    }
  // }

  // //suicide again

  // public void ElevatorCargo1(){
  //   if(elevator.getActiveTrajectoryPosition() >= 0){
  //     elevator.setSelectedSensorPosition(0);
  //     }
  //   if(elevatorSwitchTop.get() == false){
  //     elevator.set(0.05);
  //    }
  // }

  // public void ElevatorCargo2(){
  //   if(elevator.getActiveTrajectoryPosition() >= 0){
  //     elevator.setSelectedSensorPosition(0);
  //     }
  //   if(elevatorSwitchTop.get() == false){
  //     elevator.set(0.05);
  //    }
  // }

  // // public Boolean isSwitchSet(){
  // //   return bottomCounter.get() > 0 && elevatorSwitch.get() == false;
  // // }

  // // public void initializeCounter(){
  // //   bottomCounter.reset();
  // // }

  // public void ElevatorDoNothing(){
  //   elevator.set(0.05);
  // }

  // public void ElevatorUpSpeed(){
  //   elevator.set(1);
  // }

  // public void ElevatorDownSpeed(){
  //   elevator.set(-1);
  // }
}
