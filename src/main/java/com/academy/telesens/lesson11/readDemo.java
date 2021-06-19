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

public class readDemo {
    public static void main(String[] args) {
        String path = "C:/111/женские имена2.txt";
        //  FileInputStream is = null;
        System.out.println("1 способ ");
        try (FileInputStream is = new FileInputStream(path)) {
            Scanner scanner = new Scanner(is);

            String name = scanner.nextLine();
            System.out.println(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
// второй способ
//List<String> names = new ArrayList<>(name);
        System.out.println("2 способ ");

        try (FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr)) {
            String name;
            while ((name = br.readLine()) != null) {
                System.out.println(name);
//names.sort
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
// как записать файл

    }


    public static class ExcelReadDemo {
        public static void main(String[] args) {
            String path = "C:/Users/af_oleg/Documents/QA-JA-11/maven-project/data/excel.xlsx";

            try (FileInputStream fis = new FileInputStream(path);
                 Workbook workbook = new XSSFWorkbook(fis)) {
                Sheet sheet = workbook.getSheetAt(0);
                Row row = sheet.getRow(0);
                Cell cell = row.getCell(0);
                String name = cell.getStringCellValue();
                System.out.println(name);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
