// /*----------------------------------------------------------------------------*/
// /* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
// /* Open Source Software - may be modified and shared by FRC teams. The code   */
// /* must be accompanied by the FIRST BSD license file in the root directory of */
// /* the project.                                                               */
// /*----------------------------------------------------------------------------*/

// package frc.robot.gamepads;

// import frc.robot.RobotMap;
// import edu.wpi.first.wpilibj.Joystick;
// import edu.wpi.first.wpilibj.buttons.JoystickButton;

// /**
//  * Add your docs here.
//  */
// public class F310 extends Joystick {

//     	// Gamepad axis ports
// 	private static final int AXIS_LEFT_X = 0;
// 	private static final int AXIS_LEFT_Y = 1;
//     private static final int AXIS_LEFT_TRIGGER = 2;
//     private static final int AXIS_RIGHT_TRIGGER = 3;
// 	private static final int AXIS_RIGHT_X = 4;
// 	private static final int AXIS_RIGHT_Y = 5;
// 	private static final int AXIS_DPAD_X = 6;

// 	// Gamepad buttons
// 	private static final int BUTTON_A = 1;
// 	private static final int BUTTON_B = 2;
// 	private static final int BUTTON_X = 3;
// 	private static final int BUTTON_Y = 4;
// 	private static final int BUTTON_LEFT_BUMPER = 5;
// 	private static final int BUTTON_RIGHT_BUMPER = 6;
// 	private static final int BUTTON_BACK = 7;
// 	private static final int BUTTON_START = 8;
// 	private static final int BUTTON_LEFT_STICK = 9;
// 	private static final int BUTTON_RIGHT_STICK = 10;

// /**
// 	 * Default constructor
// 	 * @param port - the port the joystick is plugged into on the DS.
// 	 */
//     public F310(int port) {
// 		super(port);	
// 	}
//     public double getLeftStickRaw_X() {
// 		return getRawAxis(AXIS_LEFT_X);
// 	}

// 	/**
// 	 * Returns the X position of the right stick.
// 	 */
// 	public double getRightStickRaw_X() {
// 		return getRawAxis(AXIS_RIGHT_X);
// 	}

// 	/**
// 	 * Returns the Y position of the left stick.
// 	 */
// 	public double getLeftStickRaw_Y() {
// 		return getRawAxis(AXIS_LEFT_Y);
// 	}

// 	/**
// 	 * Returns the Y position of the right stick.
// 	 */
// 	public double getRightStickRaw_Y() {
// 		return getRawAxis(AXIS_RIGHT_Y);
// 	}

// 	/**
// 	 * Returns the position of the shoulder trigger.
// 	 */
// 	public double getTriggerAxisRaw_Right() {
// 		return getRawAxis(AXIS_RIGHT_TRIGGER);
//     }

//     	/**
// 	 * Returns the position of the shoulder trigger.
// 	 */
// 	public double getTriggerAxisRaw_Left() {
// 		return getRawAxis(AXIS_LEFT_TRIGGER);
// 	}

// 	/**
// 	 * Returns the position of the shoulder trigger.
// 	 */
// 	public double getDAxisRaw_X() {
// 		return getRawAxis(AXIS_DPAD_X);
//     }
    
//     /**
// 	 * Checks whether Button A is being pressed and returns true if it is.
// 	 */
// 	public boolean isPressedButtonA() {
// 		return getRawButton(BUTTON_A);
// 	}

// 	/**
// 	 * Checks whether Button B is being pressed and returns true if it is.
// 	 */
// 	public boolean isPressedButtonB() {
// 		return getRawButton(BUTTON_B);
// 	}

// 	/**
// 	 * Checks whether Button X is being pressed and returns true if it is.
// 	 */
// 	public boolean isPressedButtonX() {
// 		return getRawButton(BUTTON_X);
// 	}

// 	/**
// 	 * Checks whether Button Y is being pressed and returns true if it is.
// 	 */
// 	public boolean isPressedButtonY() {
// 		return getRawButton(BUTTON_Y);
// 	}

// 	public boolean isPressedButtonLeftBumper() {
// 		return getRawButton(BUTTON_LEFT_BUMPER);
// 	}	  

// 	public boolean isPressedButtonRightBumper() {
// 		return getRawButton(BUTTON_RIGHT_BUMPER);
// 	}	  	  

// 	public boolean isPressedButtonBack() {
// 		return getRawButton(BUTTON_BACK);
// 	}	 	  

// 	public boolean isPressedButtonStart() {
// 		return getRawButton(BUTTON_START);
// 	}		  

// 	public boolean isPressedButtonLeftStick() {
// 		return getRawButton(BUTTON_LEFT_STICK);
// 	}	

// 	public boolean isPressedButtonRightStick() {
// 		return getRawButton(BUTTON_RIGHT_STICK);
// 	}

// 	/**
// 	 * Returns an object of Button A.
// 	 */
// 	public JoystickButton ButtonA() {
// 		return new JoystickButton(this, BUTTON_A);
// 	}

// 	/**
// 	 * Returns an object of Button B.
// 	 */
// 	public JoystickButton ButtonB() {
// 		return new JoystickButton(this, BUTTON_B);
// 	}

// 	/**
// 	 * Returns an object of Button X.
// 	 */
// 	public JoystickButton ButtonX() {
// 		return new JoystickButton(this, BUTTON_X);
// 	}

// 	/**
// 	 * Returns an object of Button Y.
// 	 */
// 	public JoystickButton ButtonY() {
// 		return new JoystickButton(this, BUTTON_Y);
// 	}

// 	/**
// 	 * Gets Start button object
// 	 * @return the Start button
// 	 */
// 	public JoystickButton ButtonStart(){
// 		return new JoystickButton(this, BUTTON_START);
// 	}

// 	/**
// 	 * Gets the Back button object
// 	 * @return the Back button
// 	 */
// 	public JoystickButton ButtonBack() {
// 		return new JoystickButton(this, BUTTON_BACK);
// 	}

// 	/**
// 	 * Gets the state of the left shoulder
// 	 * @return the state of the left shoulder
// 	 */
// 	public JoystickButton ButtonLeftBumper() {
// 		return new JoystickButton(this, BUTTON_LEFT_BUMPER);
// 	}

// 	/**
// 	 * Gets the state of the right shoulder
// 	 * @return the state of the right shoulder
// 	 */
// 	public JoystickButton ButtonRightBumper() {
// 		return new JoystickButton(this, BUTTON_RIGHT_BUMPER);
// 	}

// 	public JoystickButton ButtonLeftStick() {
// 		return new JoystickButton(this, BUTTON_LEFT_STICK);
// 	}

// 	public JoystickButton ButtonRightStick() {
// 		return new JoystickButton(this, BUTTON_RIGHT_STICK);
// 	}







// }

