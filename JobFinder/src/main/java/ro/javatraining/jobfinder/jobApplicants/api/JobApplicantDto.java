package ro.javatraining.jobfinder.jobApplicants.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
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