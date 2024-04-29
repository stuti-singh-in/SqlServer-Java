package com.example.sqlserverjava;

import android.os.StrictMode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
    String classes = "net.sourceforge.jtds.jdbc.Driver";
    protected static  String ip  = "10.0.2.2";
    protected static String port = "59479";
    protected static String db = "demo";
    protected static String un = "sa";
    protected static String password = "StutiSingh";

    public Connection CONN(){
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        Connection conn = null;
        try {
            Class.forName(classes);
            String conUrl = "jdbc:jtds:sqlserver://"+ip +":" + port +";" + db;
            conn = DriverManager.getConnection(conUrl,un,password);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
       return conn;
    }
}
