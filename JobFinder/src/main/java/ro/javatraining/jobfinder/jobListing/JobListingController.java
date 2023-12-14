package ro.javatraining.jobfinder.jobListing;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import ro.javatraining.jobfinder.jobListing.api.JobListingDto;
import ro.javatraining.jobfinder.jobListing.api.JobListingManagement;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
@RequestMapping("job/listing")
public class JobListingController {

    @Autowired
    private final JobListingManagement jobListingManagement;
    @GetMapping
    public Collection<JobListingDto>getAllJobListings() {
        return jobListingManagement.getAll();
    }

    @GetMapping("/{id}")
    public JobListingDto getJobListingById(@PathVariable final Long id) {
        return jobListingManagement.getById(id);
    }

    @PostMapping
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Long createJobListing(@RequestBody final JobListingDto jobListingDTO) {
        System.out.println("++++++++++++++++++++++++++");
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getAuthorities());
        System.out.println("++++++++++++++++++++++++++");
        return  jobListingManagement.create(jobListingDTO);
    }

    @PutMapping("/{id}")
    public void updateJobListing(@PathVariable Long id, @RequestBody JobListingDto jobListingDTO) {
        jobListingManagement.update(id,jobListingDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteJobListing(@PathVariable Long id) {
       jobListingManagement.delete(id);
    }
}

