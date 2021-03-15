package com.gabriellenoel.eval;

import java.math.BigDecimal;
import java.sql.*;

public class SampleSingleton {

    private static Connection conn = null;
    private static SampleSingleton instance = null;

    private static SampleSingleton getInstance() {
        if (instance == null)
            instance = new SampleSingleton();
            return instance;
        }

        // fix by adding try/catch statement and converting input (a BigDecimal) to

        public static void databaseQuery(BigDecimal input) {
            // unhandled exception, must add try/catch for .getConnection to work
            try {
                conn = DriverManager.getConnection("url of database");
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("select id from table");
                BigDecimal x;
                while (rs.next()) {
                    x = BigDecimal.valueOf(rs.getInt(1)).multiply(input);
                    // cannot do * on BigDecimal, must get exact value... regardless, exception thrown
                }
            } catch(SQLException e) {System.out.println("SQL Exception!");}

    }

    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal(5.66453453453453453);
        databaseQuery(bd);
    }

    }


