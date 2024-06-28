package testScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import genericLibraries.BaseClass;
import pomPages.AddToCart;
import pomPages.SkillRaryDemoPage;

public class Test1 extends BaseClass {
	
	@Test
	public void tc1() {
		SkillRaryDemoPage demo=new SkillRaryDemoPage(driver);
		utilities.mouseHover(driver,demo.getCourse());
		demo.getSelenium();
		
		AddToCart cart=new AddToCart(driver);
		utilities.doubleclick(driver, cart.getPlus());
		cart.getAddCartBtn();
		utilities.alertPopUp(driver);
		
	}
	

}
