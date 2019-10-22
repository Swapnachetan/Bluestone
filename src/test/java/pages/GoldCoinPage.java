package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class GoldCoinPage extends BaseTest{
	
	public GoldCoinPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@id='goldCoins']//a[contains(text(), 'Coins')]") private WebElement goldCoin;
	@FindBy(xpath = "(//span[contains(text(),'1 gram')])[1]") private WebElement oneGram;
	@FindBy(xpath = "//h1[@class='title-5']") private WebElement pageTitle;
	
	public void selectGoldcoin(WebDriver driver) {
		
		Actions act = new Actions(driver);
		act.moveToElement(goldCoin).perform();
	}
	
	public void select1Gram() {
		oneGram.click();
	}
	
	public void oneGramtitle() {
		String str = pageTitle.getText();
		System.out.println("title = " + str);
		if (str.equals("1 gram 24 KT Gold Coin")) {
			System.out.println("1 gram 24 KT Gold Coin is displayed");
		} else {
			System.out.println("1 gram 24 KT Gold Coin is not displayed");
		}
	}
	
}
