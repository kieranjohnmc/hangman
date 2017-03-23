package Testing;

import java.awt.AWTException;

public class Main {

	public static void main(String[] args) {
		
		TextTest robotprogramme = null;
		try {
			robotprogramme = new TextTest();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		robotprogramme.textTester();
	}
	Buttons_Test robotprogramme = null;
	{
	robotprogramme = new Buttons_Test();
	robotprogramme.buttonTester();
	
}
}
