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

String dZO

int a

int planFact

int file

int page

double fileperc

double pageperc

String typeOfData

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

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/1 квартал 2023 список'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/1 квартал 2023'))

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/2 квартал 2023 список'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/2 квартал 2023'))

WebUI.click(findTestObject('Выполнение бизнес-плана/3 квартал 2023 список'))

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Июль'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Июль'))

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Август'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Август'))

'Проскроллить до заголовка фильтра "Дата"'
WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Заголовок дашборда'), 30)

'Нажать "Применить"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре Дата'))

WebUI.delay(30)

'!'
if (WebUI.verifyTextPresent('Просьба обратить внимание', false) == true) {
    WebUI.click(findTestObject('Выполнение бизнес-плана/Закрыть оповещение'))
}

OpenFilter()

'Выбрать ПАО Россети'
WebUI.click(findTestObject('Выполнение бизнес-плана/ПАО Россети'))

'Нажать "Применить"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре ДЗО'))

'___________________________________________________________________________________________________'
dZO = 'ПАО Россети'

a = 84

Numbers(a, todaysDate, planFact, dZO)

CheckPercents(a, todaysDate, dZO)

dZO = 'Россети ФСК ЕЭС'

a = 83

Numbers(a, todaysDate, planFact, dZO)

OpenFilter()

WebUI.click(findTestObject('Выполнение бизнес-плана/Раскрыть список ПАО Россети в фильтре ДЗО'))

WebUI.click(findTestObject('Выполнение бизнес-плана/Раскрыть список Магистральные сети'))

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети ФСК ЕЭС'))

Change(a, todaysDate, dZO)

dZO = 'РаспредКомплекс'

a = 82

OpenFilter()

WebUI.click(findTestObject('Выполнение бизнес-плана/Раскрыть список ПАО Россети в фильтре ДЗО'))

WebUI.click(findTestObject('Выполнение бизнес-плана/РаспредКомплекс'))

WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре ДЗО'))

Numbers(a, todaysDate, planFact, dZO)

CheckPercents(a, todaysDate, dZO)

OpenFilter()

WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре ДЗО'))

dZO = 'АО "Тываэнерго"'

a = 52

Numbers(a, todaysDate, planFact, dZO)

OpenFilter()

OpenRSK()

WebUI.click(findTestObject('Выполнение бизнес-плана/Тываэнерго'))

Change(a, todaysDate, dZO)

dZO = 'АО "Чеченэнерго"'

a = 72

Numbers(a, todaysDate, planFact, dZO)

OpenFilter()

OpenRSK()

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Раскрыть список Чеченэнерго'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Чеченэнерго'))

Change(a, todaysDate, dZO)

dZO = 'Россети Волга'

a = 28

Numbers(a, todaysDate, planFact, dZO)

OpenFilter()

OpenRSK()

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Волга'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Волга'))

Change(a, todaysDate, dZO)

dZO = 'Россети Кубань'

a = 73

Numbers(a, todaysDate, planFact, dZO)

OpenFilter()

OpenRSK()

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Кубань'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Кубань'))

Change(a, todaysDate, dZO)

dZO = 'Россети Ленэнерго (ГК)'

a = 77

Numbers(a, todaysDate, planFact, dZO)

OpenFilter()

OpenRSK()

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Ленэнерго'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Ленэнерго'))

Change(a, todaysDate, dZO)

dZO = 'Россети Московский регион'

a = 74

Numbers(a, todaysDate, planFact, dZO)

OpenFilter()

OpenRSK()

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Московский регион'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Московский регион'))

Change(a, todaysDate, dZO)

dZO = 'Россети Северный Кавказ (ГК)'

a = 65

Numbers(a, todaysDate, planFact, dZO)

OpenFilter()

OpenRSK()

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Северный кавказ'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Северный Кавказ'))

Change(a, todaysDate, dZO)

dZO = 'Россети Северо-Запад'

a = 36

Numbers(a, todaysDate, planFact, dZO)

OpenFilter()

OpenRSK()

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Северо-Запад'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Северо-Запад'))

Change(a, todaysDate, dZO)

dZO = 'Россети Сибирь (ГК)'

a = 44

Numbers(a, todaysDate, planFact, dZO)

OpenFilter()

OpenRSK()

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Сибирь'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Сибирь'))

Change(a, todaysDate, dZO)

dZO = 'Россети Томск'

a = 53

Numbers(a, todaysDate, planFact, dZO)

OpenFilter()

OpenRSK()

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Томск'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Томск'))

Change(a, todaysDate, dZO)

dZO = 'Россети Тюмень'

a = 80

Numbers(a, todaysDate, planFact, dZO)

OpenFilter()

OpenRSK()

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Тюмень'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Тюмень'))

Change(a, todaysDate, dZO)

dZO = 'Россети Урал (ГК)'

a = 54

Numbers(a, todaysDate, planFact, dZO)

OpenFilter()

OpenRSK()

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Урал'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Урал'))

Change(a, todaysDate, dZO)

dZO = 'Россети Центр (ГК)'

a = 1

Numbers(a, todaysDate, planFact, dZO)

OpenFilter()

OpenRSK()

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Центр'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Центр'))

Change(a, todaysDate, dZO)

dZO = 'Россети Центр и Приволжье (ГК)'

a = 18

Numbers(a, todaysDate, planFact, dZO)

OpenFilter()

OpenRSK()

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Россети Центр и Приволжье'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Центр и Приволжье'))

Change(a, todaysDate, dZO)

dZO = 'Россети Юг (ГК)'

a = 59

Numbers(a, todaysDate, planFact, dZO)

OpenFilter()

OpenRSK()

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Юг'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Юг'))

Change(a, todaysDate, dZO)

dZO = 'Россети Янтарь'

