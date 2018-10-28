package org.fasttrackit.algorithm.sandorszucs.homework.JDBC;

import java.sql.*;

public class DemoClass {
    public static void main(String[] args) throws Exception {


        String url = "jdbc:postgresql://54.93.65.5:5432/sandor";
        String USERNAME = "fasttrackit_dev";
        String PASSWORD = "fasttrackit_dev";

        int userId = 5;
        String userName = "Ali";
        int userMark = 9;

        String query = "INSERT INTO public.\"Catalogue\" VALUES (?,?,?)";




        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,USERNAME,PASSWORD);
        PreparedStatement st = con.prepareStatement(query);

        st.setInt(1, userId);
        st.setString(2, userName);
        st.setInt(3, userMark);

        int count = st.executeUpdate();

        System.out.println(count + " row(s) affected");



        st.close();
        con.close();









    }
}
