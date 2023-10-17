package it.unibo.design.robot.impl;

import it.unibo.design.robot.api.RobotWithArms;

public class RobotWithTwoArms extends BaseRobot implements RobotWithArms {

    private BaseArm armLeft;
    private BaseArm armRight;

    public RobotWithTwoArms(final String robotName) {
        super(robotName);
        this.armLeft = new BaseArm("Arm Left");
        this.armRight = new BaseArm("Arm Right");
    }

    @Override
    public boolean pickUp() {
        return this.armLeft.pickUp() || this.armRight.pickUp();
    }

    @Override
    public boolean dropDown() {
        return this.armLeft.dropDown() || this.armRight.dropDown();
    }

    @Override
    public int getCarriedItemsCount() {
        return (this.armLeft.isGrabbing() ? 1 : 0) + (this.armRight.isGrabbing() ? 1 : 0);
    }
    
}
