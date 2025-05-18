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

WebUI.delay(50)

ZakrytOpoveshenie()

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр Дата'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Снять выделение в фильтре Дата'))

'Нажать "Применить"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре Дата'))

ZakrytOpoveshenie()

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр Дата'))

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/2024 список'), 30)

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/2024 список'))

'Выбрать 1 квартал 2022'
WebUI.scrollToElement(findTestObject('null'), 30)

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('null'))

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/Январь 2024'))

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/Февраль 2024'))

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/Март 2024'))

'Выбрать 1 квартал 2022'
WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Март 2024'), 30)

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/2 квартал 2024 список'))

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/Апрель 2024'))

'Проскроллить до заголовка фильтра "Дата"'
WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Заголовок дашборда'), 30)

'Нажать "Применить"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре Дата'))

WebUI.delay(50)

ZakrytOpoveshenie()

'Открыть фильтр "ДЗО"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр ДЗО'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Снять выделение в фильтре ДЗО'))

'Выбрать ПАО Россети'
WebUI.click(findTestObject('Выполнение бизнес-плана/ПАО Россети'))

'Нажать "Применить"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре ДЗО'))

WebUI.delay(50)

int i

String a = WebUI.getText(findTestObject('Выполнение бизнес-плана/Итого'))

i = a.indexOf('План')

a = a.substring(0, i)

a = a.trim()

println(a)

String a00 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan1'))

String a01 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact1'))

String a02 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan2'))

String a03 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact2'))

String a04 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan3'))

String a05 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact3'))

String a06 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan4'))

String a07 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact4'))

String a08 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan5'))

String a09 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact5'))

String a10 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan6'))

String a11 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact6'))

String a12 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan7'))

String a13 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact7'))

String a14 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan8'))

String a15 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact8'))

String a16 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan9'))

String a17 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact9'))

String a18 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan10'))

String a19 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact10'))

String a20 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan11'))

String a21 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact11'))

String a22 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan12'))

String a23 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact12'))

String a24 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan13'))

String a25 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact13'))

String a26 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan14'))

String a27 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact14'))

String a28 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan15'))

String a29 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact15'))

String a30 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan16'))

String a31 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact16'))

String a32 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanPlan17'))

String a33 = WebUI.getText(findTestObject('Выполнение бизнес-плана/spanFact17'))

String a2 = WebUI.getText(findTestObject('Выполнение бизнес-плана/divTable'))

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

WebUI.delay(50)

ZakrytOpoveshenie()

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Фильтр Дата'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Снять выделение в фильтре Дата'))

'Нажать "Применить"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Применить в фильтре Дата'))

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Фильтр Дата'))

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/2024 список'), 30)

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/2024 список'))

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/1 квартал 2024 список'), 30)

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/1 квартал 2024 список'))

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Январь 2024'))

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Февраль 2024'))

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Март 2024'))

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/2 квартал 2024 список'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/2 квартал 2024 список'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Апрель 2024'), FailureHandling.CONTINUE_ON_FAILURE)

'Проскроллить до заголовка фильтра "Дата"'
WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Заголовок дашборда'), 30)

'Нажать "Применить"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Применить в фильтре Дата'))

WebUI.delay(50)

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

WebUI.delay(50)

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

if (WebUI.verifyEqual(a00, b00) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a01, b01) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a02, b02) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a03, b03) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a04, b04) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a05, b05) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a06, b06) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a07, b07) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a08, b08) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a09, b09) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a10, b10) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a11, b11) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a12, b12) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a13, b13) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a14, b14) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a15, b15) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a16, b16) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a17, b17) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a18, b18) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a19, b19) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a20, b20) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a21, b21) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a22, b22) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a23, b23) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a24, b24) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a25, b25) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a26, b26) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a27, b27) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a28, b28) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a29, b29) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a30, b30) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a31, b31) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a32, b32) == true) {
} else {
    widget = 'Отклонения фактического уровня потерь от бизнес-плана'

    WriteToExcel(todaysDate, widget)
}

if (WebUI.verifyEqual(a33, b33) == true) {
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

