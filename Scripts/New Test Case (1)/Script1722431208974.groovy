import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String urlText

String urlByPath

int urlData = 8

int i = 1

int ii = 0

int x

boolean pageNotLoaded

String searchWord = 'Вход'

WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, urlData))

urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))

if (urlText.contains(searchWord) == false) {
	for(urlText.contains(searchWord)==false;i<4;ii++) {

		i = i +1
		WebUI.refresh()
		
		WebUI.delay(20)
		
		WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, urlData))
		
		WebUI.delay(10)
				
		urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))
	}
}


def ReopenBrowser(def urlText, def searchWord, def urlData) {
	
	if (urlText.contains(searchWord) == false) {
		
		WebUI.refresh()

		WebUI.delay(20)

		WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, urlData))

		WebUI.delay(10)
		
		urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))
			
		if (urlText.contains(searchWord) == false) {
		
			WebUI.refresh()
	
			WebUI.delay(20)
	
			WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, urlData))
	
			WebUI.delay(10)
			
			urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))
						
			if (urlText.contains(searchWord) == false) {
			
				WebUI.refresh()
		
				WebUI.delay(20)
		
				WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, urlData))
		
				WebUI.delay(10)
			}
			
		}
		
	}

}

WebUI.closeBrowser()
