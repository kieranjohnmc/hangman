package Testing;

import java.awt.AWTException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int test = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Pick a number: ");
		test = input.nextInt();
		
		String testString = null;
		switch (test){
		case 1: Easy();
				break;
		case 2: Intermediate();
				break;
		case 3: Hard();
				break;
		
		}
        System.out.println(testString); 
        input.close();
	}
		
	private static void Easy() {
		Beginner_Test robotprogramme = null;
		try {
			robotprogramme = new Beginner_Test();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		robotprogramme.beginnerDifficulty();
	}
	
	private static void Intermediate() {
		Intermediate_Test robotprogramme = null;
		try {
			robotprogramme = new Intermediate_Test();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		robotprogramme.intermediateTest();
	
	}
	
	private static void Hard() {
		Hard_Difficulty robotprogramme = null;
		try {
			robotprogramme = new Hard_Difficulty();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		robotprogramme.hardDifficulty();
	}
	

}
