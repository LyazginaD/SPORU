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
WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/2 квартал 2024 список'), 30)

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

WebUI.delay(30)

'!'
OpenFilter()

'Выбрать ПАО Россети'
WebUI.click(findTestObject('Выполнение бизнес-плана/ПАО Россети'))

'Нажать "Применить"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре ДЗО'))

WebUI.delay(30)

'___________________________________________________________________________________________________'
dZO = 'ПАО Россети'

a = 84

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

dZO = 'Россети ФСК ЕЭС'

a = 83

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

dZO = 'РаспредКомплекс'

a = 82

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

dZO = 'АО "Тываэнерго"'

a = 52

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

dZO = 'АО "Чеченэнерго"'

a = 72

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

dZO = 'Россети Волга'

a = 28

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

dZO = 'Россети Кубань'

a = 73

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

dZO = 'Россети Ленэнерго (ГК)'

a = 77

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

dZO = 'Россети Московский регион'

a = 74

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

dZO = 'Россети Северный Кавказ (ГК)'

a = 65

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

dZO = 'Россети Северо-Запад'

a = 36

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

dZO = 'Россети Сибирь (ГК)'

a = 44

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

dZO = 'Россети Томск'

a = 53

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

dZO = 'Россети Тюмень'

a = 80

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

dZO = 'Россети Урал (ГК)'

a = 54

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

dZO = 'Россети Центр (ГК)'

a = 1

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

dZO = 'Россети Центр и Приволжье (ГК)'

a = 18

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

dZO = 'Россети Юг (ГК)'

a = 59

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

dZO = 'Россети Янтарь'

a = 81

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

WebUI.closeBrowser()

static def Numbers(def a, def typeOfData, def todaysDate, def pageInt, def fileInt, def pageDouble, def fileDouble, def dZO) {
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

        path = (((dataFolder + typeOfData) + ' за отчётный период ') + b)

        println(path)

        page = WebUI.getText(findTestObject(path))

        page = page.replaceAll('\\s+', '')

        fileOtpuskVSet = otpusk.toInteger()

        pageOtpuskVSet = page.toInteger()

        typeOfData = (typeOfDataMain + ' Потери')

        path = (((dataFolder + typeOfData) + ' за отчётный период ') + b)

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
    } else {
        if (((((((((((a == 83) || (a == 29)) || (a == 79)) || (a == 75)) || (a == 71)) || (a == 15)) || (a == 19)) || (a == 
        37)) || (a == 45)) || (a == 58)) || (a == 64)) {
            filialNumberInRow = 1
        } else if (((((((((((a == 52) || (a == 30)) || (a == 78)) || (a == 76)) || (a == 70)) || (a == 14)) || (a == 20)) || 
        (a == 38)) || (a == 46)) || (a == 55)) || (a == 60)) {
            filialNumberInRow = 2
        } else if (((((((((a == 72) || (a == 31)) || (a == 66)) || (a == 16)) || (a == 21)) || (a == 39)) || (a == 47)) || 
        (a == 56)) || (a == 61)) {
            filialNumberInRow = 3
        } else if (((((((((a == 28) || (a == 32)) || (a == 67)) || (a == 17)) || (a == 22)) || (a == 40)) || (a == 48)) || 
        (a == 57)) || (a == 62)) {
            filialNumberInRow = 4
        } else if ((((((((a == 73) || (a == 33)) || (a == 68)) || (a == 2)) || (a == 23)) || (a == 42)) || (a == 49)) || 
        (a == 63)) {
            filialNumberInRow = 5
        } else if (((((((a == 77) || (a == 34)) || (a == 69)) || (a == 3)) || (a == 24)) || (a == 43)) || (a == 50)) {
            filialNumberInRow = 6
        } else if ((((((a == 74) || (a == 35)) || (a == 4)) || (a == 25)) || (a == 41)) || (a == 51)) {
            filialNumberInRow = 7
        } else if (((a == 65) || (a == 5)) || (a == 26)) {
            filialNumberInRow = 8
        } else if (((a == 36) || (a == 6)) || (a == 27)) {
            filialNumberInRow = 9
        } else if ((a == 44) || (a == 7)) {
            filialNumberInRow = 10
        } else if ((a == 53) || (a == 13)) {
            filialNumberInRow = 11
        } else if ((a == 80) || (a == 8)) {
            filialNumberInRow = 12
        } else if ((a == 54) || (a == 9)) {
            filialNumberInRow = 13
        } else if ((a == 1) || (a == 10)) {
            filialNumberInRow = 14
        } else if ((a == 18) || (a == 11)) {
            filialNumberInRow = 15
        } else if ((a == 59) || (a == 12)) {
            filialNumberInRow = 16
        } else if (a == 81) {
            filialNumberInRow = 17
        }
        
        println('filialNumberInRow: ' + filialNumberInRow)

        page1 = WebUI.getText(findTestObject('Object Repository/Выполнение бизнес-плана/spanPlan' + filialNumberInRow))

        page2 = WebUI.getText(findTestObject('Object Repository/Выполнение бизнес-плана/spanFact' + filialNumberInRow))

        page1 = page1.replace('|', '').trim()

        page2 = page2.replace('|', '').trim()
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
            Filials(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)
        }
    }
    
    if (a == 82) {
        OpenFilter()

        CloseFilter()

        WebUI.delay(20)
    }
}

