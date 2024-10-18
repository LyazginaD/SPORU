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

'run - показывает, в каком положении переключатель процентов. 1 - Млн, 2 - Проценты'
int run = 1

'vir - показывает, что выбрано в фильтре Выручка. 1 = Все, 2 = Итого, 3 = Внутренний оборот'
int vir = 1

'block - показывает, из какого блока дашборд проверяется. 1 = Блок Руководителя, 2 = Выручка'
int block = 1

String vidget

String nameOfBlock

String typeOfData

String viruchka

Double a

Double b

String x

String y

String dZO = 'ПАО Россети'

for (run = 1; run < 3; run++) {
    ViruchkaChange(run, vir, block, nameOfBlock, typeOfData, viruchka, vidget, todaysDate, a, b, dZO, x, y)
}

static def ViruchkaChange(def run, def vir, def block, def nameOfBlock, def typeOfData, def viruchka, def vidget, def todaysDate, def a, def b, def dZO, def x, def y) {
    for (vir = 1; vir < 4; vir++) {
        Blocks(run, vir, block, nameOfBlock, typeOfData, viruchka, vidget, todaysDate, a, b, dZO, x, y)
    }
}

static def Blocks(def run, def vir, def block, def nameOfBlock, def typeOfData, def viruchka, def vidget, def todaysDate, def a, def b, def dZO, def x, def y) {
    int i

    String perc = ''

    String a1

    String a2

    String a30

    String a31

    String a32

    String a33

    String a34

    String a35

    String a36

    String a37

    String a38

    String a39

    String a310

    String a311

    String a312

    String a313

    String a314

    String a315

    String a316

    String a317

    String b1

    String b2

    String b30

    String b31

    String b32

    String b33

    String b34

    String b35

    String b36

    String b37

    String b38

    String b39

    String b310

    String b311

    String b312

    String b313

    String b314

    String b315

    String b316

    String b317

    block = 1

    nameOfBlock = ''

    PreSettings(run, vir, block, nameOfBlock, typeOfData, todaysDate)

    Rosseti(nameOfBlock)

    if (run == 2) {
        perc = ' Perc'
    }
    
    if ((vir == 1) || (vir == 2)) {
        a1 = WebUI.getText(findTestObject('Выручка в рублях/График План'))
    } else {
        a1 = WebUI.getText(findTestObject('Выручка в рублях/vir3Plan'))
    }
    
    if ((vir == 1) || (vir == 2)) {
        a2 = WebUI.getText(findTestObject('Выручка в рублях/График Факт'))
    } else {
        a2 = WebUI.getText(findTestObject('Выручка в рублях/vir3Fact'))
    }
    
    a30 = WebUI.getText(findTestObject('Выручка в рублях/span1' + perc))

    i = a30.indexOf('млн.руб.')

    if (i > -1) {
        a30 = a30.substring(0, i)

        a30 = a30.replaceAll(' ', '')
    }
    
    if (a30.contains('%')) {
        a30 = a30.replaceAll('%', '')
    }
    
    a30 = a30.replace('%', '').replace(',', '.').trim()

    println('a30: ' + a30)

    if ((vir == 1) || (vir == 2)) {
        a31 = WebUI.getText(findTestObject('Выручка в рублях/span2' + perc)).replace('%', '').replace(',', '.').trim()
    } else {
        a31 = WebUI.getText(findTestObject('Выручка в рублях/span15' + perc)).replace('%', '').replace(',', '.').trim()
    }
    
    if ((vir == 1) || (vir == 2)) {
        a32 = WebUI.getText(findTestObject('Выручка в рублях/span3' + perc)).replace('%', '').replace(',', '.').trim()
    } else {
        a32 = WebUI.getText(findTestObject('Выручка в рублях/span16' + perc)).replace('%', '').replace(',', '.').trim()
    }
    
    if ((vir == 1) || (vir == 2)) {
        a33 = WebUI.getText(findTestObject('Выручка в рублях/span4' + perc)).replace('%', '').replace(',', '.').trim()

        a34 = WebUI.getText(findTestObject('Выручка в рублях/span5' + perc)).replace('%', '').replace(',', '.').trim()

        a35 = WebUI.getText(findTestObject('Выручка в рублях/span6' + perc)).replace('%', '').replace(',', '.').trim()

        a36 = WebUI.getText(findTestObject('Выручка в рублях/span7' + perc)).replace('%', '').replace(',', '.').trim()

        a37 = WebUI.getText(findTestObject('Выручка в рублях/span8' + perc)).replace('%', '').replace(',', '.').trim()
    } else {
        a37 = WebUI.getText(findTestObject('Выручка в рублях/span17' + perc)).replace('%', '').replace(',', '.').trim()
    }
    
    if ((vir == 1) || (vir == 2)) {
        a38 = WebUI.getText(findTestObject('Выручка в рублях/span9' + perc)).replace('%', '').replace(',', '.').trim()

        a39 = WebUI.getText(findTestObject('Выручка в рублях/span10' + perc)).replace('%', '').replace(',', '.').trim()

        a310 = WebUI.getText(findTestObject('Выручка в рублях/span11' + perc)).replace('%', '').replace(',', '.').trim()

        a311 = WebUI.getText(findTestObject('Выручка в рублях/span12' + perc)).replace('%', '').replace(',', '.').trim()

        a312 = WebUI.getText(findTestObject('Выручка в рублях/span13' + perc)).replace('%', '').replace(',', '.').trim()

        a313 = WebUI.getText(findTestObject('Выручка в рублях/span14' + perc)).replace('%', '').replace(',', '.').trim()

        a314 = WebUI.getText(findTestObject('Выручка в рублях/span15' + perc)).replace('%', '').replace(',', '.').trim()

        a315 = WebUI.getText(findTestObject('Выручка в рублях/span16' + perc)).replace('%', '').replace(',', '.').trim()

        a316 = WebUI.getText(findTestObject('Выручка в рублях/span17' + perc)).replace('%', '').replace(',', '.').trim()
    } else {
        a316 = WebUI.getText(findTestObject('Выручка в рублях/span18' + perc)).replace('%', '').replace(',', '.').trim()
    }
    
    if ((vir == 1) || (vir == 2)) {
        a317 = WebUI.getText(findTestObject('Выручка в рублях/span18' + perc)).replace('%', '').replace(',', '.').trim()
    }
    
    block = 2

    nameOfBlock = ' Выручка'

    PreSettings(run, vir, block, nameOfBlock, typeOfData, todaysDate)

    Rosseti(nameOfBlock)

    if ((vir == 1) || (vir == 2)) {
        b1 = WebUI.getText(findTestObject('Выручка в рублях/График План Выручка'))
    } else {
        b1 = WebUI.getText(findTestObject('Выручка в рублях/vir3Plan Выручка'))
    }
    
    if ((vir == 1) || (vir == 2)) {
        b2 = WebUI.getText(findTestObject('Выручка в рублях/График Факт Выручка'))
    } else {
        b2 = WebUI.getText(findTestObject('Выручка в рублях/vir3Fact Выручка'))
    }
    
    b30 = WebUI.getText(findTestObject('Выручка в рублях/span1' + perc))

    i = b30.indexOf('млн.руб.')

    if (i > -1) {
        b30 = b30.substring(0, i)

        b30 = b30.replaceAll(' ', '')
    }
    
    if (b30.contains('%')) {
        b30 = b30.replaceAll('%', '')
    }
    
    b30 = b30.replace('%', '').replace(',', '.').trim()

    println('b30: ' + b30)

    if ((vir == 1) || (vir == 2)) {
        b31 = WebUI.getText(findTestObject('Выручка в рублях/span2' + perc)).replace('%', '').replace(',', '.').trim()
    } else {
        b31 = WebUI.getText(findTestObject('Выручка в рублях/span15' + perc)).replace('%', '').replace(',', '.').trim()
    }
    
    if ((vir == 1) || (vir == 2)) {
        b32 = WebUI.getText(findTestObject('Выручка в рублях/span3' + perc)).replace('%', '').replace(',', '.').trim()
    } else {
        b32 = WebUI.getText(findTestObject('Выручка в рублях/span16' + perc)).replace('%', '').replace(',', '.').trim()
    }
    
    if ((vir == 1) || (vir == 2)) {
        b33 = WebUI.getText(findTestObject('Выручка в рублях/span4' + perc)).replace('%', '').replace(',', '.').trim()

        b34 = WebUI.getText(findTestObject('Выручка в рублях/span5' + perc)).replace('%', '').replace(',', '.').trim()

        b35 = WebUI.getText(findTestObject('Выручка в рублях/span6' + perc)).replace('%', '').replace(',', '.').trim()

        b36 = WebUI.getText(findTestObject('Выручка в рублях/span7' + perc)).replace('%', '').replace(',', '.').trim()

        b37 = WebUI.getText(findTestObject('Выручка в рублях/span8' + perc)).replace('%', '').replace(',', '.').trim()
    } else {
        b37 = WebUI.getText(findTestObject('Выручка в рублях/span17' + perc)).replace('%', '').replace(',', '.').trim()
    }
    
    if ((vir == 1) || (vir == 2)) {
        b38 = WebUI.getText(findTestObject('Выручка в рублях/span9' + perc)).replace('%', '').replace(',', '.').trim()

        b39 = WebUI.getText(findTestObject('Выручка в рублях/span10' + perc)).replace('%', '').replace(',', '.').trim()

        b310 = WebUI.getText(findTestObject('Выручка в рублях/span11' + perc)).replace('%', '').replace(',', '.').trim()

        b311 = WebUI.getText(findTestObject('Выручка в рублях/span12' + perc)).replace('%', '').replace(',', '.').trim()

        b312 = WebUI.getText(findTestObject('Выручка в рублях/span13' + perc)).replace('%', '').replace(',', '.').trim()

        b313 = WebUI.getText(findTestObject('Выручка в рублях/span14' + perc)).replace('%', '').replace(',', '.').trim()

        b314 = WebUI.getText(findTestObject('Выручка в рублях/span15' + perc)).replace('%', '').replace(',', '.').trim()

        b315 = WebUI.getText(findTestObject('Выручка в рублях/span16' + perc)).replace('%', '').replace(',', '.').trim()

        b316 = WebUI.getText(findTestObject('Выручка в рублях/span17' + perc)).replace('%', '').replace(',', '.').trim()
    } else {
        b316 = WebUI.getText(findTestObject('Выручка в рублях/span18' + perc)).replace('%', '').replace(',', '.').trim()
    }
    
    if ((vir == 1) || (vir == 2)) {
        b317 = WebUI.getText(findTestObject('Выручка в рублях/span18' + perc)).replace('%', '').replace(',', '.').trim()
    }
    
    dZO = 'ПАО Россети'

    if (WebUI.verifyEqual(a1, b1) == false) {
        vidget = 'План'

        a = a1.toDouble()

        b = b1.toDouble()

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)
    }
    
    if (WebUI.verifyEqual(a2, b2) == false) {
        vidget = 'Факт'

        a = a2.toDouble()

        b = b2.toDouble()

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)
    }
    
    vidget = 'Отклонения'

    if (WebUI.verifyEqual(a30, b30) == false) {
        a = a30.toDouble()

        b = b30.toDouble()

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)
    }
    
    dZO = 'АО «Тываэнерго»'

    if (WebUI.verifyEqual(a31, b31) == false) {
        a = a31.toDouble()

        b = b31.toDouble()

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)
    }
    
    dZO = 'АО «Чеченэнерго»'

    if (WebUI.verifyEqual(a32, b32) == false) {
        a = a32.toDouble()

        b = b32.toDouble()

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)
    }
    
    dZO = 'Россети Волга'

    if (WebUI.verifyEqual(a33, b33) == false) {
        a = a33.toDouble()

        b = b33.toDouble()

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)
    }
    
    dZO = 'Россети Кубань'

    if (WebUI.verifyEqual(a34, b34) == false) {
        a = a34.toDouble()

        b = b34.toDouble()

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)
    }
    
    dZO = 'Россети Ленэнерго (ГК)'

    if (WebUI.verifyEqual(a35, b35) == false) {
        a = a35.toDouble()

        b = b35.toDouble()

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)
    }
    
    dZO = 'Россети Московский регион'

    if (WebUI.verifyEqual(a36, b36) == false) {
        a = a36.toDouble()

        b = b36.toDouble()

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)
    }
    
    dZO = 'Россети Северный Кавказ (ГК)'

    if (WebUI.verifyEqual(a37, b37) == false) {
        a = a37.toDouble()

        b = b37.toDouble()

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)
    }
    
    dZO = 'Россети Северо-Запад'

    if (WebUI.verifyEqual(a38, b38) == false) {
        a = a38.toDouble()

        b = b38.toDouble()

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)
    }
    
    dZO = 'Россети Сибирь (ГК)'

    if (WebUI.verifyEqual(a39, b39) == false) {
        a = a39.toDouble()

        b = b39.toDouble()

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)
    }
    
    dZO = 'Россети Томск'

    if (WebUI.verifyEqual(a310, b310) == false) {
        a = a310.toDouble()

        b = b310.toDouble()

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)
    }
    
    dZO = 'Россети Тюмень'

    if (WebUI.verifyEqual(a311, b311) == false) {
        a = a311.toDouble()

        b = b311.toDouble()

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)
    }
    
    dZO = 'Россети Урал (ГК)'

    if (WebUI.verifyEqual(a312, b312) == false) {
        a = a312.toDouble()

        b = b312.toDouble()

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)
    }
    
    dZO = 'Россети ФСК ЕЭС'

    if (WebUI.verifyEqual(a313, b313) == false) {
        a = a313.toDouble()

        b = b313.toDouble()

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)
    }
    
    dZO = 'Россети Центр'

    if (WebUI.verifyEqual(a314, b314) == false) {
        a = a314.toDouble()

        b = b314.toDouble()

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)
    }
    
    dZO = 'Россети Центр и Приволжье (ГК)'

    if (WebUI.verifyEqual(a315, b315) == false) {
        a = a315.toDouble()

        b = b315.toDouble()

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)
    }
    
    dZO = 'Россети Юг (ГК)'

    if (WebUI.verifyEqual(a316, b316) == false) {
        a = a316.toDouble()

        b = b316.toDouble()

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)
    }
    
    dZO = 'Россети Янтарь'

    if (WebUI.verifyEqual(a317, b317) == false) {
        a = a317.toDouble()

        b = b317.toDouble()

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)
    }
    
    WebUI.closeBrowser()
}

