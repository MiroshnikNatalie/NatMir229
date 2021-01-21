package com.academy.telesens.lesson6;

import java.util.Scanner;

public class lesson6 {
    public static void main(String[] args) {

        Button button1 = new Button();
        button1.draw();

        RoundButton btn2 = new RoundButton();
        btn2.draw();

        CheckBox checkbox = new CheckBox();
        checkbox.draw();
        checkbox.click();

        Label label1 = new Label();
        label1.draw();

// ДЗ по CustomDateTime
// время и датa 25.01.2017 15:05:35
        int  myDay = 25;
        int myMonth = 01;
        int myYear = 2017;
        int  myHour = 15;
        int myMin = 05;
        int mySec = 35;
      //  CustomDateTime customDateTime = new CustomDateTime(myYear, myMonth, myDay, myHour, myMin, mySec);
        CustomDateTime customDateTime = new CustomDateTime();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите часы");
        int h1 = scanner.nextInt();
        customDateTime.setHour(h1);
        System.out.println("Введите минуты");
        customDateTime.setMinute(scanner.nextInt());
        System.out.println("Введите секунды");
        customDateTime.setSecond(scanner.nextInt());
        customDateTime.setDay(25);
        customDateTime.setMonth(01);
        customDateTime.setYear(2017);
        System.out.println(customDateTime.getFormattedDateTime(myDay, myMonth, myYear, myHour, myMin, mySec));
        String Str1 = customDateTime.toString();
        System.out.println(Str1);



    }
}
