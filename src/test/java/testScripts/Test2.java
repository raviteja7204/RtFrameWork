package testScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.Point;
import genericLibraries.BaseClass;
import pomPages.SkillRaryDemoPage;
import pomPages.TestingPage;

public class Test2 extends BaseClass{
	
	@Test
	public void tc2() throws IOException {
		
		SkillRaryDemoPage demo=new SkillRaryDemoPage(driver);
		utilities.dropDownbtn(demo.getDd(),pf.getProperty("coursedd"));
		
		TestingPage t=new TestingPage(driver);
		Point loc = t.getFb().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		utilities.scrollBar(driver, x,y);
		t.fbIcon();
		
		
		
		
		
		
	}

}
