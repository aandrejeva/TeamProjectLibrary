package jtm.teamProjectLibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"jtm.teamProjectLibrary.repository"})
public class WebApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(WebApplication.class, args);
	}
}
