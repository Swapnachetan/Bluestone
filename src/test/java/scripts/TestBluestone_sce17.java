package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.Bluestone_sce17_page;

public class TestBluestone_sce17 extends BaseTest{
	
	@Test
	public void fiftyGM() throws InterruptedException {
		Bluestone_sce17_page sce17 = new Bluestone_sce17_page(driver);
		
		sce17.selectGoldcoin(driver);
		sce17.select50Gm();
		sce17.verifytextField();
	
	}


}
