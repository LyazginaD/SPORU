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

int i

int ii

int run

String typeOfData

String otobrajeniyeDannyh

String todaysDate

String vidget

String tableA = 'ДЗО/Филиал/Отклонение (объём услуг)/Отклонение (средний тариф)/АО «Тываэнерго» АО "Тываэнерго" 52 5/АО «Чеченэнерго» АО «Чеченэнерго» -1 472 NaN/Россети Волга Мордовэнерго -1 320 -76/Оренбургэнерго -4 851 - 106/Пензаэнерго -2 998 -54/Самарские РС -5 933 - 512/Саратовские РС -6 145 - 215/Ульяновские РС -2 227 -91/Чувашэнерго -1 892 56/Россети Кубань Кубаньэнерго -23 017 - 122/Россети Ленэнерго (ГК) Ленинградская область -14 037 -20/г. Санкт-Петербург -19 185 - 179/Россети Московский регион Московская область 2 967 - 327/г. Москва 1 385 - 146/Россети Северный Кавказ (ГК) Дагэнерго -2 945 222/Ингушэнерго - 708 38/Каббалкэнерго -1 230 -6/Карачаево-Черкесскэнерго - 858 -16/Севкавказэнерго -1 484 41/Ставропольэнерго -3 750 - 162/Россети Северо-Запад Архангельский филиал 128 -18/Вологодский филиал 126 0/Карельский филиал 165 51/Мурманский филиал 106 51/Новгородский филиал 173 -17/Псковский филиал 93 -22/филиал в Республике Коми 26 -2/Россети Сибирь (ГК) Алтайэнерго 141 147/Бурятэнерго 65 166/ГАЭС 64 -12/Красноярскэнерго 487 8/Кузбассэнерго-РЭС 202 111/Омскэнерго 95 - 130/Хакасэнерго 166 - 185/Читаэнерго 31 38/Россети Томск Томская распределительная компания -3 123 -85/Россети Тюмень Россети Тюмень -29 389 - 110/Россети Урал (ГК) Пермэнерго 272 - 126/Свердловэнерго 447 48/Челябэнерго 669 - 409/Россети ФСК ЕЭС Итого по ФСК ЕЭС 5 866 -4 698/Россети Центр Белгородэнерго 122 24/Брянскэнерго -2 365 5/Воронежэнерго -6 401 39/Костромаэнерго 78 -8/Курскэнерго -2 333 15/Липецкэнерго 498 - 164/Орелэнерго -1 349 -1/Смоленскэнерго -3 156 3/Тамбовэнерго -2 342 -18/Тверьэнерго 252 0/Ярэнерго -2 705 -52/Россети Центр и Приволжье (ГК) Владимирэнерго 312 34/Ивэнерго 147 -13/Калугаэнерго 311 -40/Кировэнерго 195 5/Мариэнерго 80 10/Нижновэнерго 312 52/Рязаньэнерго 132 15/Тулэнерго 528 - 149/Удмуртэнерго 171 -10/Россети Юг (ГК) АО «ВМЭС» -1 541 9/Астраханьэнерго -2 211 16/Волгоградэнерго -3 942 - 135/Калмэнерго - 659 -6/Ростовэнерго -8 560 137/Россети Янтарь Россети Янтарь 155 -43'
println('tableA: '+tableA)

for(i=1;i<5;i++) {

	ii = tableA.indexOf('/')+1
	
	tableA=tableA.substring(ii,tableA.length())
	
}
println('tableA: '+tableA)

TyA = GetData(x=tableA)

println('TyA: '+TyA)

tableA=NewDZO(x=tableA)

ChA = GetData(x=tableA)

println('ChA: '+ChA)

tableA=NewDZO(x=tableA)

i = tableA.indexOf('Кубань')

VA = tableA.substring(0,i).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('VA: '+VA)

for(i=1;i<8;i++) {
	tableA=NewDZO(x=tableA)
}

i = tableA.indexOf('Ленэнерго')

KuA = GetData(x=tableA)

println('KuA: '+KuA)

tableA=NewDZO(x=tableA)

i = tableA.indexOf('Московский')

LenA = tableA.substring(0,i).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('LenA: '+LenA)

tableA=NewDZO(x=tableA)

tableA=NewDZO(x=tableA)

i = tableA.indexOf('Кавказ')

MosA = tableA.substring(0,i).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('MosA: '+MosA)

for(i=1;i<3;i++) {
	tableA=NewDZO(x=tableA)
}

i = tableA.indexOf('Запад')

SKA = tableA.substring(0,i).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('SKA: '+SKA)

for(i=1;i<7;i++) {

	tableA=NewDZO(x=tableA)
	
}

i = tableA.indexOf('Сибирь')

SZA = tableA.substring(0,i).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('SZA: '+SZA)


for(i=1;i<8;i++) {

	tableA=NewDZO(x=tableA)
}

i = tableA.indexOf('Томск')

SiA = tableA.substring(0,i).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('SiA: '+SiA)

for(i=1;i<9;i++) {

	tableA=NewDZO(x=tableA)
	
}

i = tableA.indexOf('Тюмень')

