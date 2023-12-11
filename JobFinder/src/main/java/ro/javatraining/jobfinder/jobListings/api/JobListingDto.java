package ro.javatraining.jobfinder.jobListings.api;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ro.javatraining.jobfinder.jobCategory.JobCategory;
import ro.javatraining.jobfinder.recruiters.Recruiter;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JobListingDto {
    private Long id;

    private Recruiter recruiter;
    @NotBlank
    private String title;
    @NotBlank
    private String description;
    @NotBlank
    private String location;
    @NotBlank
    private String salaryRange;
    private Date postedDate;
    private Date deadline;
    private JobCategory jobCategory;

}
