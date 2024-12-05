package jframe;

import java.sql.*;

public class DBConnection {
    public static Connection getCon(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_ms","root","");
        return con;
    }
    catch(Exception e){
        System.out.println(e);
        return null;
        }
    }
}
