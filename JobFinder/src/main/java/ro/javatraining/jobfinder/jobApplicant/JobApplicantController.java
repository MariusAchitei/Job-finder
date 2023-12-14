package ro.javatraining.jobfinder.jobApplicant;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    @ResponseStatus(value = HttpStatus.OK)
    public List<JobApplicantDto> getAll() {
        return jobApplicantManagement.getAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public JobApplicantDto getById(@PathVariable Long id) {
        return jobApplicantManagement.getById(id);
    }

    @PostMapping("")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Long create(JobApplicantDto jobApplicantDto) {
        return jobApplicantManagement.create(jobApplicantDto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public void update(@PathVariable Long id, JobApplicantDto jobApplicantDto) {
        jobApplicantManagement.update(id, jobApplicantDto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        jobApplicantManagement.delete(id);
    }
}
