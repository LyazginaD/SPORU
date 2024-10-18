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

String dZO

int a

double fileperc

double pageperc

int pageInt

int fileInt

double pageDouble

double fileDouble

String typeOfData

int dzoNum = 0

int filialNum = 0

String urlText

String searchWord

int i

int ii

WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 1))

urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))

WebUI.delay(20)

searchWord = 'Вход'

if (urlText.contains(searchWord) == false) {
    for (urlText.contains(searchWord) == false; i < 4; ii++) {
        i = (i + 1)

        WebUI.refresh()

        WebUI.delay(20)

        WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 1))

        WebUI.delay(20)

        urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))
    }
}

WebUI.setText(findTestObject('Страница авторизации/input__username'), findTestData('PlanFact').getValue(8, 1))

WebUI.setText(findTestObject('Страница авторизации/input__password'), findTestData('PlanFact').getValue(9, 1))

WebUI.click(findTestObject('Страница авторизации/button_'))

WebUI.delay(50)

searchWord = 'ДЗО'

urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))

if (urlText.contains('ошибка') || (urlText.contains(searchWord) == false)) {
    for (urlText.contains(searchWord) == false; i < 4; ii++) {
        i = (i + 1)

        WebUI.refresh()

        WebUI.delay(20)

        WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 1))

        WebUI.delay(20)

        urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))
    }
}

ZakrytOpoveshenie()

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр Дата'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Снять выделение в фильтре Дата'))

'Нажать "Применить"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре Дата'))

WebUI.delay(50)

ZakrytOpoveshenie()

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр Дата'))

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/2024 список'), 30)

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/2024 список'))

'Выбрать 1 квартал 2022'
WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/1 квартал 2024 список'), 30)

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/1 квартал 2024 список'))

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/Январь 2024'))

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/Февраль 2024'))

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/Март 2024'))

'Выбрать 1 квартал 2022'
WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/2 квартал 2024'), 30)

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/2 квартал 2024'))

'Выбрать 1 квартал 2022'
WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/3 квартал 2024 список'), 30)

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/3 квартал 2024 список'), FailureHandling.CONTINUE_ON_FAILURE)

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/Июль 2024'))

'Выбрать 1 квартал 2022'
WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Август 2024'), 30)

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/Август 2024'))

'Проскроллить до заголовка фильтра "Дата"'
WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Заголовок дашборда'), 30)

'Нажать "Применить"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре Дата'))

WebUI.delay(50)

ZakrytOpoveshenie()

WebUI.delay(30)

'!'
OpenFilter()

'Выбрать ПАО Россети'
WebUI.click(findTestObject('Выполнение бизнес-плана/ПАО Россети'))

'Нажать "Применить"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре ДЗО'))

WebUI.delay(30)

String x1 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Список ДЗО старый'))

'___________________________________________________________________________________________________'
dZO = 'ПАО Россети'

a = 84

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)

dZO = 'Россети ФСК ЕЭС'

a = 83

if (x1.contains(dZO)) {
    dzoNum = (dzoNum + 1)

    println(dzoNum)

    Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
} else {
    NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
}

println(dzoNum)

dZO = 'РаспредКомплекс'

a = 82

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)

dZO = 'АО «Тываэнерго»'

a = 52

if (x1.contains(dZO)) {
    dzoNum = (dzoNum + 1)

    Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
} else {
    NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
}

println(dzoNum)

dZO = 'АО «Чеченэнерго»'

a = 72

if (x1.contains(dZO)) {
    dzoNum = (dzoNum + 1)

    Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
} else {
    NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
}

println(dzoNum)

a = 28

dZO = 'Россети Волга'

if (x1.contains(dZO)) {
    dzoNum = (dzoNum + 1)

    Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
} else {
    NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
}

println(dzoNum)

dZO = 'Россети Кубань'

a = 73

if (x1.contains(dZO)) {
    dzoNum = (dzoNum + 1)

    Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
} else {
    NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
}

println(dzoNum)

dZO = 'Россети Ленэнерго'

a = 77

if (x1.contains(dZO)) {
    dzoNum = (dzoNum + 1)

    Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
} else {
    NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
}

println(dzoNum)

dZO = 'Россети Московский регион'

a = 74

if (x1.contains(dZO)) {
    dzoNum = (dzoNum + 1)

    Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
} else {
    NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
}

println(dzoNum)

dZO = 'Россети Северный Кавказ'

