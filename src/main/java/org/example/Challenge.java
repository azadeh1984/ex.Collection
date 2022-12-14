package org.example;

import java.util.*;

public class Challenge {
    public static void main(String[] args) {
        ex3();
    }
    public static void ex1() {
        Set<String> weekDays = new HashSet<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
        Set<String> weekDays2 = new HashSet<>();
        weekDays.add("Saturday");
        weekDays.add("Sunday");
        weekDays2.addAll(weekDays);



        }


    public static void ex2(){
        HashMap<String, String> Person = new HashMap<>();
        Person.put("as@gmail.com", "azadeh");
        //Set<String> person1 = Person.keySet();
        Set<String> person1 = new HashSet<>();
        person1.addAll(Person.keySet());
        System.out.println(person1);


    }
   public static  void ex3(){
       ArrayList<SuperHero> superHerolist = new ArrayList<>();
       superHerolist.add(new SuperHero(12,"Artina",76));
       superHerolist.add(new SuperHero(12,"arash",67));
       superHerolist.add(new SuperHero(13,"Bijan",65));

       System.out.println(superHerolist.toString());
       Collections.sort(superHerolist);
       System.out.println(superHerolist);

   }
}

