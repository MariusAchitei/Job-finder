package ro.javatraining.jobfinder.recruiter.api;

import org.springframework.validation.annotation.Validated;

import java.util.Collection;

@Validated
public interface RecruiterManagement {
    Long create(RecruiterDto recruiterDto);

    Collection<RecruiterDto> getAll();

    RecruiterDto get(Long id);

    void update(Long id, RecruiterDto recruiterDto);

    void delete(Long id);
}
