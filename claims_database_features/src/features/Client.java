package features;

import javax.swing.JOptionPane;

public class Client {

	    //main() method start  
	    public static void main(String arg[])  
	    {  
	        try  
	        {  
	            //create instance of the CreateLoginForm  
	            LoginField form = new LoginField();  
	            form.setSize(300,100);  //set size of the frame  
	            form.setVisible(true);  //make form visible to the user  
	        }  
	        catch(Exception e)  
	        {     
	            //handle exception   
	            JOptionPane.showMessageDialog(null, e.getMessage());  
	        }  
	    }  
	}

