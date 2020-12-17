package com.academy.telesens.lesson5;

import java.util.Scanner;

public class lesson5dz {
    public static void main(String[] args) {
/*Создать класс CustomDate, который имеет следующие поля:
 *  - день
 *  - месяц
 * 	- год
 */
        CustomDate customDate = new CustomDate();
        //вводим день
        System.out.println("Enter the day:");
        Scanner sc = new Scanner(System.in);
        int myDay = sc.nextInt();
        sc.nextLine();
        customDate.setDay(myDay);
        //вводим месяц
        System.out.println("Enter the month:");
        int myMonth = sc.nextInt();
        sc.nextLine();
        customDate.setMonth(myMonth);
        //вводим год
        System.out.println("Enter the year:");
        int myYear = sc.nextInt();
        sc.nextLine();
        customDate.setYear(myYear);
        customDate.validate(myDay, myMonth, myYear);
        System.out.println(customDate.getFormattedDate(myDay, myMonth, myYear));

        Operator oper = new Operator();

    }
}

