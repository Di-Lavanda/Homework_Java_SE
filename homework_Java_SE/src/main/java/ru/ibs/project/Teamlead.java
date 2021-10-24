package ru.ibs.project;

public class Teamlead extends Employee implements Manager{
    private int countOfDevsInTeam;
    private int countOfTrainee;
    @Override
    public double salary(){
        return workTime*rate*countOfTrainee;
    }

    @Override
    public void teamManagement() {
        System.out.println("Team! We need work harder!");
    }

    private void teachTrainee(){

    }

    public int getCountOfDevsInTeam() {
        return countOfDevsInTeam;
    }

    public void setCountOfDevsInTeam(int countOfDevsInTeam) {
        this.countOfDevsInTeam = countOfDevsInTeam;
    }

    public int getCountOfTrainee() {
        return countOfTrainee;
    }

    public void setCountOfTrainee(int countOfTrainee) {
        this.countOfTrainee = countOfTrainee;
    }
}
