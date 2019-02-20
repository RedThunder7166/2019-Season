/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;
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

  boolean isFinished = false;
  boolean inErrorZone = false;
  int count;

  DigitalInput elevatorSwitchBottom = new DigitalInput(0);
  DigitalInput elevatorSwitchTop = new DigitalInput(1);
  TalonSRX elevator = new TalonSRX(RobotMap.ELEVATOR_PORT_CAN);
  Spark elevatorLights = new Spark(RobotMap.ELEVATOR_LIGHTS_PORT);
  
  // elevator.configSelectedFeedbackSensor(Feedback.)




  // Hatch Heights

  public void ElevatorHatch1(){
    elevator.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Absolute);
    elevator.config_kP(0, 10);
    elevator.config_kI(0, 0.001);
    elevator.config_kD(0, 18);
    elevatorLights.set(0.01);

    elevator.setSensorPhase(true);

    elevator.set(ControlMode.Position , 4129);
    System.out.println("Encoder Value: " + elevator.getSelectedSensorPosition());

    if(elevator.getSelectedSensorPosition() > 4000 && elevator.getSelectedSensorPosition() < 4200){
      elevator.set(ControlMode.PercentOutput, 0.12);
    }
  }

  public void ElevatorHatch2(){
    elevator.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Absolute);
    elevator.config_kP(0, 10);
    elevator.config_kI(0, 0.001);
    elevator.config_kD(0, 18);
    elevatorLights.set(0.01);


    elevator.setSensorPhase(true);

    elevator.set(ControlMode.Position , 17000);
    System.out.println("Encoder Value: " + elevator.getSelectedSensorPosition());

    if(elevator.getSelectedSensorPosition() > 16900 && elevator.getSelectedSensorPosition() < 17100){
      elevator.set(ControlMode.PercentOutput, 0.12);
    }
  }

  public void ElevatorHatch3(){
    elevator.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Absolute);
    elevator.config_kP(0, 10);
    elevator.config_kI(0, 0.001);
    elevator.config_kD(0, 18);
    elevatorLights.set(0.01);


    elevator.setSensorPhase(true);


    System.out.println("Encoder Value: " + elevator.getSelectedSensorPosition());
    
    if(elevatorSwitchTop.get() == true){
      elevator.set(ControlMode.PercentOutput, 0.85);
      // elevator.set(ControlMode.Position , 27500);

      // if(elevator.getSelectedSensorPosition() > 27400 && elevator.getSelectedSensorPosition() < 27600){
      // elevator.set(ControlMode.PercentOutput, 0.15);
      // }
    } else if(elevatorSwitchTop.get() == false){
      elevator.set(ControlMode.PercentOutput, 0.15);
      }
  }

  //Cargo Heights

  public void ElevatorCargo1(){
    elevator.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Absolute);
    elevator.config_kP(0, 10);
    elevator.config_kI(0, 0.001);
    elevator.config_kD(0, 18);
    elevatorLights.set(0.21);

    elevator.setSensorPhase(true);

    elevator.set(ControlMode.Position , 10370);
    System.out.println("Encoder Value: " + elevator.getSelectedSensorPosition());
    
    if(elevator.getSelectedSensorPosition() > 10270 && elevator.getSelectedSensorPosition() < 10470){
      elevator.set(ControlMode.PercentOutput, 0.15);
    }
  }

  public void ElevatorCargo2(){
    elevator.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Absolute);
    elevator.config_kP(0, 10);
    elevator.config_kI(0, 0.001);
    elevator.config_kD(0, 18);
    elevatorLights.set(0.21);


    elevator.setSensorPhase(true);

    elevator.set(ControlMode.Position , 23303);
    System.out.println("Encoder Value: " + elevator.getSelectedSensorPosition());
    
    if(elevator.getSelectedSensorPosition() > 23203 && elevator.getSelectedSensorPosition() < 23403){
      elevator.set(ControlMode.PercentOutput, 0.15);
    }
  }

  // Ground Height

  public void ElevatorGround(){
    System.out.println("Encoder Value: " + elevator.getSelectedSensorPosition());
    elevator.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Absolute);
    elevator.config_kP(0, 10);
    elevator.config_kI(0, 0.001);
    elevator.config_kD(0, 18);
    elevatorLights.set(-0.31);

    elevator.setSensorPhase(true);

    if(elevatorSwitchBottom.get() == true) {
      elevator.set(ControlMode.PercentOutput , -0.45);
    } else if(elevatorSwitchBottom.get() == false){
      elevator.set(ControlMode.PercentOutput, 0.0);
      elevator.setSelectedSensorPosition(0);
    }
  }



  
  // The Default Method That Takes Place When There Is No Elevator Input

  public void ElevatorDoNothing(){
    elevator.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Absolute);
    if(elevatorSwitchBottom.get() == false){
    elevator.set(ControlMode.PercentOutput, 0.0);
    elevator.setSelectedSensorPosition(0);
    } else if(elevatorSwitchBottom.get() == true){
      elevator.set(ControlMode.PercentOutput, 0.15);
    }
  }

  public void ElevatorUp(){
    elevator.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Absolute);
    System.out.println("Encoder Value: " + elevator.getSelectedSensorPosition());
    elevator.set(ControlMode.PercentOutput, 0.65);
    if(elevatorSwitchTop.get() == false){
      elevator.set(ControlMode.PercentOutput, 0.10);
    }
  }

  // public void ElevatorDownSpeed(){
  //   elevator.set(ControlMode.PercentOutput, -1);
  // }

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
