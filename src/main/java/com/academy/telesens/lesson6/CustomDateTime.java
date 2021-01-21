package com.academy.telesens.lesson6;

import com.academy.telesens.lesson5.CustomDate;
import com.academy.telesens.lesson9.IllegalTimeException;

public class CustomDateTime extends CustomDate {
    private int hour;
    private int minute;
    private int second;

    CustomDateTime() {    }

    CustomDateTime(int year, int month, int day, int hour, int minute, int second)
    {
        year = 1900;
        month = 1;
        day = 1;
        hour = 0;
        minute = 0;
        second = 0;

    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public int setHour(int hour) throws IllegalTimeException {
        if (hour > 23 || hour < 0)
        {
            throw new IllegalTimeException("часы должны быть в промежутке от 0 до 23 включительно");
        }
        this.hour = hour;
        return hour;
    }



    public void setMinute(int minute) throws IllegalTimeException {
        if (minute > 59 || minute < 0)
        {
            throw new IllegalTimeException("минуты должны быть в промежутке от 0 до 59 включительно");
        }
        this.minute = minute;
    }

    public void setSecond(int second) throws IllegalTimeException{
        if (second > 59 || second < 0)
        {
            throw new IllegalTimeException("секунды должны быть в промежутке от 0 до 59 включительно");
        }
        this.second = second;
    }


    public String getFormattedDateTime(int day, int month, int year, int hour, int minute, int second) {
        String strokaDateTime = super.getFormattedDate(day, month, year);
        strokaDateTime  = strokaDateTime + " " +this.getHour() + ":" + String.format("%02d",this.getMinute()) + ":" + this.getSecond();
        return strokaDateTime;
    }

    @Override
    public String toString() {
        return super.toString() + " " + String.format("%02d",this.getHour()) + " " + String.format("%02d",this.getMinute()) + " "
               + String.format("%02d",this.getSecond()) ;
    }

    public boolean invalid(int second)
    {

        return true;
    }
}
