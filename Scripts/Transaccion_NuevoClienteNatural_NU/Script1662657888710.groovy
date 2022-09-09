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

WebUI.navigateToUrl('https://srvsoftde.oscus.int/oscus.aplicacion')

WebUI.waitForPageLoad(20)

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('ObjXpath/AccederATuCuenta'), 20)

WebUI.setText(findTestObject('Object Repository/Page_Inicia sesin en Oscus QA/input_Usuario_username'), 'csantamaria')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Inicia sesin en Oscus QA/input_Contrasea_password'), 'pFvlI3x3p6lG056Re0KmbA==')

WebUI.click(findTestObject('Object Repository/Page_Inicia sesin en Oscus QA/input_Contrasea_login'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/img_Num. Cliente_imgNuevoClienteNatural'))

WebUI.waitForPageLoad(10)

//Datos
WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_Pasaporte'))

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Es menor de edad_txtIdentificacion'), 'PR133')

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Con Disolucin Conyugal_txtApellidosPasaporte'), 
    'Pazmiño')

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Con Disolucin Conyugal_txtNombresPasaporte'), 
    'Luis')

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_Soltero(a)'))

WebUI.click(findTestObject('Object Repository/ObjXpath/IconoCalendario'))

WebUI.click(findTestObject('Object Repository/ObjXpath/ClicAnioCalendario'))

WebUI.click(findTestObject('Object Repository/ObjXpath/Anio1990Calendario'))

WebUI.click(findTestObject('Object Repository/ObjXpath/Dia12Calendario'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/label_Hombre'))

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Mujer_v'), '1')

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2'))

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input'), 'Ecuador')

WebUI.takeScreenshot()

WebUI.scrollToPosition(0, 200)

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_Ecuador'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_Mestizoa'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/h1_DIRECCIN'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4'))

//Dirección
WebUI.scrollToElement(findTestObject('Object Repository/ObjXpath/Pestana_direccion'), 5)

WebUI.click(findTestObject('Object Repository/ObjXpath/Provincia_Ecuador'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/ObjXpath/Canton_DISTRITOMETROPOLITANODEQUITO'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/ObjXpath/Parroquia_PuertoQuito'))

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Parroquia reside_txtDireccion'), 'General Rumiñahui')

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Parroquia reside_txtCalleSecundaria'), 'VELASCO IBARRA')

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Parroquia reside_txtNumCasa'), 'F17-122')

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Parroquia reside_txtReferenciaDireccion'), 'PEDRO LÓPEZ')

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Parroquia reside_txtCelular1'), '0999456987')

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/label_NO'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_Propia no hipotecada'))

WebUI.takeScreenshot()

//Ocupación
WebUI.scrollToElement(findTestObject('Object Repository/ObjXpath/Pestana_Ocupacion'), 5)

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/h1_OCUPACIN'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5_6_7_8'))

WebUI.click(findTestObject('Object Repository/ObjXpath/Educacion_Universitaria'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5_6_7_8_9'))

WebUI.click(findTestObject('Object Repository/ObjXpath/ProfesiónSBS'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5_6_7_8_9_10'))

WebUI.click(findTestObject('Object Repository/ObjXpath/Ocupacion_Auditor'))

WebUI.click(findTestObject('Object Repository/ObjXpath/Boton_OrigenIngresos'))

WebUI.click(findTestObject('Object Repository/ObjXpath/OrigenIngresos_Rentista'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5_6_7_8_9_10_11'))

WebUI.click(findTestObject('Object Repository/ObjXpath/GrupoEconomico_ActividadAdministrativa'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5_6_7_8_9_10_11_12'))

WebUI.click(findTestObject('Object Repository/ObjXpath/ClasificacionActividad_ActividadDePrestacion'))

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Cantn_txtDescripcionActividadEconomicaActual'), 
    'Auditor')

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Cantn_txtTiempoTrabajo'), '5')

WebUI.scrollToElement(findTestObject('Object Repository/ObjXpath/Pestana_direccion'), 5)

WebUI.takeScreenshot()

//Situación Económica
WebUI.click(findTestObject('Object Repository/ObjXpath/Pestana_SituacionEconomica'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/label'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/a_Ingresos Mes_panel-tool-collapse panel-to_71da54'))

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Propios_txtValorIngreso0'), '5')

WebUI.click(findTestObject('Object Repository/ObjXpath/SE_GastosMes'))

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Alimentacin_txtValorGasto0'), '5')

//Referencia
WebUI.scrollToElement(findTestObject('Object Repository/PruebasOSCUS_TC/Page_OSCUS Business/h1_REFERENCIAS'), 5)

WebUI.click(findTestObject('Object Repository/PruebasOSCUS_TC/Page_OSCUS Business/h1_REFERENCIAS'))

WebUI.setText(findTestObject('Object Repository/PruebasOSCUS_TC/Page_OSCUS Business/input_REFERENCIAS PERSONALES_txtNombrePersonal'), 
    'CARLOS')

WebUI.setText(findTestObject('Object Repository/PruebasOSCUS_TC/Page_OSCUS Business/input_REFERENCIAS PERSONALES_txtDireccionPersonal'), 
    'FLORESTA')

WebUI.setText(findTestObject('Object Repository/PruebasOSCUS_TC/Page_OSCUS Business/input_REFERENCIAS PERSONALES_txtTelefonoCelular'), 
    '0999456654')

WebUI.click(findTestObject('Object Repository/PruebasOSCUS_TC/Page_OSCUS Business/input_REFERENCIAS PERSONALES_txtParentesco'))

WebUI.setText(findTestObject('Object Repository/PruebasOSCUS_TC/Page_OSCUS Business/input_REFERENCIAS PERSONALES_txtParentesco_1'), 
    'TÍO')

//Otros
WebUI.scrollToElement(findTestObject('Object Repository/Page_OSCUS Business/h1_OTROS'), 5)

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/h1_OTROS'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5_6_7_8_9_10_11_12_13'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_AHORROS'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/img_PEP_imgGuardarNuevoCliente'))

WebUI.verifyElementText(findTestObject('Object Repository/ObjXpath/NoAgregado_PrimerAceptar'), 'Ya existe un cliente con la identificación: PR133 , LUIS PAMIÑO, #863801, por favor verificar.')

WebUI.click(findTestObject('Object Repository/ObjXpath/BotonAceptar_NoAgregado'))

WebUI.scrollToElement(findTestObject('Object Repository/ObjXpath/BotonMenu'), 5)

WebUI.click(findTestObject('Object Repository/ObjXpath/BotonMenu'))

WebUI.click(findTestObject('Object Repository/ObjXpath/Menu_OpcionClientes'))

