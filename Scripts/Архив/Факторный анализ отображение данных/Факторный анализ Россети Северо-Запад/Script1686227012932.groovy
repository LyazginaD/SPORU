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

WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 3))

WebUI.setText(findTestObject('Страница авторизации/input__username'), findTestData('PlanFact').getValue(8, 1))

WebUI.setText(findTestObject('Страница авторизации/input__password'), findTestData('PlanFact').getValue(9, 1))

WebUI.click(findTestObject('Страница авторизации/button_'))

String typeOfData

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Факторный анализ/Фильтр Период'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Факторный анализ/Снять выделение в фильтре Дата'))

'Нажать "Применить"'
WebUI.click(findTestObject('Факторный анализ/Применить в фильтре Дата'))

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Факторный анализ/Фильтр Период'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Факторный анализ/Снять выделение в фильтре Дата'))

'Проскроллить до элемента 2022'
WebUI.scrollToElement(findTestObject('Факторный анализ/2023 список'), 30)

'Проскроллить до элемента 2022'
WebUI.click(findTestObject('Факторный анализ/2023 список'), FailureHandling.CONTINUE_ON_FAILURE)

'Проскроллить до элемента 2022'
WebUI.scrollToElement(findTestObject('Факторный анализ/1 квартал 2023 выбрать'), 30)

'Проскроллить до элемента 2022'
WebUI.click(findTestObject('Факторный анализ/1 квартал 2023 выбрать'), FailureHandling.CONTINUE_ON_FAILURE)

'Проскроллить до элемента 2022'
WebUI.click(findTestObject('Факторный анализ/2 квартал 2023 список'), FailureHandling.CONTINUE_ON_FAILURE)

'Проскроллить до элемента 2022'
WebUI.click(findTestObject('Факторный анализ/Апрель'), FailureHandling.CONTINUE_ON_FAILURE)

'Проскроллить до заголовка фильтра "Дата"'
WebUI.scrollToElement(findTestObject('Факторный анализ/Заголовок дашборда'), 30)

'Нажать "Применить"'
WebUI.click(findTestObject('Факторный анализ/Применить в фильтре Дата'))

'Открыть фильтр "ДЗО"'
WebUI.click(findTestObject('Факторный анализ/Фильтр ДЗО'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Факторный анализ/Снять выделение в Фильтре ДЗО'))

WebUI.click(findTestObject('Факторный анализ/Раскрыть список ПАО Россети'))

WebUI.click(findTestObject('Факторный анализ/Раскрыть список ПАО Россети'))

WebUI.click(findTestObject('Общие объекты/Раскрыть список РаспредКомплекс'))

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Северо-Запад'), 30)

WebUI.click(findTestObject('Факторный анализ/Россети Северо-Запад'))

def test = Change(typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Северо-Запад'), 30)

WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Северо-Запад'))

WebUI.click(findTestObject('Общие объекты/Архангельский филиал'))

test = Change(typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Вологодский филиал'), 30)

WebUI.click(findTestObject('Общие объекты/Вологодский филиал'))

test = Change(typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Карельский филиал'), 30)

WebUI.click(findTestObject('Общие объекты/Карельский филиал'))

test = Change(typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Мурманский филиал'), 30)

WebUI.click(findTestObject('Общие объекты/Мурманский филиал'))

test = Change(typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Новгородский филиал'), 30)

WebUI.click(findTestObject('Общие объекты/Новгородский филиал'))

test = Change(typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Псковский филиал'), 30)

WebUI.click(findTestObject('Общие объекты/Псковский филиал'))

test = Change(typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/филиал в Республике Коми'), 30)

WebUI.click(findTestObject('Общие объекты/филиал в Республике Коми'))

'Проскроллить до заголовка фильтра "Дата"'
WebUI.scrollToElement(findTestObject('Факторный анализ/Заголовок дашборда'), 30)

'Нажать "Применить"'
WebUI.click(findTestObject('Факторный анализ/Применить в фильтре ДЗО'))

typeOfData = 'Филиал'

test = Test(typeOfData)

WebUI.click(findTestObject('Факторный анализ/Переключить отображение с филиала на месяц Выручка'))

typeOfData = 'Месяц'

test = Test(typeOfData)

WebUI.closeBrowser()

static def Change(def typeOfData) {
    'Проскроллить до заголовка фильтра "Дата"'
    WebUI.scrollToElement(findTestObject('Факторный анализ/Заголовок дашборда'), 30)

    'Нажать "Применить"'
    WebUI.click(findTestObject('Факторный анализ/Применить в фильтре ДЗО'))

    typeOfData = 'Филиал'

    def test = Test(typeOfData)

    WebUI.click(findTestObject('Факторный анализ/Переключить отображение с филиала на месяц Выручка'))

    typeOfData = 'Месяц'

    test = Test(typeOfData)

    WebUI.click(findTestObject('Факторный анализ/Переключить отображение с месяца на филиал'))

    'Открыть фильтр "ДЗО"'
    WebUI.click(findTestObject('Факторный анализ/Фильтр ДЗО'))

    'Нажать "Снять выделение"'
    WebUI.click(findTestObject('Факторный анализ/Снять выделение в фильтре ДЗО'))
}

static def Test(def typeOfData) {
    if (WebUI.verifyTextNotPresent('нет данных', false) == true) {
        if (WebUI.verifyTextNotPresent('Ошибка запроса данных', false) == true) {
            if (WebUI.verifyTextNotPresent('Произошла ошибка при выполнении пользовательского кода', false) == true) {
                if (WebUI.verifyTextNotPresent('У виджета нет данных', false) == true) {
                    if (WebUI.verifyTextNotPresent('У виджета нет данных', false) == true) {
                    } else {
                        def write = WriteToExcel(typeOfData)
                    }
                } else {
                    def write = WriteToExcel(typeOfData)
                }
            } else {
                def write = WriteToExcel(typeOfData)
            }
        } else {
            def write = WriteToExcel(typeOfData)
        }
    } else {
        def write = WriteToExcel(typeOfData)
    }
}

static def WriteToExcel(def typeOfData) {
    String excelFilePath = 'C:\\Users\\LIAZGINA-DI\\Тестирование\\СПОРУ\\СПОРУ\\Data Files\\ПланФакт Апрель 2023.xls'

    String sheetName = 'Sheet1'

    def data = findTestData('PlanFact')

    int n = data.getRowNumbers() + 1

    String t = typeOfData

    println(t)

    String dZO = WebUI.getText(findTestObject('Факторный анализ/Фильтр ДЗО'))

    String date = WebUI.getText(findTestObject('Факторный анализ/Фильтр Период'))

    println(date)

    String dashboardName = 'Факторный анализ'

    def workbook01 = ExcelKeywords.getWorkbook(excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, date)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, t)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(excelFilePath, workbook01)
}

