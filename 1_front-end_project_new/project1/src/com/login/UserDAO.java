package com.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.login.ConnectionManager;
import com.login.UserBean;

public class UserDAO 	
{
   static Connection currentCon = null;
   static ResultSet rs = null;  
	
   public static UserBean login(UserBean bean) {
       Statement stmt = null;    
	
      String username = bean.getUsername();    
      String password = bean.getPassword();   
	    
      String searchQuery ="select * from user1 where email='"+ username+ "' AND pass='"+ password+ "'";
     
   try 
   {
      currentCon = ConnectionManager.getConnection();
      stmt=currentCon.createStatement();
      rs = stmt.executeQuery(searchQuery);	        
      boolean more = rs.next();
	       
     if (!more) 
      {
         bean.setValid(false);
      } 
	        
      //if user exists set the isValid variable to true
      else if (more) 
      {
    	 int id = rs.getInt("id");
         String firstName = rs.getString("name");
         String mobileNumber = rs.getString("mobile");
         String status = rs.getString("status");
         //String lastName = rs.getString("LastName");
	     	
         System.out.println("Welcome " + firstName);
         bean.setUserId(id);
         bean.setFirstName(firstName);
         bean.setMobileNumber(mobileNumber);
         bean.setStatus(status);
         
      //   bean.setLastName(lastName);
         bean.setValid(true);
      }
   } 

   catch (Exception ex) 
   {
      System.out.println("Log In failed: An Exception has occurred! " + ex);
   } 
	    
   //some exception handling
   finally 
   {
      if (rs != null)	{
         try {
            rs.close();
         } catch (Exception e) {}
            rs = null;
         }
	
      if (stmt != null) {
         try {
            stmt.close();
         } catch (Exception e) {}
            stmt = null;
         }
	
      if (currentCon != null) {
         try {
            currentCon.close();
         } catch (Exception e) {}
         currentCon = null;
      }
   }  return bean;
	      }	
   
   public static UserBean register(UserBean bean) {
	      
   try 
	  {
	      currentCon = ConnectionManager.getConnection();
		    
	      String uname = bean.getFirstName();    
		  String email = bean.getUsername();    
	      String pass = bean.getPassword();   
	      String mob = bean.getMobileNumber();    
	        
	      String searchQuery ="insert into `user1`(`name`,`email`,`pass`,`mobile`) values(?,?,?,?) ";
		 
			PreparedStatement pst=currentCon.prepareStatement(searchQuery);  
			 pst.setString(1,uname);  
	          pst.setString(2,email);
	          pst.setString(3,pass);
	          pst.setString(4,mob);
		         
	          int i=pst.executeUpdate();  

	       if(i>0){
	    	  bean.setValid(true);
	      } 
	       else{       
	    	   bean.setValid(false);
	       }
	   } 

	   catch (Exception ex) 
	   {
	      System.out.println(ex);
	   } 
		    
	   //some exception handling
	   finally 
	   {
		  if (currentCon != null) {
	         try {
	            currentCon.close();
	         } catch (Exception e) {}
	         currentCon = null;
	      }
	   }  return bean;
		      }	

   public static UserBean delete(UserBean bean) {
       Statement stmt = null;    
	
      String username = bean.getUsername();    
      String password = bean.getPassword();   
	    
      String searchQuery ="delete * from user1 where email='"+ username+ "' AND pass='"+ password+ "'";
     
   try 
   {
      currentCon = ConnectionManager.getConnection();
      stmt=currentCon.createStatement();
      int i = stmt.executeUpdate(searchQuery);	        
           
      if(i>0){
    	  bean.setValid(true);
      } 
       else{       
    	   bean.setValid(false);
     
    	    }
   } 

   catch (Exception ex) 
   {
      System.out.println("An Exception has occurred! " + ex);
   } 
	    
   //some exception handling
   finally 
   {
        if (stmt != null) {
         try {
            stmt.close();
         } catch (Exception e) {}
            stmt = null;
         }
	
      if (currentCon != null) {
         try {
            currentCon.close();
         } catch (Exception e) {}
         currentCon = null;
      }
   }  return bean;
	      }	


}
