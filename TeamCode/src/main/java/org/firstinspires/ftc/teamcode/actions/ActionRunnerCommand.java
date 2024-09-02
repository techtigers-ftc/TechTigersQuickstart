package org.firstinspires.ftc.teamcode.actions;

import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.command.Subsystem;

import team.techtigers.base.actions.IAction;

/**
 * Command to handle the running of a set of actions
 */
public class ActionRunnerCommand extends CommandBase {
    private IAction topLevelAction;

    /**
     * Initializes a new ActionRunnerCommand
     *
     * @param topLevelAction The top level action to run
     * @param subsystems The subsystems that are required
     */
    public ActionRunnerCommand(IAction topLevelAction,
                               Subsystem... subsystems) {
        addRequirements(subsystems);
        this.topLevelAction = topLevelAction;
    }

    @Override
    public void initialize() {
        topLevelAction.start();
    }

    @Override
    public void execute() {
        topLevelAction.update();
    }

    @Override
    public boolean isFinished() {
        return topLevelAction.isFinished();
    }
}
