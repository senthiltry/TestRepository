package gitProject;

import org.testng.annotations.Test;

public class GitDemo {

	@Test(priority = 1)
	public void openBox() {
		System.out.println("Box Opened");
	}

	@Test(priority = 2)
	public void closeBox() {
		System.out.println("Box Closed");
	}

	@Test(priority = 3)
	public void boxUpdate() {
		System.out.println("Updated successfully");
	}

}