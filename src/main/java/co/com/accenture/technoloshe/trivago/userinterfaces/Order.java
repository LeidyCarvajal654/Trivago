package co.com.accenture.technoloshe.trivago.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Order extends PageObject {
	
	public static final Target RECOMEND = Target.the("Recomendados").located(By.id("mf-select-sortby"));
	public static final Target CHEAP = Target.the("Precio").locatedBy("//*[@value=\"2\"]");
	public static final Target SCORE = Target.the("Puntuación").locatedBy("//*[@class=\"item__rating-number= \"Muy bueno\"]");
}
