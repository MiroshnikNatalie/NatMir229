package com.academy.telesens.lesson12;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class domashka12 {
    public static void main(String[] args) throws IOException {

        String mNames = "C:/111/мужские имена.txt";
        String mSurnames = "C:/111/мужские фамилии.txt";

        String zhNames = "C:/111/женские имена.txt";
        String zhSurnames = "C:/111/женские фамилии.txt";

        String path = "C:/111/subscr.xlsx";
        String url = "jdbc:mysql://localhost:3306/newschema1?user=root&password=root";
        String sqlInsert = "insert into subscriber (first_name, last_name, age, gender ) values (?, ?, ?, ?)";

        // из файла в базу данных
        int vozr;
        try (FileReader fr = new FileReader(mNames);
             BufferedReader br = new BufferedReader(fr)) {
            String name;
            while ((name = br.readLine()) != null) {
                try (Connection connection = DriverManager.getConnection(url)) {

                    // insert
                    PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);
                    preparedStatement.setString(1, name);
                    preparedStatement.setString(2, "Петров");
                    preparedStatement.setInt(3, vozr = (int) (Math.random() * 99));
                    preparedStatement.setString(4, "m");
                    preparedStatement.execute();
                    preparedStatement.close();

                } catch (SQLException e) {
                    System.out.println("Connection error. Details: " + e.getMessage());
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
