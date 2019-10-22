package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.Bluestone_sce16_page;

public class TestBluestone_sce16 extends BaseTest{
	
	@Test
	public void twentyGm() throws InterruptedException {
		Bluestone_sce16_page sce16 = new Bluestone_sce16_page(driver);
		
		sce16.selectGoldcoin(driver);
		sce16.select20Gm();
		sce16.verifytextField();
	
	}

}
