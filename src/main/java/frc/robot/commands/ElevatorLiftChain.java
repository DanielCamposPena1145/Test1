// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class ElevatorLiftChain extends CommandBase {
  /** Creates a new ElevatorLiftChain. */
  public ElevatorLiftChain() {
    addRequirements(RobotContainer.m_elevatorlift);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double liftSpeed = RobotContainer.driverController2.getRawAxis(Constants.ELEVATOR_LIFT_CHAIN_Y_AXIS);

    RobotContainer.m_elevatorlift.elevatorLiftSpeed(liftSpeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    RobotContainer.m_elevatorlift.elevatorLiftSpeed(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}