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

String typeOfData

WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 6))

WebUI.setText(findTestObject('Страница авторизации/input__username'), findTestData('PlanFact').getValue(8, 1))

WebUI.setText(findTestObject('Страница авторизации/input__password'), findTestData('PlanFact').getValue(9, 1))

WebUI.click(findTestObject('Страница авторизации/button_'))

WebUI.delay(15)

String c = ''

String a1 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

println('a1 before cut:' + a1)

int i = a1.indexOf('по ПАО Россети на 2023 год')

if (i > -1) {
    i = (i + 27)

    a1 = a1.substring(i, a1.length())

    println('a1:' + a1)
}else {
	i = a1.indexOf('кВт.ч.')
	
	if (i > -1) {
		i = (i + 7)
	
		a1 = a1.substring(i, a1.length())
	
		println('a1:' + a1)
		}
}

i = a1.indexOf('План')

if (i > -1) {
    c = a1.substring(0, i)
}

println('c:' + c)

i = a1.indexOf('по ПАО Россети на 2023 год')

if (i > -1) {
    i = (i + 27)

    a1 = a1.substring(i, a1.length())

    println('a1:' + a1)
}

a1 = (c + a1)

println('a1:' + a1)

i = a1.indexOf('План')

if (i > -1) {
    c = a1.substring(0, i)
}

i = a1.indexOf('по ПАО Россети на 2023 год')

if (i > -1) {
    i = (i + 27)

    a1 = a1.substring(i, a1.length())

    println('a1:' + a1)
}

a1 = (c + a1)

println('a1:' + a1)

i = a1.indexOf('⬤ Отклонение')

if (i > -1) {
    c = a1.substring(0, i)
}

i = a1.indexOf('по ПАО Россети на 2023 год')

if (i > -1) {
    i = (i + 27)

    a1 = a1.substring(i, a1.length())

    println('a1:' + a1)
}

a1 = (c + a1)

println('a1:' + a1)

i = a1.indexOf('⬤ Отклонение')

if (i > -1) {
    a1 = a1.substring(0, i)
}

a1 = a1.trim()

println('a1:' + a1)

WebUI.click(findTestObject('Прогноз по отраслям/Переключить отображение с процентов на абс Блок руководителя'))

WebUI.delay(10)

String a2 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

println('a2 before cut:' + a2)

i = a2.indexOf('по ПАО Россети на 2023 год')

if (i > -1) {
    i = (i + 27)

    a2 = a2.substring(i, a2.length())

    println('a2:' + a2)
}

i = a2.indexOf('⬤ Отклонение')

if (i > -1) {
    c = a2.substring(0, i)
}

i = a2.indexOf('по ПАО Россети на 2023 год')

if (i > -1) {
    i = (i + 27)

    a2 = a2.substring(i, a2.length())

    println('a2:' + a2)
}

a2 = (c + a2)

println('a2:' + a2)

i = a2.indexOf('⬤ Отклонение')

if (i > -1) {
    c = a2.substring(0, i)
}

i = a2.indexOf('по ПАО Россети на 2023 год')

if (i > -1) {
    i = (i + 27)

    a2 = a2.substring(i, a2.length())

    println('a2:' + a2)
}

a2 = (c + a2)

println('a2:' + a2)

i = a2.indexOf('План')

if (i > -1) {
    c = a2.substring(0, i)
}

i = a2.indexOf('по ПАО Россети на 2023 год')

if (i > -1) {
    i = (i + 27)

    a2 = a2.substring(i, a2.length())

    println('a2:' + a2)
}

a2 = (c + a2)

println('a2:' + a2)

i = a2.indexOf('План')

if (i > -1) {
    a2 = a2.substring(0, i)
}

a2 = a2.trim()

println('a2:' + a2)

WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 12))

WebUI.delay(15)

String b1 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

println('b1 before cut:' + b1)

i = b1.indexOf('по ПАО Россети на 2023 год')

