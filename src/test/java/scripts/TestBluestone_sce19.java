package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.Bluestone_sce19_page;

public class TestBluestone_sce19 extends BaseTest {

	@Test
	public void lakshmi5GmCoin() {
		Bluestone_sce19_page sce19 = new Bluestone_sce19_page(driver);
		
		sce19.selectGoldcoin(driver);
		sce19.selectlakshmi5Gm();
		sce19.verifytextField();
	
	}
}
