package org.fasttrackit.algorithm.andreeasauchea.Repository;

import org.fasttrackit.algorithm.andreeasauchea.agendatelefonica.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonRepository {

    public void createPerson(String firstName, String lastName, String phoneNumber) throws ClassNotFoundException, SQLException {
        Connection conn = getDatabaseConnection();
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO persons (first_name, last_name, phone_number) VALUES(?,?,?)");
        preparedStatement.setString(1, firstName);
        preparedStatement.setString(2, lastName);
        preparedStatement.setString(3, phoneNumber);
        int rowsInserted = preparedStatement.executeUpdate();
        System.out.println("Ati creat " + rowsInserted + "randuri.");
        preparedStatement.close();
        conn.close();

    }
    public void updatePerson(String firstName, String lastName, String phoneNumber, int x) throws ClassNotFoundException, SQLException {
        Connection conn = getDatabaseConnection();
        PreparedStatement preparedStatement =conn.prepareStatement("UPDATE persons SET first_name = ? , last_name = ?, phone_number = ? WHERE id=?");
        preparedStatement.setString(1, firstName);
        preparedStatement.setString(2, lastName);
        preparedStatement.setString(3, phoneNumber);
        preparedStatement.setLong(4, x);
        int rowsUpdated = preparedStatement.executeUpdate();
        System.out.println("Ati updatat " + rowsUpdated + "randuri");
        preparedStatement.close();
        conn.close();

    }
    public void deletePerson(int x) throws ClassNotFoundException, SQLException {
        Connection conn = getDatabaseConnection();
        PreparedStatement preparedStatement =conn.prepareStatement("DELETE FROM persons WHERE id=?");
        preparedStatement.setLong(1, x);
        int rowsDeleted = preparedStatement.executeUpdate();
        System.out.println("Ati sters " + rowsDeleted + " randuri.");

        preparedStatement.close();
        conn.close();

    }
    public List<Person> findAll() throws ClassNotFoundException, SQLException {
        Connection conn = getDatabaseConnection();
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT id, first_name, last_name, phone_number FROM persons");
        List<Person> personList =  new ArrayList<>();
        while (resultSet.next()){
            Person person = new Person();
            person.setId(resultSet.getInt("id"));
            person.setFirstName(resultSet.getString("first_name").trim());
            person.setLastName(resultSet.getString("last_name").trim());
            person.setPhoneNumber(resultSet.getString("phone_number").trim());
            personList.add(person);
        }
        resultSet.close();
        statement.close();
        conn.close();
        return personList;
    }

    public Connection getDatabaseConnection() throws ClassNotFoundException, SQLException {
       Class.forName("org.postgresql.Driver");
        final String URL = "jdbc:postgresql://54.93.65.5:5432/andreeasauchea";
        final String USERNAME = "fasttrackit_dev";
        final String PASSWORD = "fasttrackit_dev";
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
