package org.fasttrackit.algorithm.sandorszucs.homework.JDBC;

import java.sql.*;

public class DemoClass {
    public static void main(String[] args) throws Exception {


        String url = "jdbc:postgresql://54.93.65.5:5432/sandor";
        String USERNAME = "fasttrackit_dev";
        String PASSWORD = "fasttrackit_dev";
        String query = "SELECT * FROM public.\"Catalogue\"";

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,USERNAME,PASSWORD);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        rs.next();
        String name = rs.getString("StudentName");
        System.out.println(name);

        st.close();
        con.close();









    }
}
