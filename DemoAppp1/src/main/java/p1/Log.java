package p1;

import java.time.LocalDate;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {

	
	 @Before("execution(public int doPayment(..))")
		public void empSalaryLog()
		{
			LocalDate date = LocalDate.now();
			
			System.err.println(" INFO :- Employe Logs :- "+date);
		}
}