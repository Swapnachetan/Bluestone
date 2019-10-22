package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bluestone_sce8_page {
	
	public Bluestone_sce8_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'All Jewellery')]")
	private WebElement allJewellery;
	@FindBy(xpath = "//span[@data-p='mens-jewellery-kadas,m']")
	private WebElement kada;
	@FindBy(xpath = "//a[@id='pid_5675']//img[contains(@class,'hc img-responsive center-block')]") 
	private WebElement selectAnyKada;
	@FindBy(xpath = "//input[@id='buy-now']")
	private WebElement clickbuyNow;
	@FindBy(xpath = "//div[@class='formErrorContent']")
	private WebElement errorMsg;
	
	public void selectAllJewellery(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(allJewellery).perform();
	}
	
	public void selectKada() {
		kada.click();
	}

	public void clickOnanyKada() {
		selectAnyKada.click();
	}
	
	public void clickOnBuyNow() {
		clickbuyNow.click();
	}

	public void displayErrMsg() {
		String str = errorMsg.getText();
		System.out.println(str);
		if (str.equals("* This field is required")) {
			System.out.println("Displayed");
		} else {
			System.out.println("Not displayed");
		}
	}

}
