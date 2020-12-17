package com.academy.telesens.lesson6;

public class CheckBox extends Button {
    protected Boolean checked = false;

    @Override
    public void draw() {
        System.out.println("Draw CheckBox");
    }

    @Override
    public  void click() {
        if (checked == true)
        {
            checked = false;
            System.out.println("CheckBox off");
        }

        if (checked == false)
        {
            checked = true;
            System.out.println("CheckBox on");
        }


    }


    }
