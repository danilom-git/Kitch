package kitch;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieSession;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KitchApp {

	public static void main(String[] args) {
		SpringApplication.run(KitchApp.class, args);
	}
	
	@Bean
    public KieSession kieSession() {
        return KieServices.Factory.get().getKieClasspathContainer().newKieSession("KitchSession");
    }
}