if (i > -1) {
    i = (i + 27)

    b1 = b1.substring(i, b1.length())

    println('b1:' + b1)
}else {
	i = b1.indexOf('кВт.ч.')
	
	if (i > -1) {
		i = (i + 7)
	
		b1 = b1.substring(i, b1.length())
	
		println('b1:' + b1)
		}
}

i = b1.indexOf('План')

if (i > -1) {
    c = b1.substring(0, i)
}

println('c:' + c)

i = b1.indexOf('по ПАО Россети на 2023 год')

if (i > -1) {
    i = (i + 27)

    b1 = b1.substring(i, b1.length())

    println('b1:' + b1)
}

b1 = (c + b1)

println('b1:' + b1)

i = b1.indexOf('План')

if (i > -1) {
    c = b1.substring(0, i)
}

i = b1.indexOf('по ПАО Россети на 2023 год')

if (i > -1) {
    i = (i + 27)

    b1 = b1.substring(i, b1.length())

    println('ab1:' + b1)
}

b1 = (c + b1)

println('b1:' + b1)

i = b1.indexOf('⬤ Отклонение')

if (i > -1) {
    c = b1.substring(0, i)
}

i = b1.indexOf('по ПАО Россети на 2023 год')

if (i > -1) {
    i = (i + 27)

    b1 = b1.substring(i, b1.length())

    println('b1:' + b1)
}

b1 = (c + b1)

println('b1:' + b1)

i = b1.indexOf('⬤ Отклонение')

if (i > -1) {
    b1 = b1.substring(0, i)
}

b1 = b1.trim()

println('b1:' + b1)

WebUI.click(findTestObject('Прогноз по отраслям/Переключить отображение с процентов на абс Стресс-сценарий'))

WebUI.delay(10)

String b2 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

println('b2 before cut:' + b2)

if (b2.indexOf(',') > -1) {
    b2 = b2.replaceAll(',', '.')
}

i = b2.indexOf('по ПАО Россети на 2023 год')

if (i > -1) {
    i = (i + 27)

    b2 = b2.substring(i, b2.length())

    println('b2:' + b2)
}

i = b2.indexOf('⬤ Отклонение')

if (i > -1) {
    c = b2.substring(0, i)
}

i = b2.indexOf('по ПАО Россети на 2023 год')

if (i > -1) {
    i = (i + 27)

    b2 = b2.substring(i, b2.length())

    println('b2:' + b2)
}

b2 = (c + b2)

println('b2:' + b2)

i = b2.indexOf('⬤ Отклонение')

if (i > -1) {
    c = b2.substring(0, i)
}

i = b2.indexOf('по ПАО Россети на 2023 год')

if (i > -1) {
    i = (i + 27)

    b2 = b2.substring(i, b2.length())

    println('b2:' + b2)
}

b2 = (c + b2)

println('b2:' + b2)

i = b2.indexOf('План')

if (i > -1) {
    c = b2.substring(0, i)
}

i = b2.indexOf('по ПАО Россети на 2023 год')

if (i > -1) {
    i = (i + 27)

    b2 = b2.substring(i, b2.length())

    println('b2:' + b2)
}

b2 = (c + b2)

println('b2:' + b2)

i = b2.indexOf('План')

if (i > -1) {
    b2 = b2.substring(0, i)
}

b2 = b2.trim()

println('b2:' + b2)

if (WebUI.verifyEqual(a1, b1) == true) {
} else {
    typeOfData = 'Проценты'

    WriteToExcel(todaysDate, typeOfData)
}

if (WebUI.verifyEqual(a2, b2) == true) {
} else {
    typeOfData = 'абс'

    WriteToExcel(todaysDate, typeOfData)
}

WebUI.closeBrowser()

static def WriteToExcel(def todaysDate, def typeOfData) {
    String sheetName = 'Sheet1'

    def data = findTestData('PlanFact')

    int n = data.getRowNumbers() + 1

    String dZO = WebUI.getText(findTestObject('Прогноз по отраслям/Фильтр Организация'))

    String period = WebUI.getText(findTestObject('Прогноз по отраслям/Фильтр Месяц'))

    println(period)

    String dashboardName = 'Прогноз по отраслям'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, period)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, typeOfData)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, todaysDate)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

