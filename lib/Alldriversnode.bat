java -Dwebdriver.ie.driver=D:/DEV/ESRI_TEST/com.esri.test.automation/lib/IEDriverServer.exe -Dwebdriver.chrome.driver=D:/DEV/ESRI_TEST/com.esri.test.automation/lib/chromedriver.exe -jar selenium-server-standalone-2.53.1.jar -port 5555 -role node -hub http://localhost:4444/grid/register -browser "browserName=firefox, maxInstances=3, platform=WINDOWS, seleniumProtocol=WebDriver" -browser "browserName=internet explorer, version=11, platform=WINDOWS, maxInstances=3" -browser "browserName=chrome,version=ANY,maxInstances=3,platform=WINDOWS"