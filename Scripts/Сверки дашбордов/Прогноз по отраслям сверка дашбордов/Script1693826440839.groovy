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

String filterSravnenie

String kpoOtpusk

WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 6))

WebUI.setText(findTestObject('Страница авторизации/input__username'), findTestData('PlanFact').getValue(8, 1))

WebUI.setText(findTestObject('Страница авторизации/input__password'), findTestData('PlanFact').getValue(9, 1))

WebUI.click(findTestObject('Страница авторизации/button_'))

WebUI.delay(50)

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр Месяц'))

WebUI.scrollToElement(findTestObject('Прогноз по отраслям/Ноябрь'), 30)

WebUI.click(findTestObject('Прогноз по отраслям/Ноябрь'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Прогноз по отраслям/Заголовок дашборда'), 30)

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр Сравнение с'))

WebUI.click(findTestObject('Прогноз по отраслям/Факт прошлого года'))

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр КПО-Отпуск'))

WebUI.click(findTestObject('Прогноз по отраслям/Отпуск'))

WebUI.delay(40)

String a1 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

a1 = a1.replaceAll('[^0-9]', '')

println('a1:' + a1)

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр Сравнение с'))

WebUI.click(findTestObject('Прогноз по отраслям/План'))

WebUI.delay(40)

String a2 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

a2 = a2.replaceAll('[^0-9]', '')

println('a2:' + a2)

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр Сравнение с'))

WebUI.click(findTestObject('Прогноз по отраслям/План СУ'))

WebUI.delay(40)

String a3 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

a3 = a3.replaceAll('[^0-9]', '')

println('a3:' + a3)

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр Сравнение с'))

WebUI.click(findTestObject('Прогноз по отраслям/Факт прошлого года'))

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр КПО-Отпуск'))

WebUI.click(findTestObject('Прогноз по отраслям/КПО'))

WebUI.delay(40)

String a4 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

a4 = a4.replaceAll('[^0-9]', '')

println('a4:' + a4)

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр Сравнение с'))

WebUI.click(findTestObject('Прогноз по отраслям/План'))

WebUI.delay(40)

String a5 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

println('a5:' + a5)

a5 = a5.replaceAll('[^0-9]', '')

println('a5:' + a5)

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр Сравнение с'))

WebUI.click(findTestObject('Прогноз по отраслям/План СУ'))

WebUI.delay(40)

String a6 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

a6 = a6.replaceAll('[^0-9]', '')

println('a6:' + a6)

WebUI.click(findTestObject('Прогноз по отраслям/Переключить отображение с процентов на абс Блок руководителя'))

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр Сравнение с'))

WebUI.click(findTestObject('Прогноз по отраслям/Факт прошлого года'))

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр КПО-Отпуск'))

WebUI.click(findTestObject('Прогноз по отраслям/Отпуск'))

WebUI.delay(40)

String a7 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

a7 = a7.replaceAll('[^0-9]', '')

println('a7:' + a7)

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр Сравнение с'))

WebUI.click(findTestObject('Прогноз по отраслям/План'))

WebUI.delay(40)

String a8 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

a8 = a8.replaceAll('[^0-9]', '')

println('a8:' + a8)

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр Сравнение с'))

WebUI.click(findTestObject('Прогноз по отраслям/План СУ'))

WebUI.delay(40)

String a9 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

a9 = a9.replaceAll('[^0-9]', '')

println('a9:' + a9)

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр Сравнение с'))

WebUI.click(findTestObject('Прогноз по отраслям/Факт прошлого года'))

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр КПО-Отпуск'))

WebUI.click(findTestObject('Прогноз по отраслям/КПО'))

WebUI.delay(40)

String a10 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

a10 = a10.replaceAll('[^0-9]', '')

println('a10:' + a10)

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр Сравнение с'))

WebUI.click(findTestObject('Прогноз по отраслям/План'))

WebUI.delay(40)

String a11 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

println('a11:' + a11)

a11 = a11.replaceAll('[^0-9]', '')

println('a11:' + a11)

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр Сравнение с'))

WebUI.click(findTestObject('Прогноз по отраслям/План СУ'))

WebUI.delay(40)

String a12 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

a12 = a12.replaceAll('[^0-9]', '')

println('a12:' + a12)

WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 12))

