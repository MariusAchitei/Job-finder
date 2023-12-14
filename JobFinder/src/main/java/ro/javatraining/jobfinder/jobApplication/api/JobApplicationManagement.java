package ro.javatraining.jobfinder.jobApplication.api;

import org.springframework.validation.annotation.Validated;

import java.util.List;

@Validated
public interface JobApplicationManagement {
    Long create(JobApplicationDto jobApplicationDto);

    JobApplicationDto getById(Long id);

    List<JobApplicationDto> getAll();

    void update(Long id, JobApplicationDto jobApplicationDto);

    void delete(Long id);
}
