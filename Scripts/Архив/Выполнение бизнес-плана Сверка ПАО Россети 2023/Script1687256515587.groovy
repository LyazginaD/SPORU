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

WebUI.openBrowser('')

Date date = new Date()

String todaysDate = date.format('dd.MM.yyyy')

println(todaysDate)

WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 1))

WebUI.setText(findTestObject('Страница авторизации/input__username'), findTestData('PlanFact').getValue(8, 1))

WebUI.setText(findTestObject('Страница авторизации/input__password'), findTestData('PlanFact').getValue(9, 1))

WebUI.click(findTestObject('Страница авторизации/button_'))

WebUI.delay(30)

'!'
if (WebUI.verifyTextPresent('Просьба обратить внимание', false) == true) {
    WebUI.click(findTestObject('Выполнение бизнес-плана/Закрыть оповещение'))
}

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр Дата'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Снять выделение в фильтре Дата'))

'Нажать "Применить"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре Дата'))

WebUI.delay(30)

if (WebUI.verifyTextPresent('Просьба обратить внимание', false) == true) {
    WebUI.click(findTestObject('Выполнение бизнес-плана/Закрыть оповещение'))
}

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр Дата'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Снять выделение в фильтре Дата'))

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/2023 список'), 30)

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/2023 список'))

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/1 квартал 2024 список'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/1 квартал 2023'))

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/2 квартал 2023 список'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/2 квартал 2023'))

WebUI.click(findTestObject('Выполнение бизнес-плана/3 квартал 2023 список'))

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Июль'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Июль'))

'Проскроллить до заголовка фильтра "Дата"'
WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Заголовок дашборда'), 30)

'Нажать "Применить"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре Дата'))

WebUI.delay(30)

'!'
if (WebUI.verifyTextPresent('Просьба обратить внимание', false) == true) {
    WebUI.click(findTestObject('Выполнение бизнес-плана/Закрыть оповещение'))
}

'Открыть фильтр "ДЗО"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр ДЗО'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Снять выделение в фильтре ДЗО'))

'Нажать "Применить"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре ДЗО'))

'Открыть фильтр "ДЗО"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр ДЗО'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Снять выделение в фильтре ДЗО'))

'Выбрать ПАО Россети'
WebUI.click(findTestObject('Выполнение бизнес-плана/ПАО Россети'))

'Нажать "Применить"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре ДЗО'))

int a

a = 19

CheckNumbersFact(a, todaysDate)

WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка План'))

CheckNumbersPlan(a, todaysDate)

WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка Факт'))

CheckPercents(a, todaysDate)

for (a = 1; a < 17; a++) {
    println(findTestData('PlanFact').getValue(1, a))

    CheckNumbersFact(a, todaysDate)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка План'))

    CheckNumbersPlan(a, todaysDate)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка Факт'))
}

a = 18

CheckNumbersFact(a, todaysDate)

WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка План'))

CheckNumbersPlan(a, todaysDate)

WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка Факт'))

WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр ДЗО'))

WebUI.click(findTestObject('Выполнение бизнес-плана/Снять выделение в фильтре ДЗО'))

WebUI.click(findTestObject('Выполнение бизнес-плана/Раскрыть список ПАО Россети в фильтре ДЗО'))

WebUI.click(findTestObject('Выполнение бизнес-плана/Раскрыть список Магистральные сети'))

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети ФСК ЕЭС'))

Change(a, todaysDate)

WebUI.click(findTestObject('Выполнение бизнес-плана/Раскрыть список Магистральные сети'))

WebUI.click(findTestObject('Выполнение бизнес-плана/РаспредКомплекс'))

WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре ДЗО'))

a = 17

CheckNumbersFact(a, todaysDate)

WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка План'))

CheckNumbersPlan(a, todaysDate)

WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка Факт'))

CheckPercents(a, todaysDate)

WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр ДЗО'))

WebUI.click(findTestObject('Выполнение бизнес-плана/Снять выделение в фильтре ДЗО'))

WebUI.click(findTestObject('Выполнение бизнес-плана/Раскрыть список РаспредКомплекс в фильтре ДЗО'))

WebUI.click(findTestObject('Выполнение бизнес-плана/Тываэнерго'))

a = 6

