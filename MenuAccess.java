package NewGarden;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MenuAccess {

    private static Connection connection;
    private static PreparedStatement Pstatement;
    private static ResultSet resultSet;
    
    public static ArrayList<MenuProperties> getItemSizes(String item) {
        connection = DBConnection.getConnection();
        ArrayList<MenuProperties> food = new ArrayList<>();
        try {
            Pstatement = connection.prepareStatement("SELECT * FROM menu WHERE item = (?)");
            Pstatement.setString(1, item);
            resultSet = Pstatement.executeQuery();
            
            while(resultSet.next()) {
                MenuProperties entry = new MenuProperties(resultSet.getString(1), resultSet.getDouble(2), resultSet.getDouble(3), 
                        resultSet.getDouble(4), resultSet.getDouble(5), resultSet.getInt(6), resultSet.getString(7));
                food.add(entry);
            }
        }
        catch(SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return food;
    }
    
    public static int updateItem(int amount, String item) {
        connection = DBConnection.getConnection();
        int count = 0;
        try {
            Pstatement = connection.prepareStatement("UPDATE menu SET amt = (?) where item = (?)");
            Pstatement.setInt(1, amount);
            Pstatement.setString(2, item);
            count = Pstatement.executeUpdate();
        }
        catch(SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return count;
    }
    
    public static ArrayList<String> getAllFromCateg(String categ) {
        connection = DBConnection.getConnection();
        ArrayList<String> food = new ArrayList<>();
        try {
            Pstatement = connection.prepareStatement("SELECT item FROM menu WHERE categ = (?)");
            Pstatement.setString(1, categ);
            resultSet = Pstatement.executeQuery();
            
            while(resultSet.next()) {
                food.add(resultSet.getString(1));
            }
        }
        catch(SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return food;
    }
    
    public static ArrayList<String> getAllCateg() {
        connection = DBConnection.getConnection();
        ArrayList<String> food = new ArrayList<>();
        try {
            Pstatement = connection.prepareStatement("SELECT DISTINCT categ FROM menu");
            resultSet = Pstatement.executeQuery();
            
            while(resultSet.next()) {
                food.add(resultSet.getString(1));
            }
        }
        catch(SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return food;
    }
    
    public static ArrayList<String> getItemCateg(String item) {
        connection = DBConnection.getConnection();
        ArrayList<String> food = new ArrayList<>();
        try {
            Pstatement = connection.prepareStatement("SELECT categ FROM menu where item = (?)");
            Pstatement.setString(1, item);
            resultSet = Pstatement.executeQuery();
            
            while(resultSet.next()) {
                food.add(resultSet.getString(1));
            }
        }
        catch(SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return food;
    }
}
