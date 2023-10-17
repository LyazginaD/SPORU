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

WebUI.click(findTestObject('Выполнение бизнес-плана/Фильтр ДЗО'))

WebUI.click(findTestObject('Выполнение бизнес-плана/Снять выделение в фильтре ДЗО'))

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Юг'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Юг'))

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Заголовок дашборда'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Применить в фильтре ДЗО'))

String a

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Table Data/Факт Отпуск в сеть за отчётный период 1'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Table Data/Факт Отпуск в сеть за отчётный период 2'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Table Data/Факт Отпуск в сеть за отчётный период 3'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Table Data/Факт Отпуск в сеть за отчётный период 4'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Table Data/Факт Отпуск в сеть за отчётный период 5'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Table Data/Факт Потери за отчётный период 1(5)'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Table Data/Факт Потери за отчётный период 2(5)'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Table Data/Факт Потери за отчётный период 3(5)'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Table Data/Факт Потери за отчётный период 4(5)'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Table Data/Факт Потери за отчётный период 5(5)'))

WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка План'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Table Data/План Отпуск в сеть за отчётный период 1'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Table Data/План Отпуск в сеть за отчётный период 2'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Table Data/План Отпуск в сеть за отчётный период 3'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Table Data/План Отпуск в сеть за отчётный период 4'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Table Data/План Отпуск в сеть за отчётный период 5'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Table Data/План Потери за отчётный период 1'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Table Data/План Потери за отчётный период 2'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Table Data/План Потери за отчётный период 3'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Table Data/План Потери за отчётный период 4'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Table Data/План Потери за отчётный период 5'))

WebUI.closeBrowser()

