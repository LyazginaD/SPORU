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

WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 1))

WebUI.setText(findTestObject('Страница авторизации/input__username'), findTestData('PlanFact').getValue(8, 1))

WebUI.setText(findTestObject('Страница авторизации/input__password'), findTestData('PlanFact').getValue(9, 1))

WebUI.click(findTestObject('Страница авторизации/button_'))

WebUI.delay(30)

ZakrytOpoveshenie()

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan1'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact1'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan2'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact2'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan3'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact3'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan4'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact4'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan5'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact5'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan6'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact6'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan7'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact7'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan8'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact8'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan9'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact9'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan10'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact10'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan11'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact11'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan12'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact12'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan13'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact13'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan14'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact14'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan15'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact15'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan16'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact16'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan17'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact17'))

static void ZakrytOpoveshenie() {
	String opoveshenie = WebUI.getText(findTestObject('Выполнение бизнес-плана/Просьба обратить внимание'))

	println(opoveshenie)

	if (opoveshenie == 'Просьба обратить внимание') {
		WebUI.click(findTestObject('Выполнение бизнес-плана/Закрыть оповещение'))
	}
}
