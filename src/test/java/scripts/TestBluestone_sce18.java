package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.Bluestone_sce18_page;

public class TestBluestone_sce18 extends BaseTest {

	@Test
	public void lakshmi2GmCoin() {
		Bluestone_sce18_page sce18 = new Bluestone_sce18_page(driver);
		
		sce18.selectGoldcoin(driver);
		sce18.selectlakshmi2Gm();
		sce18.verifytextField();
	
	}
}