a = 65

if (x1.contains(dZO)) {
    dzoNum = (dzoNum + 1)

    Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
} else {
    NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
}

println(dzoNum)

dZO = 'Россети Северо-Запад'

a = 36

if (x1.contains(dZO)) {
    dzoNum = (dzoNum + 1)

    Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
} else {
    NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
}

println(dzoNum)

dZO = 'Россети Сибирь'

a = 44

if (x1.contains(dZO)) {
    dzoNum = (dzoNum + 1)

    Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
} else {
    NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
}

println(dzoNum)

dZO = 'Россети Томск'

a = 53

if (x1.contains(dZO)) {
    dzoNum = (dzoNum + 1)

    Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
} else {
    NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
}

println(dzoNum)

dZO = 'Россети Тюмень'

a = 80

if (x1.contains(dZO)) {
    dzoNum = (dzoNum + 1)

    Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
} else {
    NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
}

println(dzoNum)

dZO = 'Россети Урал (ГК)'

a = 54

if (x1.contains(dZO)) {
    dzoNum = (dzoNum + 1)

    Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
} else {
    NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
}

println(dzoNum)

dZO = 'Россети Центр (ГК)'

a = 1

if (x1.contains(dZO)) {
    dzoNum = (dzoNum + 1)

    Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
} else {
    NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
}

println(dzoNum)

dZO = 'Россети Центр и Приволжье (ГК)'

a = 18

if (x1.contains(dZO)) {
    dzoNum = (dzoNum + 1)

    Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
} else {
    NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
}

println(dzoNum)

dZO = 'Россети Юг'

a = 59

if (x1.contains(dZO)) {
    dzoNum = (dzoNum + 1)

    Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
} else {
    NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
}

println(dzoNum)

dZO = 'Россети Янтарь'

a = 81

if (x1.contains(dZO)) {
    dzoNum = (dzoNum + 1)

    Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
} else {
    NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
}

println(dzoNum)

WebUI.closeBrowser()

