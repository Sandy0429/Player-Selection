      import java.util.List;
     import java.util.ArrayList;
     import java.sql.Connection;
     import java.sql.DriverManager;
     import java.sql.SQLException;
     import java.sql.PreparedStatement;
     import java.sql.*;
     
     
    public class PlayerSelectionSystem {
    
    	public ArrayList<String> playersBasedOnHeightWeight (double minHeight, double maxWeight){
    	    
    	    ArrayList<String> arr = new ArrayList<String>();
    	        try{
    	            DB db = new DB();
    	            Connection con = db.getConnection();
    	            PreparedStatement pst = con.prepareStatement("SELECT playerName FROM player WHERE height >= ? AND weight <= ? ORDER BY playerName;");
    	            pst.setDouble(1,minHeight);
    	            pst.setDouble(2,maxWeight);
    	            
    	            ResultSet rst = pst.executeQuery();
    	            
    	            while(rst.next())
    	            {
    	                arr.add(rst.getString(1));
    	            }
    	            
    	        }catch(Exception e)
    	        {
    	            System.out.println(e);
    	        }
    		    		
    		return arr;
    	}
    }
