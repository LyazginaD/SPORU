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

String widget

WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 1))

WebUI.setText(findTestObject('Страница авторизации/input__username'), findTestData('PlanFact').getValue(8, 1))

WebUI.setText(findTestObject('Страница авторизации/input__password'), findTestData('PlanFact').getValue(9, 1))

WebUI.click(findTestObject('Страница авторизации/button_'))

WebUI.delay(40)

ZakrytOpoveshenie()

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр Дата'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Снять выделение в фильтре Дата'))

'Нажать "Применить"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре Дата'))

WebUI.delay(30)

ZakrytOpoveshenie()

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр Дата'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Снять выделение в фильтре Дата'))

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/2023 список'), 30)

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/2023 список'))

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/3 квартал 2024'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/3 квартал 2024'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Выполнение бизнес-плана/3 квартал 2023'))

'!'
ZakrytOpoveshenie()

'Проскроллить до заголовка фильтра "Дата"'
WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Заголовок дашборда'), 30)

'Нажать "Применить"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре Дата'))

WebUI.delay(30)

ZakrytOpoveshenie()

'Открыть фильтр "ДЗО"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр ДЗО'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Снять выделение в фильтре ДЗО'))

'Выбрать ПАО Россети'
WebUI.click(findTestObject('Выполнение бизнес-плана/ПАО Россети'))

'Нажать "Применить"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре ДЗО'))

int i

String a = WebUI.getText(findTestObject('Выполнение бизнес-плана/Итого'))

i = a.indexOf('План')

a = a.substring(0, i)

a = a.trim()

println(a)

String a1 = WebUI.getText(findTestObject('Выполнение бизнес-плана/vidget 2'))

println(a1)

a1 = a1.substring(0, a1.indexOf('Россети ФСКЕЭС'))

a1 = a1.replaceAll('[^0-9]', '')

println(a1)

String a2 = WebUI.getText(findTestObject('Выполнение бизнес-плана/table'))

println(a2)

String a3 = WebUI.getText(findTestObject('null'))

i = a3.indexOf('Россети ФСКЕЭС')

a3 = a3.substring(0, i)

println(a3)

String a4 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Виджет Итого'))

a4 = a4.replaceAll('\\s+', '')

a4 = a4.replaceAll('[^0-9]', '')

a4 = a4.substring(0, 2)

println(a4)

String a5 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Отпуск в сеть за отчётный период ПАО Россети'))

println(a5)

String a6 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Отпуск из сети за отчётный период ПАО Россети'))

println(a6)

String a7 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Потери за отчётный период ПАО Россети'))

println(a7)

String a8 = WebUI.getText(findTestObject('Выполнение бизнес-плана/otkloneniya 3m'))

println(a8)

i = (a8.indexOf('(нарастающим итогом)') + 21)

a8 = a8.substring(i, a8.length())

i = a8.indexOf('Россети ФСКЕЭС')

if (i > -1) {
    a8 = a8.substring(0, i).trim()
}

i = a8.indexOf('п.п.')

if (i > -1) {
    i = (i + 5)

    a8 = a8.substring(i, a8.length()).trim()
}

a8 = a8

println('a8:' + a8)

WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 4))

WebUI.delay(40)

ZakrytOpoveshenie()

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Фильтр Дата'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Снять выделение в фильтре Дата'))

'Нажать "Применить"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Применить в фильтре Дата'))

WebUI.delay(30)

ZakrytOpoveshenie()

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Фильтр Дата'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Снять выделение в фильтре Дата'))

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/2023 список'), 30)

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/2023 список'))

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/1 квартал 2023 список'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/3 квартал 2024'))

WebUI.click(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/2 квартал 2023'))

WebUI.click(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/3 квартал 2023'))

'Проскроллить до заголовка фильтра "Дата"'
WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Заголовок дашборда'), 30)

'Нажать "Применить"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Применить в фильтре Дата'))

WebUI.delay(30)

'!'
ZakrytOpoveshenie()

'Открыть фильтр "ДЗО"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Фильтр ДЗО'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Снять выделение в фильтре ДЗО'))

'Выбрать ПАО Россети'
WebUI.click(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/ПАО Россети'))

'Нажать "Применить"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Применить в фильтре ДЗО'))

String b = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Итого'))

i = b.indexOf('%')

b = b.substring(i)

b = b.trim()

i = (b.indexOf('100') - 3)

b = b.substring(0, i)

println(b)

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

String b1 = ((((((((((((((((((((((((((((((((b00 + b02) + b04) + b06) + b08) + b10) + b12) + b14) + b16) + b18) + b20) + 
b22) + b24) + b26) + b28) + b30) + b32) + b01) + b03) + b05) + b07) + b09) + b11) + b13) + b15) + b17) + b19) + b21) + b23) + 
b25) + b27) + b29) + b31) + b33

println(b1)

b1 = b1.replaceAll('[^0-9]', '')

println(b1)

String b2 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/table'))

println(b2)

String b3 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Список ДЗО'))

i = b3.indexOf('Россети ФСКЕЭС')

b3 = b3.substring(0, i)

println('b3:' + b3)

String b4 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/svg2'))

b4 = b4.replaceAll('\\s+', '')

b4 = b4.replaceAll('[^0-9]', '')

b4 = b4.substring(0, 2)

println(b4)

String b5 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Факт Отпуск в сеть за отчётный период ПАО Россети'))

println(b5)

String b6 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Факт Отпуск из сети за отчётный период ПАО Россети'))

println(b6)

String b7 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Факт Потери за отчётный период ПАО Россети'))

println(b7)

String b8 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/otkloneniya 3m'))

println(b8)

i = (b8.indexOf('п.п.') + 5)

b8 = b8.substring(i, b8.length())

i = b8.indexOf('Россети ФСКЕЭС')

b8 = b8.substring(0, i)

b8 = b8.trim()

println('b8:' + b8)

if (WebUI.verifyEqual(a, b) == true) {
} else {
    widget = 'План Факт в процентах'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a1, b1) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a2, b2) == true) {
} else {
    widget = 'Показатели баланса электроэнергии по ДЗО'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a3, b3) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана за 3 месяца (нарастающим итогом)'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a4, b4) == true) {
} else {
    widget = 'Итого'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a4, b4) == true) {
} else {
    widget = 'Итого Отпуск в сеть'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a6, b6) == true) {
} else {
    widget = 'Итого Отпуск из сети'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a7, b7) == true) {
} else {
    widget = 'Итого Потери'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a8, b8) == true) {
} else {
    widget = 'Итого Потери'

    WriteToExcel(todaysDate, widget)
}

WebUI.closeBrowser()

static void ZakrytOpoveshenie() {
    String opoveshenie = WebUI.getText(findTestObject('Выполнение бизнес-плана/Просьба обратить внимание'))

    println(opoveshenie)

    if (opoveshenie == 'Просьба обратить внимание') {
        WebUI.click(findTestObject('Выполнение бизнес-плана/Закрыть оповещение'))
    }
}

static def WriteToExcel(def todaysDate, def widget) {
    println('widget:' + widget)

    String sheetName = 'Sheet1'

    def data = findTestData('PlanFact')

    int n = data.getRowNumbers() + 1

    String dZO = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Фильтр ДЗО'))

    String period = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Фильтр Дата'))

    println(period)

    String dashboardName = 'Выполнение бизнес-плана'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, widget)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, period)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, todaysDate)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