static def Numbers(def a, def typeOfData, def todaysDate, def pageInt, def fileInt, def pageDouble, def fileDouble, def dZO, def dzoNum, def filialNum) {
    println(dzoNum)

    int planFact

    String page

    String page1

    String page2

    int filialNumberInRow

    String filialsDzoNames

    int numberOfFilials

    int numberOfSpaces

    String file

    String otpusk

    String poteri

    String dataFolder = 'Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/'

    String path

    String typeOfDataMain

    int fileOtpuskVSet

    int pageOtpuskVSet

    int filePoteri

    int pagePoteri

    int compare

    String b

    int i

    int ii

    String c

    int numberOfErrors = 0

    if (a == 82) {
        OpenFilter()

        WebUI.click(findTestObject('Выполнение бизнес-плана/Раскрыть список ПАО Россети в фильтре ДЗО'))

        WebUI.click(findTestObject('Выполнение бизнес-плана/РаспредКомплекс'))

        CloseFilter()

        WebUI.delay(5)
    }
    
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
    
    println(b)

    for (planFact = 1; planFact < 3; planFact++) {
        if (planFact == 1) {
            typeOfDataMain = 'Факт'

            otpusk = findTestData('PlanFact').getValue(5, a)

            poteri = findTestData('PlanFact').getValue(6, a)
        } else if (planFact == 2) {
            WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка План'))

            typeOfDataMain = 'План'

            otpusk = findTestData('PlanFact').getValue(2, a)

            poteri = findTestData('PlanFact').getValue(3, a)
        }
        
        otpusk = otpusk.replaceAll('\\s+', '')

        poteri = poteri.replaceAll('\\s+', '')

        typeOfData = (typeOfDataMain + ' Отпуск в сеть')

        if (a == 82) {
            path = (((dataFolder + typeOfData) + ' за отчётный период ') + 'РаспредКомплекс')
        } else if (a == 84) {
            path = (((dataFolder + typeOfData) + ' за отчётный период ') + 'ПАО Россети')
        } else if ((((((((((((((((a == 52) || (a == 72)) || (a == 28)) || (a == 73)) || (a == 77)) || (a == 74)) || (a == 
        65)) || (a == 36)) || (a == 44)) || (a == 53)) || (a == 80)) || (a == 54)) || (a == 1)) || (a == 18)) || (a == 59)) || 
        (a == 81)) {
            path = ((((dataFolder + 'Table Data/') + typeOfData) + ' за отчётный период ') + dzoNum)
        } else {
            path = (((dataFolder + typeOfData) + ' за отчётный период ') + b)
        }
        
        println(path)

        page = WebUI.getText(findTestObject(path))

        page = page.replaceAll('\\s+', '')

        fileOtpuskVSet = otpusk.toInteger()

        pageOtpuskVSet = page.toInteger()

        typeOfData = (typeOfDataMain + ' Потери')

        if (a == 82) {
            path = (((dataFolder + typeOfData) + ' за отчётный период ') + 'РаспредКомплекс')
        } else if (a == 84) {
            path = (((dataFolder + typeOfData) + ' за отчётный период ') + 'ПАО Россети')
        } else if ((((((((((((((((a == 52) || (a == 72)) || (a == 28)) || (a == 73)) || (a == 77)) || (a == 74)) || (a == 
        65)) || (a == 36)) || (a == 44)) || (a == 53)) || (a == 80)) || (a == 54)) || (a == 1)) || (a == 18)) || (a == 59)) || 
        (a == 81)) {
            path = ((((dataFolder + 'Table Data/') + typeOfData) + ' за отчётный период ') + dzoNum)
        } else {
            path = (((dataFolder + typeOfData) + ' за отчётный период ') + b)
        }
        
        page = WebUI.getText(findTestObject(path))

        page = page.replaceAll('\\s+', '')

        filePoteri = poteri.toInteger()

        pagePoteri = page.toInteger()

        compare = pageOtpuskVSet

        if (compare == fileOtpuskVSet) {
        } else if (compare > fileOtpuskVSet) {
            compare = (compare - 1)
        } else if (compare < fileOtpuskVSet) {
            compare = (compare + 1)
        }
        
        if (compare == fileOtpuskVSet) {
        } else {
            numberOfErrors = (numberOfErrors + 1)

            pageInt = pageOtpuskVSet

            fileInt = fileOtpuskVSet

            typeOfData = (typeOfDataMain + ' Отпуск в сеть')

            WriteToExcel(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)
        }
        
        compare = pagePoteri

        if (compare == filePoteri) {
        } else if (compare > filePoteri) {
            compare = (compare - 1)
        } else if (compare < filePoteri) {
            compare = (compare + 1)
        }
        
        if (compare == filePoteri) {
        } else {
            numberOfErrors = (numberOfErrors + 1)

            pageInt = pagePoteri

            fileInt = filePoteri

            typeOfData = (typeOfDataMain + ' Потери')

            WriteToExcel(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)
        }
        
        if (planFact == 2) {
            WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка Факт'))
        }
    }
    
    if ((a == 84) || (a == 82)) {
        page = WebUI.getText(findTestObject('Выполнение бизнес-плана/textPlanFact'))

        page = page.replaceAll('\\n', '_')

        page = page.substring(page.indexOf('_') + 1, page.length())

        page1 = page.substring(0, page.indexOf('_'))

        page1 = page.substring(0, page.indexOf(' '))

        page2 = page.substring(page.indexOf('_') + 1, page.length())

        page2 = page2.substring(0, page.indexOf('_'))

        page2 = page2.substring(0, page.indexOf(' '))
    } else if ((((((((((((((((a == 52) || (a == 72)) || (a == 28)) || (a == 73)) || (a == 77)) || (a == 74)) || (a == 65)) || 
    (a == 36)) || (a == 44)) || (a == 53)) || (a == 80)) || (a == 54)) || (a == 1)) || (a == 18)) || (a == 59)) || (a == 
    81)) {
        page1 = WebUI.getText(findTestObject('Object Repository/Выполнение бизнес-плана/spanPlan' + dzoNum))

        page1 = page1.replace('|', '')

        page2 = WebUI.getText(findTestObject('Object Repository/Выполнение бизнес-плана/spanFact' + dzoNum))

        page2 = page2.replace('|', '')
    } else {
        page1 = WebUI.getText(findTestObject('Object Repository/Выполнение бизнес-плана/spanPlan' + filialNum))

        page1 = page1.replace('|', '')

        page2 = WebUI.getText(findTestObject('Object Repository/Выполнение бизнес-плана/spanFact' + filialNum))

        page2 = page2.replace('|', '')
    }
    
    println('page1: ' + page1)

    println('page2: ' + page2)

    file = findTestData('PlanFact').getValue(4, a)

    file = file.replace(',', '.')

    println('file Plan: ' + file)

    typeOfData = 'План в процентах'

    fileDouble = file.toDouble()

    pageDouble = page1.toDouble()

    if (fileDouble != pageDouble) {
        numberOfErrors = (numberOfErrors + 1)

        WriteToExcel(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)
    }
    
    file = findTestData('PlanFact').getValue(7, a)

    file = file.replace(',', '.')

    println('file Fact: ' + file)

    fileDouble = file.toDouble()

    typeOfData = 'Факт в процентах'

    fileDouble = file.toDouble()

    pageDouble = page2.toDouble()

    if (fileDouble != pageDouble) {
        numberOfErrors = (numberOfErrors + 1)

        WriteToExcel(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)
    }
    
    if (WebUI.verifyEqual(numberOfErrors, 0) == false) {
        println(numberOfErrors)

        if ((((((((((a == 28) || (a == 77)) || (a == 74)) || (a == 65)) || (a == 36)) || (a == 44)) || (a == 54)) || (a == 
        1)) || (a == 18)) || (a == 59)) {
            Filials(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        }
    }
    
    if (a == 82) {
        OpenFilter()

        CloseFilter()

        WebUI.delay(20)
    }
}

static void ZakrytOpoveshenie() {
	WebUI.delay(10)
	
    String opoveshenie = WebUI.getText(findTestObject('Выполнение бизнес-плана/Просьба обратить внимание'))

    println(opoveshenie)

    if (opoveshenie == 'Просьба обратить внимание') {
        WebUI.click(findTestObject('Выполнение бизнес-плана/Закрыть оповещение'))
    }
}

static void DZO(def a) {
    OpenFilter()

    OpenRSK()

    if (a == 28) {
        WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Волга'), 30)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Волга'))
    }
    
    if (a == 77) {
        WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Ленэнерго'), 30)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Ленэнерго'))
    }
    
    if (a == 74) {
        WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Московский регион'), 30)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Московский регион'))
    }
    
    if (a == 65) {
        WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Северный кавказ'), 30)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Северный Кавказ'))
    }
    
    if (a == 36) {
        WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Северо-Запад'), 30)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Северо-Запад'))
    }
    
    if (a == 44) {
        WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Сибирь'), 30)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Сибирь'))
    }
    
    if (a == 54) {
        WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Урал'), 30)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Урал'))
    }
    
    if (a == 1) {
        WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Центр'), 30)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Центр'))
    }
    
    if (a == 18) {
        WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Россети Центр и Приволжье'), 30)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Центр и Приволжье'))
    }
    
    if (a == 59) {
        WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Юг'), 30)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Юг'))
    }
    
    CloseFilter()

    ZakrytOpoveshenie()
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

