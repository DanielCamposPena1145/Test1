// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;
import java.util.function.DoubleSupplier;

public class TankDrive extends CommandBase {
  /** Creates a new TankDrive. */

  DoubleSupplier leftInput, rightInput;

  private DriveTrain m_drivetrain;


  public TankDrive(DriveTrain m_drivetrain, DoubleSupplier leftInput, DoubleSupplier rightInput) {
    this.m_drivetrain = m_drivetrain;
    this.leftInput = leftInput;
    this.rightInput = rightInput;
    addRequirements(m_drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
    

    // double leftSpeed = RobotContainer.driverController1.getRawAxis(Constants.DRIVER_CONTROLLER_1_LEFTSPEED_Y);
    // double rightSpeed = RobotContainer.driverController1.getRawAxis(Constants.DRIVER_CONTROLLER_1_RIGHTSPEED_Y);

    m_drivetrain.driverLeftMotors(leftInput.getAsDouble());
    m_drivetrain.driverRightMotors(rightInput.getAsDouble());



    // m_drivetrain.driverLeftMotors(leftSpeed*0.8);
    // m_drivetrain.driverRightMotors(rightSpeed*0.8);

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_drivetrain.driverLeftMotors(0);
    m_drivetrain.driverRightMotors(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
