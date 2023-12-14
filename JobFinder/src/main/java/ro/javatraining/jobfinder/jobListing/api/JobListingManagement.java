package ro.javatraining.jobfinder.jobListing.api;

import org.springframework.validation.annotation.Validated;

import java.util.Collection;
import java.util.List;

@Validated
public interface JobListingManagement {
    Long create(JobListingDto jobListingDto);

    JobListingDto getById(Long id);

    Collection<JobListingDto> getAll();

    void update(Long id, JobListingDto jobListingDto);

    void delete(Long id);
}
