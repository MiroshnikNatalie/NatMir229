package com.academy.telesens.lesson12;


import com.academy.telesens.l3.next.Gender;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        // select
        String url = "jdbc:mysql://localhost:3306/newschema1?user=root&password=root";
        String sqlSelect = "select * from subscriber";

        String sqlInsert = "insert into subscriber"
        + "(first_name, last_name, age, gender )" + "values (?, ?, ?, ?) ";

        String sqlUpdate = "update subscriber set age =  ? where subscriber_id = ? ";
        String sqlDelete = "delete from newschema1.subscriber where subscriber_id= ? ";

        try(Connection connection = DriverManager.getConnection(url)) {



            // insert
            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);
            //цикл тут
            //  нагенерировать 200 абонентов в базу данных - лучше из текстового файла,
            //экспортировать в эксель таблицу , (метод персондженерейт...)
            // списки подготовить из файла, потом исп для генерации
            preparedStatement.setString(1, "Вася"); // values(?, ?, ?, ?) -> values('Вася', ?, ?, ?)
            preparedStatement.setString(2, "Кириленко");  // values('Вася', ?, ?, ?) -> values('Вася', 'Кириленко', ?, ?)
            preparedStatement.setInt(3, 18);
            preparedStatement.setString(4, "m");
            preparedStatement.execute();
            //
            preparedStatement.close();

            // Update
            PreparedStatement preparedStatement2 = connection.prepareStatement(sqlUpdate);
            preparedStatement2.setString(1, "88");
            preparedStatement2.setString(2, "4");
            preparedStatement2.execute();
            preparedStatement2.close();

            // удаление
            PreparedStatement preparedStatement3 = connection.prepareStatement(sqlDelete);
            preparedStatement3.setString(1, "17");
            preparedStatement3.execute();
            preparedStatement3.close();

            // select
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlSelect);

            while (resultSet.next()) { // переводим курсор на след строку. Возвращает null, если данных нет
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                int age = resultSet.getInt("age");
                Gender gender = Gender.parse(resultSet.getString("gender"));

                System.out.printf("%s %s %d %s %n",
                        firstName, lastName, age, gender);
            }

            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            System.out.println("Connection error. Details: " + e.getMessage());
        }
    }
}