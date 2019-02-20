// /*----------------------------------------------------------------------------*/
// /* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
// /* Open Source Software - may be modified and shared by FRC teams. The code   */
// /* must be accompanied by the FIRST BSD license file in the root directory of */
// /* the project.                                                               */
// /*----------------------------------------------------------------------------*/

// package frc.robot.subsystems;


// import edu.wpi.first.wpilibj.Solenoid;
// import edu.wpi.first.wpilibj.command.Subsystem;
// import frc.robot.RobotMap;
// import frc.robot.commands.Pneumatics.*;



// /**
//  * Add your docs here.
//  */
// public class PneumaticsArmSubsystem extends Subsystem {
//   // Put methods for controlling this subsystem
//   // here. Call these from Commands.


  
//   // Compressor compressor;
//   // Solenoid Sol1 = new Solenoid(0,RobotMap.SOL1_VALUE);
//   // Solenoid Sol2 = new Solenoid(0,RobotMap.SOL2_VALUE);
//   Solenoid Sol3 = new Solenoid(0,RobotMap.SOL3_VALUE);
//   Solenoid Sol4 = new Solenoid(0,RobotMap.SOL4_VALUE);

//   public void initDefaultCommand(){
//       // Set the default command for a subsystem here.
//       setDefaultCommand(new PneumaticsArmDoNothing());
//     }
    
//   // public void HatchDoNothing(){

//   //   Sol1.set(true);
//   //   Sol2.set(false);

//   // }

//   // public void HatchExtended(){

//   //   Sol1.set(false);
//   //   Sol2.set(true);
//   //   System.out.println("Sub to PewDiePie");
//   // }

//   public void ArmDoNothing(){
//     Sol3.set(true);
//     Sol4.set(false);
//   }

//   public void ArmExtended(){
//     Sol3.set(false);
//     Sol4.set(true);
//     }

// //   protected void init(){

// //     if(compressor.getPressureSwitchValue() == true){

// //       compressor.setClosedLoopControl(true);
      
// //     }else{
// //       compressor.close();
// //     }

// //   }

// }