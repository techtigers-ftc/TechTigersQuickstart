package org.firstinspires.ftc.teamcode.actions;

import com.qualcomm.robotcore.hardware.Servo;

import team.techtigers.base.CloseableSubsystem;

/**
 * Subsystem for controlling two servos
 */
public class ServoSubsystem extends CloseableSubsystem {
    private final Servo servo1;
    /**
     * Initializes a new ServoSubsystem
     *
     * @param servo1 The first servo
     */
    public ServoSubsystem(Servo servo1) {
        this.servo1 = servo1;

        servo1.setPosition(0);
    }

    public double getServoPosition() {
        return servo1.getPosition();
    }

    public void setServoPosition(double position) {
        servo1.setPosition(position);
    }
}
