// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ElevatorLift extends SubsystemBase {
  /** Creates a new ElevatorLift. */

  PWMSparkMax neoMotor1 = null;

  public ElevatorLift() {
    neoMotor1 = new PWMSparkMax(Constants.ELEVATOR_LIFT_1);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void elevatorLiftSpeed(double speed) {
    neoMotor1.set(speed);
  }
}