WebUI.delay(50)

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр месяц Стресс'))

WebUI.scrollToElement(findTestObject('Прогноз по отраслям/Ноябрь Стресс'), 30)

WebUI.click(findTestObject('Прогноз по отраслям/Ноябрь Стресс'))

WebUI.scrollToElement(findTestObject('Прогноз по отраслям/Заголовок дашборда Стресс'), 30)

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр Сравнение с Стресс'))

WebUI.click(findTestObject('Прогноз по отраслям/Факт прошлого года Стресс'))

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр КПО-Отпуск Стресс'))

WebUI.click(findTestObject('Прогноз по отраслям/Отпуск Стресс'))

WebUI.delay(40)

String b1 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

b1 = b1.replaceAll('[^0-9]', '')

println('b1:' + b1)

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр Сравнение с Стресс'))

WebUI.click(findTestObject('Прогноз по отраслям/План Стресс'))

WebUI.delay(40)

String b2 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

b2 = b2.replaceAll('[^0-9]', '')

println('b2:' + b2)

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр Сравнение с Стресс'))

WebUI.click(findTestObject('Прогноз по отраслям/План СУ Стресс'))

WebUI.delay(40)

String b3 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

b3 = b3.replaceAll('[^0-9]', '')

println('b3:' + b3)

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр Сравнение с Стресс'))

WebUI.click(findTestObject('Прогноз по отраслям/Факт прошлого года Стресс'))

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр КПО-Отпуск Стресс'))

WebUI.click(findTestObject('Прогноз по отраслям/КПО Стресс'))

WebUI.delay(40)

String b4 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

b4 = b4.replaceAll('[^0-9]', '')

println('b4:' + b4)

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр Сравнение с Стресс'))

WebUI.click(findTestObject('Прогноз по отраслям/План Стресс'))

WebUI.delay(40)

String b5 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

println('b5:' + b5)

b5 = b5.replaceAll('[^0-9]', '')

println('b5:' + b5)

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр Сравнение с Стресс'))

WebUI.click(findTestObject('Прогноз по отраслям/План СУ Стресс'))

WebUI.delay(40)

String b6 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

b6 = b6.replaceAll('[^0-9]', '')

println('b6:' + b6)

WebUI.click(findTestObject('Прогноз по отраслям/Переключить отображение с процентов на абс Стресс-сценарий'))

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр Сравнение с Стресс'))

WebUI.click(findTestObject('Прогноз по отраслям/Факт прошлого года Стресс'))

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр КПО-Отпуск Стресс'))

WebUI.click(findTestObject('Прогноз по отраслям/Отпуск Стресс'))

WebUI.delay(40)

String b7 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

b7 = b7.replaceAll('[^0-9]', '')

println('b7:' + b7)

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр Сравнение с Стресс'))

WebUI.click(findTestObject('Прогноз по отраслям/План Стресс'))

WebUI.delay(40)

String b8 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

b8 = b8.replaceAll('[^0-9]', '')

println('b8:' + b8)

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр Сравнение с Стресс'))

WebUI.click(findTestObject('Прогноз по отраслям/План СУ Стресс'))

WebUI.delay(40)

String b9 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

b9 = b9.replaceAll('[^0-9]', '')

println('b9:' + b9)

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр Сравнение с Стресс'))

WebUI.click(findTestObject('Прогноз по отраслям/Факт прошлого года Стресс'))

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр КПО-Отпуск Стресс'))

WebUI.click(findTestObject('Прогноз по отраслям/КПО Стресс'))

WebUI.delay(40)

String b10 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

b10 = b10.replaceAll('[^0-9]', '')

println('b10:' + b10)

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр Сравнение с Стресс'))

WebUI.click(findTestObject('Прогноз по отраслям/План Стресс'))

WebUI.delay(40)

String b11 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

println('b11:' + b11)

b11 = b11.replaceAll('[^0-9]', '')

println('b11:' + b11)

