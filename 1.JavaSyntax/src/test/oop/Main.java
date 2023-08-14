package test.oop;

import test.oop.animal.Animal;
import test.oop.animal.Cat;
import test.oop.animal.Dog;
import test.oop.animal.Wolf;

import java.util.HashMap;

public class Main {
    public static void main (String[] args) {
        Cat cat = new Cat();

        Dog dog = new Dog();

//        Bear bear = new Bear();

        Wolf wolf = new Wolf();
        wolf.say();

        Animal myAnimal = new Wolf();// полиморфизм
        myAnimal.say();

float f = 100.0F;
double d = 100.0;
       System.out.println("сказал \"привет\", а ты ему \"пока\"");


    }

    public static void method(Animal[]animals) {//
        for (Animal animal : animals) {
            animal.say();
        }
    }
}
