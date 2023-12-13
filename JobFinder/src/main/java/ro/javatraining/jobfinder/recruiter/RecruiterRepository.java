package ro.javatraining.jobfinder.recruiter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruiterRepository  extends JpaRepository<Recruiter,Long> {
}
