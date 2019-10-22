package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.Bluestone_sce20_page;

public class TestBluestone_sce20 extends BaseTest {

	@Test
	public void lakshmi10GmCoin() {
		Bluestone_sce20_page sce20 = new Bluestone_sce20_page(driver);
		
		sce20.selectGoldcoin(driver);
		sce20.selectlakshmi10Gm();
		sce20.verifytextField();
	
	}
}