a = 81

Numbers(a, todaysDate, planFact, dZO)

OpenFilter()

OpenRSK()

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Янтарь'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Янтарь'))

CloseFilter()

CheckPercents(a, todaysDate, dZO)

WebUI.closeBrowser()

static def Numbers(def a, def todaysDate, def planFact, def dZO) {
    planFact = 1

    CheckNumbersFactPlan(a, todaysDate, planFact, dZO)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка План'))

    planFact = 2

    CheckNumbersFactPlan(a, todaysDate, planFact, dZO)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка Факт'))
}

static void OpenRSK() {
    WebUI.click(findTestObject('Выполнение бизнес-плана/Раскрыть список ПАО Россети в фильтре ДЗО'))

    WebUI.click(findTestObject('Выполнение бизнес-плана/Раскрыть список РаспредКомплекс в фильтре ДЗО'))
}

static void OpenFilter() {
    WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр ДЗО'))

    WebUI.click(findTestObject('Выполнение бизнес-плана/Снять выделение в фильтре ДЗО'))
}

static void CloseFilter() {
    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Заголовок дашборда'), 30)

    WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре ДЗО'))
}

static def Change(def a, def todaysDate, def dZO) {
    CloseFilter()

    WebUI.delay(10)

    CheckPercents(a, todaysDate, dZO)

    OpenFilter()

    WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре ДЗО'))
}

static def CheckNumbersFactPlan(def a, def todaysDate, def planFact, def dZO) {
    String otpusk

    String poteri

    String dataFolder = 'Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/'

    String path

    String typeOfDataMain

    String typeOfData

    int file

    int page

    if (planFact == 1) {
        typeOfDataMain = 'Факт'

        otpusk = findTestData('PlanFact').getValue(5, a)

        poteri = findTestData('PlanFact').getValue(6, a)
    } else if (planFact == 2) {
        typeOfDataMain = 'План'

        otpusk = findTestData('PlanFact').getValue(2, a)

        poteri = findTestData('PlanFact').getValue(3, a)
    }
    
    otpusk = otpusk.replaceAll('\\s+', '')

    println('otpusk: ' + otpusk)

    poteri = poteri.replaceAll('\\s+', '')

    println('poteriFact: ' + poteri)

    String b

    int i

    b = findTestData('PlanFact').getValue(1, a)

    i = b.indexOf(' (ГК)')

    if (i > -1) {
        b = b.substring(0, i)

        b = b.trim()
    }
    
    i = b.indexOf('О "')

    if (i > -1) {
        b = b.substring(i + 3, b.length())

        i = b.indexOf('"')

        b = b.substring(0, i)

        b = b.trim()
    }
    
    i = b.indexOf('О «')

    if (i > -1) {
        b = b.substring(i + 3, b.length())

        i = b.indexOf('»')

        b = b.substring(0, i)

        b = b.trim()
    }
    
    i = b.indexOf('г. ')

    if (i > -1) {
        b = b.substring(i + 3, b.length())

        b = b.trim()
    }
    
    typeOfData = (typeOfDataMain + ' Отпуск в сеть')

    path = (((dataFolder + typeOfData) + ' за отчётный период ') + b)

    println('path: ' + path)

    String pageOtpusk = WebUI.getText(findTestObject(path))

    pageOtpusk = pageOtpusk.replaceAll('\\s+', '')

    file = otpusk.toInteger()

    page = pageOtpusk.toInteger()

    println('page: ' + page)

    Test(a, page, file, typeOfData, todaysDate, dZO)

    typeOfData = (typeOfDataMain + ' Потери')

    path = (((dataFolder + typeOfData) + ' за отчётный период ') + b)

    println('path: ' + path)

    String pagePoteri = WebUI.getText(findTestObject(path))

    pagePoteri = pagePoteri.replaceAll('\\s+', '')

    file = poteri.toInteger()

    page = pagePoteri.toInteger()

    println('page: ' + page)

    Test(a, page, file, typeOfData, todaysDate, dZO)
}

static def Test(def a, def page, def file, def typeOfData, def todaysDate, def dZO) {
    int page1 = page

    if (page == file) {
    } else if (page > file) {
        page1 = (page - 1)
    } else if (page < file) {
        page1 = (page + 1)
    }
    
    if (WebUI.verifyEqual(page1, file) == true) {
    } else {
        WriteToExcel(a, typeOfData, page, file, todaysDate, dZO)
    }
}

static def CheckPercents(def a, def todaysDate, def dZO) {
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

    TestPercents(a, page, file, typeOfData, todaysDate, dZO)

    String pageFact = textPlanFact.substring(i)

    pageFact = pageFact.substring(i)

    i = pageFact.length()

    i = (i / 2)

    pageFact = pageFact.substring(i)

    println('pageFact:' + pageFact)

    typeOfData = 'Факт в процентах'

    file = fileFact.toDouble()

    page = pageFact.toDouble()

    TestPercents(a, page, file, typeOfData, todaysDate, dZO)
}

static def TestPercents(def a, def page, def file, def typeOfData, def todaysDate, def dZO) {
    if (WebUI.verifyEqual(page, file) == true) {
    } else {
        WriteToExcel(a, typeOfData, page, file, todaysDate, dZO)
    }
}

static def WriteToExcel(def a, def typeOfData, def page, def file, def todaysDate, def dZO) {
    String sheetName = 'Sheet1'

    def data = findTestData('PlanFact')

    int n = data.getRowNumbers() + 1

    String year = todaysDate.substring(todaysDate.length() - 4, todaysDate.length())

    int y = year.toInteger()

    String m = WebUI.getText(findTestObject('Выполнение бизнес-плана/Период'))

    m = m.substring(0, m.indexOf(year))

    m = m.trim()

    println(dZO)

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

