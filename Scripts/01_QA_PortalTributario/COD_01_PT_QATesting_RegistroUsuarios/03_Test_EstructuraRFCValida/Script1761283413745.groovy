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

WebUI.openBrowser('')
WebUI.navigateToUrl('https://saceq-kong-saceq-qa.apps.codice-cluser0.py57.p1.openshiftapps.com/app-qa/saceq')
WebUI.click(findTestObject('Object Repository/01_PortalTributario_Objects/Page_NUEVO RECAUDANET/a_Registro_bg-pt-tertiary rounded-lg text-w_5995c9'))
WebUI.setText(findTestObject('Object Repository/01_PortalTributario_Objects/Page_NUEVO RECAUDANET/input_OFICINA VIRTUAL_RFC'),
	'TTI680427SMA')
WebUI.click(findTestObject('Object Repository/01_PortalTributario_Objects/Page_NUEVO RECAUDANET/button_Cancelar_px-4 py-2 uppercase bg-pt-t_3f7ad9'))