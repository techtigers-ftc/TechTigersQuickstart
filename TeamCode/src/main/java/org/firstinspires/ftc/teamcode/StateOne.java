package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.util.ElapsedTime;

import team.techtigers.base.statemachine.State;

public class StateOne extends State<Condition> {
    private final ElapsedTime timer;

    public StateOne(String name) {
        super(name);
        timer = new ElapsedTime();
    }

    @Override
    public Condition getCurrentCondition() {
        return timer.seconds()>2? Condition.ENDED: Condition.RUNNING;
    }

    @Override
    public void initialize() {
        System.out.println("Reset Timer");
        timer.reset();
    }

    @Override
    public void execute() {
//        System.out.println("Running State One");
    }
}
