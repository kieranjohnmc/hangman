package Testing;

import java.awt.AWTException;
import java.awt.Robot;

public class RobotProgram
{
	
	private Robot robot;
	private AutoClicker autoClick;
	private Runtime runtime;
	
	public void drawSine()
	{
		int xSet = 1500;
		int ySet = 500;
		int x = 0;
		int y = 0;
		double alpha = 0;
		runtime = Runtime.getRuntime();
		
		try {
			robot = new Robot();
		    } catch (AWTException e) 
		            {
			          e.printStackTrace();
	                }
		
	}
	
	
	
}
