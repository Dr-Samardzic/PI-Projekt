package gifty;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class HomePage extends JFrame {
	private final JPanel sideBar = new JPanel();


	public HomePage() {
		getContentPane().setBackground(new Color(100, 149, 237));
		sideBar.setBackground(new Color(65, 105, 225));
		
		//Sidebar Section
		
		//Labels
		JLabel userInicials = new JLabel("");
		userInicials.setForeground(new Color(255, 255, 255));
		userInicials.setBackground(new Color(255, 255, 255));
		userInicials.setFont(new Font("Helvetica", Font.PLAIN, 30));
		userInicials.setVerticalAlignment(SwingConstants.CENTER);
		userInicials.setHorizontalAlignment(SwingConstants.CENTER);
		userInicials.setEnabled(true);
		
		userInicials.setText(getInitials(Login.fullName));
		
		JLabel dashboardSidebar = new JLabel("Dashboard");
		dashboardSidebar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		dashboardSidebar.setFont(new Font("Helvetica", Font.PLAIN, 13));
		dashboardSidebar.setForeground(new Color(255, 255, 255));
		
		JLabel myProfileSidebar = new JLabel("My Profile");
		myProfileSidebar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		myProfileSidebar.setFont(new Font("Helvetica", Font.PLAIN, 13));
		myProfileSidebar.setForeground(new Color(255, 255, 255));
		
		JLabel friendsSidebar = new JLabel("Friends");
		friendsSidebar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		friendsSidebar.setForeground(new Color(255, 255, 255));
		friendsSidebar.setFont(new Font("Helvetica", Font.PLAIN, 13));
		
		JLabel groupsSidebar = new JLabel("Groups");
		groupsSidebar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		groupsSidebar.setForeground(new Color(255, 255, 255));
		groupsSidebar.setFont(new Font("Helvetica", Font.PLAIN, 13));
		
		JLabel wishlistSidebar = new JLabel("Wishlist");
		wishlistSidebar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		wishlistSidebar.setFont(new Font("Helvetica", Font.PLAIN, 13));
		wishlistSidebar.setForeground(new Color(255, 255, 255));
		
		//Logout link
		JLabel logoutSidebar = new JLabel("Logout");
		logoutSidebar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logoutSidebar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Login login = new Login();
				login.setLocationRelativeTo(null);
				login.setVisible(true);
			}
		});
		logoutSidebar.setForeground(Color.WHITE);
		logoutSidebar.setFont(new Font("Helvetica", Font.PLAIN, 13));
		
		//Sidebar appearance
		GroupLayout gl_sideBar = new GroupLayout(sideBar);
		gl_sideBar.setHorizontalGroup(
			gl_sideBar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_sideBar.createSequentialGroup()
					.addGap(16)
					.addGroup(gl_sideBar.createParallelGroup(Alignment.LEADING)
						.addComponent(userInicials, GroupLayout.PREFERRED_SIZE, 95, Short.MAX_VALUE)
						.addComponent(dashboardSidebar, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
						.addComponent(myProfileSidebar, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
						.addComponent(friendsSidebar, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
						.addComponent(groupsSidebar, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
						.addComponent(wishlistSidebar, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
						.addComponent(logoutSidebar, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
					.addGap(19))
		);
		gl_sideBar.setVerticalGroup(
			gl_sideBar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_sideBar.createSequentialGroup()
					.addGap(6)
					.addComponent(userInicials, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
					.addGap(14)
					.addComponent(dashboardSidebar, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(myProfileSidebar, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(friendsSidebar, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(groupsSidebar, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(wishlistSidebar, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(90)
					.addComponent(logoutSidebar, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
					.addGap(39))
		);
		sideBar.setLayout(gl_sideBar);
		
		//Main Section
		
		//Title
		JLabel title = new JLabel("Gifty");
		title.setForeground(new Color(255, 255, 255));
		title.setFont(new Font("Snell Roundhand", Font.PLAIN, 40));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel mainSection = new JPanel();
		mainSection.setBackground(new Color(100, 149, 237));
		
		//Images from source file
		Image imgProfileIcon = new ImageIcon(this.getClass().getResource("/profile-user.png")).getImage();
		Image imgFriends = new ImageIcon(this.getClass().getResource("/friends.png")).getImage();
		Image imgGroups = new ImageIcon(this.getClass().getResource("/networking.png")).getImage();
		Image imgWishlist = new ImageIcon(this.getClass().getResource("/wishlist.png")).getImage();
		
	//Main section appearance
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(sideBar, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(mainSection, GroupLayout.PREFERRED_SIZE, 561, Short.MAX_VALUE)
						.addComponent(title, GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE))
					.addGap(6))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(sideBar, GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(title, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
					.addGap(1)
					.addComponent(mainSection, GroupLayout.PREFERRED_SIZE, 311, Short.MAX_VALUE))
		);
		
		
		//4 main Panels
		JPanel outPanelFriends = new JPanel();
		outPanelFriends.setAlignmentY(0.0f);
		outPanelFriends.setAlignmentX(0.0f);
		outPanelFriends.setBackground(new Color(100, 149, 237));
		
		JPanel outPanelGroups = new JPanel();
		outPanelGroups.setAlignmentY(0.0f);
		outPanelGroups.setAlignmentX(0.0f);
		outPanelGroups.setBackground(new Color(100, 149, 237));
		
		JPanel outPanelWishlist = new JPanel();
		outPanelWishlist.setAlignmentY(0.0f);
		outPanelWishlist.setAlignmentX(0.0f);
		outPanelWishlist.setBackground(new Color(100, 149, 237));
		
		JPanel outPanelMyProfile = new JPanel();
		outPanelMyProfile.setAlignmentY(0.0f);
		outPanelMyProfile.setAlignmentX(0.0f);
		outPanelMyProfile.setBackground(new Color(100, 149, 237));
		
		GroupLayout gl_mainSection = new GroupLayout(mainSection);
		gl_mainSection.setHorizontalGroup(
			gl_mainSection.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mainSection.createSequentialGroup()
					.addGroup(gl_mainSection.createParallelGroup(Alignment.TRAILING)
						.addComponent(outPanelGroups, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(outPanelFriends, GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
					.addGap(6)
					.addGroup(gl_mainSection.createParallelGroup(Alignment.TRAILING)
						.addComponent(outPanelWishlist, GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
						.addComponent(outPanelMyProfile, GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_mainSection.setVerticalGroup(
			gl_mainSection.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mainSection.createSequentialGroup()
					.addGroup(gl_mainSection.createParallelGroup(Alignment.LEADING)
						.addComponent(outPanelMyProfile, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
						.addComponent(outPanelFriends, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_mainSection.createParallelGroup(Alignment.TRAILING)
						.addComponent(outPanelWishlist, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(outPanelGroups, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		
		//MyProfile Button
		JPanel myProfilePanel = new JPanel();
		myProfilePanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		myProfilePanel.setBackground(new Color(65, 105, 225));
		
		JPanel myProfileIconPanel = new JPanel();
		myProfileIconPanel.setBackground(new Color(65, 105, 225));
		
		JLabel myProfileIcon = new JLabel("");
		myProfileIcon.setIcon(new ImageIcon(imgProfileIcon));
		myProfileIcon.setForeground(new Color(255, 255, 255));
		myProfileIcon.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel myProfileTextPanel = new JPanel();
		myProfileTextPanel.setBackground(new Color(65, 105, 225));
		
		JLabel myProfileTitle = new JLabel("My Profile");
		myProfileTitle.setForeground(new Color(255, 255, 255));
		myProfileTitle.setFont(new Font("Helvetica", Font.BOLD, 15));
		myProfileTitle.setHorizontalAlignment(SwingConstants.LEADING);
		myProfileTitle.setEnabled(true);
		
		JTextArea myProfileText = new JTextArea();
		myProfileText.setWrapStyleWord(true);
		myProfileText.setLineWrap(true);
		myProfileText.setFont(new Font("Helvetica", Font.PLAIN, 10));
		myProfileText.setBackground(new Color(65, 105, 225));
		myProfileText.setForeground(new Color(255, 255, 255));
		myProfileText.setText("View and edit your profile info");
		myProfileText.setEditable(false);
		GroupLayout gl_myProfilePanel = new GroupLayout(myProfilePanel);
		gl_myProfilePanel.setHorizontalGroup(
			gl_myProfilePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_myProfilePanel.createSequentialGroup()
					.addGap(6)
					.addComponent(myProfileIconPanel, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
					.addGap(4)
					.addComponent(myProfileTextPanel, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
					.addGap(6))
		);
		gl_myProfilePanel.setVerticalGroup(
			gl_myProfilePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_myProfilePanel.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_myProfilePanel.createParallelGroup(Alignment.LEADING)
						.addComponent(myProfileIconPanel, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
						.addComponent(myProfileTextPanel, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
					.addGap(6))
		);
		GroupLayout gl_myProfileTextPanel = new GroupLayout(myProfileTextPanel);
		gl_myProfileTextPanel.setHorizontalGroup(
			gl_myProfileTextPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_myProfileTextPanel.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_myProfileTextPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(myProfileText, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
						.addComponent(myProfileTitle, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
					.addGap(6))
		);
		gl_myProfileTextPanel.setVerticalGroup(
			gl_myProfileTextPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_myProfileTextPanel.createSequentialGroup()
					.addGap(6)
					.addComponent(myProfileTitle, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
					.addGap(12)
					.addComponent(myProfileText, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addContainerGap())
		);
		myProfileTextPanel.setLayout(gl_myProfileTextPanel);
		GroupLayout gl_myProfileIconPanel = new GroupLayout(myProfileIconPanel);
		gl_myProfileIconPanel.setHorizontalGroup(
			gl_myProfileIconPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_myProfileIconPanel.createSequentialGroup()
					.addGap(6)
					.addComponent(myProfileIcon, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
					.addGap(6))
		);
		gl_myProfileIconPanel.setVerticalGroup(
			gl_myProfileIconPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_myProfileIconPanel.createSequentialGroup()
					.addGap(6)
					.addComponent(myProfileIcon, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
					.addGap(6))
		);
		myProfileIconPanel.setLayout(gl_myProfileIconPanel);
		myProfilePanel.setLayout(gl_myProfilePanel);
		GroupLayout gl_outPanelMyProfile = new GroupLayout(outPanelMyProfile);
		gl_outPanelMyProfile.setHorizontalGroup(
			gl_outPanelMyProfile.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_outPanelMyProfile.createSequentialGroup()
					.addGap(24)
					.addComponent(myProfilePanel, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(18, Short.MAX_VALUE))
		);
		gl_outPanelMyProfile.setVerticalGroup(
			gl_outPanelMyProfile.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_outPanelMyProfile.createSequentialGroup()
					.addGap(18)
					.addComponent(myProfilePanel, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
					.addGap(18))
		);
		outPanelMyProfile.setLayout(gl_outPanelMyProfile);
		
		//Wishlist Button
		JPanel wishlistButton = new JPanel();
		wishlistButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		wishlistButton.setBackground(new Color(65, 105, 225));
		
		JPanel wishlistIconPanel = new JPanel();
		wishlistIconPanel.setBackground(new Color(65, 105, 225));
		
		JLabel wishlistIcon = new JLabel("");
		wishlistIcon.setIcon(new ImageIcon(imgWishlist));
		wishlistIcon.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel wishlistTextPanel = new JPanel();
		wishlistTextPanel.setBackground(new Color(65, 105, 225));
		
		JLabel wishlistTitle = new JLabel("Wishlist");
		wishlistTitle.setFont(new Font("Helvetica", Font.BOLD, 15));
		wishlistTitle.setEnabled(true);
		wishlistTitle.setForeground(new Color(255, 255, 255));
		
		JTextArea wishlistText = new JTextArea();
		wishlistText.setFont(new Font("Helvetica", Font.PLAIN, 10));
		wishlistText.setForeground(new Color(255, 255, 255));
		wishlistText.setText("Add and remove items from your wishlist");
		wishlistText.setLineWrap(true);
		wishlistText.setWrapStyleWord(true);
		wishlistText.setBackground(new Color(65, 105, 225));
		
		GroupLayout gl_wishlistButton = new GroupLayout(wishlistButton);
		gl_wishlistButton.setHorizontalGroup(
			gl_wishlistButton.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_wishlistButton.createSequentialGroup()
					.addGap(6)
					.addComponent(wishlistIconPanel, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
					.addGap(4)
					.addComponent(wishlistTextPanel, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
					.addGap(6))
		);
		gl_wishlistButton.setVerticalGroup(
			gl_wishlistButton.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_wishlistButton.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_wishlistButton.createParallelGroup(Alignment.LEADING)
						.addComponent(wishlistIconPanel, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
						.addComponent(wishlistTextPanel, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
					.addGap(6))
		);
		GroupLayout gl_wishlistTextPanel = new GroupLayout(wishlistTextPanel);
		gl_wishlistTextPanel.setHorizontalGroup(
			gl_wishlistTextPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_wishlistTextPanel.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_wishlistTextPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(wishlistText, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
						.addComponent(wishlistTitle, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
					.addGap(6))
		);
		gl_wishlistTextPanel.setVerticalGroup(
			gl_wishlistTextPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_wishlistTextPanel.createSequentialGroup()
					.addGap(6)
					.addComponent(wishlistTitle, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
					.addGap(12)
					.addComponent(wishlistText, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addContainerGap())
		);
		wishlistTextPanel.setLayout(gl_wishlistTextPanel);
		GroupLayout gl_wishlistIconPanel = new GroupLayout(wishlistIconPanel);
		gl_wishlistIconPanel.setHorizontalGroup(
			gl_wishlistIconPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_wishlistIconPanel.createSequentialGroup()
					.addGap(6)
					.addComponent(wishlistIcon, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
					.addGap(6))
		);
		gl_wishlistIconPanel.setVerticalGroup(
			gl_wishlistIconPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_wishlistIconPanel.createSequentialGroup()
					.addGap(6)
					.addComponent(wishlistIcon, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
					.addGap(6))
		);
		wishlistIconPanel.setLayout(gl_wishlistIconPanel);
		wishlistButton.setLayout(gl_wishlistButton);
		GroupLayout gl_outPanelWishlist = new GroupLayout(outPanelWishlist);
		gl_outPanelWishlist.setHorizontalGroup(
			gl_outPanelWishlist.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_outPanelWishlist.createSequentialGroup()
					.addGap(24)
					.addComponent(wishlistButton, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(18, Short.MAX_VALUE))
		);
		gl_outPanelWishlist.setVerticalGroup(
			gl_outPanelWishlist.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_outPanelWishlist.createSequentialGroup()
					.addContainerGap()
					.addComponent(wishlistButton, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
					.addGap(23))
		);
		outPanelWishlist.setLayout(gl_outPanelWishlist);
		
		//Groups Button
		JPanel groupsPanel = new JPanel();
		groupsPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		groupsPanel.setBackground(new Color(65, 105, 225));
		
		JPanel groupsIconPanel = new JPanel();
		groupsIconPanel.setBackground(new Color(65, 105, 225));
		
		JLabel groupsIcon = new JLabel("");
		groupsIcon.setIcon(new ImageIcon(imgGroups));
		groupsIcon.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel groupsTextPanel = new JPanel();
		groupsTextPanel.setBackground(new Color(65, 105, 225));
		
		JLabel groupsTitle = new JLabel("Groups");
		groupsTitle.setForeground(new Color(255, 255, 255));
		groupsTitle.setFont(new Font("Helvetica", Font.BOLD, 15));
		
		JTextArea groupsText = new JTextArea();
		groupsText.setForeground(new Color(255, 255, 255));
		groupsText.setBackground(new Color(65, 105, 225));
		groupsText.setText("Create group for your family, friends, colleagues...");
		groupsText.setLineWrap(true);
		groupsText.setWrapStyleWord(true);
		groupsText.setEditable(false);
		groupsText.setFont(new Font("Helvetica", Font.PLAIN, 10));
		GroupLayout gl_groupsPanel = new GroupLayout(groupsPanel);
		gl_groupsPanel.setHorizontalGroup(
			gl_groupsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_groupsPanel.createSequentialGroup()
					.addGap(6)
					.addComponent(groupsIconPanel, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
					.addGap(4)
					.addComponent(groupsTextPanel, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
					.addGap(6))
		);
		gl_groupsPanel.setVerticalGroup(
			gl_groupsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_groupsPanel.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_groupsPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(groupsIconPanel, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
						.addComponent(groupsTextPanel, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
					.addGap(6))
		);
		GroupLayout gl_groupsTextPanel = new GroupLayout(groupsTextPanel);
		gl_groupsTextPanel.setHorizontalGroup(
			gl_groupsTextPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_groupsTextPanel.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_groupsTextPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(groupsText, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
						.addComponent(groupsTitle, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
					.addGap(6))
		);
		gl_groupsTextPanel.setVerticalGroup(
			gl_groupsTextPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_groupsTextPanel.createSequentialGroup()
					.addGap(6)
					.addComponent(groupsTitle, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
					.addGap(12)
					.addComponent(groupsText, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupsTextPanel.setLayout(gl_groupsTextPanel);
		GroupLayout gl_groupsIconPanel = new GroupLayout(groupsIconPanel);
		gl_groupsIconPanel.setHorizontalGroup(
			gl_groupsIconPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_groupsIconPanel.createSequentialGroup()
					.addGap(6)
					.addComponent(groupsIcon, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
					.addGap(6))
		);
		gl_groupsIconPanel.setVerticalGroup(
			gl_groupsIconPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_groupsIconPanel.createSequentialGroup()
					.addGap(6)
					.addComponent(groupsIcon, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
					.addGap(6))
		);
		groupsIconPanel.setLayout(gl_groupsIconPanel);
		groupsPanel.setLayout(gl_groupsPanel);
		GroupLayout gl_outPanelGroups = new GroupLayout(outPanelGroups);
		gl_outPanelGroups.setHorizontalGroup(
			gl_outPanelGroups.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_outPanelGroups.createSequentialGroup()
					.addContainerGap(25, Short.MAX_VALUE)
					.addComponent(groupsPanel, GroupLayout.PREFERRED_SIZE, 308, GroupLayout.PREFERRED_SIZE)
					.addGap(26))
		);
		gl_outPanelGroups.setVerticalGroup(
			gl_outPanelGroups.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_outPanelGroups.createSequentialGroup()
					.addContainerGap()
					.addComponent(groupsPanel, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
					.addGap(23))
		);
		outPanelGroups.setLayout(gl_outPanelGroups);
		
		//Friends Button
		
		JPanel friendsPanel = new JPanel();
		friendsPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		friendsPanel.setBackground(new Color(65, 105, 225));
		
		JPanel friendsIconPanel = new JPanel();
		friendsIconPanel.setBackground(new Color(65, 105, 225));
		
		JLabel friendsIcon = new JLabel("");
		friendsIcon.setIcon(new ImageIcon(imgFriends));
		friendsIcon.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel friendsTextPanel = new JPanel();
		friendsTextPanel.setBackground(new Color(65, 105, 225));
		
		JLabel friendsTitle = new JLabel("Friends");
		friendsTitle.setForeground(new Color(255, 255, 255));
		friendsTitle.setFont(new Font("Helvetica", Font.BOLD, 15));
		
		JTextArea friendsText = new JTextArea();
		friendsText.setWrapStyleWord(true);
		friendsText.setLineWrap(true);
		friendsText.setText("View current and add new friends");
		friendsText.setBackground(new Color(65, 105, 225));
		friendsText.setForeground(new Color(255, 255, 255));
		friendsText.setFont(new Font("Helvetica", Font.PLAIN, 10));
		friendsText.setEditable(false);
		GroupLayout gl_friendsPanel = new GroupLayout(friendsPanel);
		gl_friendsPanel.setHorizontalGroup(
			gl_friendsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_friendsPanel.createSequentialGroup()
					.addGap(6)
					.addComponent(friendsIconPanel, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
					.addGap(2)
					.addComponent(friendsTextPanel, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
					.addGap(6))
		);
		gl_friendsPanel.setVerticalGroup(
			gl_friendsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_friendsPanel.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_friendsPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(friendsIconPanel, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
						.addComponent(friendsTextPanel, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
					.addGap(6))
		);
		GroupLayout gl_friendsTextPanel = new GroupLayout(friendsTextPanel);
		gl_friendsTextPanel.setHorizontalGroup(
			gl_friendsTextPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_friendsTextPanel.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_friendsTextPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(friendsText, Alignment.LEADING)
						.addComponent(friendsTitle, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
					.addGap(6))
		);
		gl_friendsTextPanel.setVerticalGroup(
			gl_friendsTextPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_friendsTextPanel.createSequentialGroup()
					.addGap(6)
					.addComponent(friendsTitle, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
					.addGap(12)
					.addComponent(friendsText, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addContainerGap())
		);
		friendsTextPanel.setLayout(gl_friendsTextPanel);
		GroupLayout gl_friendsIconPanel = new GroupLayout(friendsIconPanel);
		gl_friendsIconPanel.setHorizontalGroup(
			gl_friendsIconPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_friendsIconPanel.createSequentialGroup()
					.addGap(6)
					.addComponent(friendsIcon, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
					.addGap(6))
		);
		gl_friendsIconPanel.setVerticalGroup(
			gl_friendsIconPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_friendsIconPanel.createSequentialGroup()
					.addGap(6)
					.addComponent(friendsIcon, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
					.addGap(6))
		);
		friendsIconPanel.setLayout(gl_friendsIconPanel);
		friendsPanel.setLayout(gl_friendsPanel);
		GroupLayout gl_outPanelFriends = new GroupLayout(outPanelFriends);
		gl_outPanelFriends.setHorizontalGroup(
			gl_outPanelFriends.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_outPanelFriends.createSequentialGroup()
					.addContainerGap(6, Short.MAX_VALUE)
					.addComponent(friendsPanel, GroupLayout.PREFERRED_SIZE, 308, GroupLayout.PREFERRED_SIZE)
					.addGap(25))
		);
		gl_outPanelFriends.setVerticalGroup(
			gl_outPanelFriends.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_outPanelFriends.createSequentialGroup()
					.addGap(17)
					.addComponent(friendsPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(18))
		);
		outPanelFriends.setLayout(gl_outPanelFriends);
		mainSection.setLayout(gl_mainSection);
		getContentPane().setLayout(groupLayout);
		setBounds(100, 100, 870, 525);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
	
	//Method to get initials from full name
	static String getInitials(String name)
    {
			
		String initials = "";
  
        // Since touuper() returns int, 
        // we do typecasting
        initials += Character.toUpperCase(
            name.charAt(0));
  
        // Traverse rest of the string and 
        // print the characters after spaces.
        for (int i = 1; i < name.length() - 1; i++)
            if (name.charAt(i) == ' ')
                initials += Character.toUpperCase(name.charAt(i + 1));
        
        return initials;
    }
	
}
