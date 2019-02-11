/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.Elevator.ElevatorMoveDown;
import frc.robot.commands.Elevator.ElevatorMoveUp;
// import frc.robot.commands.Pneumatics.PneumaticsArmOpen;
import frc.robot.commands.Pneumatics.PneumaticsHatchOpen;




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

    // protected JoystickButton IntakeButton;
    protected JoystickButton HatchButton;
    protected JoystickButton ElevatorUpButton;
    protected JoystickButton ElevatorDownButton;
    //hello

    /**
     * Default Constructor
     */
    public OI(){
        joystick = new XboxController(RobotMap.DRIVE_STICK_PORT);
        opjoystick = new XboxController(RobotMap.OP_STICK_PORT);
    }

    /**
     * Separating the initial setup out makes testing easier
     */
    public void init(){

        System.out.println("Made it this far");
        // PneumaticsArmOpen pneumaticsArmOpen = new PneumaticsArmOpen();
        PneumaticsHatchOpen pneumaticsHatchOpen = new PneumaticsHatchOpen();
        ElevatorMoveUp elevatorMoveUp = new ElevatorMoveUp();
        ElevatorMoveDown elevatorMoveDown = new ElevatorMoveDown();



        // IntakeButton = new JoystickButton(opjoystick, 2);
        HatchButton = new JoystickButton(opjoystick, 1);
        ElevatorUpButton = new JoystickButton(opjoystick, 5);
        ElevatorDownButton = new JoystickButton(opjoystick, 6);

        // IntakeButton.toggleWhenActive(pneumaticsArmOpen);
        HatchButton.whileHeld(pneumaticsHatchOpen);
        ElevatorUpButton.whileHeld(elevatorMoveUp);
        ElevatorDownButton.whileHeld(elevatorMoveDown);

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