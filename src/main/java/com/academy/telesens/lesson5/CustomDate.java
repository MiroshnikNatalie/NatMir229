package com.academy.telesens.lesson5;

import com.academy.telesens.lesson6.DateFormat;

public class CustomDate {
    private int day;
    private int month;
    private int year;
    private DateFormat format;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // возвращает дату в формате по умолчанию - RU: 24.01.2011
    public String getFormattedDate(int day, int month, int year) {
        String stroka = this.getDay() + "." + String.format("%02d",this.getMonth()) + "." + this.getYear();
        return stroka;
    }

    public void getFormattedDate(DateFormat format){
        switch (format) {
            case RU:
                System.out.println(String.format("%02d",this.getDay()) + "."
                        + String.format("%02d",this.getMonth()) + "."
                        + String.format("%04d",this.getYear()));
                break;
            case UK:
                System.out.println(String.format("%02d",this.getDay()) + "/"
                        + String.format("%02d",this.getMonth()) + "/"
                        + String.format("%04d",this.getYear()));
                break;

            case USA:
                System.out.println(String.format("%02d",this.getMonth()) + "-"
                        + String.format("%02d",this.getDay()) + "-"
                        + String.format("%04d",this.getYear()));
                break;
            case ENG:
                System.out.println(String.format("%02d",this.getDay()) + "-"
                        + String.format("%02d",this.getMonth()) + "-"
                        + String.format("%04d",this.getYear()));
                break;
            case CUSTOM:
                System.out.println(String.format("%02d",this.getDay()) + "."
                        + String.format("%02d",this.getMonth()) + "."
                        + String.format("%04d",this.getYear()));
                break;
        }

    }

    public static void validate(int vDay, int vMonth, int vYear) {
       boolean rezultValid = true;
       if (vDay < 0 || vDay >31) rezultValid = false;
        if (vMonth < 0 || vMonth > 12) rezultValid = false;
         if (vYear < 0 || vYear > 2099) rezultValid = false; // допустим что отрицательный год и год более 2099 невалиден
        boolean isVisokosniy = false; // признак высокосного
        int VisYear = vYear % 4;
        if (VisYear == 0) isVisokosniy = true;
        if ((vMonth == 2) && ((vDay < 0) || (vDay >29)) && isVisokosniy) rezultValid = false;
        if ((vMonth == 2) && ((vDay < 0) || (vDay >29)) && isVisokosniy == false) rezultValid = false;
    if (rezultValid == false) {
        System.out.println("Вы ввели невалидное значение даты");
    }
    }

    @Override
    public String toString()
    {
        return String.format("%02d",this.getDay()) + " " + String.format("%02d",this.getMonth())
                + " " + String.format("%04d",this.getYear());

    }

}
