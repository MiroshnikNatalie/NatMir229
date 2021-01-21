package com.academy.telesens.lesson9;

public class IllegalTimeException extends RuntimeException{
/* a) Создать класс IllegalTimeException, который является
		наследником класса RuntimeException. */
public IllegalTimeException(String message) {
    super(message);
}
}
