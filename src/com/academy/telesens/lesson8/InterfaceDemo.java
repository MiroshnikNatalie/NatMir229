package com.academy.telesens.lesson8;

import com.academy.telesens.l3.next.Person;
import com.academy.telesens.lesson6.Button;

public class InterfaceDemo {
    public static void main(String[] args) {

        VisualComponent b1 = new Button();
        b1.draw();

        Fighter boxer = new Boxer();
        boxer.fight();

        QA tester1 = new Programmer();
        tester1.coding();

        Fighter geniy = new Genius();
        geniy.fight();
        ((QA)geniy).coding(); // приводим к типу который умеет кодить

        Dancer dancer = new Сhoreographer();

        Object[] arrPerson = new Person[5];
        arrPerson[0] = new Boxer();
        arrPerson[1] = new Programmer();
        arrPerson[2] = new Genius();
        arrPerson[3] = new Boxer();

        System.out.println("***кто из массива танцор");
        Object[] crowd = {tester1, boxer, dancer};
        for (int i = 0; i < crowd.length; i++) {
            if (arrPerson[i] instanceof Сhoreographer) ((Dancer)arrPerson[i]).dance();
        }

    }
}
