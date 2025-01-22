package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        if (args == null || args.length < 1) {
            throw new RuntimeException();
        }
        SimpleDateFormat input = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat output = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Person person = null;
        if (args[0].equals("-c")) {
            if (args[2].equalsIgnoreCase("м")) {
                person = Person.createMale(args[1], input.parse(args[3]));
            } else if (args[2].equalsIgnoreCase("ж")) {
                person = Person.createFemale(args[1], input.parse(args[3]));
            }
            allPeople.add(person);
            System.out.println(allPeople.size() - 1);
        } else if (args[0].equals("-r")) {
            int index = Integer.parseInt(args[1]);
            if (index >= 0 && index < allPeople.size()) {
                person = allPeople.get(index);
                String name = person.getName();
                String sex = "";
                if (person.getSex().equals(Sex.MALE)) {
                    sex = "м";
                } else if (person.getSex().equals(Sex.FEMALE)) {
                    sex = "ж";
                }

                String date = output.format(person.getBirthDate());
                System.out.println(name + " " + sex + " " + date);
            }

        } else if (args[0].equals("-u")) {
            int index = Integer.parseInt(args[1]);
            if(index>=0 && index <allPeople.size()){
                person = allPeople.get(index);
                person.setName(args[2]);
                person.setBirthDate(input.parse(args[4]));
                if(args[3].equalsIgnoreCase("м")) {
                    person.setSex(Sex.MALE);
                } else if (args[3].equalsIgnoreCase("ж")) {
                    person.setSex(Sex.FEMALE);
                }

            }
        } else if (args[0].equals("-d")) {
            int index = Integer.parseInt(args[1]);
            if(index >=0 && index < allPeople.size()){
                person = allPeople.get(index);
                person.setName(null);
                person.setSex(null);
                person.setBirthDate(null);

            }
        }
    }

}
