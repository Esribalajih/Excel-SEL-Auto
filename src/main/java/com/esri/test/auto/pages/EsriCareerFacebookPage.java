package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Career Facebook page
 * @author balajih
 *
 */
public class EsriCareerFacebookPage extends ESRIWrappers{
	
	public EsriCareerFacebookPage() throws Throwable{
		if (!VerifyTitle("Esri Student Connection | Facebook"))
			Reporter.reportStep("This is not a Esri Career Facebook Page", "FAIL");
	}
	
	public EsriCareerMainPage switchbacktoParentWindow() throws Throwable{
		switchToDefaultContent();
		return new EsriCareerMainPage();
	}

}
