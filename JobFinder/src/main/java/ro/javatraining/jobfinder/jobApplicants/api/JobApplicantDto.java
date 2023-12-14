package ro.javatraining.jobfinder.jobApplicants.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ro.javatraining.jobfinder.users.User;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JobApplicantDto {

    private Long id;
    private User user;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String resumeLink;
    private String education;
    private String skills;
}