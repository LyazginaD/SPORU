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

int ii
int i1
String x
String z
String dZO = 'Янтарь'
int dZONum = 4
String strToManage

z = '0.05/-0.99/-0.40/-1.51/-0.19/-0.38/-0.25/-1.05/-0.60/-1.44/-1.52/Россети ФСК ЕЭС/Россети Волга/Россети Московскийрегион/Россети Северо-Запад/Россети Томск/Россети Тюмень/Россети Урал (ГК)/Россети Центр (ГК)/Россети Центр иПриволжье (ГК)/Россети Юг (ГК)/Россети Янтарь/-2/0/2/4/6/8'

strToManage = z

ii = strToManage.indexOf('ГК')

if(ii >-1) {

	for(i1 = 1; i1 > -1; i1--) {
		strToManage = strToManage.substring(0,strToManage.indexOf('ГК')-1)+strToManage.substring(strToManage.indexOf('ГК')+3)
		
		println('strToManage count i1: ' + strToManage)
		
		i1 = strToManage.count('ГК')
		println('i1: ' + i1)

	}

}

z = strToManage

println('z: ' + z)

int lettersStart = z.indexOf('Россети')

println('lettersStart: ' + lettersStart)

strToManage = z.substring(lettersStart,z.length())

println('strToManage: ' + strToManage)

String dZONames = strToManage

strToManage = strToManage.replaceAll('[а-яА-Я]', '')

println('strToManage after letters: ' + strToManage)

strToManage = strToManage.replaceAll(' ', '').replaceAll('/-/', '')

println('strToManage: ' + strToManage)

strToManage = strToManage.substring(strToManage.lastIndexOf('//')+1,strToManage.length())

println('strToManage: ' + strToManage)

ii = z.indexOf(strToManage)

if(ii>-1) {
	z = z.substring(0,ii)+'/'

}

println('z: ' + z)

println('dZONum: ' + dZONum)

strToManage = dZO

if(strToManage.indexOf('(ГК)')>-1) {
	strToManage = strToManage.substring(0,dZO.indexOf('(ГК)'))
}
strToManage = strToManage.replaceAll("\\p{P}", "").replaceAll('\\s+', '')

println('strToManage: ' + strToManage)

if(z.replaceAll("\\p{P}", "").replaceAll('\\s+', '').indexOf(strToManage)>-1) {

	dZONames = dZONames.replaceAll('\\d+','').replaceAll('\\s+', '').replaceAll('-', '').replaceAll('//','')
	
	println('dZONames: ' + dZONames)
	
	dZONumOtk = 1
	
	ii = dZONames.indexOf(strToManage)
	
	if(strToManage!='ФСК') {
			
		if (ii>-1) {
			
			for(i1=1;ii>-1;i1++) {
				
				dZONames=dZONames.substring(dZONames.indexOf('/')+1, dZONames.length())
					
				ii = dZONames.lastIndexOf('/')
				
				println('dZONames: ' + dZONames)
				
				dZONumOtk = (dZONumOtk+1)
					
				println('dZONumOtk: ' + dZONumOtk)
	
			}
		}
	
	}
	if(z.indexOf('//')>-1) {
			z = z.substring(0,z.indexOf('//'))
	}

	println('z: ' + z)
	
	for (ii = 1; ii < dZONumOtk; ii++) {
		i1 = (z.indexOf('/')+1)
		z = z.substring(i1,z.length())
		println('ii: ' + ii)
		println('z: ' + z)

	}
	
	z = z.substring(0,z.indexOf('/'))

}else {
	z='нет данных'
}
	
println('z: ' + z)

	
x = ((x + '/') + z)

x = x.replaceAll('[\\r?\n|\r]', '')
