package p1;

import org.springframework.stereotype.Component;

@Component
public class CarInsurance implements Insurance {

	@Override
	public int getSumAssuredAmount() {
		
		return 5000;
	}

}
