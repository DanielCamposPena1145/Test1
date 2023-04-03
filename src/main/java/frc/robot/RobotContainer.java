// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.commands.ElevatorLiftChain;
import frc.robot.commands.ElevatorPivot;
import frc.robot.commands.TankDrive;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.ElevatorLift;
import frc.robot.subsystems.ElevatorPulley;
import frc.robot.subsystems.Intake;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  public final DriveTrain m_drivetrain = new DriveTrain();
  public final ElevatorPulley m_elevatorpulley = new ElevatorPulley();
  public static final ElevatorLift m_elevatorlift = new ElevatorLift();
  public static final Intake m_intake = new Intake();
  
  // Replace with CommandPS4Controller or CommandJoystick if needed
  public final CommandXboxController driverController1 = new CommandXboxController(Constants.DRIVER_CONTROLLER_1_PORT);
  public final CommandXboxController driverController2 = new CommandXboxController(Constants.DRIVER_CONTROLLER_2_PORT);



  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {
    // Schedule `ExampleCommand` when `exampleCondition` changes to `true`

    m_drivetrain.setDefaultCommand(new TankDrive(m_drivetrain, ()-> driverController1.getRawAxis(Constants.DRIVER_CONTROLLER_1_LEFTJOYSTICK_Y_AXIS), ()-> driverController1.getRawAxis(Constants.DRIVER_CONTROLLER_1_RIGHTJOYSTICK_Y_AXIS)));
    m_elevatorpulley.setDefaultCommand(new ElevatorPivot(m_elevatorpulley, ()-> driverController2.getRawAxis(Constants.DRIVERCONTROLLER_2_LEFT_JOYSTICK_Y_AXIS)));
    m_elevatorlift.setDefaultCommand(new ElevatorLiftChain(m_elevatorlift, ()-> driverController2.getRawAxis(Constants.DRIVER_CONTROLLER_2_RIGHTJOYSTICK_Y_AXIS)));
    
    if(driverController2.leftTrigger().getAsBoolean()) {
      m_intake.intakeMotorSpeed(driverController2.getLeftTriggerAxis()*0.7);
    } else if(driverController2.rightTrigger().getAsBoolean()) {
      m_intake.intakeMotorSpeed(driverController2.getRightTriggerAxis()*0.7);
    } else {
      m_intake.intakeMotorSpeed(0);
    }

    // Schedule `exampleMethodCommand` when the Xbox controller's B button is pressed,
    // cancelling on release.
    
  }

  

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
  
    return null;
  }

}
