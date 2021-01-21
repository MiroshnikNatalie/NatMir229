package com.academy.telesens.tmp;

import java.util.Random;

public class lesson3 {
    public static void main(String[] args) {

        /*
    *    7)
	*Проинициализировать одномерный массив произвольными целыми числами
	*Вывести массив в виде, например:
	*	[3, 4, 9, 10, 34, 239, 8, 0, -3, 19, 17]
	*	a) используя цикл for
	*	b) используя цикл while
         */
        Random random = new Random();
        System.out.print("[");
        int[] intNumbers = new int[10];
        for ( int i = 0; i< 9; i++)
        {
            intNumbers[i] = random.nextInt(100);
            System.out.print(intNumbers[i] + ", ");
        }
        // чтоб не нарисовалась лишняя запятая, инициализирую и вывожу последний элемент вне цикла
        intNumbers[9] = random.nextInt(100);
        System.out.print(intNumbers[9]);
        System.out.print("]");

        // используя while
        int i = 0;
        System.out.print("\n" + "[");
        while (i < 9) {

            intNumbers[i] = random.nextInt(100);
            System.out.print(intNumbers[i] + ", ");
            i++;
        }
        intNumbers[9] = random.nextInt(100);
        System.out.print(intNumbers[9]);
        System.out.print("]");

      // 8)  Нарисовать квадрат заданного размера.
        Kvadrat(4);
    }
    public static void Kvadrat(int n) {
        System.out.println();
        for (int i =0; i < n; i++) {
            for (int j =0; j < n; j++)
            {
                if (i == 0)
                    System.out.print("*" );
                if ((i > 0) && (i < n-1) && (j == 0))
                    System.out.print("*" );
                if ((i > 0) && (i < n-1) && (j < n-2))
                    System.out.print(" " );
                if ((i > 0) && (i < n-1) && (j == n-1))
                    System.out.print("*" );
                if (i == n-1)
                    System.out.print("*" );
            }
            System.out.println();
        }


        }



}


