package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryDemoPage {
	
	@FindBy(id="course")
	private WebElement course;
	
	@FindBy(xpath="(//a[text()='Selenium'])[2]")
	private WebElement selenium;
	
	@FindBy(name="addresstype")
	private WebElement dd;
	
	
	public SkillRaryDemoPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getCourse() {
		return course;
	}
	
	public void getSelenium() {
		selenium.click();
	}

	public WebElement getDd() {
		return dd;
	}
	
	

	
	
	

}
