package co.com.accenture.technoloshe.trivago.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class City extends PageObject{

	
	public static final Target CITY = Target.the("ciudad").locatedBy("//*[@id=\"querytext\"]");
	public static final Target CHOOSE_DESTINATION = Target.the("seleccione la ciudad destino").located(By.id("suggestion-65524/200"));
	public static final Target MONTH = Target.the("mes").located(By.id("cal-heading-month"));
	public static final Target D_ARRIVED = Target.the("Fecha de llegada").locatedBy("//*[@datetime='2019-10-27']");	
	public static final Target D_DEPARTURE = Target.the("Fecha de salida").locatedBy("//*[@datetime='2019-10-30']");
	public static final Target SEARCH = Target.the("buscar").locatedBy("//*[@class='search-button__label']");
	public static final Target LODGING = Target.the("estrellas").locatedBy(("//*[@class='toolbar-list__item toolbar-list__item--stars js-toolbar__item--stars js-toolbar-stars']"));
	public static final Target KIND = Target.the("tipo de estrellas").locatedBy(("//*[@id=\"page_wrapper\"]/section[1]/div/div/ul/li[2]/div/div/section/div/div/div[1]/div/ul/li[2]/button"));
	public static final Target FILTERS = Target.the("filtros").locatedBy("//*[@id=\"page_wrapper\"]/section[1]/div/div/ul/li[5]/button");
	public static final Target HOTEL_SERVICE = Target.the("Servicios de hotel").locatedBy("//*[@id=\"page_wrapper\"]/section[1]/div/div/ul/li[5]/div/div/section/div/div/div[1]/div/div/div[1]/div[3]/button");
	public static final Target BAR = Target.the("bar").locatedBy("//*[@id=\"page_wrapper\"]/section[1]/div/div/ul/li[5]/div/div/section/div/div/div[1]/div/div/div[2]/div[2]/details[3]/ul/li[1]/label");
	public static final Target NO_SMOKERS = Target.the("No fumadores").locatedBy("//*[@id=\"page_wrapper\"]/section[1]/div/div/ul/li[5]/div/div/section/div/div/div[1]/div/div/div[2]/div[2]/details[3]/ul/li[4]/label");
	public static final Target PET = Target.the("Mascotas").locatedBy("//*[@id=\"page_wrapper\"]/section[1]/div/div/ul/li[5]/div/div/section/div/div/div[1]/div/div/div[2]/div[2]/details[3]/ul/li[6]/label");
	public static final Target OK = Target.the("Ok").locatedBy("//*[@class=\"btn btn--small refinement-row__btn btn--primary\"]");
}