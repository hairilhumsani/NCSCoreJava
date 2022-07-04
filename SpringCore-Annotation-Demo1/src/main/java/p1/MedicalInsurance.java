package p1;

import org.springframework.stereotype.Component;

@Component
public class MedicalInsurance implements Insurance {

	@Override
	public int getSumAssuredAmount() {
		
		return 10000;
	}

}
