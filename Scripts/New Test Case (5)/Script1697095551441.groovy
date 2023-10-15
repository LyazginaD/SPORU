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

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Центр'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Центр'))

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Заголовок дашборда'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Применить в фильтре ДЗО'))

String a

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Отпуск в сеть за отчётный период Кинешемская электросеть'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Отпуск в сеть за отчётный период Воронежская горэлектросеть'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Отпуск в сеть за отчётный период Тульские городские электрические сети'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Отпуск в сеть за отчётный период Ярославская электросетевая компания'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Отпуск в сеть за отчётный период Белгородэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Отпуск в сеть за отчётный период Брянскэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Отпуск в сеть за отчётный период Воронежэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Отпуск в сеть за отчётный период Костромаэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Отпуск в сеть за отчётный период Курскэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Отпуск в сеть за отчётный период Липецкэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Отпуск в сеть за отчётный период БрянскЭлектро'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Отпуск в сеть за отчётный период Орелэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Отпуск в сеть за отчётный период Смоленскэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Отпуск в сеть за отчётный период Тамбовэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Отпуск в сеть за отчётный период Тверьэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Отпуск в сеть за отчётный период Ярэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Потери за отчётный период Кинешемская электросеть'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Потери за отчётный период Воронежская горэлектросеть'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Потери за отчётный период Тульские городские электрические сети'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Потери за отчётный период Ярославская электросетевая компания'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Потери за отчётный период Белгородэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Потери за отчётный период Брянскэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Потери за отчётный период Воронежэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Потери за отчётный период Костромаэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Потери за отчётный период Курскэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Потери за отчётный период Липецкэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Потери за отчётный период БрянскЭлектро'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Потери за отчётный период Орелэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Потери за отчётный период Смоленскэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Потери за отчётный период Тамбовэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Потери за отчётный период Тверьэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Потери за отчётный период Ярэнерго'))

WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка План'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Отпуск в сеть за отчётный период Кинешемская электросеть'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Отпуск в сеть за отчётный период Воронежская горэлектросеть'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Отпуск в сеть за отчётный период Тульские городские электрические сети'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Отпуск в сеть за отчётный период Ярославская электросетевая компания'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Отпуск в сеть за отчётный период Белгородэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Отпуск в сеть за отчётный период Брянскэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Отпуск в сеть за отчётный период Воронежэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Отпуск в сеть за отчётный период Костромаэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Отпуск в сеть за отчётный период Курскэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Отпуск в сеть за отчётный период Липецкэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Отпуск в сеть за отчётный период БрянскЭлектро'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Отпуск в сеть за отчётный период Орелэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Отпуск в сеть за отчётный период Смоленскэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Отпуск в сеть за отчётный период Тамбовэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Отпуск в сеть за отчётный период Тверьэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Отпуск в сеть за отчётный период Ярэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Потери за отчётный период Кинешемская электросеть'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Потери за отчётный период Воронежская горэлектросеть'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Потери за отчётный период Тульские городские электрические сети'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Потери за отчётный период Ярославская электросетевая компания'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Потери за отчётный период Белгородэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Потери за отчётный период Брянскэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Потери за отчётный период Воронежэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Потери за отчётный период Костромаэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Потери за отчётный период Курскэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Потери за отчётный период Липецкэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Потери за отчётный период БрянскЭлектро'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Потери за отчётный период Орелэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Потери за отчётный период Смоленскэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Потери за отчётный период Тамбовэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Потери за отчётный период Тверьэнерго'))

WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Потери за отчётный период Ярэнерго'))

WebUI.closeBrowser()


if ((((a == 29) || (a == 83)) || (a == 71)) || (a == 15)) {
	filialNumberInRow = 1
} else if ((((((a == 30) || (a == 52)) || (a == 79)) || (a == 76)) || (a == 70)) || (a == 14)) {
	filialNumberInRow = 2
} else if ((((((a == 31) || (a == 72)) || (a == 78)) || (a == 75)) || (a == 66)) || (a == 16)) {
	filialNumberInRow = 3
} else if ((((a == 28) || (a == 32)) || (a == 67)) || (a == 17)) {
	filialNumberInRow = 4
} else if ((((a == 33) || (a == 73)) || (a == 68)) || (a == 2)) {
	filialNumberInRow = 5
} else if ((((a == 34) || (a == 77)) || (a == 69)) || (a == 3)) {
	filialNumberInRow = 6
} else if ((((a == 35) || (a == 74)) || (a == 3)) || (a == 4)) {
	filialNumberInRow = 7
} else if ((a == 65) || (a == 5)) {
	filialNumberInRow = 8
} else if ((a == 36) || (a == 6)) {
	filialNumberInRow = 9
} else if ((a == 44) || (a == 7)) {
	filialNumberInRow = 10
} else if ((a == 53) || (a == 13)) {
	filialNumberInRow = 11
} else if ((a == 80) || (a == 8)) {
	filialNumberInRow = 12
} else if ((a == 54) || (a == 9)) {
	filialNumberInRow = 13
} else if ((a == 1) || (a == 10)) {
	filialNumberInRow = 14
} else if ((a == 18) || (a == 11)) {
	filialNumberInRow = 15
} else if ((a == 59) || (a == 12)) {
	filialNumberInRow = 16
} else if (a == 81) {
	filialNumberInRow = 17
}