WebUI.click(findTestObject('Прогноз по отраслям/Фильтр Сравнение с Стресс'))

WebUI.click(findTestObject('Прогноз по отраслям/План СУ Стресс'))

WebUI.delay(40)

String b12 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

b12 = b12.replaceAll('[^0-9]', '')

println('b12:' + b12)

if (WebUI.verifyEqual(a1, b1) == true) {
} else {
    typeOfData = 'Проценты'

    filterSravnenie = 'Факт прошлого года'

    kpoOtpusk = 'Отпуск'

    WriteToExcel(todaysDate, typeOfData, filterSravnenie, kpoOtpusk)
}

if (WebUI.verifyEqual(a2, b2) == true) {
} else {
    typeOfData = 'Проценты'

    filterSravnenie = 'План'

    kpoOtpusk = 'Отпуск'

    WriteToExcel(todaysDate, typeOfData, filterSravnenie, kpoOtpusk)
}

if (WebUI.verifyEqual(a3, b3) == true) {
} else {
    typeOfData = 'Проценты'

    filterSravnenie = 'План СУ'

    kpoOtpusk = 'Отпуск'

    WriteToExcel(todaysDate, typeOfData, filterSravnenie, kpoOtpusk)
}

if (WebUI.verifyEqual(a4, b4) == true) {
} else {
    typeOfData = 'Проценты'

    filterSravnenie = 'Факт прошлого года'

    kpoOtpusk = 'КПО'

    WriteToExcel(todaysDate, typeOfData, filterSravnenie, kpoOtpusk)
}

if (WebUI.verifyEqual(a5, b5) == true) {
} else {
    typeOfData = 'Проценты'

    filterSravnenie = 'План'

    kpoOtpusk = 'КПО'

    WriteToExcel(todaysDate, typeOfData, filterSravnenie, kpoOtpusk)
}

if (WebUI.verifyEqual(a6, b6) == true) {
} else {
    typeOfData = 'Проценты'

    filterSravnenie = 'План СУ'

    kpoOtpusk = 'КПО'

    WriteToExcel(todaysDate, typeOfData, filterSravnenie, kpoOtpusk)
}

if (WebUI.verifyEqual(a7, b7) == true) {
} else {
    typeOfData = 'абс'

    filterSravnenie = 'Факт прошлого года'

    kpoOtpusk = 'Отпуск'

    WriteToExcel(todaysDate, typeOfData, filterSravnenie, kpoOtpusk)
}

if (WebUI.verifyEqual(a8, b8) == true) {
} else {
    typeOfData = 'абс'

    filterSravnenie = 'План'

    kpoOtpusk = 'Отпуск'

    WriteToExcel(todaysDate, typeOfData, filterSravnenie, kpoOtpusk)
}

if (WebUI.verifyEqual(a9, b9) == true) {
} else {
    typeOfData = 'абс'

    filterSravnenie = 'План СУ'

    kpoOtpusk = 'Отпуск'

    WriteToExcel(todaysDate, typeOfData, filterSravnenie, kpoOtpusk)
}

if (WebUI.verifyEqual(a10, b10) == true) {
} else {
    typeOfData = 'абс'

    filterSravnenie = 'Факт прошлого года'

    kpoOtpusk = 'КПО'

    WriteToExcel(todaysDate, typeOfData, filterSravnenie, kpoOtpusk)
}

if (WebUI.verifyEqual(a11, b11) == true) {
} else {
    typeOfData = 'абс'

    filterSravnenie = 'План'

    kpoOtpusk = 'КПО'

    WriteToExcel(todaysDate, typeOfData, filterSravnenie, kpoOtpusk)
}

if (WebUI.verifyEqual(a12, b12) == true) {
} else {
    typeOfData = 'абс'

    filterSravnenie = 'План СУ'

    kpoOtpusk = 'КПО'

    WriteToExcel(todaysDate, typeOfData, filterSravnenie, kpoOtpusk)
}

WebUI.closeBrowser()

static def WriteToExcel(def todaysDate, def typeOfData, def filterSravnenie, def kpoOtpusk) {
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

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, filterSravnenie)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, kpoOtpusk)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, todaysDate)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

