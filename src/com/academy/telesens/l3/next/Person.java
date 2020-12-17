package com.academy.telesens.l3.next;

public class Person {
    private String firsName;
    private String lastName;
    private int age;
    private String gender;

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFirsName(String firsName, String lastName, int age){
        this.firsName = firsName;
        this.lastName = lastName;
        this.age = age;
    }



    public void getProile()
    {
        firsName = "NamePers";
        lastName = "FamPers";
        age = 18;
        gender = "m";
        System.out.println(this.firsName);
        System.out.println(this.lastName);
        System.out.println(this.age);
        System.out.println(this.gender);

    }
}