Change(a, todaysDate)

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Раскрыть список Чеченэнерго'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Чеченэнерго'))

a = 11

Change(a, todaysDate)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Волга'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Волга'))

a = 3

Change(a, todaysDate)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Кубань'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Кубань'))

a = 12

Change(a, todaysDate)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Ленэнерго'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Ленэнерго'))

a = 14

Change(a, todaysDate)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Московский регион'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Московский регион'))

a = 13

Change(a, todaysDate)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Северный кавказ'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Северный Кавказ'))

a = 10

Change(a, todaysDate)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Северо-Запад'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Северо-Запад'))

a = 4

Change(a, todaysDate)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Сибирь'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Сибирь'))

a = 5

Change(a, todaysDate)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Томск'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Томск'))

a = 7

Change(a, todaysDate)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Тюмень'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Тюмень'))

a = 15

Change(a, todaysDate)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Урал'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Урал'))

a = 8

Change(a, todaysDate)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Центр'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Центр'))

a = 1

Change(a, todaysDate)

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Россети Центр и Приволжье'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Центр и Приволжье'))

a = 2

Change(a, todaysDate)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Юг'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Юг'))

a = 9

Change(a, todaysDate)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Янтарь'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Янтарь'))

a = 16

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Заголовок фильтра ДЗО'), 30)

WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре ДЗО'))

CheckPercents(a, todaysDate)

WebUI.closeBrowser()

static def Change(def a, def todaysDate) {
    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Заголовок дашборда'), 30)

    WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре ДЗО'))

    WebUI.delay(30)

    CheckPercents(a, todaysDate)

    WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр ДЗО'))

    WebUI.click(findTestObject('Выполнение бизнес-плана/Снять выделение в фильтре ДЗО'))
}

static def CheckNumbersFact(def a, def todaysDate) {
    String otpuskFact = findTestData('PlanFact').getValue(5, a)

    otpuskFact = otpuskFact.replaceAll('\\s+', '')

    println('otpuskFact: ' + otpuskFact)

    String poteriFact = findTestData('PlanFact').getValue(6, a)

    poteriFact = poteriFact.replaceAll('\\s+', '')

    println('poteriFact: ' + poteriFact)

    String b = findTestData('PlanFact').getValue(1, a)

    println('b: ' + b)

    String path = 'Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Отпуск в сеть за отчётный период ' + 
    b

    println('path: ' + path)

    String pageOtpusk = WebUI.getText(findTestObject(path))

    pageOtpusk = pageOtpusk.replaceAll('\\s+', '')

    println('pageOtpusk: ' + pageOtpusk)

    String typeOfData = 'Факт Отпуск в сеть'

    int file = otpuskFact.toInteger()

    int page = pageOtpusk.toInteger()

    Test(a, page, file, typeOfData, todaysDate)

    path = ('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Потери за отчётный период ' + b)

    println('path: ' + path)

    String pagePoteri = WebUI.getText(findTestObject(path))

    pagePoteri = pagePoteri.replaceAll('\\s+', '')

    println('pagePoteri: ' + pagePoteri)

    typeOfData = 'Факт Потери'

    file = poteriFact.toInteger()

    page = pagePoteri.toInteger()

    Test(a, page, file, typeOfData, todaysDate)
}

static def CheckNumbersPlan(def a, def todaysDate) {
    String otpuskPlan = findTestData('PlanFact').getValue(2, a)

    otpuskPlan = otpuskPlan.replaceAll('\\s+', '')

    println('otpuskPlan: ' + otpuskPlan)

    String poteriPlan = findTestData('PlanFact').getValue(3, a)

    poteriPlan = poteriPlan.replaceAll('\\s+', '')

    println('poteriPlan: ' + poteriPlan)

    String b = findTestData('PlanFact').getValue(1, a)

    println('b: ' + b)

    String path = 'Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Отпуск в сеть за отчётный период ' + 
    b

    println('path: ' + path)

    String pageOtpusk = WebUI.getText(findTestObject(path))

    pageOtpusk = pageOtpusk.replaceAll('\\s+', '')

    println('pageOtpusk: ' + pageOtpusk)

    String typeOfData = 'План Отпуск в сеть'

    int file = otpuskPlan.toInteger()

    int page = pageOtpusk.toInteger()

    Test(a, page, file, typeOfData, todaysDate)

    path = ('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Потери за отчётный период ' + b)

    println('path: ' + path)

    String pagePoteri = WebUI.getText(findTestObject(path))

    pagePoteri = pagePoteri.replaceAll('\\s+', '')

    println('pagePoteri: ' + pagePoteri)

    typeOfData = 'План Потери'

    file = poteriPlan.toInteger()

    page = pagePoteri.toInteger()

    Test(a, page, file, typeOfData, todaysDate)
}

