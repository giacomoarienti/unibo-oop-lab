package it.unibo.design.robot.impl;

public class BaseArm {
    public static final double BATTERY_FULL = 100;
    public static final double PICKUP_DELTA_CONSUMPTION = 1.2;
    public static final double DROPDOWN_DELTA_CONSUMPTION = 0.5;

    private String armName;
    private boolean grabbing;
    private double batteryLevel;

    public BaseArm(final String name) {
        this.armName = name;
        this.batteryLevel = BATTERY_FULL;
    }
    
    public boolean pickUp() {
        if(this.isBatteryEnough(this.getConsumptionForPickUp()) && !this.grabbing) {
            this.consumeBatteryForPickUp();
            this.grabbing = true;

            log("Pickup");

            return true;
        }

        return false;
    }

    public boolean dropDown() {
        if(this.isBatteryEnough(this.getConsumptionForDropDown()) && this.grabbing) {
            this.consumeBatteryForDropDown();
            this.grabbing = false;

            log("DropDown");

            return true;
        }

        return false;
    }

    public boolean isGrabbing() {
        return this.grabbing;
    }

    public double getConsumptionForPickUp() {
        return PICKUP_DELTA_CONSUMPTION;
    }
    
    public double getConsumptionForDropDown() {
        return DROPDOWN_DELTA_CONSUMPTION;
    }

    /**
     * 
     * @return The robot's current battery level
     */
    public double getBatteryLevel() {
        return Math.round(batteryLevel * 100d) / BATTERY_FULL;
    }

    /**
     * Fully recharge the robot
     */
    public void recharge() {
        this.batteryLevel = BATTERY_FULL;
    }


    @Override
    public String toString() {
        return this.armName;
    }

    /**
     * Consume the amount of energy provided in input from the battery
     * 
     * @param amount
     */
    protected void consumeBattery(final double amount) {
        if (batteryLevel >= amount) {
            this.batteryLevel -= amount;
        } else {
            this.batteryLevel = 0;
        }
    }

    /**
     * @param operationCost how much
     * @return
     */
    protected boolean isBatteryEnough(final double operationCost) {
        return this.batteryLevel > operationCost;
    }

    /**
     * Log in stdout the {@link String} provided in input
     * 
     * @param msg
     */
    protected void log(final String msg) {
        System.out.println("[" + this.armName + "]: " + msg + " Battery Level: " + getBatteryLevel());
    }

    /**
     * Consume the amount of energy required to pickup an object substracting it
     * from the current battery level
     */
    private void consumeBatteryForPickUp() {
        consumeBattery(getConsumptionForPickUp());
    }

    /**
     * Consume the amount of energy required to dropdown an object substracting it
     * from the current battery level
     */
    private void consumeBatteryForDropDown() {
        consumeBattery(getConsumptionForDropDown());
    }
    
}