ToA = tableA.substring(0,i).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('ToA: '+ToA)

tableA=NewDZO(x=tableA)

TyuA = tableA.substring(0,i).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('TyuA: '+TyuA)

tableA=NewDZO(x=tableA)

i = tableA.indexOf('ЕЭС')

UrA = tableA.substring(0,i).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('UrA: '+UrA)

for(i=1;i<4;i++) {

	tableA=NewDZO(x=tableA)
	
}

i = tableA.indexOf('Центр')

FSKA = tableA.substring(0,i).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('FSKA: '+FSKA)

tableA=NewDZO(x=tableA)

i = tableA.indexOf('Приволжье')

CenA = tableA.substring(0,i).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('CenA: '+CenA)

for(i=1;i<12;i++) {

	tableA=NewDZO(x=tableA)
	
}

i = tableA.indexOf('Юг')

CiPA = tableA.substring(0,i).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('CiPA: '+CiPA)

for(i=1;i<10;i++) {

	tableA=NewDZO(x=tableA)
	
}


i = tableA.indexOf('Янтарь')

UgA = tableA.substring(0,i).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('UgA: '+UgA)

i = tableA.lastIndexOf('/')

YaA = tableA.substring(i,tableA.length()).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('YaA: '+YaA)

'_______________________________________________'

String tableB = 'ДЗО/Филиал/Отклонение (объём услуг) филиал без Nan/Отклонение (средний тариф) филиал без Nan/АО «Тываэнерго» АО "Тываэнерго" 52 5/АО «Чеченэнерго» АО «Чеченэнерго» -1 472 0/Россети Волга Мордовэнерго 41 -76/Оренбургэнерго 355 - 106/Пензаэнерго 140 -54/Самарские РС 160 - 512/Саратовские РС 139 - 215/Ульяновские РС 88 -91/Чувашэнерго -36 56/Россети Кубань Кубаньэнерго 827 - 122/Россети Ленэнерго (ГК) Ленинградская область 954 -20/г. Санкт-Петербург 1 268 - 179/Россети Московский регион Московская область 2 967 - 327/г. Москва 1 385 - 146/Россети Северный Кавказ (ГК) Дагэнерго - 286 222/Ингушэнерго - 122 38/Каббалкэнерго 43 -6/Карачаево-Черкесскэнерго 18 -16/Севкавказэнерго - 197 41/Ставропольэнерго 80 - 162/Россети Северо-Запад Архангельский филиал 128 -18/Вологодский филиал 126 0/Карельский филиал 165 51/Мурманский филиал 106 51/Новгородский филиал 173 -17/Псковский филиал 93 -22/филиал в Республике Коми 26 -2/Россети Сибирь (ГК) Алтайэнерго 141 147/Бурятэнерго 65 166/ГАЭС 64 -12/Красноярскэнерго 487 8/Кузбассэнерго-РЭС 202 111/Омскэнерго 95 - 130/Хакасэнерго 166 - 185/Читаэнерго 31 38/Россети Томск Томская распределительная компания 189 -85/Россети Тюмень Россети Тюмень -1 135 - 110/Россети Урал (ГК) Пермэнерго 272 - 126/Свердловэнерго 447 48/Челябэнерго 669 - 409/Россети ФСК ЕЭС Итого по ФСК ЕЭС 5 866 -4 698/Россети Центр Белгородэнерго 122 25/Брянскэнерго 64 5/Воронежэнерго 207 39/Костромаэнерго 78 -8/Курскэнерго 98 14/Липецкэнерго 498 - 164/Орелэнерго 103 -5/Смоленскэнерго 69 3/Тамбовэнерго 142 -18/Тверьэнерго 252 0/Ярэнерго 454 -52/Россети Центр и Приволжье (ГК) Владимирэнерго 312 34/Ивэнерго 147 -13/Калугаэнерго 311 -40/Кировэнерго 195 5/Мариэнерго 80 10/Нижновэнерго 312 52/Рязаньэнерго 132 15/Тулэнерго 528 - 149/Удмуртэнерго 171 -10/Россети Юг (ГК) АО «ВМЭС» 48 9/Астраханьэнерго 67 16/Волгоградэнерго 188 - 135/Калмэнерго 23 -6/Ростовэнерго 65 137/Россети Янтарь Россети Янтарь 155 -43'
println('tableB: '+tableB)

for(i=1;i<5;i++) {

	ii = tableB.indexOf('/')+1
	
	tableB=tableB.substring(ii,tableB.length())
	
}
println('tableB: '+tableB)

TyB = GetData(x=tableB)

println('TyB: '+TyB)

tableB=NewDZO(x=tableB)

ChB = GetData(x=tableB)

println('ChB: '+ChB)

tableB=NewDZO(x=tableB)

i = tableB.indexOf('Кубань')

VB = tableB.substring(0,i).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('VB: '+VB)

for(i=1;i<8;i++) {
	tableB=NewDZO(x=tableB)
}

i = tableB.indexOf('Ленэнерго')

KuB = GetData(x=tableB)

println('KuB: '+KuB)

tableB=NewDZO(x=tableB)

