package ru.ibs.project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class App {
    public static void main(String[] args){

        HashSet<Object> Set = new HashSet<Object>();
        Developer Oleg = new Developer();
        Oleg.setName("Олег");
        Oleg.setRate(400);
        Oleg.setWorkTime(40);
        Oleg.setCompletedTaskCount(4);
        Oleg.setRang("Middle");
        Teamlead Denis = new Teamlead();
        Denis.setName("Денис");
        Denis.setRate(800);
        Denis.setWorkTime(30);
        Denis.setCountOfTrainee(1);
        Denis.setCountOfDevsInTeam(3);
        Trainee Vlad = new Trainee();
        Vlad.setName("Влад");
        Vlad.setRate(100);
        Vlad.setWorkTime(20);
        Vlad.setQuestionsForTeamleadCount(1000);
        Vlad.setStudyLevel(0.7);
        Set.add(Oleg);
        Set.add(Denis);
        Set.add(Vlad);
        List<Object> List = new ArrayList<Object>(Set);

    }
}
