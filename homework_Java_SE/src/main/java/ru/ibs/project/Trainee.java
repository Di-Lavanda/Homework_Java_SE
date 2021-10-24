package ru.ibs.project;

public class Trainee extends Employee{
    private double studyLevel;
    private long questionsForTeamleadCount;
    @Override
    public double salary(){
        return workTime*rate*studyLevel;
    }

    private void orderPizzaForTeam(){};

    public double getStudyLevel() {
        return studyLevel;
    }

    public void setStudyLevel(double studyLevel) {
        this.studyLevel = studyLevel;
    }

    public long getQuestionsForTeamleadCount() {
        return questionsForTeamleadCount;
    }

    public void setQuestionsForTeamleadCount(long questionsForTeamleadCount) {
        this.questionsForTeamleadCount = questionsForTeamleadCount;
    }
}
