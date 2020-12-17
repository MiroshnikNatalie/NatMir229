package com.academy.telesens.lesson6;

public class lesson7poly {
    public static void main(String[] args) {
        Component[] arrComponent = new Component[10];

        arrComponent[0] = new RoundButton();
        arrComponent[1] = new Button();
        arrComponent[2] = new Label();
        arrComponent[3] = new CheckBox();
        arrComponent[4] = new Button();
        arrComponent[5] = new Label();
        arrComponent[6] = new RoundButton();
        arrComponent[7] = new CheckBox();
        arrComponent[8] = new Button();
        arrComponent[9] = new Label();


        for (int i = 0; i < arrComponent.length; i++)
            arrComponent[i].draw();
    }
}
