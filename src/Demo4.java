package com.academy.telesens.l3.next;

public class Demo4 {
    public static void main(String[] args) {
        Button myButton = new Button();
        Button myButton2 = null;

        System.out.println(myButton.size);
        myButton.text = "ffgg";
       // myButton.setText();
        myButton.printInfo();

        Button btn4 = new Button();

        btn4.printInfo();

        Person myPerson = new Person();
        myPerson.getProile();

        Subscriber subscriber = new Subscriber("ivan", "ivanov");

    }

    //массив с абонентами

   // разработать класс

}
