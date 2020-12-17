package com.academy.telesens.l3.next;

public class lesson3_2 {

    public static void main(String[] args) {

        String data = "18 999 ₴, 29 999 ₴, 19 499 ₴, 26 555 ₴, 22 999 ₴, 27 777 ₴, 36 399 ₴, 23 349 ₴, 57 777 ₴";
// распарсить строку и создать массив цен
        int[] prices = new int[9];
        String[] words = data.split(",");
        for (int i = 0; i<words.length; i++) {
            words[i] = words[i].replace("₴", "");
            words[i] = words[i].replace(" ", "");
            prices[i] =  Integer.parseInt(words[i]);
            System.out.println(prices[i]);
        }

    }


    }




