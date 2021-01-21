package com.academy.telesens.lesson9;

import com.academy.telesens.l3.next.AgeError;
import com.academy.telesens.l3.next.Person;

public class ExeptionDemo {

    public static void main(String[] args) {

        double d1 = 1;
        double d2 = 0;

        int n1 = 1;
        int n2 = 0;

        try {
            double result = div(d1, d2);
        }
        catch (DivisionByZeroError e) {
            System.out.println("error division by zero");
            System.out.println(e.getMessage());
        }

        Person person = new Person();
        try
        {
            person.setAge(-5);
        }
        catch (AgeError err)
        {
            System.out.println("отрицательный возраст");
        }

    }
        public static double div(double d1, double d2) throws DivisionByZeroError
        {
            if (d2 == 0)
                throw new DivisionByZeroError("unsupported");
            return d1 / d2;
        }



    }

