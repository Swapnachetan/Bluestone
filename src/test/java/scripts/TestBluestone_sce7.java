package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.Bluestone_sce7_page;

public class TestBluestone_sce7 extends BaseTest {

	@Test
	public void SelectKadaFromAllJewellery() throws InterruptedException {
		Bluestone_sce7_page sce7 = new Bluestone_sce7_page(driver);
		
		sce7.selectAllJewellery(driver);
		sce7.selectKada();
		sce7.clickOnanyKada();
		sce7.clickOnBuyNow();
		sce7.displayErrMsg();
	
	}
}
