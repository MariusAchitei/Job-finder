package ro.javatraining.jobfinder.users.api;

import jakarta.validation.constraints.Email;
import lombok.*;
import ro.javatraining.jobfinder.users.User;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private long id;
    @NonNull
    private String username;
    @Email
    private String email;
    @NonNull
    private String role;

    public UserDto(User user) {
    }
}
