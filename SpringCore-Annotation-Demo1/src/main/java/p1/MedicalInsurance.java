package p1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MedicalInsurance implements Insurance {


	private int sumAssured;

	
	public int getSumAssured() {
		return sumAssured;
	}


	public void setSumAssured(int sumAssured) {
		this.sumAssured = sumAssured;
	}


	@Override
	public int getSumAssuredAmount() {
		// TODO Auto-generated method stub
		return sumAssured;
	}
	
	
	

}
