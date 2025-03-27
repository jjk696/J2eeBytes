/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author gurjot
 */
public class DBConnection {

    public static Connection dbConnect() {
        Connection con = null;
        try {
//         Class.forName("com.mysql.jdbc.Driver");
//         con=DriverManager.getConnection("jdbc:mysql:///onlineide","root","123");
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineide", "root", "123");
        } catch (Exception e) {
            System.out.println("Exception in dbConnect()" + e);
        }
        return con;
    }

    public static void main(String[] args) {
        System.out.println(dbConnect());
    }
}
