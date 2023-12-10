package ro.javatraining.jobfinder.users.api;

import ro.javatraining.jobfinder.users.api.RegisterUserDto;
import ro.javatraining.jobfinder.users.api.UserDto;

import java.util.Collection;

public interface UserManagement {
    Long registerUser(RegisterUserDto dto);
    UserDto get(Long id);
    Collection<UserDto> getAll();
    void update(Long id, UserDto dto);
    void delete(Long id);
    void resetPassword(Long id, String newPassword);
}