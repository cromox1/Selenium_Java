package phonebook.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import phonebook.restservice.entity.User;
import phonebook.restservice.repository.UserRepository;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    protected CommandLineRunner init(final UserRepository userRepository) {
        return args -> {
            User user = new User();
            user.setNickname("administrator");
            user.setPassword("administrator");
            user.setPhones("+44-1234-345678");
            user.setFirstName("FirstName");
            user.setLastName("LastName");
            user.setEmail("admin@phonebook.com");
            user.setNotes("My Notes");
            userRepository.save(user);
        };
    }
}
