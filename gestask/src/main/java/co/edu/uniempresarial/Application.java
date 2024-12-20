package co.edu.uniempresarial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"co.edu.uniempresarial.model"})
@EnableJpaRepositories(basePackages = {"co.edu.uniempresarial.repository"})
@ComponentScan(basePackages = {"co.edu.uniempresarial.service","co.edu.uniempresarial.controller","co.edu.uniempresarial"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
