// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */

  VictorSP leftMotor1 = null;
  VictorSP leftMotor2 = null;
  VictorSP leftMotor3 = null;
  VictorSP rightMotor1 = null;
  VictorSP rightMotor2 = null;
  VictorSP rightMotor3 = null;

  MotorControllerGroup leftMotors = null;
  MotorControllerGroup rightMotors = null;


  public DriveTrain() {
    leftMotor1 = new VictorSP(Constants.DRIVER_LEFT_MOTOR_1);
    leftMotor2 = new VictorSP(Constants.DRIVER_LEFT_MOTOR_2);
    leftMotor3 = new VictorSP(Constants.DRIVER_LEFT_MOTOR_3);
    rightMotor1 = new VictorSP(Constants.DRIVER_RIGHT_MOTOR_1);
    rightMotor2 = new VictorSP(Constants.DRIVER_RIGHT_MOTOR_2);
    rightMotor3 = new VictorSP(Constants.DRIVER_RIGHT_MOTOR_3);

    leftMotors = new MotorControllerGroup(leftMotor1, leftMotor2, leftMotor3);
    rightMotors = new MotorControllerGroup(rightMotor1, rightMotor2, rightMotor3);

    rightMotors.setInverted(true);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void driverLeftMotors(double speed) {
    leftMotors.set(speed);
  }

  public void driverRightMotors(double speed) {
    rightMotors.set(speed);
  }
}
