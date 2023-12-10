package ro.javatraining.jobfinder.users.api;

import jakarta.validation.constraints.Email;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserDto {
    private long id;
    @NonNull
    private String username;
    @NonNull
    private String password;
    @Email
    private String email;
    @NonNull
    private String role;
}
