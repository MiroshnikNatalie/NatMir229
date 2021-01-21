package com.academy.telesens.l3.next;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private  Gender gender;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0) throw new AgeError();
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void getProile()
    {

        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.age);
        System.out.println(this.gender);

    }
}
