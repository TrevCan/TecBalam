/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.autonomus;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.MoveForward;
import frc.robot.commands.Turn;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class Autonomus_1 extends SequentialCommandGroup {
  /**
   * Creates a new Autonomus_1.
   */
  public Autonomus_1() {
    super(new MoveForward(0.5).withTimeout(3), new Turn(0.6).withTimeout(2), new MoveForward(0.6).withTimeout(2));

  }
}
