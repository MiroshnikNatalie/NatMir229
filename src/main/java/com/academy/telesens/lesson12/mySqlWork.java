package com.academy.telesens.lesson12;

import com.academy.telesens.lesson13.PropertyProvider;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class mySqlWork {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mobile?user=root&password=root";

        String dbUrl2 = PropertyProvider.get("db.url");
        System.out.println(dbUrl2);


        /*
        Добавить в БД Mobile используя sql запросы:
	        - 3 мобильных оператора
         */
        String sqlInsert1 = "INSERT INTO operator VALUES(4, 'Интертелеком', 'Пушкинская 23')";
        String sqlInsert2 = "INSERT INTO operator VALUES(5, 'PeopleNet', 'Пушкинская 25')";
        String sqlInsert3 = "INSERT INTO operator VALUES(6, 'Укртелеком', 'Пушкинская 27')";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url);
            Statement statement = conn.createStatement();
            statement.executeUpdate(sqlInsert1);
            statement.executeUpdate(sqlInsert2);
            statement.executeUpdate(sqlInsert3);
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        /*
        Добавить в БД 5 абонентов
         */
        String InsertAbonent1 = "INSERT INTO subscriber VALUES(5, 'Петренко', 'Иван', 'm', 28)";
        String InsertAbonent2 = "INSERT INTO subscriber VALUES(6, 'Симоненко', 'Дарья', 'f', 29)";
        String InsertAbonent3 = "INSERT INTO subscriber VALUES(7, 'Федоренко', 'Федор', 'm', 25)";
        String InsertAbonent4 = "INSERT INTO subscriber VALUES(8, 'Иваненко', 'Иван', 'm', 26)";
        String InsertAbonent5 = "INSERT INTO subscriber VALUES(9, 'Ситенко', 'Михаил', 'm', 23)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url);
            Statement statement = conn.createStatement();
            statement.executeUpdate(InsertAbonent1);
            statement.executeUpdate(InsertAbonent2);
            statement.executeUpdate(InsertAbonent3);
            statement.executeUpdate(InsertAbonent4);
            statement.executeUpdate(InsertAbonent5);
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }

         /*
        Добавить в БД 9 мобильных номеров
         */
        String InsertNumMobile1 = "INSERT INTO operator_number VALUES('380570000001', 4)";
        String InsertNumMobile2 = "INSERT INTO operator_number VALUES('380570000002', 4)";
        String InsertNumMobile3 = "INSERT INTO operator_number VALUES('380570000003', 4)";
        String InsertNumMobile4 = "INSERT INTO operator_number VALUES('380570000004', 5)";
        String InsertNumMobile5 = "INSERT INTO operator_number VALUES('380570000005', 5)";
        String InsertNumMobile6 = "INSERT INTO operator_number VALUES('380570000006', 5)";
        String InsertNumMobile7 = "INSERT INTO operator_number VALUES('380570000007', 6)";
        String InsertNumMobile8 = "INSERT INTO operator_number VALUES('380570000008', 6)";
        String InsertNumMobile9 = "INSERT INTO operator_number VALUES('380570000009', 6)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url);
            Statement statement = conn.createStatement();
            statement.executeUpdate(InsertNumMobile1);
            statement.executeUpdate(InsertNumMobile2);
            statement.executeUpdate(InsertNumMobile3);
            statement.executeUpdate(InsertNumMobile4);
            statement.executeUpdate(InsertNumMobile5);
            statement.executeUpdate(InsertNumMobile6);
            statement.executeUpdate(InsertNumMobile7);
            statement.executeUpdate(InsertNumMobile8);
            statement.executeUpdate(InsertNumMobile9);
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        /*
        добавить в телефонную книгу 5 абонентов, присвоив каждому по номеру
         */
        String InsertPhoneBook1 = "INSERT INTO phone_book VALUES('380570000001', 5)";
        String InsertPhoneBook2 = "INSERT INTO phone_book VALUES('380570000002', 6)";
        String InsertPhoneBook3 = "INSERT INTO phone_book VALUES('380570000003', 7)";
        String InsertPhoneBook4 = "INSERT INTO phone_book VALUES('380570000004', 8)";
        String InsertPhoneBook5 = "INSERT INTO phone_book VALUES('380570000005', 9)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url);
            Statement statement = conn.createStatement();
            statement.executeUpdate(InsertPhoneBook1);
            statement.executeUpdate(InsertPhoneBook2);
            statement.executeUpdate(InsertPhoneBook3);
            statement.executeUpdate(InsertPhoneBook4);
            statement.executeUpdate(InsertPhoneBook5);
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
/*
Написать sql запросы на выборку следующих данных:
    - всех абонентов заданного мобильного оператора
SELECT d.first_name, d.last_name, c.phone_number
FROM newschema1.operator a,
 newschema1.operator_number b,
 newschema1.phone_book c,
 newschema1.subscriber d
WHERE (a.name = 'Life')
AND (a.operator_id = b.operator_id)
AND (b.phone_number = c.phone_number)
AND (c.subscriber_id = d.subscriber_id)
 */
    }
}
