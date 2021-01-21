package com.academy.telesens.l3.next;

public class lesson7enum {
    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("Sergey");
        person.setLastName("Ivanov");
        person.setAge(35);
        person.setGender(Gender.male);
        person.getProile();
    }
}
