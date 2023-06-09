package sathra.panadura.studentmanagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

	@Bean
	public RestTemplate getRestTemplate(){
		return  new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
