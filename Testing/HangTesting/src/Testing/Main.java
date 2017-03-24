package Testing;

import java.awt.AWTException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int test = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Choose a Test: ");
		System.out.println("1. Easy Test");
		System.out.println("2. Intermediate Test");
		System.out.println("3. Hard Test");
		System.out.println("4. Lose Test");
		System.out.println("5. Exit");

		test = input.nextInt();
		
		String testString = null;
		switch (test){
		case 1: Easy();
				break;
		case 2: Intermediate();
				break;
		case 3: Hard();
				break;
		case 4: LoseTest();
				break;
		case 5: Exit();
				break;
		default: System.out.println("Choose Again ");
		}
        System.out.println(testString); 
        input.close();
	}
		
	public static void Easy() {
		Beginner_Test robotprogramme = null;
		try {
			robotprogramme = new Beginner_Test();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		robotprogramme.beginnerDifficulty();
		
	}
	
	public static void Intermediate() {
		Intermediate_Test robotprogramme = null;
		try {
			robotprogramme = new Intermediate_Test();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		robotprogramme.intermediateTest();
	
	}
	
	public static void Hard() {
		Hard_Difficulty robotprogramme = null;
		try {
			robotprogramme = new Hard_Difficulty();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		robotprogramme.hardDifficulty();
	}
	
	public static void LoseTest() {
		LoseTest robotprogramme = null;
		try {
			robotprogramme = new LoseTest();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		robotprogramme.loseTest();
	}
	
	public static void Exit() {
		System.exit(0);
	}

}
