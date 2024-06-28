package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBook {
	
	@FindBy(id="email")
	private WebElement user;
	
	@FindBy(name="pass")
	private WebElement pass;
	
	@FindBy(name="login")
	private WebElement login;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement serch;
	
	@FindBy(xpath="//span[text()=' \"RAVITEJA HEART CORE FaNs\"']")
	private WebElement rt;
	
	public FaceBook(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void userNameTab(String name) {
		user.sendKeys(name);;
	}
	

	public void passwordTab(String password) {
		pass.sendKeys(password);;
	}
	
	public void loginTab() {
		login.click();
	}
	
	public void searchTab(String searchbtn) {
		user.sendKeys(searchbtn);;
	}

	public WebElement getRt() {
		return rt;
	}
	
	
	
	
	

}
