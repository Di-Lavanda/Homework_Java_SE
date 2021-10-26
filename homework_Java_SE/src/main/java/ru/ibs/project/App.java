package ru.ibs.project;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args){

        var barista = new Employee() {
            public int drinksMadeCount; // количество сделанных напитков
            @Override
            public double salary() {
                return workTime*rate*drinksMadeCount;
            }
            public void makeCoffee(){   //?
                System.out.println("barista makes coffee for you");
            }

            public int getDrinksMadeCount() { //?
                return drinksMadeCount;
            }

            public void setDrinksMadeCount(int drinksMadeCount) { //?
                this.drinksMadeCount = drinksMadeCount;
            }
        };
        barista.setDrinksMadeCount(12);
        barista.salary();

        HashSet<Employee> set = new HashSet<Employee>();

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

        Developer egor = new Developer();
        egor.setName("Егор");
        egor.setRate(200);
        egor.setWorkTime(40);
        egor.setCompletedTaskCount(1);
        egor.setRang("Junior");

        Developer artur = new Developer();
        artur.setName("Артур");
        artur.setRate(600);
        artur.setWorkTime(40);
        artur.setCompletedTaskCount(7);
        artur.setRang("Senior");

        Teamlead ivan = new Teamlead();
        ivan.setName("Иван");
        ivan.setRate(700);
        ivan.setWorkTime(30);
        ivan.setCountOfTrainee(0);
        ivan.setCountOfDevsInTeam(2);

        Developer lena = new Developer();
        lena.setName("Лена");
        lena.setRate(400);
        lena.setWorkTime(40);
        lena.setCompletedTaskCount(4);
        lena.setRang("Middle");

        Developer pavel = new Developer();
        pavel.setName("Павел");
        pavel.setRate(400);
        pavel.setWorkTime(40);
        pavel.setCompletedTaskCount(5);
        pavel.setRang("Middle");

        set.add(oleg);
        set.add(denis);
        set.add(vlad);
        set.add(egor);
        set.add(artur);
        set.add(ivan);
        set.add(lena);
        set.add(pavel);

        List<Employee> list = new ArrayList<Employee>(set);
        List<Employee> listFilter = list.stream().filter(employee -> employee.getRate() > 200).collect(Collectors.toList());
        listFilter.stream().map(employee -> employee.getName()).forEach(name -> System.out.println(name));


    }
}
