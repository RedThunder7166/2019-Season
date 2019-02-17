package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.TankDriveCommand;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.SpeedControllerGroup;



public class TankDriveSubsystem extends Subsystem{

    protected VictorSP frontLeft;
    protected VictorSP frontRight;
    protected VictorSP backLeft;
    protected VictorSP backRight;

    protected GenericHID joystick;
    protected GenericHID opjoystick;


    //Declare a couple motor groups

    protected SpeedControllerGroup leftMotorGroup;
    protected SpeedControllerGroup rightMotorGroup;

    protected DifferentialDrive differentialvideogameDrive;

    //Create a constructor
    //This is the one that will default start on this subsystem

    public TankDriveSubsystem(){
        init();
    }
    //once we are in our init method we are going to set the VictorSPs up

    protected void init(){
        joystick = Robot.oi.getjoystick();

        

        frontLeft = new VictorSP(RobotMap.FRONT_LEFT_MOTOR);
        frontRight = new VictorSP(RobotMap.FRONT_RIGHT_MOTOR);
        backLeft = new VictorSP(RobotMap.BACK_LEFT_MOTOR);
        backRight = new VictorSP(RobotMap.BACK_RIGHT_MOTOR);

        leftMotorGroup = new SpeedControllerGroup(frontLeft, backLeft);
        rightMotorGroup = new SpeedControllerGroup(frontRight, backRight);

        differentialvideogameDrive = new DifferentialDrive(leftMotorGroup, rightMotorGroup);

    }

    @Override
    protected void initDefaultCommand(){
        //
        setDefaultCommand(new TankDriveCommand());
    }

    // public void driveasTank(double speed, double rotation){
    //     differentialDrive.arcadeDrive(speed, rotation);
    // }
    public void videogamedrive(){
        double turn = 0.0;
        double speed = 0.0;
        double leftTrigger = joystick.getRawAxis(RobotMap.DRIVE_LEFT_TRIGGER);
        double rightTrigger = joystick.getRawAxis(RobotMap.DRIVE_RIGHT_TRIGGER);
        double rotation = joystick.getRawAxis(RobotMap.DRIVE_STICK);

            if(rightTrigger != 0){
                speed = .80*rightTrigger;
                System.out.println(.80*rightTrigger);
                if(Math.abs(rotation) > .10) {
                    turn = Math.pow(.80*rotation, 3);
                }
            }else if(leftTrigger != 0){
                speed = -.80*leftTrigger;
                System.out.println(.80*leftTrigger);
                if(Math.abs(rotation) > .10) {
                    turn = Math.pow(.80*rotation, 3);
                }
            }else if(Math.abs(rotation) > .10){
                turn = Math.pow(.80*rotation, 3);
            }else{

            } 
                System.out.println("sPeEd:" + speed);
                System.out.println("TuRn: " + turn);
    
            differentialvideogameDrive.arcadeDrive(speed, turn);
            }
}
    
