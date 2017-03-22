package Testing;

import java.awt.Robot;
import java.awt.event.InputEvent;

public class AutoClicker 
{
	//Single Click
	public static void LeftClick(Robot robot)
	{
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
	//Double Click
	public static void doubleLeftClick(Robot robot)
	{
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
}
