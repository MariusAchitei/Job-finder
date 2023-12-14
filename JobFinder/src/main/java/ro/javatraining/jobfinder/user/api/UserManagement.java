package ro.javatraining.jobfinder.user.api;

import org.springframework.validation.annotation.Validated;

import java.util.Collection;

@Validated
public interface UserManagement {
    Long registerUser(RegisterUserDto dto);
    UserDto get(Long id);
    Collection<UserDto> getAll();
    void update(Long id, UserDto dto);
    void delete(Long id);
    void resetPassword(Long id, String newPassword);
}
