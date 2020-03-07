/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Chasis extends SubsystemBase {

  private WPI_VictorSPX i_fr;
  private WPI_VictorSPX i_tr;
  private WPI_VictorSPX d_fr;
  private WPI_VictorSPX d_tr;

  private DifferentialDrive chasis;
  private SpeedControllerGroup izquierda;
  private SpeedControllerGroup derecha;

  public Chasis() {
    i_fr = new WPI_VictorSPX(RobotMap.I_FR_PORT);
    i_tr = new WPI_VictorSPX(RobotMap.I_TR_PORT);
    d_tr = new WPI_VictorSPX(RobotMap.D_TR_PORT);
    d_fr = new WPI_VictorSPX(RobotMap.I_FR_PORT);

    izquierda = new SpeedControllerGroup(i_fr, i_tr);
    derecha = new SpeedControllerGroup(d_fr, d_tr);

    chasis = new DifferentialDrive(izquierda, derecha);
  }

  public void arcade(double x, double y) {
    chasis.arcadeDrive(x, y);
  }

  @Override
  public void periodic() {

  }
}
