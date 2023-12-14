package ro.javatraining.jobfinder.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.javatraining.jobfinder.user.api.RegisterUserDto;
import ro.javatraining.jobfinder.user.api.UserDto;
import ro.javatraining.jobfinder.user.api.UserManagement;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    UserManagement userManagement;

    @GetMapping("")
    @ResponseStatus(value = HttpStatus.OK)
    public Collection<UserDto> getAll() {
        return userManagement.getAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public UserDto getById(@PathVariable Long id) {
        return userManagement.get(id);
    }

    @PostMapping("")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Long create(RegisterUserDto registerUserDto) {
        return userManagement.registerUser(registerUserDto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public void update(@PathVariable Long id, UserDto userDto) {
        userManagement.update(id, userDto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        userManagement.delete(id);
    }
}
