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

String a1 = "197 197|797 797|14 218 14 218|12 680 12 680|18 845 18 845|19 407 19 407|5 581 5 581|5 008 5 008|6 690 6 690|1 774 1 774|15 020 15 020|9 693 9 693|17 105 17 105|11 502 11 502|9 539 9 539|899 899|203 203|381 381|6 919 6 919|6 863 6 863|10 212 10 212|20 422 20 422|2 668 2 668|5 354 5 354|6 953 6 953|907 907|7 086 7 086|9 912 9 912|11 331 11 331|12 171 12 171|4 780 4 780|952 952||АО «Тываэнерго»|АО «Чеченэнерго»|Россети Волга|Россети Кубань|Россети Ленэнерго (ГК)|Россети Московский регион|Россети Северный Кавказ (ГК)|Россети Северо-Запад|Россети Сибирь (ГК)|Россети Томск|Россети Тюмень|Россети Урал (ГК)|Россети Центр|Россети Центр и Приволжье (ГК)|Россети Юг (ГК)|Россети Янтарь|0 млн. руб.|10 000 млн. руб.|20 000 млн. руб.|2 500 млн. руб.|5 000 млн. руб.|7 500 млн. руб.|12 500 млн. руб.|15 000 млн. руб.|17 500 млн. руб.|22 500 млн. руб."

String a2

String a3

String p = ''

String p1

String p2 = ''

int i

int n1

n = a1.indexOf('||')

println("n: "+n)

a3 = a1.substring(n+2,a1.length())

a1 = a1.substring(0,n+2,)

println("a2: "+a2)

for(n = a1.count('|')/2;n>1;n++) {
		
	p1 = a1.substring(0,a1.indexOf('|'))
	
	println("p1: "+p1)
	
	i = p1.length()/2
	
	println("i: "+i)
	
	p2 = p2 + p1.substring(0,i)+('|')
	
	println("p2: "+p2)
	
	a1 = a1.substring(a1.indexOf('|')+1,a1.length())
	
	println("a1: "+a1)
	
	n = a1.count('|')/2
	
	println("n: "+n)
	
	}

	a1 = p2.substring(0,p2.length()-2)
	
	a1 = a1.replaceAll('\\s+', '')
	
	println("a1: "+a1)
	
	n = a1.count('|')
	
	println("n: "+n)
	
	p2 = a1
		
	for(n = (p2.count('|')/2);n>1;n++) {

		p1=a1.substring(0,a1.indexOf('|')+1)
	
		println("p1: "+p1)
	
		p2=p2.substring(p1.length(),p2.length())
	
		println("p2: "+p2)
		
		n = p2.count('|')/2
			
		println("n: "+n)
	}
	
	println("a3: "+a3)
	
	i= a3.count('|')
	
	println("i: "+i)
	
	
	
	
		