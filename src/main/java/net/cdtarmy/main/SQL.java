package net.cdtarmy.main;

import java.sql.*;
import java.util.ArrayList;

public class SQL {
    Connection con = DriverManager.getConnection("jdbc:mariadb://cdtarmy.net:3306/advertiserts3?user=advertiserts3&password=test12345");
    ResultSet resultSet = null;
    String selectSql = "SELECT uuid " +
            "FROM lastJoin;";

    public SQL() throws SQLException {
    }

    public ArrayList getResult(String selectSQL) throws SQLException {
        Statement statement = con.createStatement();
        resultSet = statement.executeQuery(selectSql);
        return iterateResult(resultSet);
    }

    private ArrayList iterateResult(ResultSet r) throws SQLException {
        int i = 0;
        ArrayList a = new ArrayList<String>();
        while (r.next()) {
            i++;
            a.add(r.getString(i));
        }
        return a;

    }

    public void updateTime() {


    }


}