static def Test(def a, def page, def file, def typeOfData, def todaysDate) {
    String page1 = page

    if (page == file) {
    } else if (page > file) {
        page1 = (page - 1)
    } else if (page < file) {
        page1 = (page + 1)
    }
    
    if (WebUI.verifyEqual(page1, file) == true) {
    } else {
        WriteToExcel(a, typeOfData, page, file, todaysDate)
    }
}

static def CheckPercents(def a, def todaysDate) {
    String textPlanFact = WebUI.getText(findTestObject('Выполнение бизнес-плана/textPlanFact'))

    textPlanFact = textPlanFact.replace('%', '')

    println('textPlanFact: ' + textPlanFact)

    String filePlan = findTestData('PlanFact').getValue(4, a)

    filePlan = filePlan.replace(',', '.')

    println('filePlan: ' + filePlan)

    String fileFact = findTestData('PlanFact').getValue(7, a)

    fileFact = fileFact.replace(',', '.')

    println('fileFact: ' + fileFact)

    textPlanFact = textPlanFact.replaceAll('\\s+', '')

    println('textPlanFact: ' + textPlanFact)

    textPlanFact = (textPlanFact.split('План')[0])

    println('textPlanFact: ' + textPlanFact)

    String typeOfData = 'План в процентах'

    int i = textPlanFact.indexOf('.')

    println('i:' + i)

    i = (i + 3)

    String pagePlan = textPlanFact.substring(0, i)

    println('pagePlan:' + pagePlan)

    double file = filePlan.toDouble()

    double page = pagePlan.toDouble()

    TestPercents(a, page, file, typeOfData, todaysDate)

    String pageFact = textPlanFact.substring(i)

    pageFact = pageFact.substring(i)

    i = pageFact.length()

    i = (i / 2)

    pageFact = pageFact.substring(i)

    println('pageFact:' + pageFact)

    typeOfData = 'Факт в процентах'

    file = fileFact.toDouble()

    page = pageFact.toDouble()

    TestPercents(a, page, file, typeOfData, todaysDate)
}

static def TestPercents(def a, def page, def file, def typeOfData, def todaysDate) {
    if (WebUI.verifyEqual(page, file) == true) {
    } else {
        WriteToExcel(a, typeOfData, page, file, todaysDate)
    }
}

static def WriteToExcel(def a, def typeOfData, def page, def file, def todaysDate) {
    String sheetName = 'Sheet1'

    def data = findTestData('PlanFact')

    int n = data.getRowNumbers() + 1

    String dZO = findTestData('PlanFact').getValue(1, a)

    if (a == 2) {
        dZO = 'Россети Центр и Приволжье (ГК)'
    } else if (a == 5) {
        dZO = 'Россети Сибирь (ГК)'
    } else if (a == 6) {
        dZO = 'АО "Тываэнерго"'
    } else if (a == 8) {
        dZO = 'Россети Урал (ГК)'
    } else if (a == 9) {
        dZO = 'Россети Юг (ГК)'
    } else if (a == 10) {
        dZO = 'Россети Северный Кавказ (ГК)'
    } else if (a == 11) {
        dZO = 'АО "Чеченэнерго"'
    } else if (a == 14) {
        dZO = 'Россети Ленэнерго (ГК)'
    } else {
        println(dZO)
    }
    
    String year = todaysDate.substring(todaysDate.length() - 4, todaysDate.length())

    int y = year.toInteger()

    String m = WebUI.getText(findTestObject('Выполнение бизнес-плана/Период'))

    m = m.substring(0, m.indexOf(year))

    m = m.trim()

    String dashboardName = 'Выполнение бизнес-плана'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, typeOfData)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, file)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, page)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, m)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, y)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 7, todaysDate)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

