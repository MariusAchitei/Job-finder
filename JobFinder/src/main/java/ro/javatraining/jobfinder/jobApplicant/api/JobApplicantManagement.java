package ro.javatraining.jobfinder.jobApplicant.api;

import org.springframework.validation.annotation.Validated;

import java.util.List;

@Validated
public interface JobApplicantManagement {
    Long create(JobApplicantDto jobApplicantDto);

    JobApplicantDto getById(Long id);

    List<JobApplicantDto> getAll();

    void update(Long id, JobApplicantDto jobApplicantDto);

    void delete(Long id);
}
