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

blockNum = 1

path = 'Object Repository/Выполнение бизнес-плана/'

Presettings(blockNum, path)

VseDZO = WebUI.getText(findTestObject(path + 'Список ДЗО'))

'ПАО Россети'
pRR = GetAllPAOData(path, dZONum, VseDZO, z = 'ПАО Россети/')

println('pRR: ' + pRR)

i = VseDZO.indexOf('ЕЭС')

if (i > -1) {
    dZONum = (dZONum + 1)

    fR = GetAllData(path, dZONum, VseDZO, x = 'Россети ФСК ЕЭС/')
} else {
    fR = (fR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('fR: ' + fR)

i = VseDZO.indexOf('Тываэнерго')

if (i > -1) {
    dZONum = (dZONum + 1)

    tyR = GetAllData(path, dZONum, VseDZO, x = 'АО "Тываэнерго"/')
} else {
    tyR = (tyR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('tyR: ' + tyR)

i = VseDZO.indexOf('Чеченэнерго')

if (i > -1) {
    dZONum = (dZONum + 1)

    chR = GetAllData(path, dZONum, VseDZO, x = 'АО "Чеченэнерго"/')
} else {
    chR = (chR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('chR: ' + chR)

i = VseDZO.indexOf('Волга')

if (i > -1) {
    dZONum = (dZONum + 1)

    vR = GetAllData(path, dZONum, VseDZO, x = 'Россети Волга/')
} else {
    vR = (vR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('vR: ' + vR)

i = VseDZO.indexOf('Кубань')

if (i > -1) {
    dZONum = (dZONum + 1)

    kR = GetAllData(path, dZONum, VseDZO, x = 'Россети Кубань/')
} else {
    kR = (kR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('kR: ' + kR)

i = VseDZO.indexOf('Ленэнерго')

if (i > -1) {
    dZONum = (dZONum + 1)

    lR = GetAllData(path, dZONum, VseDZO, x = 'Россети Ленэнерго (ГК)/')
} else {
    lR = (lR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('lR: ' + lR)

i = VseDZO.indexOf('Московский')

if (i > -1) {
    dZONum = (dZONum + 1)

    mR = GetAllData(path, dZONum, VseDZO, x = 'Россети Московский регион/')
} else {
    mR = (mR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('mR: ' + mR)

i = VseDZO.indexOf('Кавказ')

if (i > -1) {
    dZONum = (dZONum + 1)

    sKR = GetAllData(path, dZONum, VseDZO, x = 'Россети Северный Кавказ (ГК)/')
} else {
    sKR = (sKR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('sKR: ' + sKR)

i = VseDZO.indexOf('Запад')

if (i > -1) {
    dZONum = (dZONum + 1)

    sZR = GetAllData(path, dZONum, VseDZO, x = 'Россети Северо-Запад/')
} else {
    sZR = (sZR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('sZR: ' + sZR)

i = VseDZO.indexOf('Сибирь')

if (i > -1) {
    dZONum = (dZONum + 1)

    siR = GetAllData(path, dZONum, VseDZO, x = 'Россети Сибирь (ГК)/')
} else {
    siR = (siR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('siR: ' + siR)

i = VseDZO.indexOf('Томск')

if (i > -1) {
    dZONum = (dZONum + 1)

    tomR = GetAllData(path, dZONum, VseDZO, x = 'Россети Томск/')
} else {
    tomR = (tomR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('tomR: ' + tomR)

i = VseDZO.indexOf('Тюмень')

if (i > -1) {
    dZONum = (dZONum + 1)

    tyumR = GetAllData(path, dZONum, VseDZO, x = 'Россети Тюмень/')
} else {
    tyumR = (tyumR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('tyumR: ' + tyumR)

i = VseDZO.indexOf('Урал')

if (i > -1) {
    dZONum = (dZONum + 1)

    urR = GetAllData(path, dZONum, VseDZO, x = 'Россети Урал (ГК)/')
} else {
    urR = (urR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('urR: ' + urR)

i = VseDZO.indexOf('Центр')

if (i > -1) {
    dZONum = (dZONum + 1)

    cenR = GetAllData(path, dZONum, VseDZO, x = 'Россети Центр (ГК)/')
} else {
    cenR = (cenR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('cenR: ' + cenR)

i = VseDZO.indexOf('Приволжье')

if (i > -1) {
    dZONum = (dZONum + 1)

    cIPR = GetAllData(path, dZONum, VseDZO, x = 'Россети Центр и Приволжье (ГК)/')
} else {
    cIPR = (cIPR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('cIPR: ' + cIPR)

i = VseDZO.indexOf('Юг')

if (i > -1) {
    dZONum = (dZONum + 1)

    ugR = GetAllData(path, dZONum, VseDZO, x = 'Россети Юг (ГК)/')
} else {
    ugR = (ugR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('ugR: ' + ugR)

i = VseDZO.indexOf('Янтарь')

if (i > -1) {
    dZONum = (dZONum + 1)

    yR = GetAllData(path, dZONum, VseDZO, x = 'Россети Янтарь/')
} else {
    yR = (yR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('yR: ' + yR)

blockNum = 2

path = 'Object Repository/Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/'

Presettings(blockNum, path)

'ПАО Россети'
pRB = GetAllPAOData(path, dZONum, VseDZO, z = 'ПАО Россети/')

println('pRB: ' + pRB)

VseDZO = WebUI.getText(findTestObject(path + 'Список ДЗО'))

dZONum = 0

i = VseDZO.indexOf('ЕЭС')

if (i > -1) {
    dZONum = (dZONum + 1)

    fB = GetAllData(path, dZONum, VseDZO, x = 'Россети ФСК ЕЭС/')
} else {
    fB = (fB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('fB: ' + fB)

i = VseDZO.indexOf('Тываэнерго')

if (i > -1) {
    dZONum = (dZONum + 1)

    tyB = GetAllData(path, dZONum, VseDZO, x = 'АО "Тываэнерго"/')
} else {
    tyB = (tyB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('tyB: ' + tyB)

i = VseDZO.indexOf('Чеченэнерго')

if (i > -1) {
    dZONum = (dZONum + 1)

    chB = GetAllData(path, dZONum, VseDZO, x = 'АО "Чеченэнерго"/')
} else {
    chB = (chB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('chB: ' + chB)

i = VseDZO.indexOf('Волга')

if (i > -1) {
    dZONum = (dZONum + 1)

    vB = GetAllData(path, dZONum, VseDZO, x = 'Россети Волга/')
} else {
    vB = (vB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('vB: ' + vB)

i = VseDZO.indexOf('Кубань')

if (i > -1) {
    dZONum = (dZONum + 1)

    kB = GetAllData(path, dZONum, VseDZO, x = 'Россети Кубань/')
} else {
    kB = (kB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('kB: ' + kB)

i = VseDZO.indexOf('Ленэнерго')

if (i > -1) {
    dZONum = (dZONum + 1)

    lB = GetAllData(path, dZONum, VseDZO, x = 'Россети Ленэнерго (ГК)/')
} else {
    lB = (lB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('lB: ' + lB)

i = VseDZO.indexOf('Московский')

if (i > -1) {
    dZONum = (dZONum + 1)

    mB = GetAllData(path, dZONum, VseDZO, x = 'Россети Московский регион/')
} else {
    mB = (mB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('mB: ' + mB)

i = VseDZO.indexOf('Кавказ')

if (i > -1) {
    dZONum = (dZONum + 1)

    sKB = GetAllData(path, dZONum, VseDZO, x = 'Россети Северный Кавказ (ГК)/')
} else {
    sKB = (sKB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('sKB: ' + sKB)

i = VseDZO.indexOf('Запад')

if (i > -1) {
    dZONum = (dZONum + 1)

    sZB = GetAllData(path, dZONum, VseDZO, x = 'Россети Северо-Запад/')
} else {
    sZB = (sZB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('sZB: ' + sZB)

i = VseDZO.indexOf('Сибирь')

if (i > -1) {
    dZONum = (dZONum + 1)

    siB = GetAllData(path, dZONum, VseDZO, x = 'Россети Сибирь (ГК)/')
} else {
    siB = (siB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('siB: ' + siB)

i = VseDZO.indexOf('Томск')

if (i > -1) {
    dZONum = (dZONum + 1)

    tomB = GetAllData(path, dZONum, VseDZO, x = 'Россети Томск/')
} else {
    tomB = (tomB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('tomB: ' + tomB)

i = VseDZO.indexOf('Тюмень')

if (i > -1) {
    dZONum = (dZONum + 1)

    tyumB = GetAllData(path, dZONum, VseDZO, x = 'Россети Тюмень/')
} else {
    tyumB = (tyumB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('tyumB: ' + tyumB)

i = VseDZO.indexOf('Урал')

if (i > -1) {
    dZONum = (dZONum + 1)

    urB = GetAllData(path, dZONum, VseDZO, x = 'Россети Урал (ГК)/')
} else {
    urB = (urB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('urB: ' + urB)

i = VseDZO.indexOf('Центр')

if (i > -1) {
    dZONum = (dZONum + 1)

    cenB = GetAllData(path, dZONum, VseDZO, x = 'Россети Центр (ГК)/')
} else {
    cenB = (cenB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('cenB: ' + cenB)

i = VseDZO.indexOf('Приволжье')

if (i > -1) {
    dZONum = (dZONum + 1)

    cIPB = GetAllData(path, dZONum, VseDZO, x = 'Россети Центр и Приволжье (ГК)/')
} else {
    cIPB = (cIPB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('cIPB: ' + cIPB)

i = VseDZO.indexOf('Юг')

if (i > -1) {
    dZONum = (dZONum + 1)

    ugB = GetAllData(path, dZONum, VseDZO, x = 'Россети Юг (ГК)/')
} else {
    ugB = (ugB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('ugB: ' + ugB)

i = VseDZO.indexOf('Янтарь')

if (i > -1) {
    dZONum = (dZONum + 1)

    yB = GetAllData(path, dZONum, VseDZO, x = 'Россети Янтарь/')
} else {
    yB = (yB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
}

println('yB: ' + yB)

VseDZO = WebUI.getText(findTestObject(path + 'Список ДЗО'))

if (blockNum == 2) {
    if (WebUI.verifyEqual(pRR, pRB) == false) {
        def result = CompareDZOData(a = pRR, b = pRB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, 
            x, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(fR, fB) == false) {
        def result = CompareDZOData(a = fR, b = fB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, 
            x, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(tyR, tyB) == false) {
        def result = CompareDZOData(a = tyR, b = tyB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, 
            x, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(chR, chB) == false) {
        def result = CompareDZOData(a = chR, b = chB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, 
            x, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(vR, vB) == false) {
        def result = CompareDZOData(a = vR, b = vB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, 
            x, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(kR, kB) == false) {
        def result = CompareDZOData(a = kR, b = kB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, 
            x, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(lR, lB) == false) {
        def result = CompareDZOData(a = lR, b = lB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, 
            x, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(mR, mB) == false) {
        def result = CompareDZOData(a = mR, b = mB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, 
            x, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(sKR, sKB) == false) {
        def result = CompareDZOData(a = sKR, b = sKB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, 
            x, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(sZR, sZB) == false) {
        def result = CompareDZOData(a = sZR, b = sZB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, 
            x, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(siR, siB) == false) {
        def result = CompareDZOData(a = siR, b = siB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, 
            x, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(tomR, tomB) == false) {
        def result = CompareDZOData(a = tomR, b = tomB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, 
            x, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(tyumR, tyumB) == false) {
        def result = CompareDZOData(a = tyumR, b = tyumB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, 
            x, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(urR, urB) == false) {
        def result = CompareDZOData(a = urR, b = urB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, 
            x, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(cenR, cenB) == false) {
        def result = CompareDZOData(a = cenR, b = cenB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, 
            x, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(cIPR, cIPB) == false) {
        def result = CompareDZOData(a = cIPR, b = cIPB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, 
            x, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(ugR, ugB) == false) {
        def result = CompareDZOData(a = ugR, b = ugB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, 
            x, vidget, tabR, tabB, o1R, o1B)
    }
    
    if (WebUI.verifyEqual(yR, yB) == false) {
        def result = CompareDZOData(a = yR, b = yB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, 
            x, vidget, tabR, tabB, o1R, o1B)
    }
}

WebUI.closeBrowser()

def CompareDZOData(def a, def b, def dZO, def typeOfData, def PercPlanR, def PercPlanB, def PercFactR, def PercFactB, def todaysDate, def x, def tabR, def tabB, def o1R, def o1B, def vidget) {
    int ii2

    if (WebUI.verifyEqual(a, b) == false) {
        vidget = 'Уровень потерь электроэнергии'

        typeOfData = 'План'

        PercPlanR = GetPercPlanR(x = a)

        PercPlanB = GetPercPlanB(x = b)

        if (WebUI.verifyEqual(PercPlanR, PercPlanB) == false) {
            def result = WriteToExcel(typeOfData, todaysDate, PercPlanR, PercPlanB, PercFactR, PercFactB, x, tabR, tabB, 
                o1R, o1B, vidget)
        }
        
        typeOfData = 'Факт'

        PercFactR = GetPercFactR(x = a)

        PercFactB = GetPercFactB(x = b)

        if (WebUI.verifyEqual(PercFactR, PercFactB) == false) {
            def result = WriteToExcel(typeOfData, todaysDate, PercPlanR, PercPlanB, PercFactR, PercFactB, x, tabR, tabB, 
                o1R, o1B, vidget)
        }
        
        vidget = 'Показатели баланса электроэнергии по ДЗО – Факт'

        typeOfData = 'Факт Отпуск в сеть'

        tabR = GetOvSFactR(x = a)

        tabB = GetOvSFactB(x = b)

        if (WebUI.verifyEqual(tabR, tabB) == false) {
            def result = WriteToExcel(typeOfData, todaysDate, PercPlanR, PercPlanB, PercFactR, PercFactB, x, tabR, tabB, 
                o1R, o1B, vidget)
        }
        
        typeOfData = 'Факт Отпуск из сети'

        tabR = GetOiSFactR(x = a)

        tabB = GetOiSFactB(x = b)

        if (WebUI.verifyEqual(tabR, tabB) == false) {
            def result = WriteToExcel(typeOfData, todaysDate, PercPlanR, PercPlanB, PercFactR, PercFactB, x, tabR, tabB, 
                o1R, o1B, vidget)
        }
        
        typeOfData = 'Факт Потери'

        tabR = GetPFactR(x = a)

        tabB = GetPFactB(x = b)

        println((tabR + '/') + tabB)

        if (WebUI.verifyEqual(tabR, tabB) == false) {
            def result = WriteToExcel(typeOfData, todaysDate, PercPlanR, PercPlanB, PercFactR, PercFactB, x, tabR, tabB, 
                o1R, o1B, vidget)
        }
        
        vidget = 'Показатели баланса электроэнергии по ДЗО – План'

        typeOfData = 'План Отпуск в сеть'

        tabR = GetOvSPlanR(x = a)

        tabB = GetOvSPlanB(x = b)

        println((tabR + '/') + tabB)

        if (WebUI.verifyEqual(tabR, tabB) == false) {
            def result = WriteToExcel(typeOfData, todaysDate, PercPlanR, PercPlanB, PercFactR, PercFactB, x, tabR, tabB, 
                o1R, o1B, vidget)
        }
        
        typeOfData = 'План Отпуск из сети'

        tabR = GetOiSPlanR(x = a)

        tabB = GetOiSPlanB(x = b)

        println((tabR + '/') + tabB)

        if (WebUI.verifyEqual(tabR, tabB) == false) {
            def result = WriteToExcel(typeOfData, todaysDate, PercPlanR, PercPlanB, PercFactR, PercFactB, x, tabR, tabB, 
                o1R, o1B, vidget)
        }
        
        typeOfData = 'План Потери'

        tabR = GetPPlanR(x = a)

        tabB = GetPPlanB(x = b)

        println((tabR + '/') + tabB)

        if (WebUI.verifyEqual(tabR, tabB) == false) {
            def result = WriteToExcel(typeOfData, todaysDate, PercPlanR, PercPlanB, PercFactR, PercFactB, x, tabR, tabB, 
                o1R, o1B, vidget)
        }
        
        ii2 = a.indexOf('ПАО')

        if (ii2 == -1) {
            vidget = 'Отклонения фактического уровня потерь от бизнес-плана'

            typeOfData = 'Коэффициент'

            o1R = Geto1R(x = a)

            o1B = Geto1B(x = b)

            println((o1R + '/') + o1B)

            if (WebUI.verifyEqual(PercFactR, PercFactB) == false) {
                def result = WriteToExcel(typeOfData, todaysDate, PercPlanR, PercPlanB, PercFactR, PercFactB, x, tabR, tabB, 
                    o1R, o1B, vidget)
            }
        }
    }
}

def GetAllPAOData(def path, def dZONum, def VseDZO, def x) {
    String path2 = 'Значения со страницы Выполнение бизнес-плана/Table Data/'

    int ii

    int i1

    String z

    String z1

    println('path: ' + path)

    z = WebUI.getText(findTestObject(path + 'Итого')).replaceAll('[\\r?\n|\r]', '/')

    ii = (z.indexOf('%') + 2)

    if (ii > -1) {
        z = z.substring(ii, z.length())

        println(z)
    }
    
    ii = (z.indexOf('/1/100') - 1)

    if (ii > -1) {
        z = z.substring(0, ii)

        println(z)
    }
    
    ii = z.indexOf('План')

    if (ii > -1) {
        z = z.substring(0, ii)

        println(z)
    }
    
    ii = (z.indexOf('/') + 1)

    z1 = z.substring(0, ii)

    println(z1)

    z = z.substring(ii, z.length())

    println(z)

    ii = (z1.length() / 2)

    z1 = z1.substring(0, ii).replace('/', '').replaceAll('[\\r?\n|\r]', '/').trim()

    println(z1)

    ii = (z.length() / 2)

    z = z.substring(0, ii).replace('/', '').trim()

    println(z)

    x = (((x + z1) + '/') + z)

    println(x)

    if (WebUI.verifyElementPresent(findTestObject(path + 'Таблица Итого-Факт'), 30)) {
        z = WebUI.getText(findTestObject(path + 'Таблица Итого-Факт')).replaceAll('[\\r?\n|\r]', '/').replaceAll('\\s+', 
            '').replaceAll('[а-яА-Я]', '')

        println(z)

        x = ((x + '/') + z)

        println(x)

        WebUI.click(findTestObject(path + 'Кнопка План'))

        z = WebUI.getText(findTestObject(path + 'Таблица Итого-План')).replaceAll('[\\r?\n|\r]', '/').replaceAll('\\s+', 
            '').replaceAll('[а-яА-Я]', '')

        x = ((x + '/') + z)

        println(x)

        WebUI.click(findTestObject(path + 'Кнопка Факт'))
    } else {
        z = WebUI.getText(findTestObject(path + 'Факт Отпуск в сеть за отчётный период ПАО Россети')).replaceAll('\\s+', 
            '')

        x = ((x + '/') + z)

        z = WebUI.getText(findTestObject(path + 'Факт Отпуск из сети за отчётный период ПАО Россети')).replaceAll('\\s+', 
            '')

        x = ((x + '/') + z)

        z = WebUI.getText(findTestObject(path + 'Факт Потери за отчётный период ПАО Россети')).replaceAll('\\s+', '')

        x = ((x + '/') + z)

        z = WebUI.getText(findTestObject(path + 'План Отпуск в сеть за отчётный период ПАО Россети')).replaceAll('\\s+', 
            '')

        x = ((x + '/') + z)

        z = WebUI.getText(findTestObject(path + 'План Отпуск из сети за отчётный период ПАО Россети')).replaceAll('\\s+', 
            '')

        x = ((x + '/') + z)

        z = WebUI.getText(findTestObject(path + 'План Потери за отчётный период ПАО Россети')).replaceAll('\\s+', '')

        x = ((x + '/') + z)
    }
    
    return x
}

def GetAllData(def path, def dZONum, def VseDZO, def x) {
    int ii

    int i1

    String z

    String path2 = 'Значения со страницы Выполнение бизнес-плана/Table Data/'
	
    println('path: ' + path)

    println('dZONum: ' + dZONum)

    z = WebUI.getText(findTestObject((path + 'spanPlan') + dZONum))

    println(z)

    if (z != '') {
        ii = z.indexOf('|')

        if (ii > -1) {
            z = z.substring(0, z.length() - 1)

            println(z)
        }
        
        z = z.replaceAll('\\s+', '')

        z = z.replace('[\\r?\n|\r]', '/')

        println(z)

        x = (x + z)

        z = WebUI.getText(findTestObject((path + 'spanFact') + dZONum))

        ii = z.indexOf('|')

        if (ii > -1) {
            z = z.replace('|', '').substring(0, z.length() - 1).replace('[\\r?\n|\r]', '/')
        }
        
        x = ((x + '/') + z)

        z = WebUI.getText(findTestObject(((path + path2) + 'Факт Отпуск в сеть за отчётный период ') + dZONum)).replaceAll(
            '\\s+', '')

        println('z=' + z)

        x = ((x + '/') + z)

        z = WebUI.getText(findTestObject(((path + path2) + 'Факт Отпуск из сети за отчётный период ') + dZONum)).replaceAll(
            '\\s+', '')

        x = ((x + '/') + z)

        z = WebUI.getText(findTestObject(((path + path2) + 'Факт Потери за отчётный период ') + dZONum)).replaceAll('\\s+', 
            '')

        x = ((x + '/') + z)

        z = WebUI.getText(findTestObject(((path + path2) + 'План Отпуск в сеть за отчётный период ') + dZONum)).replaceAll(
            '\\s+', '')

        x = ((x + '/') + z)

        z = WebUI.getText(findTestObject(((path + path2) + 'План Отпуск из сети за отчётный период ') + dZONum)).replaceAll(
            '\\s+', '')

        x = ((x + '/') + z)

        z = WebUI.getText(findTestObject(((path + path2) + 'План Потери за отчётный период ') + dZONum)).replaceAll('\\s+', 
            '')

        x = ((x + '/') + z)

        z = WebUI.getText(findTestObject(path + 'Список ДЗО 2')).replaceAll('[\\r?\n|\r]', '/')

        for (ii = 1; ii < dZONum; ii++) {
            i1 = (z.indexOf('/') + 1)

            if (i1 > -1) {
                z = z.substring(i1, z.length())

                i1 = z.indexOf('/')
            }
        }
        
        i1 = z.indexOf('/')

        if (i1 > -1) {
            z = z.substring(0, i1)
        }
        
        z = z.replace(',', '.')

        println(z)

        x = ((x + '/') + z)

        x = x.replaceAll('[\\r?\n|\r]', '')
    } else {
        x = (x + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
    }
    
    println('x =' + x)

    return x
}

def GetPercPlanR(def x) {
    int i1

    i1 = (x.indexOf('/') + 1)

    if (i1 > -1) {
        x = x.substring(i1, x.length())
    }
    
    i1 = x.indexOf('/')

    if (i1 > -1) {
        x = x.substring(0, i1)

        return x
    }
}

def GetPercPlanB(def x) {
    int i1

    i1 = (x.indexOf('/') + 1)

    if (i1 > -1) {
        x = x.substring(i1, x.length())
    }
    
    i1 = x.indexOf('/')

    if (i1 > -1) {
        x = x.substring(0, i1)
    }
    
    return x
}

def GetPercFactR(def x) {
    int i1

    int ii

    for (ii = 1; ii < 3; ii++) {
        i1 = (x.indexOf('/') + 1)

        if (i1 > -1) {
            x = x.substring(i1, x.length())

            println(x)
        }
    }
    
    i1 = x.indexOf('/')

    if (i1 > -1) {
        x = x.substring(0, i1)
    }
    
    println(x)

    return x
}

def GetPercFactB(def x) {
    int i1

    int ii

    for (ii = 1; ii < 3; ii++) {
        i1 = (x.indexOf('/') + 1)

        if (i1 > -1) {
            x = x.substring(i1, x.length())

            println(x)
        }
    }
    
    i1 = x.indexOf('/')

    if (i1 > -1) {
        x = x.substring(0, i1)
    }
    
    println(x)

    return x
}

def GetOvSFactR(def x) {
    int i1

    int ii

    for (ii = 1; ii < 4; ii++) {
        i1 = (x.indexOf('/') + 1)

        if (i1 > -1) {
            x = x.substring(i1, x.length())

            println(x)
        }
    }
    
    i1 = x.indexOf('/')

    if (i1 > -1) {
        x = x.substring(0, i1)
    }
    
    println(x)

    return x
}

def GetOvSFactB(def x) {
    int i1

    int ii

    for (ii = 1; ii < 4; ii++) {
        i1 = (x.indexOf('/') + 1)

        if (i1 > -1) {
            x = x.substring(i1, x.length())

            println(x)
        }
    }
    
    i1 = x.indexOf('/')

    if (i1 > -1) {
        x = x.substring(0, i1)
    }
    
    println(x)

    return x
}

def GetOiSFactR(def x) {
    int i1

    int ii

    for (ii = 1; ii < 5; ii++) {
        i1 = (x.indexOf('/') + 1)

        if (i1 > -1) {
            x = x.substring(i1, x.length())

            println(x)
        }
    }
    
    i1 = x.indexOf('/')

    if (i1 > -1) {
        x = x.substring(0, i1)
    }
    
    println(x)

    return x
}

def GetOiSFactB(def x) {
    int i1

    int ii

    for (ii = 1; ii < 5; ii++) {
        i1 = (x.indexOf('/') + 1)

        if (i1 > -1) {
            x = x.substring(i1, x.length())

            println(x)
        }
    }
    
    i1 = x.indexOf('/')

    if (i1 > -1) {
        x = x.substring(0, i1)
    }
    
    println(x)

    return x
}

def GetPFactR(def x) {
    int i1

    int ii

    for (ii = 1; ii < 6; ii++) {
        i1 = (x.indexOf('/') + 1)

        if (i1 > -1) {
            x = x.substring(i1, x.length())

            println(x)
        }
    }
    
    i1 = x.indexOf('/')

    if (i1 > -1) {
        x = x.substring(0, i1)
    }
    
    println(x)

    return x
}

def GetPFactB(def x) {
    int i1

    int ii

    for (ii = 1; ii < 6; ii++) {
        i1 = (x.indexOf('/') + 1)

        if (i1 > -1) {
            x = x.substring(i1, x.length())

            println(x)
        }
    }
    
    i1 = x.indexOf('/')

    if (i1 > -1) {
        x = x.substring(0, i1)
    }
    
    println(x)

    return x
}

def GetOvSPlanR(def x) {
    int i1

    int ii

    for (ii = 1; ii < 7; ii++) {
        i1 = (x.indexOf('/') + 1)

        if (i1 > -1) {
            x = x.substring(i1, x.length())

            println(x)
        }
    }
    
    i1 = x.indexOf('/')

    if (i1 > -1) {
        x = x.substring(0, i1)
    }
    
    println(x)

    return x
}

def GetOvSPlanB(def x) {
    int i1

    int ii

    for (ii = 1; ii < 7; ii++) {
        i1 = (x.indexOf('/') + 1)

        if (i1 > -1) {
            x = x.substring(i1, x.length())

            println(x)
        }
    }
    
    i1 = x.indexOf('/')

    if (i1 > -1) {
        x = x.substring(0, i1)
    }
    
    println(x)

    return x
}

def GetOiSPlanR(def x) {
    int i1

    int ii

    for (ii = 1; ii < 8; ii++) {
        i1 = (x.indexOf('/') + 1)

        if (i1 > -1) {
            x = x.substring(i1, x.length())

            println(x)
        }
    }
    
    i1 = x.indexOf('/')

    if (i1 > -1) {
        x = x.substring(0, i1)
    }
    
    println(x)

    return x
}

def GetOiSPlanB(def x) {
    int i1

    int ii

    for (ii = 1; ii < 8; ii++) {
        i1 = (x.indexOf('/') + 1)

        if (i1 > -1) {
            x = x.substring(i1, x.length())

            println(x)
        }
    }
    
    i1 = x.indexOf('/')

    if (i1 > -1) {
        x = x.substring(0, i1)
    }
    
    println(x)

    return x
}

def GetPPlanR(def x) {
    int i1

    int ii

    for (ii = 1; ii < 9; ii++) {
        i1 = (x.indexOf('/') + 1)

        if (i1 > -1) {
            x = x.substring(i1, x.length())

            println(x)
        }
    }
    
    i1 = x.indexOf('/')

    if (i1 > -1) {
        x = x.substring(0, i1)
    }
    
    println(x)

    return x
}

def GetPPlanB(def x) {
    int i1

    int ii

    for (ii = 1; ii < 9; ii++) {
        i1 = (x.indexOf('/') + 1)

        if (i1 > -1) {
            x = x.substring(i1, x.length())

            println(x)
        }
    }
    
    i1 = x.indexOf('/')

    if (i1 > -1) {
        x = x.substring(0, i1)
    }
    
    println(x)

    return x
}

def Geto1R(def x) {
    int i1

    int ii

    for (ii = 1; ii < 10; ii++) {
        i1 = (x.indexOf('/') + 1)

        if (i1 > -1) {
            x = x.substring(i1, x.length())
        }
    }
    
    i1 = x.indexOf('/')

    if (i1 > -1) {
        x = x.substring(0, i1)
    }
    
    println(x)

    return x
}

def Geto1B(def x) {
    int i1

    int ii

    for (ii = 1; ii < 10; ii++) {
        i1 = (x.indexOf('/') + 1)

        if (i1 > -1) {
            x = x.substring(i1, x.length())
        }
    }
    
    i1 = x.indexOf('/')

    if (i1 > -1) {
        x = x.substring(0, i1)
    }
    
    println(x)

    return x
}

def WriteToExcel(def typeOfData, def todaysDate, def PercPlanR, def PercPlanB, def PercFactR, def PercFactB, def dZO, def tabR, def tabB, def o1R, def o1B, def vidget) {
    int iii = dZO.indexOf('/')

    println(iii)

    dZO = dZO.substring(0, iii)

    println(dZO)

    println(PercPlanR)

    println(PercPlanB)

    println(PercFactR)

    println(PercFactB)

    println(tabR)

    println(tabB)

    println(o1R)

    println(o1B)

    Double PR

    Double FR

    Double PB

    Double FB

    int TR

    int TB

    String sheetName = 'Sheet1'

    def data = findTestData('PlanFact')

    int n = data.getRowNumbers() + 1

    int day = todaysDate.substring(0, todaysDate.indexOf('.')).toInteger()

    println(day)

    int month = todaysDate.substring(todaysDate.indexOf('.') + 1, todaysDate.lastIndexOf('.')).toInteger()

    println(month)

    int y = todaysDate.substring(todaysDate.length() - 4, todaysDate.length()).toInteger()

    if ((month < 3) && (day < 30)) {
        y = (y - 1)
    }
    
    println(y)

    String m = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Фильтр Дата'))

    if (y.toString().length() == 4) {
        m = m.substring(0, m.indexOf(y.toString()))
    }
    
    m = m.trim()

    if (m == '') {
        m = 'весь год'
    }
    
    String dashboardName = 'Выполнение бизнес-плана'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, typeOfData)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, typeOfData)

    if (typeOfData == 'План') {
        if (PercPlanR == null) {
        } else {
            if (PercPlanR == 'нет данных') {
                ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, 'нет данных')
            } else {
                PR = PercPlanR.toDouble()

                ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, PR)
            }
        }
        
        if (PercPlanB == null) {
        } else {
            if (PercPlanB == 'нет данных') {
                ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, 'нет данных')
            } else {
                PB = PercPlanB.toDouble()

                ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, PB)
            }
        }
    } else if (typeOfData == 'Факт') {
        if (PercFactR == null) {
        } else {
            if (PercFactR == 'нет данных') {
                ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, 'нет данных')
            } else {
                FR = PercFactR.toDouble()

                ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, FR)
            }
        }
        
        if (PercFactB == null) {
        } else {
            if (PercFactB == 'нет данных') {
                ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, 'нет данных')
            } else {
                FB = PercFactB.toDouble()

                ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, FB)
            }
        }
    } else if (vidget.contains('электроэнергии') == true) {
        if (tabR == null) {
        } else {
            if (tabR == 'нет данных') {
                ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, 'нет данных')
            } else {
                TR = tabR.toInteger()

                ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, TR)
            }
        }
        
        if (tabB == null) {
        } else {
            if (tabB == 'нет данных') {
                ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, 'нет данных')
            } else {
                TB = tabB.toInteger()

                ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, TB)
            }
        }
    } else {
        if (o1R == null) {
        } else {
            if (o1R == 'нет данных') {
                ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, 'нет данных')
            } else {
                FR = o1R.toDouble()

                ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, FR)
            }
        }
        
        if (o1B == null) {
        } else {
            if (o1B == 'нет данных') {
                ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, 'нет данных')
            } else {
                FB = o1B.toDouble()

                ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, FB)
            }
        }
    }
    
    ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, m)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 7, y)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 8, todaysDate)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

static def Presettings(def blockNum, def path) {
    int blockNumber

    String urlText

    String searchWord

    int i

    int ii

    WebUI.openBrowser('')

    if (blockNum == 1) {
        path = 'Object Repository/Выполнение бизнес-плана/'

        blockNumber = 1
    } else {
        path = 'Object Repository/Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/'

        blockNumber = 4
    }
    
    WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, blockNumber))

    urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))

    WebUI.delay(10)

    searchWord = 'Вход'

    if (urlText.contains(searchWord) == false) {
        for (urlText.contains(searchWord) == false; i < 4; ii++) {
            i = (i + 1)

            WebUI.refresh()

            WebUI.delay(20)

            WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, blockNumber))

            WebUI.delay(10)

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

            WebUI.delay(10)

            urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))
        }
    }
    
    ZakrytOpoveshenie()

    'Раскрыть фильтр "Дата"'
    WebUI.click(findTestObject(path + 'Фильтр Дата'))

    'Нажать "Снять выделение"'
    WebUI.click(findTestObject(path + 'Снять выделение в фильтре Дата'))

    'Нажать "Применить"'
    WebUI.click(findTestObject(path + 'Применить в фильтре Дата'))

    WebUI.delay(50)

    ZakrytOpoveshenie()

    'Раскрыть фильтр "Дата"'
    WebUI.click(findTestObject(path + 'Фильтр Дата'))

    WebUI.scrollToElement(findTestObject(path + '2025 список'), 30)

    'Выбрать нужную дату'
    WebUI.click(findTestObject(path + '2025 список'))

    WebUI.scrollToElement(findTestObject(path + '1 квартал 2025 список'), 30)

    'Выбрать нужную дату'
    WebUI.click(findTestObject(path + '1 квартал 2025'))

    'Проскроллить до заголовка дашборда'
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

