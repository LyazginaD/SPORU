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

WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 4))

WebUI.setText(findTestObject('Страница авторизации/input__username'), findTestData('PlanFact').getValue(8, 1))

WebUI.setText(findTestObject('Страница авторизации/input__password'), findTestData('PlanFact').getValue(9, 1))

WebUI.click(findTestObject('Страница авторизации/button_'))

WebUI.delay(20)

if (WebUI.verifyTextPresent('Просьба обратить внимание', false) == true) {
    WebUI.click(findTestObject('Выполнение бизнес-плана/Закрыть оповещение'))
}

String b00 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanFSK1'))

println(b00)

String b01 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanFSK2'))

println(b01)

String b02 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanTyva1'))

println(b02)

String b03 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanTyva2'))

println(b03)

String b04 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanCh1'))

println(b04)

String b05 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanCh2'))

println(b05)

String b06 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanV1'))

println(b06)

String b07 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanV2'))

println(b07)

String b08 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanKub1'))

println(b08)

String b09 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanKub2'))

println(b09)

String b10 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanLen1'))

println(b10)

String b11 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanLen2'))

println(b11)

String b12 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanM1'))

println(b12)

String b13 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanM2'))

println(b13)

String b14 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanSK1'))

println(b14)

String b15 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanSK2'))

println(b15)

String b16 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanSZ1'))

println(b16)

String b17 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanSZ2'))

println(b17)

String b18 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanSib1'))

println(b18)

String b19 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanSib2'))

println(b19)

String b20 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanTom1'))

println(b20)

String b21 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanTom2'))

println(b21)

String b22 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanTum1'))

println(b22)

String b23 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanTum2'))

println(b23)

String b24 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanUr1'))

println(b24)

String b25 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanUr2'))

println(b25)

String b26 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanZ1'))

println(b26)

String b27 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanZ2'))

println(b27)

String b28 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanZIP1'))

println(b28)

String b29 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanZIP2'))

println(b29)

String b30 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanUg1'))

println(b30)

String b31 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanUg2'))

println(b31)

String b32 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanYan1'))

println(b32)

String b33 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/spanYan2'))

println(b33)

String b1 = ((((((((((((((((((((((((((((((((b00 + b02) + b04) + b06) + b08) + b10) + b12) + b14) + b16) + b18) + b20) + b22) + 
b24) + b26) + b28) + b30) + b32) + b01) + b03) + b05) + b07) + b09) + b11) + b13) + b15) + b17) + b19) + b21) + b23) + b25) + 
b27) + b29) + b31) + b33

println(b1)

b1 = b1.replaceAll('[^0-9]', '')

println(b1)

WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 1))

WebUI.delay(30)

if (WebUI.verifyTextPresent('Просьба обратить внимание', false) == true) {
    WebUI.click(findTestObject('Выполнение бизнес-плана/Закрыть оповещение'))
}

String a1 = WebUI.getText(findTestObject('Выполнение бизнес-плана/vidget 2'))

println(a1)

a1 = a1.substring(0, a1.indexOf('Россети ФСКЕЭС'))

a1 = a1.replaceAll('[^0-9]', '')

println(a1)

WebUI.verifyEqual(a, b)

