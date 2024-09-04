package org.firstinspires.ftc.teamcode.display;

import team.techtigers.core.leddisplay.DisplayRegion;
import team.techtigers.core.leddisplay.DisplayView;

/**
 * An example view period
 */
public class ExampleView extends DisplayView {

    /**
     * Creates a new view
     */
    public ExampleView() {
        super(new DisplayRegion[]{
                new ExampleRegion(0,0)
        });
    }
}
