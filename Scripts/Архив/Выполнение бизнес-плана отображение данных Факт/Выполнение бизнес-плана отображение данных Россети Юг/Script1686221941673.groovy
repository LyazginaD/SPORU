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

WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 1))

WebUI.setText(findTestObject('Страница авторизации/input__username'), findTestData('PlanFact').getValue(8, 1))

WebUI.setText(findTestObject('Страница авторизации/input__password'), findTestData('PlanFact').getValue(9, 1))

WebUI.click(findTestObject('Страница авторизации/button_'))

WebUI.delay(10)

if (WebUI.verifyTextPresent('Просьба обратить внимание', false) == true) {
    WebUI.click(findTestObject('Выполнение бизнес-плана/Закрыть оповещение'))
}

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр Дата'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Снять выделение в фильтре Дата'))

'Нажать "Применить"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре Дата'))

WebUI.delay(10)

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

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/3 квартал 2024'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/3 квартал 2024'))

WebUI.click(findTestObject('Выполнение бизнес-плана/2 квартал 2023 список'))

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Апрель'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Апрель'))

'Проскроллить до заголовка фильтра "ДЗО"'
WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Заголовок фильтра ДЗО'), 30)

'Нажать "Применить"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре Дата'))

WebUI.delay(10)

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

WebUI.click(findTestObject('Выполнение бизнес-плана/Раскрыть список ПАО Россети в фильтре ДЗО'))

WebUI.click(findTestObject('Выполнение бизнес-плана/Раскрыть список РаспредКомплекс в фильтре ДЗО'))

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Россети Юг'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Юг'))

Change(todaysDate)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Юг'), 0)

WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Юг'))

WebUI.scrollToElement(findTestObject('Общие объекты/ВМЭС'), 30)

WebUI.click(findTestObject('Общие объекты/ВМЭС'))

Change(todaysDate)

WebUI.scrollToElement(findTestObject('Общие объекты/Астраханьэнерго'), 30)

WebUI.click(findTestObject('Общие объекты/Астраханьэнерго'))

Change(todaysDate)

WebUI.scrollToElement(findTestObject('Общие объекты/Волгоградэнерго'), 30)

WebUI.click(findTestObject('Общие объекты/Волгоградэнерго'))

Change(todaysDate)

WebUI.scrollToElement(findTestObject('Общие объекты/Калмэнерго'), 30)

WebUI.click(findTestObject('Общие объекты/Калмэнерго'))

Change(todaysDate)

WebUI.scrollToElement(findTestObject('Общие объекты/Ростовэнерго'), 30)

WebUI.click(findTestObject('Общие объекты/Ростовэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Заголовок фильтра ДЗО'), 30)

WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре ДЗО'))

Test(todaysDate)

WebUI.closeBrowser()

static def Change(def todaysDate) {
    'Проскроллить до заголовка фильтра "ДЗО"'
    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Заголовок фильтра ДЗО'), 30)

    'Нажать "Применить"'
    WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре ДЗО'))

    Test(todaysDate)

    'Открыть фильтр "ДЗО"'
    WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр ДЗО'))

    'Нажать "Снять выделение"'
    WebUI.click(findTestObject('Выполнение бизнес-плана/Снять выделение в фильтре ДЗО'))
}

static def Test(def todaysDate) {
    if (WebUI.verifyTextNotPresent('нет данных', false) == true) {
        if (WebUI.verifyTextNotPresent('Ошибка запроса данных', false) == true) {
            if (WebUI.verifyTextNotPresent('Произошла ошибка при выполнении пользовательского кода', false) == true) {
                if (WebUI.verifyTextNotPresent('У виджета нет данных', false) == true) {
                    if (WebUI.verifyTextNotPresent('У виджета нет данных', false) == true) {
                    } else {
                        WriteToExcel(todaysDate)
                    }
                } else {
                    WriteToExcel(todaysDate)
                }
            } else {
                WriteToExcel(todaysDate)
            }
        } else {
            WriteToExcel(todaysDate)
        }
    } else {
        WriteToExcel(todaysDate)
    }
}

static def WriteToExcel(def todaysDate) {
    String sheetName = 'Sheet1'

    def data = findTestData('PlanFact')

    int n = data.getRowNumbers() + 1

    String dZO = WebUI.getText(findTestObject('Выполнение бизнес-плана/Фильтр ДЗО'))

    int i = dZO.indexOf(' - ')

    String dZO1

    String dZO2

    String dZO3

    String dZO4

    if (i > -1) {
        dZO1 = dZO.substring(0, i)

        dZO1 = dZO1.trim()

        println('dZO1:' + dZO1)

        i = (dZO1.length() + 2)

        dZO = dZO.substring(i)

        dZO = dZO.trim()

        println(dZO)

        i = dZO.indexOf(' - ')

        if (i > -1) {
            dZO2 = dZO.substring(0, i)

            dZO2 = dZO2.trim()

            println('dZO2:' + dZO2)

            i = (dZO2.length() + 2)

            dZO = dZO.substring(i)

            dZO = dZO.trim()

            println(dZO)

            i = dZO.indexOf(' - ')

            if (i > -1) {
                dZO3 = dZO.substring(0, i)

                dZO3 = dZO3.trim()

                println('dZO3:' + dZO3)

                i = (dZO3.length() + 2)

                dZO = dZO.substring(i)

                dZO = dZO.trim()

                println(dZO)

                dZO4 = dZO

                println('dZO4:' + dZO4)
            } else {
                dZO3 = dZO

                dZO4 = ''
            }
        } else {
            dZO2 = dZO

            dZO3 = ''

            dZO4 = ''
        }
    } else {
        dZO1 = dZO

        dZO2 = ''

        dZO3 = ''

        dZO4 = ''
    }
    
    String date = WebUI.getText(findTestObject('Выполнение бизнес-плана/Фильтр Дата'))

    println(date)

    String dashboardName = 'Выполнение бизнес-плана'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO1)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, dZO2)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, dZO3)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, dZO4)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, date)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, todaysDate)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

