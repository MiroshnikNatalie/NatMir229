package com.academy.telesens.lesson6;

import com.academy.telesens.lesson5.CustomDate;

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

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
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
