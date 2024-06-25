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

	String PercPlanR
	String PercPlanB
	String PercFactR
	String PercFactB

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
	
	i = VseDZO.indexOf('ЕЭС')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
		
			def GetDZOData = new GetDZOData()
		
			fR = GetDZOData.GetAllData(path, dZONum, y = 'Россети ФСК ЕЭС/')
		} else {
			fR = (fR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('fR: ' + fR)
	
		i = VseDZO.indexOf('Тываэнерго')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			tyR = GetDZOData.GetAllData(path, dZONum, y = 'АО "Тываэнерго"/')
		} else {
			tyR = (tyR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('tyR: ' + tyR)
	
		i = VseDZO.indexOf('Чеченэнерго')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			chR = GetDZOData.GetAllData(path, dZONum, y = 'АО "Чеченэнерго"/')
		} else {
			chR = (chR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('chR: ' + chR)
	
		i = VseDZO.indexOf('Волга')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			vR = GetDZOData.GetAllData(path, dZONum, y = 'Россети Волга/')
		} else {
			vR = (vR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('vR: ' + vR)
	
		i = VseDZO.indexOf('Кубань')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			kR = GetDZOData.GetAllData(path, dZONum, y = 'Россети Кубань/')
		} else {
			kR = (kR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('kR: ' + kR)
	
		i = VseDZO.indexOf('Ленэнерго')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			lR = GetDZOData.GetAllData(path, dZONum, y = 'Россети Ленэнерго (ГК)/')
		} else {
			lR = (lR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('lR: ' + lR)
	
		i = VseDZO.indexOf('Московский')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			mR = GetDZOData.GetAllData(path, dZONum, y = 'Россети Московский регион/')
		} else {
			mR = (mR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('mR: ' + mR)
	
		i = VseDZO.indexOf('Кавказ')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			sKR = GetDZOData.GetAllData(path, dZONum, y = 'Россети Северный Кавказ (ГК)/')
		} else {
			sKR = (sKR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('sKR: ' + sKR)
	
		i = VseDZO.indexOf('Запад')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			sZR = GetDZOData.GetAllData(path, dZONum, y = 'Россети Северо-Запад/')
		} else {
			sZR = (sZR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('sZR: ' + sZR)
	
		i = VseDZO.indexOf('Сибирь')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			siR = GetDZOData.GetAllData(path, dZONum, y = 'Россети Сибирь (ГК)/')
		} else {
			siR = (siR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('siR: ' + siR)
	
		i = VseDZO.indexOf('Томск')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			tomR = GetDZOData.GetAllData(path, dZONum, y = 'Россети Томск/')
		} else {
			tomR = (tomR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('tomR: ' + tomR)
	
		i = VseDZO.indexOf('Тюмень')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			tyumR = GetDZOData.GetAllData(path, dZONum, y = 'Россети Тюмень/')
		} else {
			tyumR = (tyumR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('tyumR: ' + tyumR)
	
		i = VseDZO.indexOf('Урал')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			urR = GetDZOData.GetAllData(path, dZONum, y = 'Россети Урал (ГК)/')
		} else {
			urR = (urR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('urR: ' + urR)
	
		i = VseDZO.indexOf('Центр')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			cenR = GetDZOData.GetAllData(path, dZONum, y = 'Россети Центр (ГК)/')
		} else {
			cenR = (cenR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('cenR: ' + cenR)
	
		i = VseDZO.indexOf('Приволжье')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			cIPR = GetDZOData.GetAllData(path, dZONum, y = 'Россети Центр и Приволжье (ГК)/')
		} else {
			cIPR = (cIPR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('cIPR: ' + cIPR)
	
		i = VseDZO.indexOf('Юг')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			ugR = GetDZOData.GetAllData(path, dZONum, y = 'Россети Юг (ГК)/')
		} else {
			ugR = (ugR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('ugR: ' + ugR)
	
		i = VseDZO.indexOf('Янтарь')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			yR = GetDZOData.GetAllData(path, dZONum, y = 'Россети Янтарь/')
		} else {
			yR = (yR + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('yR: ' + yR)
	
		
		blockNum = 2
	
		path = 'Object Repository/Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/'
		
		Presettings(blockNum, path)
				
		VseDZO = WebUI.getText(findTestObject(path + 'Список ДЗО'))
		
		dZONum = 0
		
		i = VseDZO.indexOf('ЕЭС')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			fB = GetDZOData.GetAllData(path, dZONum, y = 'Россети ФСК ЕЭС/')
		} else {
			fB = (fB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('fB: ' + fB)
	
		i = VseDZO.indexOf('Тываэнерго')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			tyB = GetDZOData.GetAllData(path, dZONum, y = 'АО "Тываэнерго"/')
		} else {
			tyB = (tyB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('tyB: ' + tyB)
	
		i = VseDZO.indexOf('Чеченэнерго')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			chB = GetDZOData.GetAllData(path, dZONum, y = 'АО "Чеченэнерго"/')
		} else {
			chB = (chB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('chB: ' + chB)
	
		i = VseDZO.indexOf('Волга')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			vB = GetDZOData.GetAllData(path, dZONum, y = 'Россети Волга/')
		} else {
			vB = (vB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('vB: ' + vB)
	
		i = VseDZO.indexOf('Кубань')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			kB = GetDZOData.GetAllData(path, dZONum, y = 'Россети Кубань/')
		} else {
			kB = (kB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('kB: ' + kB)
	
		i = VseDZO.indexOf('Ленэнерго')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			lB = GetDZOData.GetAllData(path, dZONum, y = 'Россети Ленэнерго (ГК)/')
		} else {
			lB = (lB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('lB: ' + lB)
	
		i = VseDZO.indexOf('Московский')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			mB = GetDZOData.GetAllData(path, dZONum, y = 'Россети Московский регион/')
		} else {
			mB = (mB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('mB: ' + mB)
	
		i = VseDZO.indexOf('Кавказ')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			sKB = GetDZOData.GetAllData(path, dZONum, y = 'Россети Северный Кавказ (ГК)/')
		} else {
			sKB = (sKB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('sKB: ' + sKB)
	
		i = VseDZO.indexOf('Запад')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			sZB = GetDZOData.GetAllData(path, dZONum, y = 'Россети Северо-Запад/')
		} else {
			sZB = (sZB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('sZB: ' + sZB)
	
		i = VseDZO.indexOf('Сибирь')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			siB = GetDZOData.GetAllData(path, dZONum, y = 'Россети Сибирь (ГК)/')
		} else {
			siB = (siB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('siB: ' + siB)
	
		i = VseDZO.indexOf('Томск')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			tomB = GetDZOData.GetAllData(path, dZONum, y = 'Россети Томск/')
		} else {
			tomB = (tomB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('tomB: ' + tomB)
	
		i = VseDZO.indexOf('Тюмень')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			tyumB = GetDZOData.GetAllData(path, dZONum, y = 'Россети Тюмень/')
		} else {
			tyumB = (tyumB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('tyumB: ' + tyumB)
	
		i = VseDZO.indexOf('Урал')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			urB = GetDZOData.GetAllData(path, dZONum, y = 'Россети Урал (ГК)/')
		} else {
			urB = (urB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('urB: ' + urB)
	
		i = VseDZO.indexOf('Центр')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			cenB = GetDZOData.GetAllData(path, dZONum, y = 'Россети Центр (ГК)/')
		} else {
			cenB = (cenB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('cenB: ' + cenB)
	
		i = VseDZO.indexOf('Приволжье')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			cIPB = GetDZOData.GetAllData(path, dZONum, y = 'Россети Центр и Приволжье (ГК)/')
		} else {
			cIPB = (cIPB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('cIPB: ' + cIPB)
	
		i = VseDZO.indexOf('Юг')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			ugB = GetDZOData.GetAllData(path, dZONum, y = 'Россети Юг (ГК)/')
		} else {
			ugB = (ugB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('ugB: ' + ugB)
	
		i = VseDZO.indexOf('Янтарь')
	
		if (i > -1) {
			dZONum = (dZONum + 1)
	
			def GetDZOData = new GetDZOData()
	
			yB = GetDZOData.GetAllData(path, dZONum, y = 'Россети Янтарь/')
		} else {
			yB = (yB + 'нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных/нет данных')
		}
		
		println('yB: ' + yB)
	
	
	VseDZO = WebUI.getText(findTestObject(path + 'Список ДЗО'))


	if (blockNum == 2) {
			
		if(WebUI.verifyEqual(fR, fB)==false) {
			def Compare = new Compare()
			def result = Compare.CompareDZOData(a=fR, b=fB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, vidget, tabR, tabB)
		}
		
		if(WebUI.verifyEqual(tyR, tyB)==false) {
			def Compare = new Compare()
			def result = Compare.CompareDZOData(a=tyR, b=tyB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, vidget, tabR, tabB)
		}
		
		if(WebUI.verifyEqual(chR, chB)==false) {
			def Compare = new Compare()
			def result = Compare.CompareDZOData(a=chR, b=chB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, vidget, tabR, tabB)
		}
		
		if(WebUI.verifyEqual(vR, vB)==false) {
			def Compare = new Compare()
			def result = Compare.CompareDZOData(a=vR, b=vB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, vidget, tabR, tabB)
		}
		
		if(WebUI.verifyEqual(kR, kB)==false) {
			def Compare = new Compare()
			def result = Compare.CompareDZOData(a=kR, b=kB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, vidget, tabR, tabB)
		}
		
		if(WebUI.verifyEqual(lR, lB)==false) {
			def Compare = new Compare()
			def result = Compare.CompareDZOData(a=lR, b=lB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, vidget, tabR, tabB)
		}
		
		if(WebUI.verifyEqual(mR, mB)==false) {
			def Compare = new Compare()
			def result = Compare.CompareDZOData(a=mR, b=mB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, vidget, tabR, tabB)
		}
		
		if(WebUI.verifyEqual(sKR, sKB)==false) {
			def Compare = new Compare()
			def result = Compare.CompareDZOData(a=sKR, b=sKB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, vidget, tabR, tabB)
		}
		
		if(WebUI.verifyEqual(sZR, sZB)==false) {
			def Compare = new Compare()
			def result = Compare.CompareDZOData(a=sZR, b=sZB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, vidget, tabR, tabB)
		}
		
		if(WebUI.verifyEqual(siR, siB)==false) {
			def Compare = new Compare()
			def result = Compare.CompareDZOData(a=siR, b=siB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, vidget, tabR, tabB)
		}
		
		if(WebUI.verifyEqual(tomR, tomB)==false) {
			def Compare = new Compare()
			def result = Compare.CompareDZOData(a=tomR, b=tomB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, vidget, tabR, tabB)
		}
		
		if(WebUI.verifyEqual(tyumR, tyumB)==false) {
			def Compare = new Compare()
			def result = Compare.CompareDZOData(a=tyumR, b=tyumB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, vidget, tabR, tabB)
		}
		
		if(WebUI.verifyEqual(urR, urB)==false) {
			def Compare = new Compare()
			def result = Compare.CompareDZOData(a=urR, b=urB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, vidget, tabR, tabB)
		}
		
		if(WebUI.verifyEqual(cenR, cenB)==false) {
			def Compare = new Compare()
			def result = Compare.CompareDZOData(a=cenR, b=cenB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, vidget, tabR, tabB)
		}
		
		if(WebUI.verifyEqual(cIPR, cIPB)==false) {
			def Compare = new Compare()
			def result = Compare.CompareDZOData(a=cIPR, b=cIPB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, vidget, tabR, tabB)
		}
		
		if(WebUI.verifyEqual(ugR, ugB)==false) {
			def Compare = new Compare()
			def result = Compare.CompareDZOData(a=ugR, b=ugB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, vidget, tabR, tabB)
		}
		
		if(WebUI.verifyEqual(yR, yB)==false) {
			def Compare = new Compare()
			def result = Compare.CompareDZOData(a=yR, b=yB, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, vidget, tabR, tabB)
		}
	}


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

	
}


class GetDZOData{
	String path2 = 'Значения со страницы Выполнение бизнес-плана/Table Data/'
	def GetAllData(def path, def dZONum, def y) {
		int ii
	
		y = y + WebUI.getText(findTestObject(path + ('spanPlan'+dZONum)))
	
		ii = y.indexOf('|')
					
		if (ii>-1) {
			y = y.substring(0,(ii-1)).trim()

		}
			
		y = y + '/' + WebUI.getText(findTestObject(path + ('spanFact'+dZONum)))
		
		ii = y.indexOf('|')
			
		if (ii>-1) {
			y = y.substring(0,(ii-1)).trim()

		}
	
		y = y + '/' + WebUI.getText(findTestObject(path + (path2 +('Факт Отпуск в сеть за отчётный период '+dZONum))))
		
		y = y + '/' + WebUI.getText(findTestObject(path + (path2 +('Факт Отпуск из сети за отчётный период '+dZONum))))
		
		y = y + '/' + WebUI.getText(findTestObject(path + (path2 +('Факт Потери за отчётный период '+dZONum))))
		
		y = y + '/' + WebUI.getText(findTestObject(path + (path2 +('План Отпуск в сеть за отчётный период '+dZONum))))
		
		y = y + '/' + WebUI.getText(findTestObject(path + (path2 +('План Отпуск из сети за отчётный период '+dZONum))))
		
		y = y + '/' + WebUI.getText(findTestObject(path + (path2 +('План Потери за отчётный период '+dZONum))))
		println(y)
	
		return y
	}

}


def Compare = new Compare()
def result = Compare.CompareDZOData(a, b, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, vidget, tabOvSR, tabOvSB)


class Compare{
	
		String x
		String z
		def CompareDZOData(a, b, dZO, typeOfData, PercPlanR, PercPlanB, PercFactR, PercFactB, todaysDate, vidget, tabR, tabB) {
			if(WebUI.verifyEqual(a, b)==false) {
				def DZOData = new DZOData()
				dZO = DZOData.GetDZO(x = a)
				
				vidget = 'Уровень потерь электроэнергии'
				typeOfData = 'План'
				
				
				PercPlanR = DZOData.GetPercPlan(x = a)
				PercPlanB = DZOData.GetPercPlan(x = b)
				if(WebUI.verifyEqual(PercPlanR, PercPlanB)==false) {
					def Write = new Write()
					def result = Write.WriteToExcel(typeOfData, todaysDate, PercPlanR, PercPlanB, PercFactR, PercFactB, dZO, vidget, tabR, tabB)
				}
				
				vidget = 'Уровень потерь электроэнергии'
				typeOfData = 'Факт'
				PercFactR = DZOData.GetPercFact(x = a)
				PercFactB = DZOData.GetPercFact(x = b)
				if(WebUI.verifyEqual(PercFactR, PercFactB)==false) {
					def Write = new Write()
					def result = Write.WriteToExcel(typeOfData, todaysDate, PercPlanR, PercPlanB, PercFactR, PercFactB, dZO, vidget, tabR, tabB)
				}
			
				vidget = 'Показатели баланса электроэнергии по ДЗО – Факт'
				typeOfData = 'Факт Отпуск в сеть'
				tabR = DZOData.GetOvSFact(x = a)
				tabB = DZOData.GetOvSFact(x = b)
				if(WebUI.verifyEqual(tabR, tabB)==false) {
					def Write = new Write()
					def result = Write.WriteToExcel(typeOfData, todaysDate, PercPlanR, PercPlanB, PercFactR, PercFactB, dZO, vidget, tabR, tabB)
				}
				vidget = 'Показатели баланса электроэнергии по ДЗО – Факт'
				typeOfData = 'Факт Отпуск из сети'
				tabR = DZOData.GetOiSFact(x = a)
				tabB = DZOData.GetOiSFact(x = b)
				if(WebUI.verifyEqual(tabR, tabB)==false) {
					def Write = new Write()
					def result = Write.WriteToExcel(typeOfData, todaysDate, PercPlanR, PercPlanB, PercFactR, PercFactB, dZO, vidget, tabR, tabB)
				}
				vidget = 'Показатели баланса электроэнергии по ДЗО – Факт'
				typeOfData = 'Факт Потери'
				tabR = DZOData.GetPFact(x = a)
				tabB = DZOData.GetPFact(x = b)
				if(WebUI.verifyEqual(tabR, tabB)==false) {
					def Write = new Write()
					def result = Write.WriteToExcel(typeOfData, todaysDate, PercPlanR, PercPlanB, PercFactR, PercFactB, dZO, vidget, tabR, tabB)
				}
				
				vidget = 'Показатели баланса электроэнергии по ДЗО – План'
				typeOfData = 'План Отпуск в сеть'
				tabR = DZOData.GetOvSPlan(x = a)
				tabB = DZOData.GetOvSPlan(x = b)
				println('tabR:' + tabR)
				println('tabB:' + tabB)
				if(WebUI.verifyEqual(tabR, tabB)==false) {
					def Write = new Write()
					def result = Write.WriteToExcel(typeOfData, todaysDate, PercPlanR, PercPlanB, PercFactR, PercFactB, dZO, vidget, tabR, tabB)
				}
				vidget = 'Показатели баланса электроэнергии по ДЗО – План'
				typeOfData = 'План Отпуск из сети'
				tabR = DZOData.GetOiSPlan(x = a)
				tabB = DZOData.GetOiSPlan(x = b)
				if(WebUI.verifyEqual(tabR, tabB)==false) {
					def Write = new Write()
					def result = Write.WriteToExcel(typeOfData, todaysDate, PercPlanR, PercPlanB, PercFactR, PercFactB, dZO, vidget, tabR, tabB)
				}
				vidget = 'Показатели баланса электроэнергии по ДЗО – План'
				typeOfData = 'План Потери'
				tabR = DZOData.GetPPlan(x = a)
				tabB = DZOData.GetPPlan(x = b)
				if(WebUI.verifyEqual(tabR, tabB)==false) {
					def Write = new Write()
					def result = Write.WriteToExcel(typeOfData, todaysDate, PercPlanR, PercPlanB, PercFactR, PercFactB, dZO, vidget, tabR, tabB)
				}
			}
		}
	}

class DZOData{
	int i1
	int i2
	def GetDZO(x) {
		i1 = x.indexOf('/')
		if(i1>-1) {
			x=x.substring(0, i1)
		}
	}
	
	def GetPercPlan(x){
		i1 = x.indexOf('/')+1
		if(i1>-1) {
			x=x.substring(i1,x.length())
		}
		i1 = x.indexOf('/')
		if(i1>-1) {
			x=x.substring(0, i1)
		}
	}

	def GetPercFact(x){
		for(i2=1;i2<3;i2++) {
			i1 = x.indexOf('/')+1
			if(i1>-1) {
				x=x.substring(i1,x.length())
			}
		}
		i1 = x.indexOf('/')
		if(i1>-1) {
			x=x.substring(0, i1)
		}

	}
	
	def GetOvSFact(x) {
		for(i2=1;i2<4;i2++) {
			i1 = x.indexOf('/')+1
			if(i1>-1) {
				x=x.substring(i1,x.length())
			}
		}
		i1 = x.indexOf('/')
		if(i1>-1) {
			x=x.substring(0, i1)
		}
		
	}
		
	
	def GetOiSFact(x) {
		for(i2=1;i2<5;i2++) {
			i1 = x.indexOf('/')+1
			if(i1>-1) {
				x=x.substring(i1,x.length())
			}
		}
		i1 = x.indexOf('/')
		if(i1>-1) {
			x=x.substring(0, i1)
		}


	}
	def GetPFact(x) {
		for(i2=1;i2<6;i2++) {
			i1 = x.indexOf('/')+1
			if(i1>-1) {
				x=x.substring(i1,x.length())
			}
		}
		i1 = x.indexOf('/')
		if(i1>-1) {
			x=x.substring(0, i1)
		}

	}
	def GetOvSPlan(x) {
		for(i2=1;i2<7;i2++) {
			i1 = x.indexOf('/')+1
			if(i1>-1) {
				x=x.substring(i1,x.length())
			}
		}
		i1 = x.indexOf('/')
		if(i1>-1) {
			x=x.substring(0, i1)
		}
	
	}
			
	def GetOiSPlan(x) {
		for(i2=1;i2<8;i2++) {
			i1 = x.indexOf('/')+1
			if(i1>-1) {
				x=x.substring(i1,x.length())
			}
		}
		i1 = x.indexOf('/')
		if(i1>-1) {
			x=x.substring(0, i1)
		}
	
	}
	def GetPPlan(x) {
		i1 = x.lastIndexOf('/')+1
		if(i1>-1) {
			x=x.substring(i1,x.length())
		}
	}
	
}

WebUI.closeBrowser()


class Write{
	
def WriteToExcel(def typeOfData, def todaysDate, def PercPlanR, def PercPlanB, def PercFactR, def PercFactB, def dZO, def vidget, def tabR, def tabB) {
		println(PercPlanR)
		println(PercPlanB)
		println(PercFactR)
		println(PercFactB)
		println('tabR:' + tabR)
		println('tabB:' + tabB)
		
		Double PR
		Double PB
		Double FR
		Double FB
		int TR
		int TB
		
		String sheetName = 'Sheet1'
	
		def data = findTestData('PlanFact')
	
		int n = data.getRowNumbers() + 1
	
		String year = todaysDate.substring(todaysDate.length() - 4, todaysDate.length())
	
		int y = year.toInteger()
	
		String m = WebUI.getText(findTestObject('Выполнение бизнес-плана/Выполнение бизнес-плана Балансы/Фильтр Дата'))
	
		m = m.substring(0, m.indexOf('2024'))
	
		m = m.trim()
	
		String dashboardName = 'Выполнение бизнес-плана'
	
		def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)
	
		def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)
	
		ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)
	
		ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)
	
		ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, vidget)
		
		ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, typeOfData)
		
		if(typeOfData == 'План') {
						
			if(PercPlanR.contains('нет данных')) {
				ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, 'нет данных')
			}else {
				PR = PercPlanR.toDouble()
				ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, PR)
			}
			
			if(PercPlanB.contains('нет данных')) {
				ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, 'нет данных')
			}else {
				PB = PercPlanB.toDouble()
				ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, PB)
			}
				
		}else if (typeOfData == 'Факт'){
			
			if(PercFactR.contains('нет данных')) {
				ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, 'нет данных')
			}else {
				FR = PercFactR.toDouble()
				ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, FR)
			}
			
			if(PercFactB.contains('нет данных')) {
				ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, 'нет данных')
			}else {
				FB = PercFactB.toDouble()
				ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, FB)
			}

		} else {
			if(tabR.contains('данных')) {
				ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, 'нет данных')
			}else {
				tabR = tabR.replaceAll('\\s+','')
				TR = tabR.toInteger()
				ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, TR)
			}
		
			if(tabB.contains('данных')) {
				ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, 'нет данных')
			}else {
				
				tabB = tabB.replaceAll('\\s+','')
				TB = tabB.toInteger()
				
				ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, TB)
			}
		}

		
		ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, m)
	
		ExcelKeywords.setValueToCellByIndex(sheet01, n, 7, y)
	
		ExcelKeywords.setValueToCellByIndex(sheet01, n, 8, todaysDate)
	
		n = (n + 1)
	
		ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
	}

}


static void ZakrytOpoveshenie() {
	String opoveshenie = WebUI.getText(findTestObject('Выполнение бизнес-плана/Просьба обратить внимание'))

	if (opoveshenie == 'Просьба обратить внимание') {
		WebUI.click(findTestObject('Выполнение бизнес-плана/Закрыть оповещение'))
	}
}

