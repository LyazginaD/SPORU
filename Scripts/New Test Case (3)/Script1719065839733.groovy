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

path = 'Object Repository/Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/'

WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 4))

WebUI.setText(findTestObject('Страница авторизации/input__username'), findTestData('PlanFact').getValue(8, 1))

WebUI.setText(findTestObject('Страница авторизации/input__password'), findTestData('PlanFact').getValue(9, 1))

WebUI.click(findTestObject('Страница авторизации/button_'))

WebUI.delay(30)

ZakrytOpoveshenie()

WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Значения со страницы Выполнение бизнес-плана/Table Data/План Отпуск в сеть за отчётный период 1'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Значения со страницы Выполнение бизнес-плана/Table Data/План Отпуск в сеть за отчётный период 2'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Значения со страницы Выполнение бизнес-плана/Table Data/План Отпуск в сеть за отчётный период 3'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Значения со страницы Выполнение бизнес-плана/Table Data/План Отпуск в сеть за отчётный период 4'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Значения со страницы Выполнение бизнес-плана/Table Data/План Отпуск в сеть за отчётный период 5'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Значения со страницы Выполнение бизнес-плана/Table Data/План Отпуск в сеть за отчётный период 6'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Значения со страницы Выполнение бизнес-плана/Table Data/План Отпуск в сеть за отчётный период 7'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Значения со страницы Выполнение бизнес-плана/Table Data/План Отпуск в сеть за отчётный период 8'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Значения со страницы Выполнение бизнес-плана/Table Data/План Отпуск в сеть за отчётный период 9'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Значения со страницы Выполнение бизнес-плана/Table Data/План Отпуск в сеть за отчётный период 10'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Значения со страницы Выполнение бизнес-плана/Table Data/План Отпуск в сеть за отчётный период 11'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Значения со страницы Выполнение бизнес-плана/Table Data/План Отпуск в сеть за отчётный период 12'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Значения со страницы Выполнение бизнес-плана/Table Data/План Отпуск в сеть за отчётный период 13'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Значения со страницы Выполнение бизнес-плана/Table Data/План Отпуск в сеть за отчётный период 14'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Значения со страницы Выполнение бизнес-плана/Table Data/План Отпуск в сеть за отчётный период 15'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Значения со страницы Выполнение бизнес-плана/Table Data/План Отпуск в сеть за отчётный период 16'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Значения со страницы Выполнение бизнес-плана/Table Data/План Отпуск в сеть за отчётный период 17'))

static void ZakrytOpoveshenie() {
    String opoveshenie = WebUI.getText(findTestObject('Выполнение бизнес-плана/Просьба обратить внимание'))

    println(opoveshenie)

    if (opoveshenie == 'Просьба обратить внимание') {
        WebUI.click(findTestObject('Выполнение бизнес-плана/Закрыть оповещение'))
    }
}

