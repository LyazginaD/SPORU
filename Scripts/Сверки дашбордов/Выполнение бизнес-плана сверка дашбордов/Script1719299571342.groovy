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

'Номер Блока, 1- Блок Руководителя, 2 - Блок Балансы'
int blockNum

'Путь до соответствующей папки'
String path

String typeOfData

'Для расчётов'
int i

String dZO

String vidget

String tabR

String tabB

String o1R

String o1B

String PercPlanR

String PercPlanB

String PercFactR

String PercFactB

String pRR = 'ПАО Россети/'

String fR = 'Россети ФСК ЕЭС/'

String tyR = 'АО "Тываэнерго"/'

String chR = 'Чеченэнерго'

String vR = 'Россети Волга/'

String kR = 'Россети Кубань/'

String lR = 'Россети Ленэнерго (ГК)/'

String mR = 'Россети Московский регион/'

String sKR = 'Россети Северный Кавказ (ГК)/'

String sZR = 'Россети Северо-Запад/'

String siR = 'Россети Сибирь (ГК)/'

String tomR = 'Россети Томск/'

String tyumR = 'Россети Тюмень/'

String urR = 'Россети Урал (ГК)/'

String cenR = 'Россети Центр (ГК)/'

String cIPR = 'Россети Центр и Приволжье (ГК)/'

String ugR = 'Россети Юг (ГК)/'

String yR = 'Россети Янтарь/'

String pRB = 'ПАО Россети/'

String fB = 'Россети ФСК ЕЭС/'

String tyB = 'АО "Тываэнерго"/'

String chB = 'Чеченэнерго'

String vB = 'Россети Волга/'

String kB = 'Россети Кубань/'

String lB = 'Россети Ленэнерго (ГК)/'

String mB = 'Россети Московский регион/'

String sKB = 'Россети Северный Кавказ (ГК)/'

String sZB = 'Россети Северо-Запад/'

String siB = 'Россети Сибирь (ГК)/'

String tomB = 'Россети Томск/'

String tyumB = 'Россети Тюмень/'

String urB = 'Россети Урал (ГК)/'

String cenB = 'Россети Центр (ГК)/'

String cIPB = 'Россети Центр и Приволжье (ГК)/'

String ugB = 'Россети Юг (ГК)/'

String yB = 'Россети Янтарь/'

String VseDZO

String a

String b

int dZONum = 0

String x

String z

blockNum = 1

path = 'Object Repository/Выполнение бизнес-плана/'

Presettings(blockNum, path)

VseDZO = WebUI.getText(findTestObject(path + 'Список ДЗО'))

'ПАО Россети'
def GetDZODPAOata = new GetDZODPAOata()

pRR = GetDZODPAOata.GetAllPAOData(path, dZONum, VseDZO, z = 'ПАО Россети/')

println('pRR: ' + pRR)

