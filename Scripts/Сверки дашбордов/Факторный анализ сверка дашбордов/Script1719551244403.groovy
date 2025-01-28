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

String typeOfData

String otobrajeniyeDannyh

println(todaysDate)

String vidget

String x

String y

String DZO

WebUI.openBrowser('')

int run = 1

for (run = 1; run < 3; run++) {
    Test(run, todaysDate, typeOfData, otobrajeniyeDannyh, x, y, vidget, DZO)
}

//Notice(run)
WebUI.closeBrowser()

static def Test(def run, def todaysDate, def typeOfData, def otobrajeniyeDannyh, def x, def y, def vidget, def DZO) {
    WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 3))

    Autorization(run)

    int i

    int ii

    String a

    String a1

    String a2

    'Раскрыть фильтр "Дата"'
    WebUI.click(findTestObject('Факторный анализ/Фильтр Период'))

    'Нажать "Снять выделение"'
    WebUI.click(findTestObject('Факторный анализ/Снять выделение в фильтре Дата'))

    'Нажать "Применить"'
    WebUI.click(findTestObject('Факторный анализ/Применить в фильтре Дата'))

    WebUI.delay(10)

    'Раскрыть фильтр "Дата"'
    WebUI.click(findTestObject('Факторный анализ/Фильтр Период'))

    'Нажать "Снять выделение"'
    WebUI.click(findTestObject('Факторный анализ/Снять выделение в фильтре Дата'))

    WebUI.scrollToElement(findTestObject('Факторный анализ/2024 список'), 30)

    WebUI.click(findTestObject('Факторный анализ/2024 год'))

    'Проскроллить до заголовка фильтра "Дата"'
    WebUI.scrollToElement(findTestObject('Факторный анализ/Заголовок дашборда'), 30)

    'Нажать "Применить"'
    WebUI.click(findTestObject('Факторный анализ/Применить в фильтре Дата'))

    if (run == 1) {
        a = WebUI.getText(findTestObject('Факторный анализ/Отклонения выручки по факторам Блок руководителя'))

        a = a.replaceAll('[\\r?\n|\r]', '/')

        i = a.indexOf('Отклонение')

        if (i > -1) {
            i = i

            a = a.substring(0, i).substring(0, i).trim()
        }
        
        println('a: ' + a)

        i = a.indexOf('/')

        if (i > -1) {
            a1 = a.substring(0, i)

            println('a1: ' + a1)

            a2 = a.substring(a1.length() + 1, a.length())

            println('a2: ' + a2)

            i = (a1.length() / 2)

            if (i > -1) {
                a1 = a1.substring(0, i).replaceAll('\\s+', '').trim()
            }
            
            println('a1: ' + a1)

            i = (a2.length() / 2)

            if (i > -1) {
                a2 = a2.substring(0, i).replaceAll('\\s+', '').trim()
            }
            
            println('a2: ' + a2)
        }
    } else {
        WebUI.click(findTestObject('Факторный анализ/Переключить отображение с филиала на месяц'))

        a1 = WebUI.getText(findTestObject('Факторный анализ/span1 Блок руководителя')).replaceAll('\\s+', '').trim()

        a2 = WebUI.getText(findTestObject('Факторный анализ/span2 Блок руководителя')).replaceAll('\\s+', '').trim()

        println('a1: ' + a1)

        println('a2: ' + a2)
    }
    
    String tableA = WebUI.getText(findTestObject('Факторный анализ/AllTable1')).replaceAll('[\\r?\n|\r]', '/')

    println('tableA: ' + tableA)

    for (i = 1; i < 5; i++) {
        ii = (tableA.indexOf('/') + 1)

        tableA = tableA.substring(ii, tableA.length())
    }
    
    println('tableA: ' + tableA)

    String TyA = GetData(x = tableA)

    println('TyA: ' + TyA)

    tableA = NewDZO(x = tableA)

    String ChA = GetData(x = tableA)

    println('ChA: ' + ChA)

    tableA = NewDZO(x = tableA)

    i = tableA.indexOf('Кубань')

    String VA = tableA.substring(0, i).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('VA: ' + VA)

    for (i = 1; i < 8; i++) {
        tableA = NewDZO(x = tableA)
    }
    
    i = tableA.indexOf('Ленэнерго')

    String KuA = GetData(x = tableA)

    println('KuA: ' + KuA)

    tableA = NewDZO(x = tableA)

    i = tableA.indexOf('Московский')

    String LenA = tableA.substring(0, i).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('LenA: ' + LenA)

    tableA = NewDZO(x = tableA)

    tableA = NewDZO(x = tableA)

    i = tableA.indexOf('Кавказ')

    String MosA = tableA.substring(0, i).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('MosA: ' + MosA)

    for (i = 1; i < 3; i++) {
        tableA = NewDZO(x = tableA)
    }
    
    i = tableA.indexOf('Запад')

    String SKA = tableA.substring(0, i).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('SKA: ' + SKA)

    for (i = 1; i < 7; i++) {
        tableA = NewDZO(x = tableA)
    }
    
    i = tableA.indexOf('Сибирь')

    String SZA = tableA.substring(0, i).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('SZA: ' + SZA)

    for (i = 1; i < 8; i++) {
        tableA = NewDZO(x = tableA)
    }
    
    i = tableA.indexOf('Томск')

    String SiA = tableA.substring(0, i).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('SiA: ' + SiA)

    for (i = 1; i < 9; i++) {
        tableA = NewDZO(x = tableA)
    }
    
    i = tableA.indexOf('Тюмень')

    String ToA = tableA.substring(0, i).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('ToA: ' + ToA)

    tableA = NewDZO(x = tableA)

    String TyuA = tableA.substring(0, i).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('TyuA: ' + TyuA)

    tableA = NewDZO(x = tableA)

    i = tableA.indexOf('ЕЭС')

    String UrA = tableA.substring(0, i).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('UrA: ' + UrA)

    for (i = 1; i < 4; i++) {
        tableA = NewDZO(x = tableA)
    }
    
    i = tableA.indexOf('Центр')

    String FSKA = tableA.substring(0, i).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('FSKA: ' + FSKA)

    tableA = NewDZO(x = tableA)

    i = tableA.indexOf('Приволжье')

    String CenA = tableA.substring(0, i).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('CenA: ' + CenA)

    for (i = 1; i < 12; i++) {
        tableA = NewDZO(x = tableA)
    }
    
    i = tableA.indexOf('Юг')

    String CiPA = tableA.substring(0, i).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('CiPA: ' + CiPA)

    for (i = 1; i < 10; i++) {
        tableA = NewDZO(x = tableA)
    }
    
    i = tableA.indexOf('Янтарь')

    String UgA = tableA.substring(0, i).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('UgA: ' + UgA)

    i = tableA.lastIndexOf('/')

    String YaA = tableA.substring(i, tableA.length()).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('YaA: ' + YaA)

    WebUI.delay(10)

    '______________'
    WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 11))

    String b

    String b1

    String b2

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

    WebUI.scrollToElement(findTestObject('Факторный анализ/2024 список Выручка'), 30)

    WebUI.click(findTestObject('Факторный анализ/2024 год Выручка'))

    'Проскроллить до заголовка фильтра "Дата"'
    WebUI.scrollToElement(findTestObject('Факторный анализ/Заголовок дашборда Выручка'), 30)

    'Нажать "Применить"'
    WebUI.click(findTestObject('Факторный анализ/Применить в фильтре Дата Выручка'))

    if (run == 1) {
        b = WebUI.getText(findTestObject('Факторный анализ/Отклонения выручки по факторам Выручка'))

        b = b.replaceAll('[\\r?\n|\r]', '/')

        println('b: ' + b)

        i = b.indexOf('Отклонение')

        if (i > -1) {
            i = i

            b = b.substring(0, i).substring(0, i).trim()
        }
        
        println('b: ' + b)

        i = b.indexOf('/')

        if (i > -1) {
            b1 = b.substring(0, i)

            println('b1: ' + b1)

            b2 = b.substring(b1.length() + 1, b.length())

            println('b2: ' + b2)

            i = (b1.length() / 2)

            if (i > -1) {
                b1 = b1.substring(0, i).replaceAll('\\s+', '').trim()
            }
            
            println('b1: ' + b1)

            i = (b2.length() / 2)

            if (i > -1) {
                b2 = b2.substring(0, i).replaceAll('\\s+', '').trim()
            }
            
            println('b2: ' + b2)
        }
    } else {
        WebUI.click(findTestObject('Факторный анализ/Переключить отображение с филиала на месяц'))

        b1 = WebUI.getText(findTestObject('Факторный анализ/span1 Выручка')).replaceAll('\\s+', '').trim()

        b2 = WebUI.getText(findTestObject('Факторный анализ/span2 Выручка')).replaceAll('\\s+', '').trim()

        println('b1: ' + b1)

        println('b2: ' + b2)
    }
    
    vidget = 'Отклонения выручки по факторам'

    DZO = 'ПАО Россети'

    typeOfData = 'Отклонение (объём услуг)'

    Compare(x = a1, y = b1, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget, DZO)

    typeOfData = 'Отклонение (средний тариф)'

    Compare(x = a2, y = b2, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget, DZO)

    String tableB = WebUI.getText(findTestObject('Факторный анализ/AllTable1 Выручка')).replaceAll('[\\r?\n|\r]', '/')

    println('tableB: ' + tableB)

    for (i = 1; i < 5; i++) {
        ii = (tableB.indexOf('/') + 1)

        tableB = tableB.substring(ii, tableB.length())
    }
    
    println('tableB: ' + tableB)

    String TyB = GetData(x = tableB)

    println('TyB: ' + TyB)

    tableB = NewDZO(x = tableB)

    String ChB = GetData(x = tableB)

    println('ChB: ' + ChB)

    tableB = NewDZO(x = tableB)

    i = tableB.indexOf('Кубань')

    String VB = tableB.substring(0, i).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('VB: ' + VB)

    for (i = 1; i < 8; i++) {
        tableB = NewDZO(x = tableB)
    }
    
    i = tableB.indexOf('Ленэнерго')

    String KuB = GetData(x = tableB)

    println('KuB: ' + KuB)

    tableB = NewDZO(x = tableB)

    i = tableB.indexOf('Московский')

    String LenB = tableB.substring(0, i).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('LenB: ' + LenB)

    tableB = NewDZO(x = tableB)

    tableB = NewDZO(x = tableB)

    i = tableB.indexOf('Кавказ')

    String MosB = tableB.substring(0, i).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('MosB: ' + MosB)

    for (i = 1; i < 3; i++) {
        tableB = NewDZO(x = tableB)
    }
    
    i = tableB.indexOf('Запад')

    String SKB = tableB.substring(0, i).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('SKB: ' + SKB)

    for (i = 1; i < 7; i++) {
        tableB = NewDZO(x = tableB)
    }
    
    i = tableB.indexOf('Сибирь')

    String SZB = tableB.substring(0, i).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('SZB: ' + SZB)

    for (i = 1; i < 8; i++) {
        tableB = NewDZO(x = tableB)
    }
    
    i = tableB.indexOf('Томск')

    String SiB = tableB.substring(0, i).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('SiB: ' + SiB)

    for (i = 1; i < 9; i++) {
        tableB = NewDZO(x = tableB)
    }
    
    i = tableB.indexOf('Тюмень')

    String ToB = tableB.substring(0, i).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('ToB: ' + ToB)

    tableB = NewDZO(x = tableB)

    String TyuB = tableB.substring(0, i).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('TyuB: ' + TyuB)

    tableB = NewDZO(x = tableB)

    i = tableB.indexOf('ЕЭС')

    String UrB = tableB.substring(0, i).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('UrB: ' + UrB)

    for (i = 1; i < 4; i++) {
        tableB = NewDZO(x = tableB)
    }
    
    i = tableB.indexOf('Центр')

    String FSKB = tableB.substring(0, i).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('FSKB: ' + FSKB)

    tableB = NewDZO(x = tableB)

    i = tableB.indexOf('Приволжье')

    String CenB = tableB.substring(0, i).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('CenB: ' + CenB)

    for (i = 1; i < 12; i++) {
        tableB = NewDZO(x = tableB)
    }
    
    i = tableB.indexOf('Юг')

    String CiPB = tableB.substring(0, i).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('CiPB: ' + CiPB)

    for (i = 1; i < 10; i++) {
        tableB = NewDZO(x = tableB)
    }
    
    i = tableB.indexOf('Янтарь')

    String UgB = tableB.substring(0, i).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('UgB: ' + UgB)

    i = tableB.lastIndexOf('/')

    String YaB = tableB.substring(i, tableB.length()).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    println('YaB: ' + YaB)

    vidget = 'Отклонения выручки по факторам'

    if (run == 2) {
        DZO = 'АО «Тываэнерго»'

        CompareDZO(x = TyA, y = TyB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget, DZO)

        DZO = 'АО «Чеченэнерго»'

        CompareDZO(x = ChA, y = ChB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget, DZO)

        DZO = 'Россети Волга'

        CompareDZO(x = VA, y = VB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget, DZO)

        DZO = 'Россети Кубань'

        CompareDZO(x = KuA, y = KuB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget, DZO)

        DZO = 'Московский регион'

        CompareDZO(x = MosA, y = MosB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget, DZO)

        DZO = 'Россети Ленэнерго (ГК)'

        CompareDZO(x = LenA, y = LenB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget, DZO)

        DZO = 'Россети Северный Кавказ (ГК)'

        CompareDZO(x = SKA, y = SKB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget, DZO)

        DZO = 'Россети Северо-Запад'

        CompareDZO(x = SZA, y = SZB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget, DZO)

        DZO = 'Россети Сибирь (ГК)'

        CompareDZO(x = SiA, y = SiB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget, DZO)

        DZO = 'Россети Томск'

        CompareDZO(x = ToA, y = ToB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget, DZO)

        DZO = 'Россети Тюмень'

        CompareDZO(x = TyuA, y = TyuB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget, DZO)

        DZO = 'Россети Урал (ГК)'

        CompareDZO(x = UrA, y = UrB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget, DZO)

        DZO = 'Россети ФСК ЕЭС'

        CompareDZO(x = FSKA, y = FSKB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget, DZO)

        DZO = 'Центр'

        CompareDZO(x = CenA, y = CenB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget, DZO)

        DZO = 'Центр и Приволжье (ГК)'

        CompareDZO(x = CiPA, y = CiPB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget, DZO)

        DZO = 'Россети Юг (ГК)'

        CompareDZO(x = UgA, y = UgB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget, DZO)

        DZO = 'Россети Янтарь'

        CompareDZO(x = YaA, y = YaB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget, DZO)
    }
}

