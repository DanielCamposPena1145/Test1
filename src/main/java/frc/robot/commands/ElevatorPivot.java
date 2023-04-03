// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ElevatorPulley;

public class ElevatorPivot extends CommandBase {
  /** Creates a new ElevatorPivot. */

  private ElevatorPulley m_elevatorpulley;

  DoubleSupplier yinput;

  public ElevatorPivot(ElevatorPulley m_elevatorpulley, DoubleSupplier yinput) {
    this.m_elevatorpulley = m_elevatorpulley;
    this.yinput = yinput;
    addRequirements(m_elevatorpulley);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {


    // double motorSpeed = RobotContainer.driverController2.getRawAxis(Constants.ELEVATOR_PULLEY_Y_AXIS);

    m_elevatorpulley.driverPulley(yinput.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_elevatorpulley.driverPulley(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
