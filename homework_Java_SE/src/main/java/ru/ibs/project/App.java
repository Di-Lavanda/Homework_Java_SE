package ru.ibs.project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class App {
    public static void main(String[] args){
        Developer Oleg = new Developer (1.5, "Олег");
        Teamlead Denis = new Teamlead(2,"Денис");
        Trainee Vlad = new Trainee(0.5,"Влад");
        HashSet<Object> Set = new HashSet<Object>();
        Set.add(Oleg);
        Set.add(Denis);
        Set.add(Vlad);
        List<Object> List = new ArrayList<Object>(Set);

    }
}
