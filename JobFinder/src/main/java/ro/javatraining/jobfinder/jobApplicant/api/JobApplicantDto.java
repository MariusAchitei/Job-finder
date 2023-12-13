package ro.javatraining.jobfinder.jobApplicant.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JobApplicantDto {

    private Long applicantID;
    private Long userID;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String resumeLink;
    private String education;
    private String skills;
}