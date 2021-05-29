package methods;

import javax.swing.JLabel;

public class SetNotificationMethod {
	public static void setNotification(Integer listSize, JLabel notification) {
		if (listSize > 0) {
			notification.setText(listSize.toString());
		}else {
			notification.setVisible(false);
		}
	}
}
