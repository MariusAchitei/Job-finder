package ro.javatraining.jobfinder.jobListings.api;

import java.util.List;

public interface JobListingManagement {
    Long create(JobListingDto jobListingDto);

    JobListingDto getById(Long id);

    List<JobListingDto> getAll();

    void update(Long id, JobListingDto jobListingDto);

    void delete(Long id);
}
