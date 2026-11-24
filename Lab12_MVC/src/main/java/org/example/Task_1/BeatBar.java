package org.example.Task_1;

import javax.swing.*;

public class BeatBar extends JProgressBar implements Runnable {
    private static final long serialVersionUID = 1L;
    private final Thread thread;

    public BeatBar() {
        setMaximum(100);
        thread = new Thread(this);
        thread.setDaemon(true);
        thread.start();
    }

    @Override
    public void run() {
        for (;;) {
            int value = getValue();
            value = (int) (value * .75);
            setValue(value);
            repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}