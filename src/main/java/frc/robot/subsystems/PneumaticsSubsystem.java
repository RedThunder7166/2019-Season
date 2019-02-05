/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

import frc.robot.commands.Pneumatics.*;



/**
 * Add your docs here.
 */
public class PneumaticsSubsystem extends Subsystem{
  // Put methods for controlling this subsystem
  // here. Call these from Commands.


  
  Compressor compressor;
  Solenoid Sol1 = new Solenoid(0,0);
  Solenoid Sol2 = new Solenoid(0,1);
  Solenoid Sol3 = new Solenoid(0,2);
  Solenoid Sol4 = new Solenoid(0,3);


  public void initDefaultCommand(){
      // Set the default command for a subsystem here.
      setDefaultCommand(new PneumaticsArmDoNothing());
    }
    
  public void HatchDoNothing(){

    Sol3.set(true);
    Sol4.set(false);

  }

  public void HatchExtended(){

    Sol3.set(false);
    Sol4.set(true);
    System.out.println("Sub to PewDiePie");
  }

  public void ArmDoNothing(){

    Sol1.set(true);
    Sol2.set(false);

  }

  public void ArmExtended(){

    Sol1.set(false);
    Sol2.set(true);
    System.out.println("Sub to PewDiePie");
  }

  protected void init(){

    if(compressor.getPressureSwitchValue() == true){

      compressor.setClosedLoopControl(true);
      
    }else{
      compressor.close();
    }

  }

}