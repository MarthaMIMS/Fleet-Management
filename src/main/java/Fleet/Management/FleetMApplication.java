package Fleet.Management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
//@EnableJpaRepositories("Fleet.Management.repository")
public class FleetMApplication {

	public static void main(String[] args) {
		SpringApplication.run(FleetMApplication.class, args);
	}

}
