package ro.javatraining.jobfinder.jobApplicant;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.javatraining.jobfinder.jobApplicant.api.JobApplicantDto;
import ro.javatraining.jobfinder.jobApplicant.api.JobApplicantManagement;

import java.util.List;

@RestController
@RequestMapping("/api/v1/jobApplicants")
public class JobApplicantController {
    @Autowired
    JobApplicantManagement jobApplicantManagement;

    @GetMapping("")
    public List<JobApplicantDto> getAll() {
        return jobApplicantManagement.getAll();
    }

    @GetMapping("/{id}")
    public JobApplicantDto getById(@PathVariable Long id) {
        return jobApplicantManagement.getById(id);
    }

    @PostMapping("")
    public Long create(JobApplicantDto jobApplicantDto) {
        return jobApplicantManagement.create(jobApplicantDto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, JobApplicantDto jobApplicantDto) {
        jobApplicantManagement.update(id, jobApplicantDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        jobApplicantManagement.delete(id);
    }
}
