package co.com.accenture.technoloshe.trivago.questions;

import co.com.accenture.technoloshe.trivago.userinterfaces.Order;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Data implements Question<String> {

	@Override
	public String answeredBy (Actor actor) {
	if(Text.of(Order.SCORE).viewedBy(actor).asString().contains("Excelente")) {
		
		return "Excelente";
	
	}else {
			if (Text.of(Order.SCORE).viewedBy(actor).asString().contains("Muy bueno")) {
				return "Muy bueno";
			}else {
				
				if (Text.of(Order.SCORE).viewedBy(actor).asString().contains("Bueno")) {
					return "Bueno";
					
				}else
						return "Estado no disponible";
					
				  }
			}
	}
	
	public static Data at() {
		return new Data();
	}

	
	}


