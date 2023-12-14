package ro.javatraining.jobfinder.jobListing;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JobListingRepository  extends JpaRepository<JobListing,Long> {
}