i = tableB.indexOf('Московский')

LenB = tableB.substring(0,i).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('LenB: '+LenB)

tableB=NewDZO(x=tableB)

tableB=NewDZO(x=tableB)

i = tableB.indexOf('Кавказ')

MosB = tableB.substring(0,i).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('MosB: '+MosB)

for(i=1;i<3;i++) {
	tableB=NewDZO(x=tableB)
}

i = tableB.indexOf('Запад')

SKB = tableB.substring(0,i).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('SKB: '+SKB)

for(i=1;i<7;i++) {

	tableB=NewDZO(x=tableB)
	
}

i = tableB.indexOf('Сибирь')

SZB = tableB.substring(0,i).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('SZB: '+SZB)


for(i=1;i<8;i++) {

	tableB=NewDZO(x=tableB)
}

i = tableB.indexOf('Томск')

SiB = tableB.substring(0,i).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('SiB: '+SiB)

for(i=1;i<9;i++) {

	tableB=NewDZO(x=tableB)
	
}

i = tableB.indexOf('Тюмень')

ToB = tableB.substring(0,i).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('ToB: '+ToB)

tableB=NewDZO(x=tableB)

TyuB = tableB.substring(0,i).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('TyuB: '+TyuB)

tableB=NewDZO(x=tableB)

i = tableB.indexOf('ЕЭС')

UrB = tableB.substring(0,i).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('UrB: '+UrB)

for(i=1;i<4;i++) {

	tableB=NewDZO(x=tableB)
	
}

i = tableB.indexOf('Центр')

FSKB = tableB.substring(0,i).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('FSKB: '+FSKB)

tableB=NewDZO(x=tableB)

i = tableB.indexOf('Приволжье')

CenB = tableB.substring(0,i).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('CenB: '+CenB)

for(i=1;i<12;i++) {

	tableB=NewDZO(x=tableB)
	
}

i = tableB.indexOf('Юг')

CiPB = tableB.substring(0,i).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('CiPB: '+CiPB)

for(i=1;i<10;i++) {

	tableB=NewDZO(x=tableB)
	
}


i = tableB.indexOf('Янтарь')

UgB = tableB.substring(0,i).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('UgB: '+UgB)

i = tableB.lastIndexOf('/')

YaB = tableB.substring(i,tableB.length()).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()

println('YaB: '+YaB)

DZO = 'АО «Тываэнерго»'
CompareDZO(x=TyA, y=TyB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget)

DZO = 'АО «Чеченэнерго»'
CompareDZO(x=ChA, y=ChB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget)

DZO = 'Россети Волга'
CompareDZO(x=VA, y=VB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget)

DZO = 'Россети Кубань'
CompareDZO(x=KuA, y=KuB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget)

DZO = 'Московский регион'
CompareDZO(x=MosA, y=MosB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget)

DZO = 'Россети Ленэнерго (ГК)'
CompareDZO(x=LenA, y=LenB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget)

DZO = 'Россети Северный Кавказ (ГК)'
CompareDZO(x=SKA, y=SKB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget)

DZO = 'Россети Северо-Запад'
CompareDZO(x=SZA, y=SZB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget)

DZO = 'Россети Сибирь (ГК)'
CompareDZO(x=SiA, y=SiB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget)

DZO = 'Россети Томск'
CompareDZO(x=ToA, y=ToB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget)

DZO = 'Россети Тюмень'
CompareDZO(x=TyuA, y=TyuB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget)

DZO = 'Россети Урал (ГК)'
CompareDZO(x=TyuA, y=TyuB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget)

DZO = 'Россети ФСК ЕЭС'
CompareDZO(x=TyuA, y=TyuB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget)

DZO = 'Центр'
CompareDZO(x=CenA, y=CenB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget)

DZO = 'Центр и Приволжье (ГК)'
CompareDZO(x=CiPA, y=CiPB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget)

DZO = 'Россети Юг (ГК)'
CompareDZO(x=UgA, y=UgB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget)

DZO = 'Россети Юг (ГК)'
CompareDZO(x=YaA, y=YaB, run, typeOfData, otobrajeniyeDannyh, todaysDate, vidget)


static def CompareDZO(def x, def y, def run, def typeOfData, def otobrajeniyeDannyh, def todaysDate, def vidget){
		
	String x1=x
	String y1=y
	int i1
	
	if (WebUI.verifyEqual(x, y) == true){
		
	}else{
		otobrajeniyeDannyh = 'Все'
		vidget = 'Всего отклонения'
			WriteToExcel(todaysDate, typeOfData, otobrajeniyeDannyh, x, y, vidget)
		
	}
	
}

static def GetData(def x) {
	int i2
	i2 = x.indexOf('/')+1
	x = x.substring(0,i2).replaceAll('[а-яА-Я]', '').replaceAll("\\p{P}", "").trim()
	return x
}

static def NewDZO(def x) {
	int i3
	i3 = x.indexOf('/')+1
	x=x.substring(i3,x.length())
	return x
}

static def WriteToExcel(def todaysDate, def typeOfData, def otobrajeniyeDannyh, def x, def y, def vidget) {
	
}