static void Rosseti(def nameOfBlock) {
    println('nameOfBlock:' + nameOfBlock)

    'Выбрать ПАО Россети'
    WebUI.click(findTestObject('Выручка в рублях/ПАО Россети' + nameOfBlock))

    'Нажать "Применить"'
    WebUI.click(findTestObject('Выручка в рублях/Применить в фильтре ДЗО' + nameOfBlock))
}

static def PreSettings(def run, def vir, def block, def nameOfBlock, def typeOfData, def todaysDate) {
    WebUI.openBrowser('')

    WebUI.refresh()

    WebUI.delay(50)

    println('run:' + run)

    println('vir:' + vir)

    println('block:' + block)

    if (block == 1) {
        nameOfBlock = ''
    } else {
        nameOfBlock = ' Выручка'
    }
    
    println('nameOfBlock:' + nameOfBlock)

    println('typeOfData:' + typeOfData)

    println('todaysDate:' + todaysDate)

    Autorization(block, nameOfBlock)

    'Раскрыть фильтр "Дата"'
    WebUI.click(findTestObject('Выручка в рублях/Фильтр Период' + nameOfBlock))

    'Нажать "Снять выделение"'
    WebUI.click(findTestObject('Выручка в рублях/Снять выделение в фильтре Дата' + nameOfBlock))

    'Нажать "Применить"'
    WebUI.click(findTestObject('Выручка в рублях/Применить в фильтре Дата' + nameOfBlock))

    WebUI.delay(50)

    'Раскрыть фильтр "Дата"'
    WebUI.click(findTestObject('Выручка в рублях/Фильтр Период' + nameOfBlock))

    'Нажать "Снять выделение"'
    WebUI.click(findTestObject('Выручка в рублях/Снять выделение в фильтре Дата' + nameOfBlock))

    WebUI.scrollToElement(findTestObject('Выручка в рублях/2024 список' + nameOfBlock), 30)

    WebUI.click(findTestObject('Выручка в рублях/2024 список' + nameOfBlock))

    WebUI.scrollToElement(findTestObject('Выручка в рублях/1 квартал 2024 выбрать' + nameOfBlock), 30)

    WebUI.click(findTestObject('Выручка в рублях/1 квартал 2024 выбрать' + nameOfBlock))

    WebUI.scrollToElement(findTestObject('Выручка в рублях/2 квартал 2024 выбрать' + nameOfBlock), 30)

    WebUI.click(findTestObject('Выручка в рублях/2 квартал 2024 выбрать' + nameOfBlock))

    WebUI.scrollToElement(findTestObject('Выручка в рублях/3 квартал 2024 список' + nameOfBlock), 30)

    WebUI.click(findTestObject('Выручка в рублях/3 квартал 2024 список' + nameOfBlock))

    WebUI.click(findTestObject('Выручка в рублях/Июль 2024' + nameOfBlock))

    WebUI.scrollToElement(findTestObject('Выручка в рублях/Август 2024' + nameOfBlock), 30)

    WebUI.click(findTestObject('Выручка в рублях/Август 2024' + nameOfBlock))

    'Проскроллить до заголовка дашборда'
    WebUI.scrollToElement(findTestObject('Выручка в рублях/Заголовок дашборда' + nameOfBlock), 30)

    'Нажать "Применить"'
    WebUI.click(findTestObject('Выручка в рублях/Применить в фильтре Дата' + nameOfBlock))

    WebUI.delay(50)

    'Открыть фильтр "ДЗО"'
    WebUI.click(findTestObject('Выручка в рублях/Фильтр ДЗО' + nameOfBlock))

    'Нажать "Снять выделение в фильтре ДЗО"'
    WebUI.click(findTestObject('Выручка в рублях/Снять выделение в фильтре ДЗО' + nameOfBlock))

    'Нажать "Применить"'
    WebUI.click(findTestObject('Выручка в рублях/Применить в фильтре ДЗО' + nameOfBlock))

    WebUI.delay(50)

    Tumbler(run, vir, block, nameOfBlock)

    'Открыть фильтр "ДЗО"'
    WebUI.click(findTestObject('Выручка в рублях/Фильтр ДЗО' + nameOfBlock))
}

