package ro.javatraining.jobfinder.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.javatraining.jobfinder.user.api.RegisterUserDto;
import ro.javatraining.jobfinder.user.api.UserDto;
import ro.javatraining.jobfinder.user.api.UserManagement;

import java.util.Collection;

@Controller
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    UserManagement userManagement;

    @GetMapping("")
    public Collection<UserDto> getAll() {
        return userManagement.getAll();
    }

    @GetMapping("/{id}")
    public UserDto getById(@PathVariable Long id) {
        return userManagement.get(id);
    }

    @PostMapping("")
    public Long create(RegisterUserDto registerUserDto) {
        return userManagement.registerUser(registerUserDto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, UserDto userDto) {
        userManagement.update(id, userDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userManagement.delete(id);
    }
}
