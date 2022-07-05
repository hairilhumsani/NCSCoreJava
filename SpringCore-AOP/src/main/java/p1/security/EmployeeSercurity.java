package p1.security;


import java.time.LocalDate;
import java.time.LocalDateTime;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import p1.Employee;

@Aspect
@Component
public class EmployeeSercurity {


 @Before("execution(public void p1.dev.*.do*())")
	public void empSecurity()
	{
			System.err.println(" INFO :- Employe Security :- "+LocalDateTime.now());
	}
}
