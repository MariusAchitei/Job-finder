package ro.javatraining.jobfinder.jobCategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.javatraining.jobfinder.jobCategory.api.JobCategoryDto;
import ro.javatraining.jobfinder.jobCategory.api.JobCategoryManagement;

import java.util.List;

@Controller
@RequestMapping("/jobCategory")
public class JobCategoryController {

    @Autowired
    JobCategoryManagement jobCategoryManagement;

    @GetMapping("")
    public List<JobCategoryDto> getAll() {
        return jobCategoryManagement.getAll();
    }

    @GetMapping("/{id}")
    public JobCategoryDto getById(@PathVariable Long id) {
        return jobCategoryManagement.getById(id);
    }

    @PostMapping("")
    public Long create(JobCategoryDto jobCategoryDto) {
        return jobCategoryManagement.create(jobCategoryDto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, JobCategoryDto jobCategoryDto) {
        jobCategoryManagement.update(id, jobCategoryDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        jobCategoryManagement.delete(id);
    }
}
