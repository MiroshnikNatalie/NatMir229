package com.academy.telesens.lesson11;

import java.io.IOException;
import java.io.PrintWriter;

public class writeDemo {

    public static void main(String[] args) {
        String name = "Tina";

        String path = "C:/111/женские имена2.txt";

        try(PrintWriter pw = new PrintWriter(path)) {
            pw.println(name);
                    }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
