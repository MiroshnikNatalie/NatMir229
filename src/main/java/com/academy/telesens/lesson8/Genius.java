package com.academy.telesens.lesson8;

import com.academy.telesens.l3.next.Person;

public class Genius extends Person implements Fighter, QA {

    public void fight(){
        System.out.println("I can fight");
    };

    public void coding() {
        System.out.println("I can write programs");
    }

}
