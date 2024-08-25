package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import team.techtigers.base.visualdisplay.AdafruitNeoPixel;
import team.techtigers.core.utils.GlobalState;

public class TestOpMode extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        telemetry.addData("Status", "Initialized");
        telemetry.update();
        waitForStart();
        while (opModeIsActive()) {
            GlobalState;
            AdafruitNeoPixel;

            telemetry.addData("Status", "Running");
            telemetry.update();
        }
    }
}
