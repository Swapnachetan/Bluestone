package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bluestone_sce19_page {
	
	public Bluestone_sce19_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@id='goldCoins']//a[contains(text(),'Coins')]")
	private WebElement coins;
	@FindBy(xpath = "//span[@data-p='l-gold-coins-weight-5gms,m']")
	private WebElement lakshmi5Gm;
	@FindBy(xpath = "//h1[@class='title-5']") 
	private WebElement verifyText;
	
	public void selectGoldcoin(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(coins).perform();
	}
	
	public void selectlakshmi5Gm() {
		lakshmi5Gm.click();
	}

	public void verifytextField() {
		String str = verifyText.getText();
		if (str.equals("5 gram 24 KT Lakshmi Gold Coin")) {
			System.out.println("Displayed");
		} else {
			System.out.println("Not displayed");
		}
	}


}
