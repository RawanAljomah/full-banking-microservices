package org.sid.billing;

import com.fasterxml.jackson.core.Versioned;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.vault.core.VaultTemplate;

import java.util.Map;

@SpringBootApplication
public class BillingApplication {
	@Autowired
	private VaultTemplate vaultTemplate;

	public static void main(String[] args) {

		SpringApplication.run(BillingApplication.class, args);
	}
     @Bean
	CommandLineRunner commandLineRunner() {
		return args -> {

			vaultTemplate.opsForVersionedKeyValue("secret")
					.put("keypair" ,Map.of("privkey","54321","pubkey","8999"));

		};

	}
}