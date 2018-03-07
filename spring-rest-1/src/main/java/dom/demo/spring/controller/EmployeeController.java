package dom.demo.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dom.demo.spring.Employee;

@RestController
public class EmployeeController {

	@RequestMapping(path="/emp", method=RequestMethod.GET, produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public Employee getEmployee(){
		Employee e =  new Employee(100, "Jagadeesh", "London", 48000);
		return e;
	}
}