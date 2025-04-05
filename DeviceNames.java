package org.firstinspires.ftc.teamcode;

public enum DeviceNames {
    LB_MOTOR("left_back_drive"),
    RB_MOTOR("right_back_drive"),
    LF_MOTOR("left_front_drive"),
    RF_MOTOR("right_front_drive"),
    ARM("arm"),
    SEC_ARM("secondArm"),
    SLIDE("slide"),
    INTAKE("pinch"),
    WRIST("wrist"),
    IMU("imu");





    private final String name;


    private DeviceNames(String name) {
        this.name = name;

    }


    public String toString() {
        return name;
    }

}
