package ro.javatraining.jobfinder.user.api;

import java.util.Collection;

public interface UserManagement {
    Long registerUser(RegisterUserDto dto);
    UserDto get(Long id);
    Collection<UserDto> getAll();
    void update(Long id, UserDto dto);
    void delete(Long id);
    void resetPassword(Long id, String newPassword);
}