static void ZakrytOpoveshenie() {
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

static def Filials(def a, def typeOfData, def todaysDate, def pageInt, def fileInt, def pageDouble, def fileDouble, def dZO) {
    int i

    int c

    String page

    println(dZO)

    String reducedDZO = dZO.substring(0, 13)

    println(reducedDZO)

    DZO(a)

    page = WebUI.getText(findTestObject('Object Repository/Выполнение бизнес-плана/Filials'))

    println(page)

    c = page.indexOf(reducedDZO)

    while (c > -1) {
        OpenFilter()

        CloseFilter()

        DZO(a)

        WebUI.delay(10)

        page = WebUI.getText(findTestObject('Object Repository/Выполнение бизнес-плана/Filials'))

        println(page)

        c = page.indexOf(reducedDZO)

        println('c indexOf(reducedDZO): ' + c)

        WebUI.delay(5)
    }
    
    if (a == 28) {
        dZO = 'Мордовэнерго'

        a = 29

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Оренбургэнерго'

        a = 30

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Пензаэнерго'

        a = 31

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Самарские РС'

        a = 32

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Саратовские РС'

        a = 33

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Ульяновские РС'

        a = 34

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Чувашэнерго'

        a = 35

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)
    }
    
    if (a == 77) {
        dZO = 'Ленинградская область'

        a = 79

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'г. Санкт-Петербург'

        a = 78

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)
    }
    
    if (a == 74) {
        dZO = 'г. Москва'

        a = 75

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Московская область'

        a = 76

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)
    }
    
    if (a == 65) {
        dZO = 'Дагэнерго'

        a = 71

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Ингушэнерго'

        a = 70

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Каббалкэнерго'

        a = 66

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Карачаево-Черкесскэнерго'

        a = 67

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Севкавказэнерго'

        a = 68

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Ставропольэнерго'

        a = 69

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)
    }
    
    if (a == 1) {
        dZO = 'АО «Воронежская горэлектросеть»'

        a = 14

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'АО «Тульские городские электрические сети»'

        a = 16

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'АО «Ярославская электросетевая компания»'

        a = 17

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Белгородэнерго'

        a = 2

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Брянскэнерго'

        a = 3

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Воронежэнерго'

        a = 4

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Костромаэнерго'

        a = 5

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Курскэнерго'

        a = 6

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Липецкэнерго'

        a = 7

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'ООО «БрянскЭлектро»'

        a = 13

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Орелэнерго'

        a = 8

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Смоленскэнерго'

        a = 9

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Тамбовэнерго'

        a = 10

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Тверьэнерго'

        a = 11

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Ярэнерго'

        a = 12

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)
    }
    
    if (a == 18) {
        dZO = 'Владимирэнерго'

        a = 19

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Ивэнерго'

        a = 20

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Калугаэнерго'

        a = 21

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Кировэнерго'

        a = 22

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Мариэнерго'

        a = 23

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Нижновэнерго'

        a = 24

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Рязаньэнерго'

        a = 25

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Тулэнерго'

        a = 26

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Удмуртэнерго'

        a = 27

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)
    }
    
    if (a == 36) {
        dZO = 'Архангельский филиал'

        a = 37

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Вологодский филиал'

        a = 38

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Карельский филиал'

        a = 39

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Мурманский филиал'

        a = 40

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Новгородский филиал'

        a = 42

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Псковский филиал'

        a = 43

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'филиал в Республике Коми'

        a = 41

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)
    }
    
    if (a == 44) {
        dZO = 'Алтайэнерго'

        a = 45

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Бурятэнерго'

        a = 46

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Красноярскэнерго'

        a = 47

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Кузбассэнерго-РЭС'

        a = 48

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Омскэнерго'

        a = 49

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Хакасэнерго'

        a = 50

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Читаэнерго'

        a = 51

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)
    }
    
    if (a == 54) {
        dZO = 'АО ЕЭСК'

        a = 58

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Пермэнерго'

        a = 55

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Свердловэнерго'

        a = 56

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Челябэнерго'

        a = 57

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)
    }
    
    if (a == 59) {
        dZO = 'АО "ВМЭС"'

        a = 64

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Астраханьэнерго'

        a = 60

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Волгоградэнерго'

        a = 61

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Калмэнерго'

        a = 62

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

        dZO = 'Ростовэнерго'

        a = 63

        Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)
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

