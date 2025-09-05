package org.firstinspires.ftc.teamcode.actions;

import java.util.function.DoubleSupplier;

import team.techtigers.base.actions.ServoActionCommand;

public class ServoPitchAction extends ServoActionCommand {

    private ServoSubsystem servoSubsystem;

    public ServoPitchAction(ServoSubsystem servoSubsystem, DoubleSupplier expectedPosSupplier, long duration) {
        super(expectedPosSupplier, duration);
        this.servoSubsystem = servoSubsystem;
    }

    @Override
    protected double getPosition() {
        return servoSubsystem.getServoPosition();
    }

    @Override
    protected void setPosition(double position) {
        servoSubsystem.setServoPosition(position);

    }
}