static def Compare(def x, def y, def run, def typeOfData, def otobrajeniyeDannyh, def todaysDate, def vidget, def DZO) {
    if (WebUI.verifyEqual(x, y) == true) {
    } else {
        if (run == 1) {
            otobrajeniyeDannyh = 'Филиал'

            WriteToExcel(todaysDate, typeOfData, otobrajeniyeDannyh, x, y, vidget, DZO)
        } else {
            otobrajeniyeDannyh = 'Месяц'

            WriteToExcel(todaysDate, typeOfData, otobrajeniyeDannyh, x, y, vidget, DZO)
        }
    }
}

static def CompareDZO(def x, def y, def run, def typeOfData, def otobrajeniyeDannyh, def todaysDate, def vidget, def DZO) {
    String x1 = x

    String y1 = y

    int i1

    if (WebUI.verifyEqual(x, y) == true) {
    } else {
        otobrajeniyeDannyh = 'Все'

        vidget = 'Всего отклонения по факторам'

        WriteToExcel(todaysDate, typeOfData, otobrajeniyeDannyh, x, y, vidget, DZO)
    }
}

static def GetData(def x) {
    int i2

    i2 = (x.indexOf('/') + 1)

    x = x.substring(0, i2).replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').trim()

    return x
}

static def NewDZO(def x) {
    int i3

    i3 = (x.indexOf('/') + 1)

    x = x.substring(i3, x.length())

    return x
}

static def Autorization(def run) {
    WebUI.delay(10)

    if (run == 1) {
        WebUI.setText(findTestObject('Страница авторизации/input__username'), findTestData('PlanFact').getValue(8, 1))

        WebUI.setText(findTestObject('Страница авторизации/input__password'), findTestData('PlanFact').getValue(9, 1))

        WebUI.click(findTestObject('Страница авторизации/button_'))

        WebUI.delay(10)
    }
}

static def Notice(def run) {
    if (run == 1) {
        if (WebUI.click(findTestObject('Выполнение бизнес-плана/Закрыть оповещение')) == true) {
            WebUI.click(findTestObject('Выполнение бизнес-плана/Закрыть оповещение'))
        }
    }
}

static def WriteToExcel(def todaysDate, def typeOfData, def otobrajeniyeDannyh, def x, def y, def vidget, def DZO) {
    String sheetName = 'Sheet1'

    def data = findTestData('PlanFact')

    int n = data.getRowNumbers() + 1

    String period = WebUI.getText(findTestObject('Факторный анализ/Фильтр Период'))

    println(period)

    String dashboardName = 'Факторный анализ'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, DZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, vidget)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, typeOfData)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, otobrajeniyeDannyh)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, period)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, todaysDate)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

