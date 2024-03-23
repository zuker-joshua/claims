package claims.models.Drivers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import claims.models.Customer;

public class VehicleDatabaseDriver {
    private Connection conn;

    public VehicleDatabaseDriver() {
        try {
            this.conn = DriverManager.getConnection("jdbc:sqlite:Databases/vehicles.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ResultSet getAllVehicles(){
        Statement statement;
        ResultSet resultSet = null;
        try {
            statement = this.conn.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM vehicles");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }
    
    public ResultSet getCustomerVehicles(Customer customer){
    	Statement statement;
        ResultSet resultSet = null;
        try {
            statement = this.conn.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM vehicles WHERE ownerID='"+customer.getUserID()+";");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }
    
    public void removeVehicle(int vehicleID) {
        try {
            Statement statement = this.conn.createStatement();
            statement.executeUpdate("DELETE FROM vehicles WHERE VehicleID=" + vehicleID + ";");
            System.out.println("Vehicler with ID " + vehicleID + " removed successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}