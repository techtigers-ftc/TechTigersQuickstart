package org.firstinspires.ftc.teamcode.actions;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import team.techtigers.base.BaseOpMode;
import team.techtigers.base.actions.ServoActionCommand;

/**
 * Test op mode for the actions
 */
@TeleOp
public class ActionTestOpMode extends BaseOpMode {
    ServoActionCommand actionRunnerCommand;

    @Override
    public void initialize() {
        ServoSubsystem servoSubsystem = new ServoSubsystem(
                hardwareMap.servo.get("servo")
        );

        actionRunnerCommand =
                new ServoPitchAction(
                        servoSubsystem,
                        () -> 50,
                        500
                );

        registerSubsystems(servoSubsystem);
    }

    @Override
    protected void justAfterStart() {
        schedule(actionRunnerCommand);
    }
}
