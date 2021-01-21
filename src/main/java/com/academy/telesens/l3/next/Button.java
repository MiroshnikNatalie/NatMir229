package com.academy.telesens.l3.next;

public class Button {
    int size = 12; //0
    String text; // иницилиируется как null, если не задаем значение

    public void printInfo() {
        System.out.println(String.format("size: %d, text: %s", size, text ));
    }
    public void setText(String text) {
        this.text = text;
    }


}
