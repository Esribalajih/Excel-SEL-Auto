package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Career Blog Page
 * @author balajih
 *
 */
public class EsriCareerBlogPage extends ESRIWrappers{
	
	public EsriCareerBlogPage() throws Throwable{
		if(!VerifyTitle("Esri Careers"))
			Reporter.reportStep("This is not a Esri Career Blog Page", "FAIL");
	}

	public EsriCareerHomePage switchbacktoParentWindow() throws Throwable{
		switchToDefaultContent();
		return new EsriCareerHomePage();
	}
	
}
