package gr.ote.database.bootstrap;

import gr.ote.database.model.User;
import gr.ote.database.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataLoader implements CommandLineRunner {
    private final UserRepository userRepository;

    @Override
    public void run(String... args) {
        User user1 = User.builder().firstName("Jim").
                lastName("Pasch").email("pas@gmail.com").age(37).build();
        User user2 = User.builder().firstName("Yiota").
                lastName("Plati").email("yio@gmail.com").age(36).build();
        User user3 = User.builder().firstName("Spyros").
                lastName("Farantos").email("spy@gmail.com").age(29).build();

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
    }

}
