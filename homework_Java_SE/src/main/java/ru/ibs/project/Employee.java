package ru.ibs.project;

public abstract class Employee {
    protected int workTime;
    protected int rate;
    public abstract int salary();

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
