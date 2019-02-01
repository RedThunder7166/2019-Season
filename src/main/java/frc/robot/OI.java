/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
// import edu.wpi.first.wpilibj.Compressor;
// import edu.wpi.first.wpilibj.Solenoid;
import frc.robot.commands.*;




/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    // CREATING BUTTONS
    // One type of button is a joystick button which is any button on a
    // joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    // Our instance of the joystick
    protected GenericHID joystick;
    protected GenericHID opjoystick;

    protected JoystickButton extendButton;
    // protected JoystickButton retractButton;

    //hello

    /**
     * Default Constructor
     */
    public OI(){
        joystick = new Joystick(RobotMap.DRIVE_STICK_PORT);
        opjoystick = new Joystick(RobotMap.OP_STICK_PORT);
    }

    /**
     * Separating the initial setup out makes testing easier
     */
    public void init(){

        System.out.println("Made it this far");
        PneumaticsArmOpen pneumaticsArmOpen = new PneumaticsArmOpen();


        // Change to OPJOYSTICK or you will fucking die!!!!!!! <<<<<<<<<< READ THIS CHRIS OR IT BREAK IN MATCH
        extendButton = new JoystickButton(joystick, 1);


        extendButton.toggleWhenActive(pneumaticsArmOpen);

    }


    /**
     * Used to get a reference on the joystick
     * @return
     */
    public GenericHID getjoystick(){
    return joystick;

    }

    public GenericHID getopjoystick(){
    return opjoystick;
    }

}