package Testing;

import java.awt.AWTException;

public class Main {

	public static void main(String[] args) {
		
		/*Hard_Difficulty robotprogramme = null;
		try {
			robotprogramme = new Hard_Difficulty();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		robotprogramme.hardDifficulty();
	}*/
	
		Intermediate_Test robotprogramme = null;
	try {
		robotprogramme = new Intermediate_Test();
	} catch (AWTException e) {
		e.printStackTrace();
	}
	robotprogramme.intermediateTest();
}
	/*Beginner_Test robotprogramme = null;
	try {
		robotprogramme = new Beginner_Test();
	} catch (AWTException e) {
		e.printStackTrace();
	}
	robotprogramme.beginnerDifficulty();*/
}
