package org.firstinspires.ftc.teamcode;

import team.techtigers.base.statemachine.State;

public class StateOne extends State<Condition> {
    public StateOne(String name) {
        super(name);
    }

    @Override
    public Condition getCurrentCondition() {
        return Condition.RUNNING;
    }

    @Override
    public void execute() {
        System.out.println("Running State One");
    }
}