i = VseDZO.indexOf('ЕЭС')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    fR = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети ФСК ЕЭС/')
} else {
    fR = (fR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('fR: ' + fR)

i = VseDZO.indexOf('Тываэнерго')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    tyR = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'АО "Тываэнерго"/')
} else {
    tyR = (tyR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('tyR: ' + tyR)

i = VseDZO.indexOf('Чеченэнерго')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    chR = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'АО "Чеченэнерго"/')
} else {
    chR = (chR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('chR: ' + chR)

i = VseDZO.indexOf('Волга')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    vR = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Волга/')
} else {
    vR = (vR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('vR: ' + vR)

i = VseDZO.indexOf('Кубань')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    kR = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Кубань/')
} else {
    kR = (kR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('kR: ' + kR)

i = VseDZO.indexOf('Ленэнерго')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    lR = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Ленэнерго (ГК)/')
} else {
    lR = (lR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('lR: ' + lR)

i = VseDZO.indexOf('Московский')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    mR = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Московский регион/')
} else {
    mR = (mR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('mR: ' + mR)

i = VseDZO.indexOf('Кавказ')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    sKR = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Северный Кавказ (ГК)/')
} else {
    sKR = (sKR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('sKR: ' + sKR)

i = VseDZO.indexOf('Запад')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    sZR = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Северо-Запад/')
} else {
    sZR = (sZR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('sZR: ' + sZR)

i = VseDZO.indexOf('Сибирь')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    siR = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Сибирь (ГК)/')
} else {
    siR = (siR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('siR: ' + siR)

i = VseDZO.indexOf('Томск')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    tomR = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Томск/')
} else {
    tomR = (tomR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('tomR: ' + tomR)

i = VseDZO.indexOf('Тюмень')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    tyumR = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Тюмень/')
} else {
    tyumR = (tyumR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('tyumR: ' + tyumR)

i = VseDZO.indexOf('Урал')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    urR = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Урал (ГК)/')
} else {
    urR = (urR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('urR: ' + urR)

i = VseDZO.indexOf('Центр')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    cenR = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Центр (ГК)/')
} else {
    cenR = (cenR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('cenR: ' + cenR)

i = VseDZO.indexOf('Приволжье')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    cIPR = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Центр и Приволжье (ГК)/')
} else {
    cIPR = (cIPR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('cIPR: ' + cIPR)

i = VseDZO.indexOf('Юг')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    ugR = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Юг (ГК)/')
} else {
    ugR = (ugR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('ugR: ' + ugR)

i = VseDZO.indexOf('Янтарь')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    yR = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Янтарь/')
} else {
    yR = (yR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('yR: ' + yR)

blockNum = 2

path = 'Object Repository/Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/'

Presettings(blockNum, path)

'ПАО Россети'
GetDZODPAOata = new GetDZODPAOata()

pRB = GetDZODPAOata.GetAllPAOData(path, dZONum, VseDZO, z = 'ПАО Россети/')

println('pRB: ' + pRB)

VseDZO = WebUI.getText(findTestObject(path + 'Список ДЗО'))

dZONum = 0

i = VseDZO.indexOf('ЕЭС')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    fB = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети ФСК ЕЭС/')
} else {
    fB = (fB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('fB: ' + fB)

i = VseDZO.indexOf('Тываэнерго')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    tyB = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'АО "Тываэнерго"/')
} else {
    tyB = (tyB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('tyB: ' + tyB)

i = VseDZO.indexOf('Чеченэнерго')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    chB = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'АО "Чеченэнерго"/')
} else {
    chB = (chB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('chB: ' + chB)

i = VseDZO.indexOf('Волга')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    vB = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Волга/')
} else {
    vB = (vB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('vB: ' + vB)

i = VseDZO.indexOf('Кубань')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    kB = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Кубань/')
} else {
    kB = (kB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('kB: ' + kB)

i = VseDZO.indexOf('Ленэнерго')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    lB = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Ленэнерго (ГК)/')
} else {
    lB = (lB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('lB: ' + lB)

i = VseDZO.indexOf('Московский')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    mB = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Московский регион/')
} else {
    mB = (mB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('mB: ' + mB)

i = VseDZO.indexOf('Кавказ')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    sKB = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Северный Кавказ (ГК)/')
} else {
    sKB = (sKB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('sKB: ' + sKB)

i = VseDZO.indexOf('Запад')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    sZB = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Северо-Запад/')
} else {
    sZB = (sZB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('sZB: ' + sZB)

i = VseDZO.indexOf('Сибирь')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    siB = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Сибирь (ГК)/')
} else {
    siB = (siB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('siB: ' + siB)

i = VseDZO.indexOf('Томск')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    tomB = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Томск/')
} else {
    tomB = (tomB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('tomB: ' + tomB)

i = VseDZO.indexOf('Тюмень')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    tyumB = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Тюмень/')
} else {
    tyumB = (tyumB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('tyumB: ' + tyumB)

i = VseDZO.indexOf('Урал')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    urB = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Урал (ГК)/')
} else {
    urB = (urB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('urB: ' + urB)

i = VseDZO.indexOf('Центр')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    cenB = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Центр (ГК)/')
} else {
    cenB = (cenB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('cenB: ' + cenB)

i = VseDZO.indexOf('Приволжье')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    cIPB = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Центр и Приволжье (ГК)/')
} else {
    cIPB = (cIPB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('cIPB: ' + cIPB)

i = VseDZO.indexOf('Юг')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    ugB = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Юг (ГК)/')
} else {
    ugB = (ugB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('ugB: ' + ugB)

i = VseDZO.indexOf('Янтарь')

if (i > -1) {
    dZONum = (dZONum + 1)

    def GetDZOData = new GetDZOData()

    yB = GetDZOData.GetAllData(path, dZONum, VseDZO, y = 'Россети Янтарь/')
} else {
    yB = (yB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('yB: ' + yB)

VseDZO = WebUI.getText(findTestObject(path + 'Список ДЗО'))

if (blockNum == 2) {
    if (WebUI.verifyEqual(pRR, pRB) == false) {
        def Compare = new Compare()

        def result = Compare.CompareDZOData(a = pRR, b = pRB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, 
            todaysDate, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(fR, fB) == false) {
        def Compare = new Compare()

        def result = Compare.CompareDZOData(a = fR, b = fB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, 
            todaysDate, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(tyR, tyB) == false) {
        def Compare = new Compare()

        def result = Compare.CompareDZOData(a = tyR, b = tyB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, 
            todaysDate, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(chR, chB) == false) {
        def Compare = new Compare()

        def result = Compare.CompareDZOData(a = chR, b = chB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, 
            todaysDate, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(vR, vB) == false) {
        def Compare = new Compare()

        def result = Compare.CompareDZOData(a = vR, b = vB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, 
            todaysDate, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(kR, kB) == false) {
        def Compare = new Compare()

        def result = Compare.CompareDZOData(a = kR, b = kB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, 
            todaysDate, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(lR, lB) == false) {
        def Compare = new Compare()

        def result = Compare.CompareDZOData(a = lR, b = lB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, 
            todaysDate, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(mR, mB) == false) {
        def Compare = new Compare()

        def result = Compare.CompareDZOData(a = mR, b = mB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, 
            todaysDate, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(sKR, sKB) == false) {
        def Compare = new Compare()

        def result = Compare.CompareDZOData(a = sKR, b = sKB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, 
            todaysDate, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(sZR, sZB) == false) {
        def Compare = new Compare()

        def result = Compare.CompareDZOData(a = sZR, b = sZB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, 
            todaysDate, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(siR, siB) == false) {
        def Compare = new Compare()

        def result = Compare.CompareDZOData(a = siR, b = siB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, 
            todaysDate, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(tomR, tomB) == false) {
        def Compare = new Compare()

        def result = Compare.CompareDZOData(a = tomR, b = tomB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, 
            todaysDate, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(tyumR, tyumB) == false) {
        def Compare = new Compare()

        def result = Compare.CompareDZOData(a = tyumR, b = tyumB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, 
            todaysDate, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(urR, urB) == false) {
        def Compare = new Compare()

        def result = Compare.CompareDZOData(a = urR, b = urB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, 
            todaysDate, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(cenR, cenB) == false) {
        def Compare = new Compare()

        def result = Compare.CompareDZOData(a = cenR, b = cenB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, 
            todaysDate, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(cIPR, cIPB) == false) {
        def Compare = new Compare()

        def result = Compare.CompareDZOData(a = cIPR, b = cIPB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, 
            todaysDate, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(ugR, ugB) == false) {
        def Compare = new Compare()

        def result = Compare.CompareDZOData(a = ugR, b = ugB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, 
            todaysDate, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(yR, yB) == false) {
        def Compare = new Compare()

        def result = Compare.CompareDZOData(a = yR, b = yB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, 
            todaysDate, vidget, tabR, tabB, o1R, o1B)
    }
}

WebUI.closeBrowser()

WebUI.closeBrowser()

static def Presettings(def blockNum, def path) {
    WebUI.openBrowser('')

    if (blockNum == 1) {
        path = 'Object Repository/Выполнение бизнес-плана/'

        WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 1))
    } else {
        path = 'Object Repository/Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/'

        WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 4))
    }
    
    println(path)

    WebUI.setText(findTestObject('Страница авторизации/input__username'), findTestData('PlanFact').getValue(8, 1))

    WebUI.setText(findTestObject('Страница авторизации/input__password'), findTestData('PlanFact').getValue(9, 1))

    WebUI.click(findTestObject('Страница авторизации/button_'))

    WebUI.delay(30)

    ZakrytOpoveshenie()

    'Раскрыть фильтр "Дата"'
    WebUI.click(findTestObject(path + 'Фильтр Дата'))

    'Нажать "Снять выделение"'
    WebUI.click(findTestObject(path + 'Снять выделение в фильтре Дата'))

    'Нажать "Применить"'
    WebUI.click(findTestObject(path + 'Применить в фильтре Дата'))

    WebUI.delay(30)

    ZakrytOpoveshenie()

    'Раскрыть фильтр "Дата"'
    WebUI.click(findTestObject(path + 'Фильтр Дата'))

    WebUI.scrollToElement(findTestObject(path + '2024 список'), 30)

    'Выбрать 1 квартал 2022'
    WebUI.click(findTestObject(path + '2024 список'))

    'Выбрать 1 квартал 2022'
    WebUI.scrollToElement(findTestObject(path + '1 квартал 2024 список'), 30)

    'Выбрать 1 квартал 2022'
    WebUI.click(findTestObject(path + '1 квартал 2024 список'))

    'Выбрать 1 квартал 2022'
    WebUI.click(findTestObject(path + 'Январь 2024'))

    'Выбрать 1 квартал 2022'
    WebUI.click(findTestObject(path + 'Февраль 2024'))

    'Выбрать 1 квартал 2022'
    WebUI.click(findTestObject(path + 'Март 2024'))

    'Выбрать 1 квартал 2022'
    WebUI.scrollToElement(findTestObject(path + 'Март 2024'), 30)

    'Выбрать 1 квартал 2022'
    WebUI.click(findTestObject(path + '2 квартал 2024 список'))

    'Выбрать 1 квартал 2022'
    WebUI.click(findTestObject(path + 'Апрель 2024'))

    'Выбрать 1 квартал 2022'
    WebUI.click(findTestObject(path + 'Май 2024'))

    'Проскроллить до заголовка фильтра "Дата"'
    WebUI.scrollToElement(findTestObject(path + 'Заголовок дашборда'), 30)

    'Нажать "Применить"'
    WebUI.click(findTestObject(path + 'Применить в фильтре Дата'))

    WebUI.delay(30)

    ZakrytOpoveshenie()

    'Открыть фильтр "ДЗО"'
    WebUI.click(findTestObject(path + 'Фильтр ДЗО'))

    'Нажать "Снять выделение"'
    WebUI.click(findTestObject(path + 'Снять выделение в фильтре ДЗО'))

    'Выбрать ПАО Россети'
    WebUI.click(findTestObject(path + 'ПАО Россети'))

    'Нажать "Применить"'
    WebUI.click(findTestObject(path + 'Применить в фильтре ДЗО'))

    WebUI.delay(30)
}

static void ZakrytOpoveshenie() {
    String opoveshenie = WebUI.getText(findTestObject('Выполнение бизнес-плана/Просьба обратить внимание'))

    if (opoveshenie == 'Просьба обратить внимание') {
        WebUI.click(findTestObject('Выполнение бизнес-плана/Закрыть оповещение'))
    }
}

