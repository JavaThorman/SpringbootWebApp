package JavaThorman.items.webservices.SpringbootWebApp;

import JavaThorman.items.webservices.SpringbootWebApp.Repository.RoleRepository;
import JavaThorman.items.webservices.SpringbootWebApp.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import JavaThorman.items.webservices.SpringbootWebApp.Models.Role;
import JavaThorman.items.webservices.SpringbootWebApp.Models.User;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication(scanBasePackages = "JavaThorman.items.webservices.SpringbootWebApp")
public class SpringbootWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebAppApplication.class, args);
	}

	@Bean
	CommandLineRunner init(RoleRepository roleRepository, UserRepository userRepository, PasswordEncoder passwordEncoder) {
		return args -> {
			if (roleRepository.findByAuthority("ADMIN").isEmpty()) {
				Role adminRole = roleRepository.save(new Role(0L, "ADMIN"));
				roleRepository.save(new Role(0L, "USER"));

				Set<Role> roles = new HashSet<>();
				roles.add(adminRole);

				User admin = new User(0L, "admin", passwordEncoder.encode("password"), roles);

				userRepository.save(admin);
			}
		};
	}
}
