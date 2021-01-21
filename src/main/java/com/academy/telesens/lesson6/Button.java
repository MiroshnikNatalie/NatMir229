package com.academy.telesens.lesson6;

public class Button extends Component{

    @Override
    public void draw() {
        System.out.println("Draw Button");
    }

    public void click() {

        System.out.println("Click Button");
    }
}
