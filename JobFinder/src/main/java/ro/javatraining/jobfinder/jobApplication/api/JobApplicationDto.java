package ro.javatraining.jobfinder.jobApplication.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ro.javatraining.jobfinder.core.utils.JobApplicationStatus;

import java.util.Date;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JobApplicationDto {
    private long id;
    private long jobListingId;
    private long jobApplicantId;
    private Date applicationDate;
    private JobApplicationStatus status;
}