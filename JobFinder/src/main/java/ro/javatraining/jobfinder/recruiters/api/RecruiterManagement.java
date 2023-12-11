package ro.javatraining.jobfinder.recruiters.api;

import org.springframework.validation.annotation.Validated;
import ro.javatraining.jobfinder.recruiters.Recruiter;

import java.util.Collection;

@Validated
public interface RecruiterManagement {
    Long create(RecruiterDto recruiterDto);

    Collection<RecruiterDto> getAll();

    RecruiterDto get(Long id);

    void update(Long id, RecruiterDto recruiterDto);

    void delete(Long id);
}
