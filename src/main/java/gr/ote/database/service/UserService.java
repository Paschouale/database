package gr.ote.database.service;

import gr.ote.database.model.User;
import gr.ote.database.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getUsersByFirstName(String firstName){
        return userRepository.findByFirstName(firstName);
    }

    public List<User> getUsersOlderThan(Integer age){
        return userRepository.findUsersOlderThan(age);
    }

    public List<User> getUsersByEmailDomain(String domain){
        return userRepository.findByEmailDomain(domain);
    }
}
