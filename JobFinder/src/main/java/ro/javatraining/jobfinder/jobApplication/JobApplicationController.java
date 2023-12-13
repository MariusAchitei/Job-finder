package ro.javatraining.jobfinder.jobApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.javatraining.jobfinder.jobApplicant.api.JobApplicantDto;
import ro.javatraining.jobfinder.jobApplicant.api.JobApplicantManagement;
import ro.javatraining.jobfinder.jobApplication.api.JobApplicationDto;
import ro.javatraining.jobfinder.jobApplication.api.JobApplicationManagement;

import java.util.List;

@Controller
@RequestMapping("/jobApplication")
public class JobApplicationController {
    @Autowired
    JobApplicationManagement jobApplicationManagement;

    @GetMapping("")
    public List<JobApplicationDto> getAll() {
        return jobApplicationManagement.getAll();
    }

    @GetMapping("/{id}")
    public JobApplicationDto getById(@PathVariable Long id) {
        return jobApplicationManagement.getById(id);
    }

    @PostMapping("")
    public Long create(JobApplicationDto jobApplicationDto) {
        return jobApplicationManagement.create(jobApplicationDto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, JobApplicationDto jobApplicationDto) {
        jobApplicationManagement.update(id, jobApplicationDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        jobApplicationManagement.delete(id);
    }
}