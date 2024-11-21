package gr.ote.database.controller;

import gr.ote.database.model.User;
import gr.ote.database.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @GetMapping("/firstName/{firstName}")
    public List<User> getUsersByFirstName(@PathVariable String firstName){
        return userService.getUsersByFirstName(firstName);
    }

    @GetMapping("/olderThan/{age}")
    public List<User> getUsersOlderThan(@PathVariable Integer age){
        return userService.getUsersOlderThan(age);
    }

    @GetMapping("/emailDomain/{domain}")
    public List<User> getUsersByEmailDomain(@PathVariable String domain){
        return userService.getUsersByEmailDomain(domain);
    }
}
