package org.firstinspires.ftc.teamcode.actions;

import com.qualcomm.robotcore.hardware.Servo;

import team.techtigers.base.actions.IAction;
import team.techtigers.base.actions.ParallelAction;
import team.techtigers.base.actions.SerialAction;
import team.techtigers.base.actions.ServoAction;
import team.techtigers.base.actions.WaitAction;
import team.techtigers.base.actions.WaitUntilAction;
import team.techtigers.base.statemachine.CloseableSubsytem;

/**
 * Subsystem for controlling two servos
 */
public class ServoSubsystem extends CloseableSubsytem {
    private final Servo servo1;
    private final Servo servo2;

    /**
     * Initializes a new ServoSubsystem
     * @param servo1 The first servo
     * @param servo2 The second servo
     */
    public ServoSubsystem(Servo servo1, Servo servo2) {
        this.servo1 = servo1;
        this.servo2 = servo2;

        servo1.setPosition(0);
        servo2.setPosition(0);
    }

    /**
     * @return an action that runs the servos
     */
    public IAction getServoAction() {
        return new ParallelAction(
                new SerialAction(
                        new WaitAction(1000), // Waits 1 second
                        new ServoAction(servo1, 1, 2000) // Moves servo1 to
                        // position 1 in 1 second
                ),
                new SerialAction(
                        new WaitUntilAction(() -> servo1.getPosition() > 0.5), // Waits until servo1 is past position 0.5
                        new ServoAction(servo2, 1, 500) // Moves servo2 to
                        // position 1 in 1 second
                )
        );
    }
}
