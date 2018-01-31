import java.sql.*;

public class DemoClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3307/shop";
		String user="root";
		String pass="root";
		
       String query="INSERT INTO `USER` (`fname`,`lname`,`email`,`pass`) VALUES('vn','vibhu','nn','d')";
     //   String query="Select * from user";	
        Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
		int rs=st.executeUpdate(query);
	    //ResultSet rs=st.executeQuery(query);  
	     //while(rs.next())
	    // {	System.out.println(rs.getInt("id")+" "+rs.getString("email"));
	     //}
		st.close();
		con.close();

	}

}
