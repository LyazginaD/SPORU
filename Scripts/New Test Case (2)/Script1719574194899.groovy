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

String z
String x

int iii
int i1
String path = 'Object Repository/Выполнение бизнес-плана/'


a = 'ПАО Россети/6.16/8.40/268419716/245738664/22681052/521964901/489688470/32276431'

iii = a.indexOf('/')
dZO =  a.substring(0,'/')
println(dZO)

	
static def Presettings(def blockNum, def path) {
	WebUI.openBrowser('')

	if (blockNum == 1) {
		path = 'Object Repository/Выполнение бизнес-плана/'

		WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 1))
	} else {
		path = 'Object Repository/Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/'

		WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 4))
	}
	
	println(path)

	WebUI.setText(findTestObject('Страница авторизации/input__username'), findTestData('PlanFact').getValue(8, 1))

	WebUI.setText(findTestObject('Страница авторизации/input__password'), findTestData('PlanFact').getValue(9, 1))

	WebUI.click(findTestObject('Страница авторизации/button_'))

	WebUI.delay(30)

	ZakrytOpoveshenie()
}

static void ZakrytOpoveshenie() {
	String opoveshenie = WebUI.getText(findTestObject('Выполнение бизнес-плана/Просьба обратить внимание'))

	if (opoveshenie == 'Просьба обратить внимание') {
		WebUI.click(findTestObject('Выполнение бизнес-плана/Закрыть оповещение'))
	}
}

