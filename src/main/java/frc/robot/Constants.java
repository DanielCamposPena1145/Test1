// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
//Driver1 Left & Right Motor PWM Ports
public static final int DRIVER_LEFT_MOTOR_1 = 1;
public static final int DRIVER_LEFT_MOTOR_2 = 2;
public static final int DRIVER_LEFT_MOTOR_3 = 3;
public static final int DRIVER_RIGHT_MOTOR_1 = 4;
public static final int DRIVER_RIGHT_MOTOR_2 = 5;
public static final int DRIVER_RIGHT_MOTOR_3 = 6;
//Driver Controller 1 Port
public static final int DRIVER_CONTROLLER_1_PORT = 0;
//Driver Controller 1 Left & Right Stick Y Axis
public static final int DRIVER_CONTROLLER_1_LEFTSPEED_Y = 1;
public static final int DRIVER_CONTROLLER_1_RIGHTSPEED_Y = 5;

//INTAKE, LIFT, ELEVATOR

//Driver Controller 2 Port
public static final int DRIVER_CONTROLLER_2_PORT = 1;
//Driver2 Elevator Pulley PWM Port
public static final int ELEVATOR_PULLEY_MOTOR_1 = 7;
//Driver Controller 2 Left & Right Stick Y Axis
public static final int ELEVATOR_PULLEY_Y_AXIS = 1;
public static final int ELEVATOR_LIFT_CHAIN_Y_AXIS = 5;
//Elevator Lift NEOPWM Motor Port
public static final int ELEVATOR_LIFT_1 = 0;
//Intake Motor PWM Port
public static final int INTAKE_MOTOR_1 = 8;

public static final int DRIVER_CONTROLLER_1_LEFTJOYSTICK_Y_AXIS = 1;
public static final int DRIVER_CONTROLLER_1_RIGHTJOYSTICK_Y_AXIS = 5;

public static final int DRIVERCONTROLLER_2_LEFT_JOYSTICK_Y_AXIS = 1;
public static final int DRIVER_CONTROLLER_2_RIGHTJOYSTICK_Y_AXIS = 5;



}
