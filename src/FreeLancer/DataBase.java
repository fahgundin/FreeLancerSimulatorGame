package FreeLancer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
    
    private static Connection connection = null;

    public static void getConnection(){
        
        try{
            connection = DriverManager.getConnection("jdbc:sqlite:base.db");
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
    }
        
    public static boolean checkActivated(int id) throws Exception{

        try{
            
            Statement state = connection.createStatement();
            state.setQueryTimeout(30);
            ResultSet rs = state.executeQuery("SELECT activated FROM items WHERE id = " + id);
            if(rs.getInt("activated") == 1){
                return true;
            }
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return false;
    }
    public static void setActivated(int id, boolean activated) throws Exception{
        try{
            
            Statement state = connection.createStatement();
            state.setQueryTimeout(30);
            if(!activated){
                state.executeUpdate("UPDATE items SET activated = 0 WHERE id = " + id);
                
            }else{
                state.executeUpdate("UPDATE items SET activated = 1 WHERE id = " + id);
                
            }
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
    }
    public static void setMoney(int id, int money) throws Exception{
        try{
            Statement state = connection.createStatement();
            state.setQueryTimeout(30);
            state.executeUpdate("UPDATE player SET money = " + money + " WHERE id = " + id);
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
    }
    public static int getMoney() throws Exception{
        int id = 1;
        try{
            
            Statement state = connection.createStatement();
            state.setQueryTimeout(30);
            ResultSet rs = state.executeQuery("SELECT money FROM player WHERE id = " + id);
            return rs.getInt("money");
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return 0;
    }
    public void close() throws Exception{
        try{
            
            connection.close();
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
    }
    public static void disableAll(){
        try{
            
            Statement state = connection.createStatement();
            state.setQueryTimeout(30);
            for(int i = 0; i < 10; i++){
                state.executeUpdate("UPDATE items SET activated = 0 WHERE id = "+i);
            }
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }

    }
    public static void closeConnection(){
        connection = null;

    }

}
