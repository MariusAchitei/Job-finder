package ro.javatraining.jobfinder.jobCategory;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.javatraining.jobfinder.jobCategory.api.JobCategoryDto;
import ro.javatraining.jobfinder.jobCategory.api.JobCategoryManagement;
import ro.javatraining.jobfinder.jobCategory.api.JobCategoryNotFound;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("jobCategory")
public class JobCategoryController {

    private final JobCategoryManagement jobCategoryManagement;

    @GetMapping("")
    public List<JobCategoryDto> getAll() {
        return jobCategoryManagement.getAll();
    }

    @GetMapping("/{id}")
    public JobCategoryDto getById(@PathVariable Long id) throws JobCategoryNotFound {
        return jobCategoryManagement.getById(id);
    }

    @PostMapping("")
    public Long create(JobCategoryDto jobCategoryDto) {
        return jobCategoryManagement.create(jobCategoryDto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, JobCategoryDto jobCategoryDto) throws JobCategoryNotFound {
        jobCategoryManagement.update(id, jobCategoryDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) throws JobCategoryNotFound {
        jobCategoryManagement.delete(id);
    }
}