static void Autorization(def block, def nameOfBlock) {
	int i
	int ii
	int urlData
	String searchWord
	String urlText
    println('block:' + block)

    if (block == 1) {
        nameOfBlock = ''
    } else {
        WebUI.delay(45)

        nameOfBlock = ' Выручка'
    }
    
    println('nameOfBlock:' + nameOfBlock)

    if (block == 1) {
		urlData = 2

        WebUI.delay(45)
    } else {
		urlData = 9

        WebUI.delay(45)
    }
    
	WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, urlData))
	
	urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))
	searchWord = 'Вход'
	if (urlText.contains('ошибка') || (urlText.contains(searchWord) == false)) {
		for (urlText.contains(searchWord) == false; i < 10; ii++) {
			i = (i + 1)

			WebUI.refresh()

			WebUI.delay(45)

			WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, urlData))

			WebUI.delay(45)

			urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))
		}
	}
	
    if (WebUI.verifyElementPresent(findTestObject('Страница авторизации/button_'), 30) == true) {
        WebUI.setText(findTestObject('Страница авторизации/input__username'), findTestData('PlanFact').getValue(8, 1))

        WebUI.setText(findTestObject('Страница авторизации/input__password'), findTestData('PlanFact').getValue(9, 1))

        WebUI.click(findTestObject('Страница авторизации/button_'))
		
		WebUI.delay(45)
    }
	
	urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))
	searchWord = 'а'
	if (urlText.contains('ошибка') || (urlText.contains(searchWord) == false)) {
		for (urlText.contains(searchWord) == false; i < 10; ii++) {
			i = (i + 1)

			WebUI.refresh()

			WebUI.delay(45)

			WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, urlData))

			WebUI.delay(45)

			urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))
		}
	}
    WebUI.delay(45)
	
    if (block == 2) {
        String opoveshenie = WebUI.getText(findTestObject('Выручка в рублях/Просьба обратить внимание'))

        if (opoveshenie == 'Просьба обратить внимание') {
            WebUI.click(findTestObject('Выручка в рублях/Закрыть оповещение'))

            WebUI.delay(50)
        
        }
    }
}

