package com.academy.telesens;

import java.util.Scanner;

public class lesson2 {

    public static void main(String[] args) {
        /*
        1) Написать программу ввода с клавиатуры последовательно 3 чисел. Вывести
        минимальное максимальное и средние значения */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int n1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int n2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int n3 = scanner.nextInt();

        if (n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " - максимальное" );
        if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " - максимальное" );
        if (n3 >= n1 && n3 >= n2)
            System.out.println(n3 + " - максимальное" );

        if (n1 <= n2 && n1 <= n3)
            System.out.println(n1 + " - минимальное" );
        if (n2 <= n1 && n2 <= n3)
            System.out.println(n2 + " - минимальное" );
        if (n3 <= n1 && n3 <= n2)
            System.out.println(n3 + " - минимальное" );

        /* 2)
        Сила тяжести на Луне составляет около 17% земной. Напишите программу, которая
        вычислила бы ваш вес на Луне.
        - запросить земной вес с консоли
        - вывести ваш вес на Земле
        - вывести ваш вес на Луне */
        System.out.println("************************");
        System.out.print("Введите ваш вес: ");
        double vesEath = scanner.nextDouble();
        double vesMoon = vesEath * 0.17;
        System.out.println("Ваш вес на Земле: " + vesEath);
        System.out.println("Ваш вес на Луне: " + vesMoon);

    /* 3)  В переменных q и w хранятся два натуральных числа.
    Создайте программу, выводящую на экран результат деления q на w с остатком.*/
        System.out.println("************************");
        System.out.print("Введите первое число: ");
        int q = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int w = scanner.nextInt();
        double rez = q / w;
        int rez1 = (int)rez;
        System.out.println("остаток от деления " + q + " на " + w + " = " + q % w);
        System.out.println("деление нацело " + q + " на " + w + " = " + rez1);

       /* 4) В переменной n хранится натуральное двузначное число.
                Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.*/
        System.out.println("************************");
        System.out.print("Введите натуральное двузначное число: ");
        int nat = scanner.nextInt();
        if ((nat < 100) && (nat > 9)) {
            int nat10 = nat / 10;
            int nat1 = nat % 10;
            int rez2 = nat10 + nat1;
            System.out.println("сумма цифр числа " + nat + " равна " + rez2);
        }
        else
            System.out.println("число не двузначное ");
    }
}
