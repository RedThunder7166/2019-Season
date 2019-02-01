/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
// import edu.wpi.first.wpilibj.Joystick;
// import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

import frc.robot.commands.PneumaticsArmDoNothing;



/**
 * Add your docs here.
 */
public class PneumaticsSubsystem extends Subsystem{
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  JoystickButton extendButton;
  
  Compressor compressor;
  Solenoid Sol1 = new Solenoid(0,0);
  Solenoid Sol2 = new Solenoid(0,1);


  public void initDefaultCommand(){
      // Set the default command for a subsystem here.
      setDefaultCommand(new PneumaticsArmDoNothing());
    }

  public void Extended(){

    Sol1.set(false);
    Sol2.set(true);
    System.out.println("Sub to PewDiePie");
  }



  public void DoNothing(){

    Sol1.set(true);
    Sol2.set(false);

  }

  protected void init(){

    if(compressor.getPressureSwitchValue() == true){

      compressor.setClosedLoopControl(true);
      
    }else{
      compressor.close();
    }

  }

}