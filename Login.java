package gifty;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Cursor;

public class Login extends JFrame {
	public static JTextField username;
	public static String fullName;
	private JPasswordField password;
	
	private JButton btnLogin;
	private JLabel gifty;
	private JLabel forgotPass;
	private JLabel registerHere;
	private JLabel registerHereLabel;


	//Create frame
	
	public Login() {
		setResizable(false);
		getContentPane().setBackground(new Color(100, 149, 237));
		setBounds(500, 200, 431, 324);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Title
		gifty = new JLabel("Gifty");
		gifty.setBounds(6, 6, 419, 80);
		gifty.setHorizontalAlignment(SwingConstants.CENTER);
		gifty.setForeground(new Color(255, 255, 255));
		gifty.setFont(new Font("Snell Roundhand", Font.PLAIN, 40));
		
		//Username text field
		username = new JTextField();
		username.setBounds(132, 98, 193, 34);
		
		//Password field
		password = new JPasswordField();
		password.setBounds(132, 144, 193, 34);
		
		fullName = new String();
		
		//'Forgot password' label
		forgotPass = new JLabel("Forgot password?");
		forgotPass.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		forgotPass.setFont(new Font("Helvetica", Font.PLAIN, 10));
		forgotPass.setForeground(new Color(255, 255, 255));
		forgotPass.setBounds(132, 188, 102, 22);
		
		//'Do not have account' label
		registerHereLabel = new JLabel("Do not have account yet?");
		registerHereLabel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		registerHereLabel.setForeground(Color.WHITE);
		registerHereLabel.setFont(new Font("Helvetica", Font.PLAIN, 10));
		registerHereLabel.setBounds(132, 211, 193, 22);
		
		//'Register here' link
		registerHere = new JLabel("Register here.");
		registerHere.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Registration registration = new Registration();
				registration.setLocationRelativeTo(null);
				registration.show();
			}
		});
		registerHere.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		registerHere.setForeground(Color.WHITE);
		registerHere.setFont(new Font("Helvetica", Font.BOLD, 10));
		registerHere.setBounds(132, 225, 193, 22);
		
		//Login button
		btnLogin = new JButton("Login");
		btnLogin.setBounds(246, 184, 79, 29);
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					// Open connection
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/giftyDB", "root", "hazymane666");
					
					//Query
					Statement stmt=con.createStatement();
				
					String sql = "Select * from users where username='"+username.getText()+"' and password='"+password.getText()+"' ";
					ResultSet rs = stmt.executeQuery(sql);
					
					if (rs.next()){
						
						String firstName = rs.getString("firstName");
						String lastName = rs.getString("lastName");
						
						//Fullname to get initials
						fullName += firstName + " " + lastName;
						
						dispose();
						HomePage home = new HomePage();
						home.setLocationRelativeTo(null);
						home.show();
						
					}else {
						JOptionPane.showMessageDialog(null, "Wrong username or password");
						username.setText("");
						password.setText("");
					}
					
					con.close();
					
				}catch (Exception e2){
					JOptionPane.showMessageDialog(null, e2);
				}
			}
		});
		
		getContentPane().setLayout(null);
		getContentPane().add(gifty);
		getContentPane().add(username);
		getContentPane().add(password);
		getContentPane().add(forgotPass);
		getContentPane().add(registerHereLabel);
		getContentPane().add(registerHere);
		getContentPane().add(btnLogin);
		

	}
}