static def Tumbler(def run, def vir, def block, def nameOfBlock) {
    println('run:' + run)

    println('vir:' + vir)

    println('block:' + block)

    println('nameOfBlock:' + nameOfBlock)

    if (vir == 1) {
        if (run == 2) {
            WebUI.click(findTestObject('Выручка в рублях/Переключить отображение с млн на проценты Выручка в рублях' + nameOfBlock))
        }
    } else if (vir == 2) {
        if (run == 2) {
            WebUI.click(findTestObject('Выручка в рублях/Переключить отображение с млн на проценты Выручка в рублях' + nameOfBlock))
        }
        
        WebUI.click(findTestObject('Выручка в рублях/Фильтр Выручка' + nameOfBlock))

        WebUI.click(findTestObject('Выручка в рублях/Итого в фильтре Выручка' + nameOfBlock))

        WebUI.click(findTestObject('Выручка в рублях/Применить в фильтре Выручка' + nameOfBlock))
    } else if (vir == 3) {
        if (run == 2) {
            WebUI.click(findTestObject('Выручка в рублях/Переключить отображение с млн на проценты Выручка в рублях' + nameOfBlock))
        }
        
        WebUI.click(findTestObject('Выручка в рублях/Фильтр Выручка' + nameOfBlock))

        WebUI.click(findTestObject('Выручка в рублях/Внутренний оборот в фильтре Выручка' + nameOfBlock))

        WebUI.click(findTestObject('Выручка в рублях/Применить в фильтре Выручка' + nameOfBlock))
    }
}

static def WriteToExcel(def todaysDate, def run, def vir, def block, def typeOfData, def viruchka, def vidget, def nameOfBlock, def a, def b, def dZO) {
    println(run)

    if (run == 1) {
        typeOfData = 'Млн'
    } else if (run == 2) {
        typeOfData = 'Проценты'
    }
    
    println('todaysDate:' + todaysDate)

    println('typeOfData:' + typeOfData)

    viruchka = WebUI.getText(findTestObject('Выручка в рублях/Фильтр Выручка' + nameOfBlock))

    println('viruchka' + viruchka)

    println('vidget' + vidget)

    println('a' + a)

    println('b' + b)

    String sheetName = 'Sheet1'

    def data = findTestData('PlanFact')

    int n = data.getRowNumbers() + 1

    String period = WebUI.getText(findTestObject('Выручка в рублях/Фильтр Период'))

    println(period)

    String dashboardName = 'Выручка в рублях'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, vidget)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, viruchka)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, typeOfData)

    if (a == null) {
        ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, '')
    } else {
        ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, a)
    }
    
    if (b == null) {
        ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, '')
    } else {
        ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, b)
    }
    
    ExcelKeywords.setValueToCellByIndex(sheet01, n, 7, period)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 8, todaysDate)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

