package co.com.accenture.technoloshe.trivago.tasks;

import co.com.accenture.technoloshe.trivago.userinterfaces.Order;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ReservationData implements Task {	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(Order.RECOMEND),
		Click.on(Order.CHEAP));
		
	}
	public static ReservationData inThePage() {
			return Tasks.instrumented(ReservationData.class);
	}

}
