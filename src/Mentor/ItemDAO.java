package Mentor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import Mentor.model.Item;

@Service
public class ItemDAO {
	
	
    public void insert(Item item) throws SQLException, ClassNotFoundException {
    	String driver= "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    	String url= "jdbc:sqlserver://localhost:1433;databaseName=TogetherLearning";
    	String username= "sa";
    	String password= "as";
        Class.forName(driver);
        Connection connection= DriverManager.getConnection(url,username,password);
        if(!connection.isClosed())
            System.out.println("connection success");
        Statement statement=connection.createStatement();
        
        String sql="INSERT INTO item(studentId,itemName,itemScore) VALUES("+item.getStudentId()+","+item.getItemName()+","+item.getItemScore()+")";
        
        statement.executeQuery(sql);
        
        statement.close();
        connection.close();
      
    }
}
