// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
  /** Creates a new Intake. */

  Spark intakeMotor1 = null;

  public Intake() {
    intakeMotor1 = new Spark(Constants.INTAKE_MOTOR_1);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void intakeMotorSpeed(double speed) {
    intakeMotor1.set(speed);
  }
}
