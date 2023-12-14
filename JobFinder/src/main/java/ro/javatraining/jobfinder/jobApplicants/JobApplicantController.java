package ro.javatraining.jobfinder.jobApplicants;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.javatraining.jobfinder.jobApplicants.api.JobApplicantDto;
import ro.javatraining.jobfinder.jobApplicants.api.JobApplicantManagement;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api/v1/jobApplicants")
public class JobApplicantController {
    @Autowired
    JobApplicantManagement jobApplicantManagement;

    @GetMapping("")
    public List<JobApplicantDto> getAll() {
        var jobApplicants = jobApplicantManagement.getAll();
        return new ArrayList<JobApplicantDto>();
//        return jobApplicants;
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
