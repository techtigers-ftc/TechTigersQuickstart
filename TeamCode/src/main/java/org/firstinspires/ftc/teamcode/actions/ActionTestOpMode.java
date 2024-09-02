package org.firstinspires.ftc.teamcode.actions;

import com.arcrobotics.ftclib.command.CommandScheduler;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.statemachine.Condition;
import org.firstinspires.ftc.teamcode.statemachine.StateOne;
import org.firstinspires.ftc.teamcode.statemachine.StateTwo;

import team.techtigers.base.statemachine.BaseOpMode;
import team.techtigers.base.statemachine.StateMachine;

/**
 * Test op mode for the actions
 */
@TeleOp
public class ActionTestOpMode extends BaseOpMode {
    ActionRunnerCommand actionRunnerCommand;

    @Override
    public void initialize() {
        ServoSubsystem servoSubsystem = new ServoSubsystem(
                hardwareMap.servo.get("servo1"), hardwareMap.servo.get("servo2")
        );

        actionRunnerCommand =
                new ActionRunnerCommand(servoSubsystem.getServoAction(),
                        servoSubsystem);

        registerSubsystems(servoSubsystem);
    }

    @Override
    protected void justAfterStart() {
        schedule(actionRunnerCommand);
    }
}
