package project;
import java.sql.*;

public class connetion {

	public static void main() throws Exception
	{	 
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="system";
			String pass="system";
			
	        String query="select * from student";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(url,user,pass);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next())
			{
			System.out.println(rs.getString(2));
			}
			st.close();
			con.close();
	}
}
