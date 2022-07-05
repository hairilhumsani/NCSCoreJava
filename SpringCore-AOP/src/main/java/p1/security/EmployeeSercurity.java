package p1.security;


import java.time.LocalDate;
import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import p1.Employee;

@Aspect
@Component
public class EmployeeSercurity {


	@Before("execution(public int p1.dev.*.do*(..))")
	public void empSecurity()
	{
			System.err.println(" INFO :- Before :- "+LocalDateTime.now());
	}
 

	@AfterReturning(pointcut = "execution(public int do*(..))",returning = "xyz")
	public void empSecurity2(JoinPoint joinPoint,Employee xyz)
	{
			System.err.println(" INFO :- Employe Security After "+joinPoint + " & method return xyz :- "+xyz);
			
			Object arr[] = joinPoint.getArgs();
			System.out.println(" --- Advice call ---");
			for (Object methodArg : arr) {
				System.out.println(methodArg.toString());
			}
			
	
	}
	
	
	@AfterThrowing(pointcut = "execution(public int do*(..))",throwing = "e")
	public void empForException(JoinPoint joinPoint,Exception e)
	{
			System.err.println(" --->>> INFO :- Employe Security After "+joinPoint + " & method throw Exception :- "+e);
			
			Object arr[] = joinPoint.getArgs();
			System.out.println(" --- Advice call ---");
			for (Object methodArg : arr) {
				System.out.println(methodArg.toString());
			}
			
	
	}
	
	
	
 
}//end class
