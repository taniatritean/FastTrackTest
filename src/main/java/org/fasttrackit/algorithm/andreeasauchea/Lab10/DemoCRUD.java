package org.fasttrackit.algorithm.andreeasauchea.Lab10;

import org.fasttrackit.algorithm.tania.lab9.Users;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static org.fasttrackit.algorithm.tania.lab9.DemoCRUDOperations.demoCreate;

public class DemoCRUD {

    public static void main(String[] args) {
        System.out.println("Hello database users! We are going to call DB from Java");
        try{
    //        demoCreate("testAndreea1","testAndreea1Password");
    //        demoCreate("testAndreea2","testAndreea2Password");
    //       demoDelete();
            demoRead();
        }  catch (ClassNotFoundException e) {
        e.printStackTrace();
        } catch (SQLException e) {
        e.printStackTrace();
    }

}

    public static void demoCreate(String username, String password) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");


        final String URL = "jdbc:postgresql://54.93.65.5:5432/ionel7";

        final String USERNAME = "fasttrackit_dev";

        final String PASSWORD = "fasttrackit_dev";

        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        PreparedStatement pSt = conn.prepareStatement("INSERT INTO USERS (USERNAME, PASSWORD) VALUES (?,?)");
        pSt.setString(1, username);
        pSt.setString(2, password);

        int rowsInserted =pSt.executeUpdate();

        pSt.close();
        conn.close();
    }

    private static void demoDelete() throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        final String URL = "jdbc:postgresql://54.93.65.5:5432/ionel7";
        final String USERNAME = "fasttrackit_dev";
        final String PASSWORD = "fasttrackit_dev";

        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        PreparedStatement pSt = conn.prepareStatement("DELETE FROM USERS WHERE id=?");
        pSt.setLong(1, 27);

        int rowsDeleted = pSt.executeUpdate();
        System.out.println(rowsDeleted + " rows were deleted.");

        pSt.close();
        conn.close();
    }

    private static List demoRead() throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");


        final String URL = "jdbc:postgresql://54.93.65.5:5432/ionel7";
        final String USERNAME = "fasttrackit_dev";
        final String PASSWORD = "fasttrackit_dev";

        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        Statement st = conn.createStatement();

        ResultSet rs = st.executeQuery("SELECT username,password FROM users");

        List<Users> listaDeUser = new ArrayList();
        while (rs.next()) {
            Users u = new Users();
            u.setUsername(rs.getString("username").trim());
            u.setPassword(rs.getString("password").trim());

            listaDeUser.add(u);
        }

        rs.close();
        st.close();
        conn.close();

        return listaDeUser;

    }



}
