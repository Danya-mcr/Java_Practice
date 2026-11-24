package org.example.Task_1;

public class HeartTestDrive {
    public static void main(String[] argc) {
        HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
