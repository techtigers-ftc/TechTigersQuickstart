package org.firstinspires.ftc.teamcode;

import team.techtigers.base.statemachine.State;

public class StateTwo extends State<Condition> {
    public StateTwo(String name) {
        super(name);
    }

    @Override
    public Condition getCurrentCondition() {
        return Condition.ENDED;
    }

    @Override
    public void initialize() {
        System.out.println("Start state 2");
    }

    @Override
    public void execute() {
//        System.out.println("Running State Two");
    }
}
