package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.Bluestone_sce8_page;

public class TestBluestone_sce8 extends BaseTest {

	@Test
	public void SelectKadaFromAllJewellery() {
		Bluestone_sce8_page sce8 = new Bluestone_sce8_page(driver);
		
		sce8.selectAllJewellery(driver);
		sce8.selectKada();
		sce8.clickOnanyKada();
		sce8.clickOnBuyNow();
		sce8.displayErrMsg();
	
	}
}
