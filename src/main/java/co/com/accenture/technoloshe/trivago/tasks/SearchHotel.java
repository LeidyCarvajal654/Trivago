package co.com.accenture.technoloshe.trivago.tasks;

import java.util.List;

import co.com.accenture.technoloshe.trivago.userinterfaces.City;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class SearchHotel implements Task {
	
	private List<List<String>> text;
	
	public SearchHotel(List<List<String>> text) {
		this.text = text;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(City.CITY),
					Enter.theValue(text.get(1).get(0)).into(City.CITY),
					
					Click.on(City.CHOOSE_DESTINATION),
					Click.on(City.MONTH), 
					Click.on(City.D_ARRIVED.of(text.get(1).get(1))),			
					Click.on(City.D_DEPARTURE.of(text.get(1).get(2))),	
					Click.on(City.SEARCH),	
					Click.on(City.LODGING), Click.on(City.KIND),
					Click.on(City.FILTERS), Click.on(City.HOTEL_SERVICE),
					Click.on(City.BAR),Click.on(City.NO_SMOKERS),Click.on(City.PET),
					Click.on(City.OK)									
				);		
		
	}
	
	public static SearchHotel inThePage (List<List<String>> text) {
		return Tasks.instrumented(SearchHotel.class, text);
	}
}
