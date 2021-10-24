package ru.ibs.project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class App {
    public static void main(String[] args){

        HashSet<Object> set = new HashSet<Object>();
        Developer oleg = new Developer();
        oleg.setName("Олег");
        oleg.setRate(400);
        oleg.setWorkTime(40);
        oleg.setCompletedTaskCount(4);
        oleg.setRang("Middle");
        Teamlead denis = new Teamlead();
        denis.setName("Денис");
        denis.setRate(800);
        denis.setWorkTime(30);
        denis.setCountOfTrainee(1);
        denis.setCountOfDevsInTeam(3);
        Trainee vlad = new Trainee();
        vlad.setName("Влад");
        vlad.setRate(100);
        vlad.setWorkTime(20);
        vlad.setQuestionsForTeamleadCount(1000);
        vlad.setStudyLevel(0.7);
        set.add(oleg);
        set.add(denis);
        set.add(vlad);
        List<Object> list = new ArrayList<Object>(set);

    }
}
