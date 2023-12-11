package ro.javatraining.jobfinder.jobApplicant.api;

import ro.javatraining.jobfinder.jobApplicant.JobApplicant;

import java.util.List;

public interface JobApplicantManagement {
    Long create(JobApplicantDto jobApplicantDto);

    JobApplicantDto getById(Long id);

    List<JobApplicantDto> getAll();

    void update(Long id, JobApplicantDto jobApplicantDto);

    void delete(Long id);
}
