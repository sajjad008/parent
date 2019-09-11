package child;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import commons.utils.CommonUtility;

@SpringBootApplication
public class ChildApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ChildApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		// For test
		System.out.println(CommonUtility.class.getName());
	}
}
