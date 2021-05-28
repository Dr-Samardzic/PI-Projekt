package methods;

import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JOptionPane;

import gifty.DBConnection;
import gifty.Registration;

public class InsertDataMethod {
	public static Boolean insertUserData(){	 
		try {
			Connection con = DBConnection.getDBConnection();
			
			Statement stmt=con.createStatement();
			
			String sql = "Insert into users (firstName, lastName, email, username, password, dateOfBirth) values "
					+ "('"+ Registration.firstNameInput +"', '"+ Registration.lastNameInput +"', "
					+ "'"+ Registration.emailInput +"', '"+ Registration.usernameInput +"',"
					+ " '"+ GenerateHashMethod.generateHash(Registration.passwordInput) +"', "
					+ "'"+ Registration.sdf.format(Registration.chosenDate) +"')";
			
			stmt.execute(sql);
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "You have successfully made an account.");
			
			con.close();
		}catch (Exception e){
			return false;
		}
		return true;
	}
}
