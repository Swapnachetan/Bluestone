package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bluestone_sce17_page {
	
	public Bluestone_sce17_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@id='goldCoins']//a[contains(text(),'Coins')]")
	private WebElement coins;
	@FindBy(xpath = "//span[@data-p='gold-coins-weight-50gms,m']")
	private WebElement fiftyGm;
	@FindBy(xpath = "//h1[@class='title-5']") 
	private WebElement verifyText;
	
	public void selectGoldcoin(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(coins).perform();
	}
	
	public void select50Gm() {
		fiftyGm.click();
	}

	public void verifytextField() {
		String str = verifyText.getText();
		if (str.equals("50 gram 24 KT Gold Coin")) {
			System.out.println("Displayed");
		} else {
			System.out.println("Not displayed");
		}
	}

}
