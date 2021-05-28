package methods;

public class GetInitialsMethod {
	
	public static String getInitials(String name)
    {	
		String initials = "";
        initials += Character.toUpperCase(
            name.charAt(0));
  
        for (int i = 1; i < name.length() - 1; i++)
            if (name.charAt(i) == ' ')
                initials += Character.toUpperCase(name.charAt(i + 1));
        
        return initials;
    }
	
}
