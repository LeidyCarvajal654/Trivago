package co.com.accenture.technoloshe.trivago.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/hotel_reservation.feature",
		glue = "co.com.accenture.technoloshe.trivago.stepdefinitions",
		snippets = SnippetType.CAMELCASE
		)
public class HotelReservationRunner {

}
