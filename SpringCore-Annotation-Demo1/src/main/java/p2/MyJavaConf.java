package p2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import p1.Address;
import p1.Employee;

@Configuration
@ComponentScan("p1")
@PropertySource("employee.properties")
public class MyJavaConf {
	
	@Bean  //Note :-  method name will be considering as bean name
	public Employee getEmployee()
	{
		Employee e = new Employee("confTest@gmail.com",8888, "test-designation");
		e.setAddress(getEmployeeAddress()); // Autowired
		return e;
	}
	
	// Note : in case of autowire , no need to use @Autowire annotation in component class
	
	@Bean
	public Address getEmployeeAddress()
	{
		return new Address("Test-Conf-House-9990","Test-cityName", null, null, 0);
	}
	
}
