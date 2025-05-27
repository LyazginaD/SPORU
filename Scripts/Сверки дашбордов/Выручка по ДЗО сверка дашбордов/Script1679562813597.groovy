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
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords

Date date = new Date()

String todaysDate = date.format('dd.MM.yyyy')

println(todaysDate)

WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 5))

WebUI.setText(findTestObject('Страница авторизации/input__username'), findTestData('PlanFact').getValue(8, 1))

WebUI.setText(findTestObject('Страница авторизации/input__password'), findTestData('PlanFact').getValue(9, 1))

WebUI.click(findTestObject('Страница авторизации/button_'))

WebUI.delay(30)

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Выручка по ДЗО/Фильтр Дата'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Выручка по ДЗО/Снять выделение в фильтре Дата'))

'Нажать "Применить"'
WebUI.click(findTestObject('Выручка по ДЗО/Применить в фильтре Дата'))

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Выручка по ДЗО/Фильтр Дата'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Выручка по ДЗО/Снять выделение в фильтре Дата'))

WebUI.scrollToElement(findTestObject('Выручка по ДЗО/2025 список'), 30)

WebUI.click(findTestObject('Выручка по ДЗО/2025 список'))

WebUI.scrollToElement(findTestObject('Выручка по ДЗО/1 квартал 2025 список'), 30)

WebUI.click(findTestObject('Выручка по ДЗО/1 квартал 2025 выбрать'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Выручка по ДЗО/2 квартал 2025 список'), 30)

WebUI.click(findTestObject('Выручка по ДЗО/2 квартал 2025 список'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Апрель 2025'), 30)

WebUI.click(findTestObject('Выручка по ДЗО/Апрель 2025'), FailureHandling.CONTINUE_ON_FAILURE)

'Проскроллить до заголовка фильтра "Дата"'
WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Заголовок дашборда'), 30)

'Нажать "Применить"'
WebUI.click(findTestObject('Выручка по ДЗО/Применить в фильтре Дата'))

WebUI.delay(30)

String a1 = WebUI.getText(findTestObject('Выручка по ДЗО/График1 Выполнение плановых показателей Блок руководителя'))

println('a1: ' + a1)

int i = a1.indexOf('План')

a1 = a1.substring(0, i)

println('a1: ' + a1)

String a2 = WebUI.getText(findTestObject('Выручка по ДЗО/График2 Выполнение плановых показателей Блок руководителя'))

println('a2: ' + a2)

i = a2.indexOf('АО «Тываэнерго»')

a2 = a2.substring(0, i)

WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 10))

WebUI.delay(30)

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Выручка по ДЗО/Фильтр Дата Выручка'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Выручка по ДЗО/Снять выделение в фильтре Дата Выручка'))

'Нажать "Применить"'
WebUI.click(findTestObject('Выручка по ДЗО/Применить в фильтре Дата Выручка'))

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Выручка по ДЗО/Фильтр Дата Выручка'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Выручка по ДЗО/Снять выделение в фильтре Дата Выручка'))

WebUI.scrollToElement(findTestObject('Выручка по ДЗО/2025 список Выручка'), 30)

WebUI.click(findTestObject('Выручка по ДЗО/2025 список Выручка'))

WebUI.scrollToElement(findTestObject('Выручка по ДЗО/1 квартал 2025 список Выручка'), 30)

WebUI.click(findTestObject('Выручка по ДЗО/1 квартал 2025 выбрать Выручка'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Выручка по ДЗО/2 квартал 2025 список Выручка'), 30)

WebUI.click(findTestObject('Выручка по ДЗО/2 квартал 2025 список Выручка'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Апрель 2025 Выручка'), 30)

WebUI.click(findTestObject('Выручка по ДЗО/Апрель 2025 Выручка'), FailureHandling.CONTINUE_ON_FAILURE)

'Проскроллить до заголовка фильтра "Дата"'
WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Заголовок дашборда Выручка'), 30)

'Нажать "Применить"'
WebUI.click(findTestObject('Выручка по ДЗО/Применить в фильтре Дата Выручка'))

WebUI.delay(30)

String b1 = WebUI.getText(findTestObject('Выручка по ДЗО/График1 Выполнение плановых показателей Выручка'))

println('b1: ' + b1)

i = b1.indexOf('План')

b1 = b1.substring(0, i)

println('b1: ' + b1)

String b2 = WebUI.getText(findTestObject('Выручка по ДЗО/График2 Выполнение плановых показателей Выручка'))

i = b2.indexOf('АО «Тываэнерго»')

b2 = b2.substring(0, i)

println(b2)

WebUI.verifyEqual(a1, b1)

if (WebUI.verifyEqual(a1, b1) == true) {
} else {
    WriteToExcel(todaysDate)
}

WebUI.verifyEqual(a2, b2)

if (WebUI.verifyEqual(a2, b2) == true) {
} else {
    WriteToExcel(todaysDate)
}

WebUI.closeBrowser()

static def WriteToExcel(def todaysDate) {
    String sheetName = 'Sheet1'

    def data = findTestData('PlanFact')

    int n = data.getRowNumbers() + 1

    String dZO = WebUI.getText(findTestObject('Выручка по ДЗО/Фильтр ДЗО'))

    String period = WebUI.getText(findTestObject('Выручка по ДЗО/Фильтр Дата'))

    println(period)

    if (period.findAll('[а-яА-Я]') == false) {
        period = (period + ' год')
    }
    
    String dashboardName = 'Выручка по ДЗО'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, period)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, todaysDate)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

