package org.example.Task_2;

import java.io.Serializable;

public interface State extends Serializable {
    public void ensertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void despence();
}
