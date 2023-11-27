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

Date date = new Date()

String todaysDate = date.format('dd.MM.yyyy')

String typeOfData

String otobrajeniyeDannyh

println(todaysDate)

WebUI.openBrowser('')

int run = 1

for (run = 1; run < 3; run++) {
    Test(run, todaysDate, typeOfData, otobrajeniyeDannyh)
}

//Notice(run)
WebUI.closeBrowser()

WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 3))

Autorization(run)

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

WebUI.scrollToElement(findTestObject('Факторный анализ/2023 список'), 30)

WebUI.click(findTestObject('Факторный анализ/2023 список'))

WebUI.scrollToElement(findTestObject('Факторный анализ/1 квартал 2023 список'), 30)

'Проскроллить до элемента 2022'
WebUI.click(findTestObject('Факторный анализ/1 квартал 2023 выбрать'), FailureHandling.CONTINUE_ON_FAILURE)

'Проскроллить до элемента 2022'
WebUI.click(findTestObject('Факторный анализ/2 квартал 2023'), FailureHandling.CONTINUE_ON_FAILURE)

'Проскроллить до элемента 2022'
WebUI.click(findTestObject('Факторный анализ/3 квартал 2023'), FailureHandling.CONTINUE_ON_FAILURE)

'Проскроллить до заголовка фильтра "Дата"'
WebUI.scrollToElement(findTestObject('Факторный анализ/Заголовок дашборда'), 30)

'Нажать "Применить"'
WebUI.click(findTestObject('Факторный анализ/Применить в фильтре Дата'))

String a1 = WebUI.getText(findTestObject('Факторный анализ/span1 Блок руководителя'))

String a2 = WebUI.getText(findTestObject('Факторный анализ/span2 Блок руководителя'))

String a3

if (run == 1) {
    a3 = WebUI.getText(findTestObject('Факторный анализ/График Всего отклонения по факторам Блок руководителя'))
} else {
    WebUI.click(findTestObject('Факторный анализ/Переключить отображение с филиала на месяц'))

    a3 = WebUI.getText(findTestObject('Факторный анализ/График Всего отклонения по факторам Блок руководителя'))
}

println(a1)

println(a3)

WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 11))

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Факторный анализ/Фильтр Дата Выручка'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Факторный анализ/Снять выделение в фильтре Дата Выручка'))

'Нажать "Применить"'
WebUI.click(findTestObject('Факторный анализ/Применить в фильтре Дата Выручка'))

WebUI.delay(10)

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Факторный анализ/Фильтр Дата Выручка'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Факторный анализ/Снять выделение в фильтре Дата Выручка'))

WebUI.scrollToElement(findTestObject('Факторный анализ/2023 список Выручка'), 30)

WebUI.click(findTestObject('Факторный анализ/2023 список Выручка'))

WebUI.scrollToElement(findTestObject('Факторный анализ/1 квартал 2023 список Выручка'), 30)

WebUI.click(findTestObject('Факторный анализ/1 квартал 2023 выбрать Выручка'))

WebUI.click(findTestObject('Факторный анализ/2 квартал 2023 Выручка'))

WebUI.click(findTestObject('Факторный анализ/3 квартал 2023 Выручка'))

'Проскроллить до заголовка фильтра "Дата"'
WebUI.scrollToElement(findTestObject('Факторный анализ/Заголовок дашборда Выручка'), 30)

'Нажать "Применить"'
WebUI.click(findTestObject('Факторный анализ/Применить в фильтре Дата Выручка'))

String b1 = WebUI.getText(findTestObject('Факторный анализ/span1 Выручка'))

String b2 = WebUI.getText(findTestObject('Факторный анализ/span2 Выручка'))

String b3

if (run == 1) {
    b3 = WebUI.getText(findTestObject('Факторный анализ/График Всего отклонения по факторам Выручка'))
} else {
    WebUI.click(findTestObject('Факторный анализ/Переключить отображение с филиала на месяц'))

    b3 = WebUI.getText(findTestObject('Факторный анализ/График Всего отклонения по факторам Выручка'))
}

println(b1)

println(b3)

if (WebUI.verifyEqual(a1, b1) == true) {
} else {
    typeOfData = 'Отклонение (объём услуг)'

    if (run == 1) {
        otobrajeniyeDannyh = 'Филиал'

        WriteToExcel(todaysDate, typeOfData, otobrajeniyeDannyh)
    } else {
        otobrajeniyeDannyh = 'Месяц'

        WriteToExcel(todaysDate, typeOfData, otobrajeniyeDannyh)
    }
}

if (WebUI.verifyEqual(a2, b2) == true) {
} else {
    typeOfData = 'Отклонение (средний тариф)'

    if (run == 1) {
        otobrajeniyeDannyh = 'Филиал'

        WriteToExcel(todaysDate, typeOfData, otobrajeniyeDannyh)
    } else {
        otobrajeniyeDannyh = 'Месяц'

        WriteToExcel(todaysDate, typeOfData, otobrajeniyeDannyh)
    }
}

if (WebUI.verifyEqual(a3, b3) == true) {
} else {
    typeOfData = 'Всего отклонения по факторам'

    if (run == 1) {
        otobrajeniyeDannyh = 'Филиал'

        WriteToExcel(todaysDate, typeOfData, otobrajeniyeDannyh)
    } else {
        otobrajeniyeDannyh = 'Месяц'

        WriteToExcel(todaysDate, typeOfData, otobrajeniyeDannyh)
    }
}

