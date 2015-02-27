import java.awt.EventQueue;

import javax.swing.JFrame;


public class Main extends JFrame{

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try
				{
					Main frame = new Main();
					frame.setVisible(true);
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	// Constructor for Main
	// Creating the JFrame Main
	public Main(){
		
		this.setSize(250,250);
		this.setLocationRelativeTo(null); // This line of code will center the program
		this.setResizable(false); // Disables the wide screen button
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Without this code the program will still run in the background even after there user clicks the red X
	}

}
