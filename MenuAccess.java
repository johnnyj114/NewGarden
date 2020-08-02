import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MenuAccess {

    private static Connection connection;
    private static PreparedStatement updateFoodFre;
    private static PreparedStatement updateFoodFreq;
    private static ResultSet resultSet;
    
    public static ArrayList<MenuProperties> getItem(String item) {
        connection = DBConnection.getConnection();
        ArrayList<MenuProperties> food = new ArrayList<MenuProperties>();
        try {
            updateFoodFre = connection.prepareStatement("SELECT * FROM menu WHERE item = (?)");
            updateFoodFre.setString(1, item);
            resultSet = updateFoodFre.executeQuery();
            
            while(resultSet.next()) {
                MenuProperties entry = new MenuProperties(resultSet.getString(1), resultSet.getDouble(2), 
                    resultSet.getDouble(3), resultSet.getDouble(4), resultSet.getDouble(5), resultSet.getInt(6));
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
            updateFoodFreq = connection.prepareStatement("UPDATE menu SET amount = (?) where item = (?)");
            updateFoodFreq.setInt(1, amount);
            updateFoodFreq.setString(2, item);
            count = updateFoodFreq.executeUpdate();
        }
        catch(SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return count;
    }
}
