import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();

suiteProperties.put('id', 'Test Suites/\u041F\u043D-\u0421\u0440-\u041F\u0442/\u0421\u0432\u0435\u0440\u043A\u0430 \u0441 \u041F\u0411\u042D')
suiteProperties.put('name', '\u0421\u0432\u0435\u0440\u043A\u0430 \u0441 \u041F\u0411\u042D')
suiteProperties.put('description', '')
suiteProperties.put('rerunTestFailImmediately', 'false')
suiteProperties.put('retryCount', '0')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\LIAZGINA-DI\\git\\SPORU\\Reports\\20231213_100924\\\u041F\u043D-\u0421\u0440-\u041F\u0442\\\u0421\u0432\u0435\u0440\u043A\u0430 \u0441 \u041F\u0411\u042D\\20231213_100924\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Пн-Ср-Пт/Сверка с ПБЭ', suiteProperties, new File("C:\\Users\\LIAZGINA-DI\\git\\SPORU\\Reports\\20231213_100924\\\u041F\u043D-\u0421\u0440-\u041F\u0442\\\u0421\u0432\u0435\u0440\u043A\u0430 \u0441 \u041F\u0411\u042D\\20231213_100924\\testCaseBinding"))
