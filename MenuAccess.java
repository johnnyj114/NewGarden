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
    
    public static ArrayList<MenuProperties> getItemSizes(String item) {
        connection = DBConnection.getConnection();
        ArrayList<MenuProperties> food = new ArrayList<MenuProperties>();
        try {
            getFoodDetails = connection.prepareStatement("SELECT * FROM menu WHERE item = (?)");
            getFoodDetails.setString(1, item);
            resultSet = getFoodDetails.executeQuery();
            
            while(resultSet.next()) {
                MenuProperties entry = new MenuProperties(resultSet.getString(1), resultSet.getDouble(2), 
                    resultSet.getDouble(3), resultSet.getDouble(4), resultSet.getDouble(5));
                food.add(entry);
            }
        }
        catch(SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return food;
    }
}
