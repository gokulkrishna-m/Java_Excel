// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DBConnection.java

package controller;

import java.sql.*;

public class DBConnection
{

    public DBConnection()
    {
    }

    public static Connection dbIntial()
        throws Exception
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = null;
        String connectionUrl = "jdbc:sqlserver://GOKULKRISHNAM:1433;databaseName=tagic;user=mgokul;password=Mgokul@07";
        try
        {
            con = DriverManager.getConnection(connectionUrl);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return con;
    }
}
