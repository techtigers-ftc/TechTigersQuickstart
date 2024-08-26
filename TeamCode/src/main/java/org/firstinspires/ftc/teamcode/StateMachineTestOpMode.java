package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import team.techtigers.base.statemachine.BaseOpMode;
import team.techtigers.base.statemachine.StateMachine;

@TeleOp
public class StateMachineTestOpMode extends BaseOpMode {
    @Override
    public void initialize() {
        StateMachine stateMachine = new StateMachine();

        StateOne stateOne = new StateOne("stateOne");
        StateTwo stateTwo = new StateTwo("stateTwo");

        stateMachine
                .addState(stateOne)
                .addState(stateTwo)
                .from("stateOne")
                    .to("stateTwo")
                    .when(Condition.ENDED)
                .setFirstState("stateOne");

        stateMachine.start();
    }
}
