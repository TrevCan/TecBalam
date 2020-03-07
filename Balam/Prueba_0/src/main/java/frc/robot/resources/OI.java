/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.resources;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.MoveForward;
import frc.robot.commands.Turn;

/**
 * Add your docs here.
 */
public class OI {
    private Joystick control;
    private static OI instance;
    private JoystickButton a, b;

    public OI() {
        control = new Joystick(0);
        a = new JoystickButton(control, 1);
        b = new JoystickButton(control, 2);

    }

    public void configureButtonBindings() {

        a.whileHeld(new MoveForward(0.3));

        b.whileHeld(new Turn(0.3));

    }

    public static OI getInstance() {
        if (instance == null) {
            instance = new OI();
        }
        return instance;
    }

    public Joystick getControl() {
        return control;
    }

}
