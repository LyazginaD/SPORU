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

String a00 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan1'))

String a01 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact1'))

String a02 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan2'))

String a03 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact2'))

String a04 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan3'))

String a05 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact3'))

String a06 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan4'))

String a07 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact4'))

String a08 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan5'))

String a09 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact5'))

String a10 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan6'))

String a11 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact6'))

String a12 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan7'))

String a13 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact7'))

String a14 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan8'))

String a15 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact8'))

String a16 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan9'))

String a17 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact9'))

String a18 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan10'))

String a19 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact10'))

String a20 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan11'))

String a21 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact11'))

String a22 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan12'))

String a23 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact12'))

String a24 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan13'))

String a25 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact13'))

String a26 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan14'))

String a27 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact14'))

String a28 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan15'))

String a29 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact15'))

String a30 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan16'))

String a31 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact16'))

String a32 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan17'))

String a33 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact17'))

static void ZakrytOpoveshenie() {
	String opoveshenie = WebUI.getText(findTestObject('Выполнение бизнес-плана/Просьба обратить внимание'))

	println(opoveshenie)

	if (opoveshenie == 'Просьба обратить внимание') {
		WebUI.click(findTestObject('Выполнение бизнес-плана/Закрыть оповещение'))
	}
}
