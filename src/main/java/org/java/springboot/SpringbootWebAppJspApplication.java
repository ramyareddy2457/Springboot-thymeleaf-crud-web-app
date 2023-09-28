package org.java.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootWebAppJspApplication {


//	@Autowired
//	private EmployeeRepository employeeRepository;
//	@PostConstruct
//	private void employeeList(){
//
//		List<Employee> employeelist=new ArrayList<>();
//		employeelist.add(new Employee("ramya","reddy","ramya@gmail.com"));
//		employeeRepository.saveAll(employeelist);
//	}


    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebAppJspApplication.class, args);
    }

}
