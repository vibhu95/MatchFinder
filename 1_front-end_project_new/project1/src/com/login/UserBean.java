package com.login;

public class UserBean {

	 private int userid;
     private String username;
     private String password;
     private String firstName;
     private String lastName;
     private String mobileNumber;
     private String status;
     public boolean valid;
	
     public int getUserId() {
         return userid;
 	}

      public void setUserId(int value) {
         userid = value;
 	}
	
     public String getFirstName() {
        return firstName;
	}

     public void setFirstName(String newFirstName) {
        firstName = newFirstName;
	}

	
     public String getLastName() {
        return lastName;
			}

     public void setLastName(String newLastName) {
        lastName = newLastName;
			}
			

     public String getPassword() {
        return password;
	}

     public void setPassword(String newPassword) {
        password = newPassword;
	}
	
			
     public String getUsername() {
        return username;
			}

     public void setUserName(String newUsername) {
        username = newUsername;
			}
     public String getMobileNumber() {
         return mobileNumber;
 			}

      public void setMobileNumber(String newMobilenumber) {
    	  mobileNumber = newMobilenumber;
 			}
      public String getStatus() {
          return status;
  			}

       public void setStatus(String newStatus) {
     	  status = newStatus;
  			}
				
     public boolean isValid() {
        return valid;
	}

     public void setValid(boolean newValid) {
        valid = newValid;
	}

}
