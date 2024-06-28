package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
	@FindBy(id="add")
	private WebElement plus;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addCart;
	
	public AddToCart(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getPlus() {
		return plus;
	}
	
	public void getAddCartBtn() {
		addCart.click();
	}


}
