// /*----------------------------------------------------------------------------*/
// /* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
// /* Open Source Software - may be modified and shared by FRC teams. The code   */
// /* must be accompanied by the FIRST BSD license file in the root directory of */
// /* the project.                                                               */
// /*----------------------------------------------------------------------------*/

// package frc.robot.subsystems;

// import edu.wpi.first.wpilibj.Encoder;
// import edu.wpi.first.wpilibj.Talon;
// import edu.wpi.first.wpilibj.command.Subsystem;
// import frc.robot.RobotMap;

// /**
//  * Add your docs here.
//  */
// public class EncoderSubsystem extends Subsystem {
//   // Put methods for controlling this subsystem
//   // here. Call these from Commands.

//   protected Encoder elevatorDistance;
//   Talon elevator = new Talon(RobotMap.ELEVATOR_PORT);

//   public void initialize(){
//     Encoder elevatorDistance = new Encoder(0, 1);


    
//     elevatorDistance.setDistancePerPulse((Math.PI * 1.5) / 1024);
//     // this value is 0.0000730467 it is really small. in / pulse
//                      0.004602 not really  small
//   }

//   @Override
//   public void initDefaultCommand() {
//     // Set the default command for a subsystem here.
//     // setDefaultCommand(new MySpecialCommand());
//   }

//   public void initializeElevatorEncoder(){
//       elevatorDistance.reset();
//   }

//   public void UpTest(){
//       if(elevatorDistance.getDistance() < 10){
//           elevator.set(0.75);
//       }else if(elevatorDistance.getDistance() >= 10){
//           elevator.set(0.05); 
//       }
//   }


// }
