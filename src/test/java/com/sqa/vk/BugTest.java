package com.sqa.vk;

import java.util.*;

import org.testng.annotations.*;

import com.sqa.vk.helpers.*;

public class BugTest {

	public void applyBugFix() {
		System.out.println("This is the placeholder for applying bug fixes");
	}

	public void findSimilarBugs() {
		System.out.println("This is the placeholder for finding similar bugs");
	}

	public void recreateBugActivity() {
		System.out.println("This is the placeholder for recreation of bugs");
	}

	@Test
	public void testBug() {
		int bugsToFile = AppBasics.requestInt("Enter numbers of bugs to file ");
		ArrayList<Bug> bugDetails = new ArrayList<Bug>();
		for (int i = 0; i < bugsToFile; i++) {
			bugDetails.add(new Bug(AppBasics.requestInt("Enter Bug ID "),
					AppBasics.requestString("Enter Reporter's name "), AppBasics.requestString("Enter Bug Title "),
					AppBasics.requestChar("Enter Bug Category"), AppBasics.requestString("Enter Operating System"),
					AppBasics.requestString("Enter Date "), AppBasics.requestString("Enter Bug Details "),
					AppBasics.requestDouble("Enter frequency"), AppBasics.requestBoolean("Is bug active? ")));
			System.out.println();
		}
		for (int j = 0; j < bugDetails.size(); j++) {
			System.out.println("Bug details: " + bugDetails.get(j));
			System.out.println();
		}
		this.recreateBugActivity();
		this.applyBugFix();
		this.findSimilarBugs();
	}
}
