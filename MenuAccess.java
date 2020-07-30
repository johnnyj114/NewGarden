import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnnyjiang
 */
public class MenuAccess {

    private static Connection connection;
    private static PreparedStatement getFoodDetails;
    private static ResultSet resultSet;
    
    public ArrayList<MenuOne> getOneSize(String name) {
        connection = DBConnection.getConnection();
        ArrayList<MenuOne> food = new ArrayList<MenuOne>();
        try {
            getFoodDetails = connection.prepareStatement("select * from friedrices where type = (?)");
            getFoodDetails.setString(1, name);
            resultSet = getFoodDetails.executeQuery();
            
            while(resultSet.next()) {
                MenuOne entry = new MenuOne(resultSet.getString(1), resultSet.getDouble(2));
                food.add(entry);
            }
        }
        catch(SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return food;
    }
    
    public ArrayList<MenuTwo> getTwoSize(String name) {
        connection = DBConnection.getConnection();
        ArrayList<MenuTwo> food = new ArrayList<MenuTwo>();
        try {
            getFoodDetails = connection.prepareStatement("select * from friedrices where type = (?)");
            getFoodDetails.setString(1, name);
            resultSet = getFoodDetails.executeQuery();
            
            while(resultSet.next()) {
                MenuTwo entry = new MenuTwo(resultSet.getString(1), resultSet.getDouble(2), resultSet.getDouble(3));
                food.add(entry);
            }
        }
        catch(SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return food;
    }
    
    public ArrayList<MenuThree> getThreeSize(String name) {
        connection = DBConnection.getConnection();
        ArrayList<MenuThree> food = new ArrayList<MenuThree>();
        try {
            getFoodDetails = connection.prepareStatement("select * from friedrices where type = (?)");
            getFoodDetails.setString(1, name);
            resultSet = getFoodDetails.executeQuery();
            
            while(resultSet.next()) {
                MenuThree entry = new MenuThree(resultSet.getString(1), resultSet.getDouble(2), resultSet.getDouble(3), resultSet.getDouble(4));
                food.add(entry);
            }
        }
        catch(SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return food;
    }
    
    public ArrayList<MenuFour> getFourSize(String name) {
        connection = DBConnection.getConnection();
        ArrayList<MenuFour> food = new ArrayList<MenuFour>();
        try {
            getFoodDetails = connection.prepareStatement("select * from friedrices where type = (?)");
            getFoodDetails.setString(1, name);
            resultSet = getFoodDetails.executeQuery();
            
            while(resultSet.next()) {
                MenuFour entry = new MenuFour(resultSet.getString(1), resultSet.getDouble(2), resultSet.getDouble(3), resultSet.getDouble(4), resultSet.getDouble(5));
                food.add(entry);
            }
        }
        catch(SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return food;
    }
}
