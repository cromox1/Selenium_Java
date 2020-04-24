package phonebook.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import phonebook.restservice.entity.User;
import phonebook.restservice.repository.UserRepository;

import javassist.tools.web.BadHttpRequest;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public Iterable<User> findAll() {
        return repository.findAll();
    }

    @GetMapping(path = "/{nickname}")
    public User find(@PathVariable("nickname") String nickname) {
        return repository.findOne(nickname);
    }

    @PostMapping(consumes = "application/json")
    public User create(@RequestBody User user) {
        return repository.save(user);
    }

    @DeleteMapping(path = "/{nickname}")
    public void delete(@PathVariable("nickname") String nickname) {
        repository.delete(nickname);
    }

    @PutMapping(path = "/{nickname}")
    public User update(@PathVariable("nickname") String nickname, @RequestBody User user) throws BadHttpRequest {
        if (repository.exists(nickname)) {
            user.setNickname(nickname);
            return repository.save(user);
        } else {
            throw new BadHttpRequest();
        }
    }

}