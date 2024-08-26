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
}
