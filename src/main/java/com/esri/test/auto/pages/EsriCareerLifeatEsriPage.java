package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Career Facebook page
 * @author balajih
 *
 */
public class EsriCareerLifeatEsriPage extends ESRIWrappers{
	
	public EsriCareerLifeatEsriPage() throws Throwable{
		if (!VerifyTitle("Esri Student Connection | Facebook"))
			Reporter.reportStep("This is not a Esri Career Facebook Page", "FAIL");
	}
	
	public EsriCareerLifeatEsriPage switchbacktoParentWindow(){
		switchToDefaultContent();
		return this;
	}

}
