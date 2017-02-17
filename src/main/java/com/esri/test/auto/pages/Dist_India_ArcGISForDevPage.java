package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the India ArcGIS for Developers Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_India_ArcGISForDevPage extends ESRIWrappers {
	public Dist_India_ArcGISForDevPage() throws Throwable {
		waitForPageLoad(10);
		switchWindowByTitle("ArcGIS for Developers");
		if (!VerifyTitle("ArcGIS for Developers")) {
			Reporter.reportStep("This is not a ArcGIS for Developers (India) page.", "FAIL");
		} else
			System.out.println("India ArcGIS for Developers page Launched Successfully");
	}

	// click back button in browser
	public Dist_India_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
			switchWindowByTitle("Esri India | Your partner in GIS");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_India_HomePage();
	}

	// verify ArcGIS for Developers label
	public Dist_India_ArcGISForDevPage verifyArcGISforDeveloperslbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIndiaArcDev.arcGISDevelopersLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}