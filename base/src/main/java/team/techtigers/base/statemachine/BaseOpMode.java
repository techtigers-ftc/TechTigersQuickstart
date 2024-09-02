package team.techtigers.base.statemachine;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.Subsystem;

import team.techtigers.core.utils.GlobalState;


/**
 * A CommandOpMode that allows for custom telemetry.
 */
public abstract class BaseOpMode extends CommandOpMode {
    protected GlobalState robotState;
    private CloseableSubsytem[] subsystems;

    /**
     * Method where telemetry is set. All telemetry messages should be set here.
     */
    protected void setTelemetry() {
    }

    /**
     * Method run after waitForStart() but before the opMode loop
     */
    protected void justAfterStart() {
    }

    /**
     * Child classes must invoke this method to ensure that the subsystems are properly registered
     * and cleaned up after the OpMode is finished.
     *
     * @param subsystems The subsystems to register
     */
    protected void registerSubsystems(CloseableSubsytem... subsystems) {
        this.subsystems = subsystems;
        super.register(subsystems);
    }

    @Override
    public void register(Subsystem... subsystems) {
        throw new UnsupportedOperationException("Use registerSubsystems() instead of register()");
    }

    @Override
    public void runOpMode() {
        robotState = new GlobalState();
        subsystems = new CloseableSubsytem[0];

        try {
            initialize();
            for (CloseableSubsytem subsystem : subsystems) {
                subsystem.init();
            }
            waitForStart();
            justAfterStart();

            // run the scheduler
            while (!isStopRequested() && opModeIsActive()) {
                run();
                setTelemetry();
                telemetry.update();
            }
        } finally {
            reset();
            // Cleaning up after execution, whether or not there are no errors
            for (CloseableSubsytem subsystem : subsystems) {
                subsystem.close();
            }
        }
    }
}