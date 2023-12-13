package ro.javatraining.jobfinder.jobCategory.api;

import ro.javatraining.jobfinder.jobApplicant.api.JobApplicantDto;

import java.util.List;

public interface JobCategoryManagement {

    Long create(JobCategoryDto jobCategoryDto);

    JobCategoryDto getById(Long id);

    List<JobCategoryDto> getAll();

    void update(Long id, JobCategoryDto jobCategoryDto);

    void delete(Long id);
}
