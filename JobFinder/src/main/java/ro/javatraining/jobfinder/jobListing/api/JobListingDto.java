package ro.javatraining.jobfinder.jobListing.api;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JobListingDto {
    private Long id;

    private Long recruiterId;
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
    private Long jobCategoryId;

}
