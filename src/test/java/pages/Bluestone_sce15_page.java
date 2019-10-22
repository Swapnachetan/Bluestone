package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Bluestone_sce15_page {
	
	@FindBy(xpath = "//li[@id='goldCoins']//a[contains(text(), 'Coins')]") 
	private WebElement goldcoins;
	@FindBy(xpath = "//li[contains(@class,'active')]//span[contains(@class,'prcs-d')][contains(text(),'2 gram')]")
	private WebElement twoGmCoin;
	@FindBy(xpath = "//h1[@class='title-5']")
	private WebElement twoGmTitle;
	
	public void selectGoldcoin(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(goldcoins).perform();
	}

	public void selecttwoGmcoin() {
		twoGmCoin.click();
	}
	
	public void verifyTitle() {
		String str = twoGmTitle.getText();
		System.out.println(str);
		if (str.equals("2 gram 24 KT Gold Coin\r\n")) {
			System.out.println("Displayed");
		} else {
			System.out.println("Not Displayed");
		}
	}
	
	public Bluestone_sce15_page (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
