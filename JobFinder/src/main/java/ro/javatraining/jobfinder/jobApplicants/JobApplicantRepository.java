package ro.javatraining.jobfinder.jobApplicants;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JobApplicantRepository extends JpaRepository<JobApplicant, Long> {
}
