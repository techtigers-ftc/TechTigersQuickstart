package org.firstinspires.ftc.teamcode.statemachine;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import team.techtigers.base.BaseOpMode;
import team.techtigers.base.statemachine.StateMachine;

/**
 * Test op mode for the state machine
 */
@TeleOp
public class StateMachineTestOpMode extends BaseOpMode {
    StateMachine stateMachine;

    @Override
    public void initialize() {
        stateMachine = new StateMachine();

        StateOne stateOne = new StateOne("stateOne");
        StateTwo stateTwo = new StateTwo("stateTwo");

        stateMachine
                .addState(stateOne)
                .addState(stateTwo)
                .addTransition(stateOne, stateTwo, Condition.ENDED)
                .setCurrentState(stateOne);
    }

    @Override
    protected void justAfterStart() {
        stateMachine.start();
    }

    @Override
    protected void update() {
        stateMachine.update();
    }
}
