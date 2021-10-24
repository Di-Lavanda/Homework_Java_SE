package ru.ibs.project;

public class Developer extends Employee{
    private int completedTaskCount;
    private String rang;

    @Override
    public double salary() {
        return workTime*rate*completedTaskCount;
    }

    private void performTasks(){}

    public int getCompletedTaskCount() {
        return completedTaskCount;
    }

    public void setCompletedTaskCount(int completedTaskCount) {
        this.completedTaskCount = completedTaskCount;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }
}
