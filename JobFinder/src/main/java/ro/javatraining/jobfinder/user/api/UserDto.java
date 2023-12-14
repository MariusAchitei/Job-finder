package ro.javatraining.jobfinder.user.api;

import jakarta.validation.constraints.Email;
import lombok.*;

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
}
