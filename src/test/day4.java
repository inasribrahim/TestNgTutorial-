package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class day4 {
	@BeforeTest
	public  void checkConfiguration() {
		System.out.println("Test the Configuration File ");

	} 
	@AfterTest
	public  void ClearTestData() {
		System.out.println("Delete the test data to reuse data ");

	}
}
