package com.test;

import java.sql.*;
import com.test.Alien;

public class AlienDao
{
    public Alien getAlien(int aid){
        Alien a = new Alien();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc", "root", "");
            Statement stmt = con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from alien where aid = " + aid);
            if (rs.next()){
                a.setAid(rs.getInt("aid"));
                a.setAname(rs.getString("aname"));
                a.setTech(rs.getString("tech"));

            }
        }
        catch (Exception e){
            System.out.println(e);
        }


        return a;
    }

}
