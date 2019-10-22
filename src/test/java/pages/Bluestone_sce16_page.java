package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bluestone_sce16_page {
	
	public Bluestone_sce16_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@id='goldCoins']//a[contains(text(),'Coins')]")
	private WebElement coins;
	@FindBy(xpath = "//span[@data-p='gold-coins-weight-20gms,m']")
	private WebElement twentyGm;
	@FindBy(xpath = "//h1[@class='title-5']") 
	private WebElement verifyText;
	
	public void selectGoldcoin(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(coins).perform();
	}
	
	public void select20Gm() {
		twentyGm.click();
	}

	public void verifytextField() {
		String str = verifyText.getText();
		if (str.equals("20 gram 24 KT Gold Coin")) {
			System.out.println("Displayed");
		} else {
			System.out.println("Not displayed");
		}
	}
	
}
