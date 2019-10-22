package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.GoldCoinPage;

public class TestGoldCoin extends BaseTest {

	@Test
	public void ClickGoldCoin() {
		
		GoldCoinPage coinPage = new GoldCoinPage(driver);
		
		coinPage.selectGoldcoin(driver);
		coinPage.select1Gram();
		coinPage.oneGramtitle();

	}

}