static def Filials(def a, def typeOfData, def todaysDate, def pageInt, def fileInt, def pageDouble, def fileDouble, def dZO, def dzoNum, def filialNum) {
    int i

    int c

    String page

    println(dZO)

    String reducedDZO
	
	reducedDZO = dZO.substring((dZO.indexOf(' ')+1),dZO.length())
	
	if (reducedDZO.contains(' ')) {
        reducedDZO = reducedDZO.substring(reducedDZO.indexOf(' ') + 1, reducedDZO.length())

        if (reducedDZO.contains(' ')) {
            reducedDZO = reducedDZO.substring(reducedDZO.indexOf(' ') + 1, reducedDZO.length())
        }
    }
    
    println(reducedDZO)

    String dzoCut

    DZO(a)

    page = WebUI.getText(findTestObject('Object Repository/Выполнение бизнес-плана/Filials'))

    println(page)

    c = page.indexOf(reducedDZO)

	if (c > -1) {
		WebUI.click(findTestObject('Выполнение бизнес-плана/список'))

		WebUI.delay(10)

		WebUI.click(findTestObject('Выполнение бизнес-плана/Раскрытие списка'))

		WebUI.delay(10)

		page = WebUI.getText(findTestObject('Object Repository/Выполнение бизнес-плана/Filials'))

		println(page)

		c = page.indexOf(reducedDZO)
	}
    
    String x2 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Список ДЗО старый'))

    if (a == 28) {
        dZO = 'Мордовэнерго'

        a = 29

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Оренбургэнерго'

        a = 30

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Пензаэнерго'

        a = 31

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Самарские РС'

        a = 32

        dzoCut = dZO.substring(0, 10)

        if (x2.contains(dzoCut)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Саратовские РС'

        a = 33

        dzoCut = dZO.substring(0, 10)

        if (x2.contains(dzoCut)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Ульяновские РС'

        a = 34

        dzoCut = dZO.substring(0, 10)

        if (x2.contains(dzoCut)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Чувашэнерго'

        a = 35

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        filialNum = 0
    }
    
    if (a == 77) {
        dZO = 'Ленинградская область'

        a = 79

        dzoCut = dZO.substring(0, 10)

        if (x2.contains(dzoCut)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'г. Санкт-Петербург'

        a = 78

        dzoCut = dZO.substring(3, dZO.length())

        if (x2.contains(dzoCut)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        filialNum = 0
    }
    
    if (a == 74) {
        dZO = 'г. Москва'

        a = 75

        dzoCut = dZO.substring(3, dZO.length())

        if (x2.contains(dzoCut)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Московская область'

        a = 76

        dzoCut = dZO.substring(0, 10)

        if (x2.contains(dzoCut)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        filialNum = 0
    }
    
    if (a == 65) {
        dZO = 'Дагэнерго'

        a = 71

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Ингушэнерго'

        a = 70

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Каббалкэнерго'

        a = 66

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Карачаево-Черкесскэнерго'

        a = 67

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Севкавказэнерго'

        a = 68

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Ставропольэнерго'

        a = 69

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        filialNum = 0
    }
    
    if (a == 1) {
        dZO = 'АО «Воронежская горэлектросеть»'

        a = 14

        i = (dZO.length() - 1)

        dzoCut = dZO.substring(4, i).replaceAll('\\s+', '')

        if (x2.contains(dzoCut)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'АО «Тульские городские электрические сети»'

        a = 16

        i = (dZO.length() - 1)

        dzoCut = dZO.substring(4, i).replaceAll('\\s+', '')

        if (x2.contains(dzoCut)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'АО «Ярославская электросетевая компания»'

        a = 17

        i = (dZO.length() - 1)

        dzoCut = dZO.substring(4, i).replaceAll('\\s+', '')

        if (x2.contains(dzoCut)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Белгородэнерго'

        a = 2

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Брянскэнерго'

        a = 3

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Воронежэнерго'

        a = 4

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Костромаэнерго'

        a = 5

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Курскэнерго'

        a = 6

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Липецкэнерго'

        a = 7

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'ООО «БрянскЭлектро»'

        a = 13

        dzoCut = dZO.substring(5, 12)

        if (x2.contains(dzoCut)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Орелэнерго'

        a = 8

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Смоленскэнерго'

        a = 9

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Тамбовэнерго'

        a = 10

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Тверьэнерго'

        a = 11

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Ярэнерго'

        a = 12

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        filialNum = 0
    }
    
    if (a == 18) {
        dZO = 'Владимирэнерго'

        a = 19

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Ивэнерго'

        a = 20

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Калугаэнерго'

        a = 21

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Кировэнерго'

        a = 22

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Мариэнерго'

        a = 23

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Нижновэнерго'

        a = 24

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Рязаньэнерго'

        a = 25

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Тулэнерго'

        a = 26

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Удмуртэнерго'

        a = 27

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        filialNum = 0
    }
    
    if (a == 36) {
        dZO = 'Архангельский филиал'

        a = 37

        dzoCut = dZO.substring(0, 10)

        if (x2.contains(dzoCut)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Вологодский филиал'

        a = 38

        dzoCut = dZO.substring(0, 10)

        if (x2.contains(dzoCut)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Карельский филиал'

        a = 39

        dzoCut = dZO.substring(0, 10)

        if (x2.contains(dzoCut)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Мурманский филиал'

        a = 40

        dzoCut = dZO.substring(0, 10)

        if (x2.contains(dzoCut)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Новгородский филиал'

        a = 42

        dzoCut = dZO.substring(0, 10)

        if (x2.contains(dzoCut)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Псковский филиал'

        a = 43

        dzoCut = dZO.substring(0, 10)

        if (x2.contains(dzoCut)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'филиал в Республике Коми'

        a = 41

        if (x2.contains('Коми')) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        filialNum = 0
    }
    
    if (a == 44) {
        dZO = 'Алтайэнерго'

        a = 45

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Бурятэнерго'

        a = 46

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Красноярскэнерго'

        a = 47

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Кузбассэнерго-РЭС'

        a = 48

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Омскэнерго'

        a = 49

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Хакасэнерго'

        a = 50

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Читаэнерго'

        a = 51

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        filialNum = 0
    }
    
    if (a == 54) {
        dZO = 'АО ЕЭСК'

        a = 58

        dzoCut = dZO.substring(3, dZO.length())

        if (x2.contains(dzoCut)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Пермэнерго'

        a = 55

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Свердловэнерго'

        a = 56

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Челябэнерго'

        a = 57

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        filialNum = 0
    }
    
    if (a == 59) {
        dZO = 'АО "ВМЭС"'

        a = 64

        i = (dZO.length() - 1)

        dzoCut = dZO.substring(4, i)

        if (x2.contains(dzoCut)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Астраханьэнерго'

        a = 60

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Волгоградэнерго'

        a = 61

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Калмэнерго'

        a = 62

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        dZO = 'Ростовэнерго'

        a = 63

        if (x2.contains(dZO)) {
            filialNum = (filialNum + 1)

            Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO, dzoNum, filialNum)
        } else {
            NoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
        }
        
        filialNum = 0
    }
    
    OpenFilter()

    CloseFilter()
}

static def WriteToExcel(def a, def typeOfData, def todaysDate, def pageInt, def fileInt, def pageDouble, def fileDouble, def dZO) {
    String sheetName = 'Sheet1'

    def data = findTestData('PlanFact')

    int n = data.getRowNumbers() + 1

    String year = todaysDate.substring(todaysDate.length() - 4, todaysDate.length())

    int y = year.toInteger()

    String m = WebUI.getText(findTestObject('Выполнение бизнес-плана/Период'))

    m = m.substring(0, m.indexOf('2024'))

    m = m.trim()

    String dashboardName = 'Выполнение бизнес-плана'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, typeOfData)

    if ((typeOfData == 'Факт в процентах') || (typeOfData == 'План в процентах')) {
        ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, fileDouble)

        ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, pageDouble)
    } else {
        ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, fileInt)

        ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, pageInt)
    }
    
    ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, m)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, y)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 7, todaysDate)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

static def NoData(def a, def typeOfData, def todaysDate, def fileInt, def fileDouble, def dZO) {
    println(a)

    println(todaysDate)

    println(fileInt)

    println(fileDouble)

    println(dZO)

    typeOfData = 'Факт Отпуск в сеть'

    fileInt = findTestData('PlanFact').getValue(5, a).replaceAll('\\s+', '').toInteger()

    WriteToExcelNoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)

    typeOfData = 'Факт Потери'

    fileInt = findTestData('PlanFact').getValue(6, a).replaceAll('\\s+', '').toInteger()

    WriteToExcelNoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)

    typeOfData = 'План Отпуск в сеть'

    fileInt = findTestData('PlanFact').getValue(2, a).replaceAll('\\s+', '').toInteger()

    WriteToExcelNoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)

    typeOfData = 'План Потери'

    fileInt = findTestData('PlanFact').getValue(3, a).replaceAll('\\s+', '').toInteger()

    WriteToExcelNoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)

    typeOfData = 'План в процентах'

    fileDouble = findTestData('PlanFact').getValue(4, a).replace(',', '.').toDouble()

    WriteToExcelNoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)

    typeOfData = 'Факт в процентах'

    fileDouble = findTestData('PlanFact').getValue(7, a).replace(',', '.').toDouble()

    WriteToExcelNoData(a, typeOfData, todaysDate, fileInt, fileDouble, dZO)
}

static def WriteToExcelNoData(def a, def typeOfData, def todaysDate, def fileInt, def fileDouble, def dZO) {
    String sheetName = 'Sheet1'

    def data = findTestData('PlanFact')

    int n = data.getRowNumbers() + 1

    String year = todaysDate.substring(todaysDate.length() - 4, todaysDate.length())

    int y = year.toInteger()

    String m = WebUI.getText(findTestObject('Выполнение бизнес-плана/Период'))

    m = m.substring(0, m.indexOf('2024'))

    m = m.trim()

    String dashboardName = 'Выполнение бизнес-плана'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, typeOfData)

    if ((typeOfData == 'Факт в процентах') || (typeOfData == 'План в процентах')) {
        ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, fileDouble)

        ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, 'нет данных')
    } else {
        ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, fileInt)

        ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, 'нет данных')
    }
    
    ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, m)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, y)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 7, todaysDate)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

