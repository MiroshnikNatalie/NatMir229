package com.academy.telesens.l3.next;

public enum Gender {
    MALE,
    FEMALE;

//private String ru;

    public static Gender parse(String val) {
        if ("f".equals(val))
            return FEMALE;
        else
            return MALE;
    }


    }
