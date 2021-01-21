package com.academy.telesens.lesson6;

import com.academy.telesens.lesson8.VisualComponent;

abstract class Component implements VisualComponent {
    protected int xPozition;
    protected int yPozition;
    protected int wight;
    protected int height;
    protected String text;

    abstract public void draw();

}
