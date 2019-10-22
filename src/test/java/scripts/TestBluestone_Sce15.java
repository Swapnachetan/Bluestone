package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.Bluestone_sce15_page;

public class TestBluestone_Sce15 extends BaseTest {
	
	@Test
	public void twogmcoin() throws InterruptedException {
		Bluestone_sce15_page coin = new Bluestone_sce15_page(driver);
		Thread.sleep(1000);
		coin.selectGoldcoin(driver);
		coin.selecttwoGmcoin();
		coin.verifyTitle();
	
	}

}
