package com.academy.telesens.lesson11;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import java.io.*;


public class domashka11 {
    public  static void main(String[] args) {
        String mNames = "C:/111/мужские имена.txt";
        String mSurnames = "C:/111/мужские фамилии.txt";

        String zhNames = "C:/111/женские имена.txt";
        String zhSurnames = "C:/111/женские фамилии.txt";

        String path = "C:/111/subscr.xlsx";

        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet();
        // мужские имена, первая колонка
        int iter = 0;
        // Cell cell = row.createCell(iter);

        try (FileReader fr = new FileReader(mNames);
             BufferedReader br = new BufferedReader(fr)) {
            String name;
            while ((name = br.readLine()) != null) {
                Row row = sheet.createRow(iter);
                Cell cell = row.createCell(0);
                cell.setCellValue(name);
                iter++;
                try (FileOutputStream fos = new FileOutputStream(path)) {
                    book.write(fos);

                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //мужские фамилии, вторая колонка
        int iter2 = 0;
        try (FileReader fr2 = new FileReader(mSurnames);
             BufferedReader br2 = new BufferedReader(fr2)) {
            String name2;
            while ((name2 = br2.readLine()) != null) {
                Row row2 = sheet.createRow(iter2);
                Cell cell2 = row2.createCell(1);
                cell2.setCellValue(name2);
                iter2++;
                try (FileOutputStream fos2 = new FileOutputStream(path)) {
                    book.write(fos2);

                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
