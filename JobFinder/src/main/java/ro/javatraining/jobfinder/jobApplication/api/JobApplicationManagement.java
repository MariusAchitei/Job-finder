package ro.javatraining.jobfinder.jobApplication.api;

import java.util.List;

public interface JobApplicationManagement {
    Long create(JobApplicationDto jobApplicationDto);

    JobApplicationDto getById(Long id);

    List<JobApplicationDto> getAll();

    void update(Long id, JobApplicationDto jobApplicationDto);

    void delete(Long id);
}
