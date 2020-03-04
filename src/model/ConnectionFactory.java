
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Guilherme José
 */
public class ConnectionFactory {
    public Connection getConnection(){
        try{
            return DriverManager.getConnection(
            "jdbc:mysql://localhost:3307/hospital", "root", "usbw");
        } catch (SQLException e) {
            throw new RuntimeException (e);
        }
    }
}
