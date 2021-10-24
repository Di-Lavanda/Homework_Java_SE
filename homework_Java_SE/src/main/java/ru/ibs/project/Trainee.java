package ru.ibs.project;

public class Trainee extends Employee{
    private double bonus;
    private String name;

    public Trainee(double bonus, String name){
        this.bonus = bonus;
        this.name = name;
    }

    @Override
    public int salary(){
        return work_time*rate;
    }

    private double self_salary(){
        return salary()*bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {this.name = name;    }


}
