package ro.javatraining.jobfinder.jobApplication;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.javatraining.jobfinder.jobApplication.api.JobApplicationDto;
import ro.javatraining.jobfinder.jobApplication.api.JobApplicationManagement;
import ro.javatraining.jobfinder.jobApplication.api.JobApplicationNotFound;
import ro.javatraining.jobfinder.jobCategory.api.JobCategoryNotFound;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("jobApplication")
public class JobApplicationController {
    @Autowired
    JobApplicationManagement jobApplicationManagement;

    @GetMapping("")
    public List<JobApplicationDto> getAll() {
        return jobApplicationManagement.getAll();
    }

    @GetMapping("/{id}")
    public JobApplicationDto getById(@PathVariable Long id) throws JobApplicationNotFound {
        return jobApplicationManagement.getById(id);
    }

    @PostMapping
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public Long create(JobApplicationDto jobApplicationDto) {
        return jobApplicationManagement.create(jobApplicationDto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, JobApplicationDto jobApplicationDto) throws JobApplicationNotFound {
        jobApplicationManagement.update(id, jobApplicationDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        jobApplicationManagement.delete(id);
    }
}